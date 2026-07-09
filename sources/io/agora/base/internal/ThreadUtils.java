package io.agora.base.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class ThreadUtils {

    /* JADX INFO: renamed from: io.agora.base.internal.ThreadUtils$1CaughtException, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class C1CaughtException {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Exception f103944e;

        C1CaughtException() {
        }
    }

    /* JADX INFO: renamed from: io.agora.base.internal.ThreadUtils$1Result, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class C1Result {
        public V value;

        C1Result() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface BlockingOperation {
        void run() throws InterruptedException;
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() { // from class: io.agora.base.internal.ThreadUtils.2
            @Override // io.agora.base.internal.ThreadUtils.BlockingOperation
            public void run() throws InterruptedException {
                countDownLatch.await();
            }
        });
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    public static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[stackTraceElementArr.length + stackTraceElementArr2.length];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z11 = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, Callable<V> callable) {
        return (V) invokeAtFrontUninterruptibly(handler, 0L, callable);
    }

    public static boolean joinUninterruptibly(Thread thread, long j11) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z11 = false;
        long jElapsedRealtime2 = j11;
        while (jElapsedRealtime2 > 0) {
            try {
                thread.join(jElapsedRealtime2);
                break;
            } catch (InterruptedException unused) {
                jElapsedRealtime2 = j11 - (SystemClock.elapsedRealtime() - jElapsedRealtime);
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class ThreadChecker {
        private Thread thread;

        public ThreadChecker() {
            this.thread = Thread.currentThread();
        }

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = Thread.currentThread();
            }
            if (Thread.currentThread() != this.thread) {
                throw new IllegalStateException("Wrong thread");
            }
        }

        public void detachThread() {
            this.thread = null;
        }

        public ThreadChecker(Thread thread) {
            Thread.currentThread();
            this.thread = thread;
        }
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j11) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zAwait = false;
        long jElapsedRealtime2 = j11;
        boolean z11 = false;
        while (true) {
            try {
                zAwait = countDownLatch.await(jElapsedRealtime2, TimeUnit.MILLISECONDS);
                break;
            } catch (InterruptedException unused) {
                jElapsedRealtime2 = j11 - (SystemClock.elapsedRealtime() - jElapsedRealtime);
                if (jElapsedRealtime2 <= 0) {
                    z11 = true;
                    break;
                }
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return zAwait;
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, long j11, final Callable<V> callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
        final C1Result c1Result = new C1Result();
        final C1CaughtException c1CaughtException = new C1CaughtException();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!handler.post(new Runnable() { // from class: io.agora.base.internal.ThreadUtils.3
            /* JADX WARN: Type inference failed for: r1v2, types: [V, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    c1Result.value = callable.call();
                } catch (Exception e12) {
                    c1CaughtException.f103944e = e12;
                }
                countDownLatch.countDown();
            }
        })) {
            c1CaughtException.f103944e = new Exception("handler post fail at invokeAtFrontUninterruptibly !");
        } else if (j11 <= 0) {
            awaitUninterruptibly(countDownLatch);
        } else {
            awaitUninterruptibly(countDownLatch, j11);
        }
        if (c1CaughtException.f103944e == null) {
            return c1Result.value;
        }
        RuntimeException runtimeException = new RuntimeException(c1CaughtException.f103944e);
        runtimeException.setStackTrace(concatStackTraces(c1CaughtException.f103944e.getStackTrace(), runtimeException.getStackTrace()));
        throw runtimeException;
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class ConditionVariable {
        private final Object lock;
        private volatile boolean mCondition;

        public ConditionVariable() {
            this.lock = new Object();
            this.mCondition = false;
        }

        public void block() {
            synchronized (this.lock) {
                while (!this.mCondition) {
                    try {
                        this.lock.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void close() {
            synchronized (this.lock) {
                this.mCondition = false;
            }
        }

        public void open() {
            synchronized (this.lock) {
                try {
                    boolean z11 = this.mCondition;
                    this.mCondition = true;
                    if (!z11) {
                        this.lock.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public boolean opened() {
            return this.mCondition;
        }

        public ConditionVariable(boolean z11) {
            this.lock = new Object();
            this.mCondition = z11;
        }

        public boolean block(long j11) {
            boolean z11;
            if (j11 != 0) {
                synchronized (this.lock) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j12 = j11 + jElapsedRealtime;
                    while (!this.mCondition && jElapsedRealtime < j12) {
                        try {
                            this.lock.wait(j12 - jElapsedRealtime);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    z11 = this.mCondition;
                }
                return z11;
            }
            block();
            return true;
        }
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() { // from class: io.agora.base.internal.ThreadUtils.1
            @Override // io.agora.base.internal.ThreadUtils.BlockingOperation
            public void run() throws InterruptedException {
                thread.join();
            }
        });
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new Callable<Void>() { // from class: io.agora.base.internal.ThreadUtils.4
            @Override // java.util.concurrent.Callable
            public Void call() {
                runnable.run();
                return null;
            }
        });
    }
}
