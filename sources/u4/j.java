package u4;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
abstract class j {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f131020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f131021b;

        /* JADX INFO: renamed from: u4.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        private static class C1786a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f131022a;

            C1786a(Runnable runnable, String str, int i11) {
                super(runnable, str);
                this.f131022a = i11;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f131022a);
                super.run();
            }
        }

        a(String str, int i11) {
            this.f131020a = str;
            this.f131021b = i11;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C1786a(runnable, this.f131020a, this.f131021b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f131023a;

        b(Handler handler) {
            this.f131023a = (Handler) w4.i.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f131023a.post((Runnable) w4.i.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f131023a + " is shutting down");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Callable f131024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private w4.a f131025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f131026c;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ w4.a f131027a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f131028b;

            a(w4.a aVar, Object obj) {
                this.f131027a = aVar;
                this.f131028b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f131027a.accept(this.f131028b);
            }
        }

        c(Handler handler, Callable callable, w4.a aVar) {
            this.f131024a = callable;
            this.f131025b = aVar;
            this.f131026c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f131024a.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f131026c.post(new a(this.f131025b, objCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i11, int i12) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i12, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i11));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static void c(Executor executor, Callable callable, w4.a aVar) {
        executor.execute(new c(u4.b.a(), callable, aVar));
    }

    static Object d(ExecutorService executorService, Callable callable, int i11) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i11, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            throw e11;
        } catch (ExecutionException e12) {
            throw new RuntimeException(e12);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
