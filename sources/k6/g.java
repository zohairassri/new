package k6;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f107603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f107604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f107605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f107606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f107607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f107608f;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void a(Object obj, Object obj2);
    }

    public g(Object obj, Looper looper, Looper looper2, i iVar, a aVar) {
        this.f107603a = iVar.d(looper, null);
        this.f107604b = iVar.d(looper2, null);
        this.f107606d = obj;
        this.f107607e = obj;
        this.f107605c = aVar;
    }

    public static /* synthetic */ void a(final g gVar, zo.g gVar2) {
        final Object objApply = gVar2.apply(gVar.f107607e);
        gVar.f107607e = objApply;
        gVar.f(new Runnable() { // from class: k6.f
            @Override // java.lang.Runnable
            public final void run() {
                g.c(this.f107601a, objApply);
            }
        });
    }

    public static /* synthetic */ void b(g gVar, Object obj) {
        if (gVar.f107608f == 0) {
            gVar.i(obj);
        }
    }

    public static /* synthetic */ void c(g gVar, Object obj) {
        int i11 = gVar.f107608f - 1;
        gVar.f107608f = i11;
        if (i11 == 0) {
            gVar.i(obj);
        }
    }

    private void f(Runnable runnable) {
        if (this.f107604b.f().getThread().isAlive()) {
            this.f107604b.h(runnable);
        }
    }

    private void i(Object obj) {
        Object obj2 = this.f107606d;
        this.f107606d = obj;
        if (obj2.equals(obj)) {
            return;
        }
        this.f107605c.a(obj2, obj);
    }

    public Object d() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.f107604b.f()) {
            return this.f107606d;
        }
        k6.a.g(looperMyLooper == this.f107603a.f());
        return this.f107607e;
    }

    public void e(Runnable runnable) {
        if (this.f107603a.f().getThread().isAlive()) {
            this.f107603a.h(runnable);
        }
    }

    public void g(final Object obj) {
        this.f107607e = obj;
        f(new Runnable() { // from class: k6.d
            @Override // java.lang.Runnable
            public final void run() {
                g.b(this.f107593a, obj);
            }
        });
    }

    public void h(zo.g gVar, final zo.g gVar2) {
        k6.a.g(Looper.myLooper() == this.f107604b.f());
        this.f107608f++;
        e(new Runnable() { // from class: k6.e
            @Override // java.lang.Runnable
            public final void run() {
                g.a(this.f107595a, gVar2);
            }
        });
        i(gVar.apply(this.f107606d));
    }
}
