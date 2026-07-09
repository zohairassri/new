package com.bumptech.glide.load.engine;

import ae.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class r implements gd.c, a.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final w4.f f19131e = ae.a.d(20, new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ae.c f19132a = ae.c.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gd.c f19133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19135d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements a.d {
        a() {
        }

        @Override // ae.a.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a() {
            return new r();
        }
    }

    r() {
    }

    private void d(gd.c cVar) {
        this.f19135d = false;
        this.f19134c = true;
        this.f19133b = cVar;
    }

    static r f(gd.c cVar) {
        r rVar = (r) zd.k.d((r) f19131e.b());
        rVar.d(cVar);
        return rVar;
    }

    private void g() {
        this.f19133b = null;
        f19131e.a(this);
    }

    @Override // gd.c
    public int a() {
        return this.f19133b.a();
    }

    @Override // gd.c
    public synchronized void b() {
        this.f19132a.c();
        this.f19135d = true;
        if (!this.f19134c) {
            this.f19133b.b();
            g();
        }
    }

    @Override // gd.c
    public Class c() {
        return this.f19133b.c();
    }

    @Override // ae.a.f
    public ae.c e() {
        return this.f19132a;
    }

    @Override // gd.c
    public Object get() {
        return this.f19133b.get();
    }

    synchronized void h() {
        this.f19132a.c();
        if (!this.f19134c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f19134c = false;
        if (this.f19135d) {
            b();
        }
    }
}
