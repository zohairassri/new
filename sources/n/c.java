package n;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile c f117196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Executor f117197d = new Executor() { // from class: n.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().c(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f117198e = new Executor() { // from class: n.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f117199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f117200b;

    private c() {
        d dVar = new d();
        this.f117200b = dVar;
        this.f117199a = dVar;
    }

    public static Executor f() {
        return f117198e;
    }

    public static c g() {
        if (f117196c != null) {
            return f117196c;
        }
        synchronized (c.class) {
            try {
                if (f117196c == null) {
                    f117196c = new c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f117196c;
    }

    @Override // n.e
    public void a(Runnable runnable) {
        this.f117199a.a(runnable);
    }

    @Override // n.e
    public boolean b() {
        return this.f117199a.b();
    }

    @Override // n.e
    public void c(Runnable runnable) {
        this.f117199a.c(runnable);
    }
}
