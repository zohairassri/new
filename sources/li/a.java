package li;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n4.f;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends AbstractExecutorService implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f114346b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f114347a;

    /* JADX INFO: renamed from: li.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class RunnableC1400a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f114348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f114349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile ScheduledFuture f114350c = null;

        public RunnableC1400a(c cVar, Object obj) {
            this.f114348a = new WeakReference(obj);
            this.f114349b = cVar;
        }

        public void a(ScheduledFuture scheduledFuture) {
            this.f114350c = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f114348a.get();
            if (obj != null) {
                this.f114349b.a(obj);
            } else if (this.f114350c != null) {
                this.f114350c.cancel(false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ScheduledExecutorService f114351a;

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f114351a.shutdown();
            try {
                if (this.f114351a.awaitTermination(5L, TimeUnit.SECONDS)) {
                    return;
                }
                this.f114351a.shutdownNow();
            } catch (InterruptedException unused) {
                this.f114351a.shutdownNow();
            }
        }

        private b(ScheduledExecutorService scheduledExecutorService) {
            super("dd-exec-shutdown-hook");
            this.f114351a = scheduledExecutorService;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface c {
        void a(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class d implements ScheduledFuture {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f114352a;

        public d(String str) {
            this.f114352a = str;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            return 0;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            return false;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return null;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public Object get(long j11, TimeUnit timeUnit) {
            return null;
        }
    }

    private a() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(li.c.f114355d);
        this.f114347a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        try {
            Runtime.getRuntime().addShutdownHook(new b(scheduledExecutorServiceNewSingleThreadScheduledExecutor));
        } catch (IllegalStateException unused) {
        }
    }

    public ScheduledFuture a(c cVar, Object obj, long j11, long j12, TimeUnit timeUnit, String str) {
        if (!f114346b.isShutdown()) {
            try {
                RunnableC1400a runnableC1400a = new RunnableC1400a(cVar, obj);
                ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay = this.f114347a.scheduleWithFixedDelay(new RunnableC1400a(cVar, obj), j11, j12, timeUnit);
                runnableC1400a.a(scheduledFutureScheduleWithFixedDelay);
                return scheduledFutureScheduleWithFixedDelay;
            } catch (RejectedExecutionException unused) {
            }
        }
        return new d(str);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j11, TimeUnit timeUnit) {
        return this.f114347a.awaitTermination(j11, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        f.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f114347a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f114347a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f114347a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f114347a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f114347a.shutdownNow();
    }
}
