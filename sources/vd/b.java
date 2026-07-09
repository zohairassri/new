package vd;

import vd.d;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f132899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f132900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile c f132901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile c f132902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d.a f132903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d.a f132904f;

    public b(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f132903e = aVar;
        this.f132904f = aVar;
        this.f132899a = obj;
        this.f132900b = dVar;
    }

    private boolean k(c cVar) {
        d.a aVar = this.f132903e;
        d.a aVar2 = d.a.FAILED;
        if (aVar != aVar2) {
            return cVar.equals(this.f132901c);
        }
        if (!cVar.equals(this.f132902d)) {
            return false;
        }
        d.a aVar3 = this.f132904f;
        return aVar3 == d.a.SUCCESS || aVar3 == aVar2;
    }

    private boolean l() {
        d dVar = this.f132900b;
        return dVar == null || dVar.i(this);
    }

    private boolean m() {
        d dVar = this.f132900b;
        return dVar == null || dVar.d(this);
    }

    private boolean n() {
        d dVar = this.f132900b;
        return dVar == null || dVar.f(this);
    }

    @Override // vd.c
    public boolean a() {
        boolean z11;
        synchronized (this.f132899a) {
            try {
                d.a aVar = this.f132903e;
                d.a aVar2 = d.a.SUCCESS;
                z11 = aVar == aVar2 || this.f132904f == aVar2;
            } finally {
            }
        }
        return z11;
    }

    @Override // vd.d, vd.c
    public boolean b() {
        boolean z11;
        synchronized (this.f132899a) {
            try {
                z11 = this.f132901c.b() || this.f132902d.b();
            } finally {
            }
        }
        return z11;
    }

    @Override // vd.d
    public void c(c cVar) {
        synchronized (this.f132899a) {
            try {
                if (cVar.equals(this.f132901c)) {
                    this.f132903e = d.a.SUCCESS;
                } else if (cVar.equals(this.f132902d)) {
                    this.f132904f = d.a.SUCCESS;
                }
                d dVar = this.f132900b;
                if (dVar != null) {
                    dVar.c(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // vd.c
    public void clear() {
        synchronized (this.f132899a) {
            try {
                d.a aVar = d.a.CLEARED;
                this.f132903e = aVar;
                this.f132901c.clear();
                if (this.f132904f != aVar) {
                    this.f132904f = aVar;
                    this.f132902d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // vd.d
    public boolean d(c cVar) {
        boolean z11;
        synchronized (this.f132899a) {
            try {
                z11 = m() && k(cVar);
            } finally {
            }
        }
        return z11;
    }

    @Override // vd.c
    public boolean e(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f132901c.e(bVar.f132901c) && this.f132902d.e(bVar.f132902d)) {
                return true;
            }
        }
        return false;
    }

    @Override // vd.d
    public boolean f(c cVar) {
        boolean zN;
        synchronized (this.f132899a) {
            zN = n();
        }
        return zN;
    }

    @Override // vd.c
    public boolean g() {
        boolean z11;
        synchronized (this.f132899a) {
            try {
                d.a aVar = this.f132903e;
                d.a aVar2 = d.a.CLEARED;
                z11 = aVar == aVar2 && this.f132904f == aVar2;
            } finally {
            }
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [vd.d] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // vd.d
    public d getRoot() {
        ?? root;
        synchronized (this.f132899a) {
            try {
                d dVar = this.f132900b;
                this = this;
                if (dVar != null) {
                    root = dVar.getRoot();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // vd.d
    public void h(c cVar) {
        synchronized (this.f132899a) {
            try {
                if (cVar.equals(this.f132902d)) {
                    this.f132904f = d.a.FAILED;
                    d dVar = this.f132900b;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    return;
                }
                this.f132903e = d.a.FAILED;
                d.a aVar = this.f132904f;
                d.a aVar2 = d.a.RUNNING;
                if (aVar != aVar2) {
                    this.f132904f = aVar2;
                    this.f132902d.j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // vd.d
    public boolean i(c cVar) {
        boolean z11;
        synchronized (this.f132899a) {
            try {
                z11 = l() && cVar.equals(this.f132901c);
            } finally {
            }
        }
        return z11;
    }

    @Override // vd.c
    public boolean isRunning() {
        boolean z11;
        synchronized (this.f132899a) {
            try {
                d.a aVar = this.f132903e;
                d.a aVar2 = d.a.RUNNING;
                z11 = aVar == aVar2 || this.f132904f == aVar2;
            } finally {
            }
        }
        return z11;
    }

    @Override // vd.c
    public void j() {
        synchronized (this.f132899a) {
            try {
                d.a aVar = this.f132903e;
                d.a aVar2 = d.a.RUNNING;
                if (aVar != aVar2) {
                    this.f132903e = aVar2;
                    this.f132901c.j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void o(c cVar, c cVar2) {
        this.f132901c = cVar;
        this.f132902d = cVar2;
    }

    @Override // vd.c
    public void pause() {
        synchronized (this.f132899a) {
            try {
                d.a aVar = this.f132903e;
                d.a aVar2 = d.a.RUNNING;
                if (aVar == aVar2) {
                    this.f132903e = d.a.PAUSED;
                    this.f132901c.pause();
                }
                if (this.f132904f == aVar2) {
                    this.f132904f = d.a.PAUSED;
                    this.f132902d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
