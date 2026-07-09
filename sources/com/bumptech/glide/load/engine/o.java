package com.bumptech.glide.load.engine;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class o implements gd.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gd.c f19120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f19121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ed.e f19122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19124g;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    interface a {
        void a(ed.e eVar, o oVar);
    }

    o(gd.c cVar, boolean z11, boolean z12, ed.e eVar, a aVar) {
        this.f19120c = (gd.c) zd.k.d(cVar);
        this.f19118a = z11;
        this.f19119b = z12;
        this.f19122e = eVar;
        this.f19121d = (a) zd.k.d(aVar);
    }

    @Override // gd.c
    public int a() {
        return this.f19120c.a();
    }

    @Override // gd.c
    public synchronized void b() {
        if (this.f19123f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f19124g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f19124g = true;
        if (this.f19119b) {
            this.f19120c.b();
        }
    }

    @Override // gd.c
    public Class c() {
        return this.f19120c.c();
    }

    synchronized void d() {
        if (this.f19124g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f19123f++;
    }

    gd.c e() {
        return this.f19120c;
    }

    boolean f() {
        return this.f19118a;
    }

    void g() {
        boolean z11;
        synchronized (this) {
            int i11 = this.f19123f;
            if (i11 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z11 = true;
            int i12 = i11 - 1;
            this.f19123f = i12;
            if (i12 != 0) {
                z11 = false;
            }
        }
        if (z11) {
            this.f19121d.a(this.f19122e, this);
        }
    }

    @Override // gd.c
    public Object get() {
        return this.f19120c.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f19118a + ", listener=" + this.f19121d + ", key=" + this.f19122e + ", acquired=" + this.f19123f + ", isRecycled=" + this.f19124g + ", resource=" + this.f19120c + '}';
    }
}
