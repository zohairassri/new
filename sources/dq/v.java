package dq;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class v implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f90375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kq.i f90376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f90377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final aq.a f90378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f90379e = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    interface a {
        void a(kq.i iVar, Thread thread, Throwable th2);
    }

    public v(a aVar, kq.i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, aq.a aVar2) {
        this.f90375a = aVar;
        this.f90376b = iVar;
        this.f90377c = uncaughtExceptionHandler;
        this.f90378d = aVar2;
    }

    private boolean b(Thread thread, Throwable th2) {
        if (thread == null) {
            aq.g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th2 == null) {
            aq.g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f90378d.b()) {
            return true;
        }
        aq.g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean a() {
        return this.f90379e.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        this.f90379e.set(true);
        try {
            try {
                if (b(thread, th2)) {
                    this.f90375a.a(this.f90376b, thread, th2);
                } else {
                    aq.g.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e11) {
                aq.g.f().e("An error occurred in the uncaught exception handler", e11);
            }
            aq.g.f().b("Completed exception processing. Invoking default exception handler.");
            this.f90377c.uncaughtException(thread, th2);
            this.f90379e.set(false);
        } catch (Throwable th3) {
            aq.g.f().b("Completed exception processing. Invoking default exception handler.");
            this.f90377c.uncaughtException(thread, th2);
            this.f90379e.set(false);
            throw th3;
        }
    }
}
