package jd;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import n4.f;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f105535b = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile int f105536c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f105537a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f105538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f105539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f105540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ThreadFactory f105541d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e f105542e = e.f105556d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f105543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f105544g;

        b(boolean z11) {
            this.f105538a = z11;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f105543f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f105543f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f105539b, this.f105540c, this.f105544g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f105541d, this.f105543f, this.f105542e, this.f105538a));
            if (this.f105544g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f105543f = str;
            return this;
        }

        public b c(int i11) {
            this.f105539b = i11;
            this.f105540c = i11;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: jd.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class C1297a extends Thread {
            C1297a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C1297a(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadFactory f105546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f105547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e f105548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f105549d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AtomicInteger f105550e = new AtomicInteger();

        /* JADX INFO: renamed from: jd.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class RunnableC1298a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f105551a;

            RunnableC1298a(Runnable runnable) {
                this.f105551a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f105549d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f105551a.run();
                } catch (Throwable th2) {
                    d.this.f105548c.a(th2);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z11) {
            this.f105546a = threadFactory;
            this.f105547b = str;
            this.f105548c = eVar;
            this.f105549d = z11;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f105546a.newThread(new RunnableC1298a(runnable));
            threadNewThread.setName("glide-" + this.f105547b + "-thread-" + this.f105550e.getAndIncrement());
            return threadNewThread;
        }
    }

    a(ExecutorService executorService) {
        this.f105537a = executorService;
    }

    static int a() {
        return c() >= 4 ? 2 : 1;
    }

    public static int c() {
        if (f105536c == 0) {
            f105536c = Math.min(4, jd.b.a());
        }
        return f105536c;
    }

    public static b e() {
        return new b(true).c(a()).b("animation");
    }

    public static a f() {
        return e().a();
    }

    public static b h() {
        return new b(true).c(1).b("disk-cache");
    }

    public static a j() {
        return h().a();
    }

    public static b k() {
        return new b(false).c(c()).b("source");
    }

    public static a n() {
        return k().a();
    }

    public static a o() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f105535b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f105556d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j11, TimeUnit timeUnit) {
        return this.f105537a.awaitTermination(j11, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        f.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f105537a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f105537a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f105537a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f105537a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f105537a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f105537a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f105537a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f105537a.submit(runnable);
    }

    public String toString() {
        return this.f105537a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j11, TimeUnit timeUnit) {
        return this.f105537a.invokeAll(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j11, TimeUnit timeUnit) {
        return this.f105537a.invokeAny(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f105537a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f105537a.submit(callable);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f105553a = new C1299a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f105554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f105555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f105556d;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class b implements e {
            b() {
            }

            @Override // jd.a.e
            public void a(Throwable th2) {
                if (th2 == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class c implements e {
            c() {
            }

            @Override // jd.a.e
            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            f105554b = bVar;
            f105555c = new c();
            f105556d = bVar;
        }

        void a(Throwable th2);

        /* JADX INFO: renamed from: jd.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class C1299a implements e {
            C1299a() {
            }

            @Override // jd.a.e
            public void a(Throwable th2) {
            }
        }
    }
}
