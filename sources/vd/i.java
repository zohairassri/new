package vd;

import vd.d;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class i implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f132948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f132949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile c f132950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile c f132951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d.a f132952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d.a f132953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f132954g;

    public i(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f132952e = aVar;
        this.f132953f = aVar;
        this.f132949b = obj;
        this.f132948a = dVar;
    }

    private boolean k() {
        d dVar = this.f132948a;
        return dVar == null || dVar.i(this);
    }

    private boolean l() {
        d dVar = this.f132948a;
        return dVar == null || dVar.d(this);
    }

    private boolean m() {
        d dVar = this.f132948a;
        return dVar == null || dVar.f(this);
    }

    @Override // vd.c
    public boolean a() {
        boolean z11;
        synchronized (this.f132949b) {
            z11 = this.f132952e == d.a.SUCCESS;
        }
        return z11;
    }

    @Override // vd.d, vd.c
    public boolean b() {
        boolean z11;
        synchronized (this.f132949b) {
            try {
                z11 = this.f132951d.b() || this.f132950c.b();
            } finally {
            }
        }
        return z11;
    }

    @Override // vd.d
    public void c(c cVar) {
        synchronized (this.f132949b) {
            try {
                if (cVar.equals(this.f132951d)) {
                    this.f132953f = d.a.SUCCESS;
                    return;
                }
                this.f132952e = d.a.SUCCESS;
                d dVar = this.f132948a;
                if (dVar != null) {
                    dVar.c(this);
                }
                if (!this.f132953f.b()) {
                    this.f132951d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // vd.c
    public void clear() {
        synchronized (this.f132949b) {
            this.f132954g = false;
            d.a aVar = d.a.CLEARED;
            this.f132952e = aVar;
            this.f132953f = aVar;
            this.f132951d.clear();
            this.f132950c.clear();
        }
    }

    @Override // vd.d
    public boolean d(c cVar) {
        boolean z11;
        synchronized (this.f132949b) {
            try {
                z11 = l() && cVar.equals(this.f132950c) && !b();
            } finally {
            }
        }
        return z11;
    }

    @Override // vd.c
    public boolean e(c cVar) {
        if (cVar instanceof i) {
            i iVar = (i) cVar;
            if (this.f132950c != null ? this.f132950c.e(iVar.f132950c) : iVar.f132950c == null) {
                if (this.f132951d == null) {
                    if (iVar.f132951d == null) {
                        return true;
                    }
                } else if (this.f132951d.e(iVar.f132951d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // vd.d
    public boolean f(c cVar) {
        boolean z11;
        synchronized (this.f132949b) {
            try {
                z11 = m() && (cVar.equals(this.f132950c) || this.f132952e != d.a.SUCCESS);
            } finally {
            }
        }
        return z11;
    }

    @Override // vd.c
    public boolean g() {
        boolean z11;
        synchronized (this.f132949b) {
            z11 = this.f132952e == d.a.CLEARED;
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
        synchronized (this.f132949b) {
            try {
                d dVar = this.f132948a;
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
        synchronized (this.f132949b) {
            try {
                if (!cVar.equals(this.f132950c)) {
                    this.f132953f = d.a.FAILED;
                    return;
                }
                this.f132952e = d.a.FAILED;
                d dVar = this.f132948a;
                if (dVar != null) {
                    dVar.h(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // vd.d
    public boolean i(c cVar) {
        boolean z11;
        synchronized (this.f132949b) {
            try {
                z11 = k() && cVar.equals(this.f132950c) && this.f132952e != d.a.PAUSED;
            } finally {
            }
        }
        return z11;
    }

    @Override // vd.c
    public boolean isRunning() {
        boolean z11;
        synchronized (this.f132949b) {
            z11 = this.f132952e == d.a.RUNNING;
        }
        return z11;
    }

    @Override // vd.c
    public void j() {
        synchronized (this.f132949b) {
            try {
                this.f132954g = true;
                try {
                    if (this.f132952e != d.a.SUCCESS) {
                        d.a aVar = this.f132953f;
                        d.a aVar2 = d.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f132953f = aVar2;
                            this.f132951d.j();
                        }
                    }
                    if (this.f132954g) {
                        d.a aVar3 = this.f132952e;
                        d.a aVar4 = d.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f132952e = aVar4;
                            this.f132950c.j();
                        }
                    }
                    this.f132954g = false;
                } catch (Throwable th2) {
                    this.f132954g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void n(c cVar, c cVar2) {
        this.f132950c = cVar;
        this.f132951d = cVar2;
    }

    @Override // vd.c
    public void pause() {
        synchronized (this.f132949b) {
            try {
                if (!this.f132953f.b()) {
                    this.f132953f = d.a.PAUSED;
                    this.f132951d.pause();
                }
                if (!this.f132952e.b()) {
                    this.f132952e = d.a.PAUSED;
                    this.f132950c.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
