package yl;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d extends ql.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f140756a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ql.c f140757b;

    public final void E(ql.c cVar) {
        synchronized (this.f140756a) {
            this.f140757b = cVar;
        }
    }

    @Override // ql.c
    public final void e() {
        synchronized (this.f140756a) {
            try {
                ql.c cVar = this.f140757b;
                if (cVar != null) {
                    cVar.e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ql.c
    public void g(ql.h hVar) {
        synchronized (this.f140756a) {
            try {
                ql.c cVar = this.f140757b;
                if (cVar != null) {
                    cVar.g(hVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ql.c, yl.a
    public final void i() {
        synchronized (this.f140756a) {
            try {
                ql.c cVar = this.f140757b;
                if (cVar != null) {
                    cVar.i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ql.c
    public final void j() {
        synchronized (this.f140756a) {
            try {
                ql.c cVar = this.f140757b;
                if (cVar != null) {
                    cVar.j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ql.c
    public void k() {
        synchronized (this.f140756a) {
            try {
                ql.c cVar = this.f140757b;
                if (cVar != null) {
                    cVar.k();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ql.c
    public final void n() {
        synchronized (this.f140756a) {
            try {
                ql.c cVar = this.f140757b;
                if (cVar != null) {
                    cVar.n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
