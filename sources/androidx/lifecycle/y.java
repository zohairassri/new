package androidx.lifecycle;

import androidx.lifecycle.l;
import java.util.Map;
import o.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Object f8574k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f8575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o.b f8576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f8577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f8579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile Object f8580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f8584j;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (y.this.f8575a) {
                obj = y.this.f8580f;
                y.this.f8580f = y.f8574k;
            }
            y.this.l(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class b extends d {
        b(b0 b0Var) {
            super(b0Var);
        }

        @Override // androidx.lifecycle.y.d
        boolean d() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class c extends d implements p {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final s f8587e;

        c(s sVar, b0 b0Var) {
            super(b0Var);
            this.f8587e = sVar;
        }

        @Override // androidx.lifecycle.p
        public void C(s sVar, l.a aVar) {
            l.b bVarB = this.f8587e.getLifecycle().b();
            if (bVarB == l.b.f8503a) {
                y.this.k(this.f8589a);
                return;
            }
            l.b bVar = null;
            while (bVar != bVarB) {
                a(d());
                bVar = bVarB;
                bVarB = this.f8587e.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.y.d
        void b() {
            this.f8587e.getLifecycle().d(this);
        }

        @Override // androidx.lifecycle.y.d
        boolean c(s sVar) {
            return this.f8587e == sVar;
        }

        @Override // androidx.lifecycle.y.d
        boolean d() {
            return this.f8587e.getLifecycle().b().b(l.b.f8506d);
        }
    }

    public y(Object obj) {
        this.f8575a = new Object();
        this.f8576b = new o.b();
        this.f8577c = 0;
        this.f8580f = f8574k;
        this.f8584j = new a();
        this.f8579e = obj;
        this.f8581g = 0;
    }

    static void a(String str) {
        if (n.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void c(d dVar) {
        if (dVar.f8590b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i11 = dVar.f8591c;
            int i12 = this.f8581g;
            if (i11 >= i12) {
                return;
            }
            dVar.f8591c = i12;
            dVar.f8589a.d(this.f8579e);
        }
    }

    void b(int i11) {
        int i12 = this.f8577c;
        this.f8577c = i11 + i12;
        if (this.f8578d) {
            return;
        }
        this.f8578d = true;
        while (true) {
            try {
                int i13 = this.f8577c;
                if (i12 == i13) {
                    this.f8578d = false;
                    return;
                }
                boolean z11 = i12 == 0 && i13 > 0;
                boolean z12 = i12 > 0 && i13 == 0;
                if (z11) {
                    h();
                } else if (z12) {
                    i();
                }
                i12 = i13;
            } catch (Throwable th2) {
                this.f8578d = false;
                throw th2;
            }
        }
    }

    void d(d dVar) {
        if (this.f8582h) {
            this.f8583i = true;
            return;
        }
        this.f8582h = true;
        do {
            this.f8583i = false;
            if (dVar != null) {
                c(dVar);
                dVar = null;
            } else {
                b.d dVarD = this.f8576b.d();
                while (dVarD.hasNext()) {
                    c((d) ((Map.Entry) dVarD.next()).getValue());
                    if (this.f8583i) {
                        break;
                    }
                }
            }
        } while (this.f8583i);
        this.f8582h = false;
    }

    public Object e() {
        Object obj = this.f8579e;
        if (obj != f8574k) {
            return obj;
        }
        return null;
    }

    public void f(s sVar, b0 b0Var) {
        a("observe");
        if (sVar.getLifecycle().b() == l.b.f8503a) {
            return;
        }
        c cVar = new c(sVar, b0Var);
        d dVar = (d) this.f8576b.j(b0Var, cVar);
        if (dVar != null && !dVar.c(sVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        sVar.getLifecycle().a(cVar);
    }

    public void g(b0 b0Var) {
        a("observeForever");
        b bVar = new b(b0Var);
        d dVar = (d) this.f8576b.j(b0Var, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.a(true);
    }

    protected void j(Object obj) {
        boolean z11;
        synchronized (this.f8575a) {
            z11 = this.f8580f == f8574k;
            this.f8580f = obj;
        }
        if (z11) {
            n.c.g().c(this.f8584j);
        }
    }

    public void k(b0 b0Var) {
        a("removeObserver");
        d dVar = (d) this.f8576b.l(b0Var);
        if (dVar == null) {
            return;
        }
        dVar.b();
        dVar.a(false);
    }

    protected void l(Object obj) {
        a("setValue");
        this.f8581g++;
        this.f8579e = obj;
        d(null);
    }

    public y() {
        this.f8575a = new Object();
        this.f8576b = new o.b();
        this.f8577c = 0;
        Object obj = f8574k;
        this.f8580f = obj;
        this.f8584j = new a();
        this.f8579e = obj;
        this.f8581g = -1;
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b0 f8589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f8590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8591c = -1;

        d(b0 b0Var) {
            this.f8589a = b0Var;
        }

        void a(boolean z11) {
            if (z11 == this.f8590b) {
                return;
            }
            this.f8590b = z11;
            y.this.b(z11 ? 1 : -1);
            if (this.f8590b) {
                y.this.d(this);
            }
        }

        boolean c(s sVar) {
            return false;
        }

        abstract boolean d();

        void b() {
        }
    }

    protected void h() {
    }

    protected void i() {
    }
}
