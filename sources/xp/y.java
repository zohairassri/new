package xp;

import vq.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class y implements vq.b, vq.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a.InterfaceC1858a f137956c = new a.InterfaceC1858a() { // from class: xp.v
        @Override // vq.a.InterfaceC1858a
        public final void a(vq.b bVar) {
            y.d(bVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final vq.b f137957d = new vq.b() { // from class: xp.w
        @Override // vq.b
        public final Object get() {
            return y.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.InterfaceC1858a f137958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile vq.b f137959b;

    private y(a.InterfaceC1858a interfaceC1858a, vq.b bVar) {
        this.f137958a = interfaceC1858a;
        this.f137959b = bVar;
    }

    public static /* synthetic */ Object b() {
        return null;
    }

    public static /* synthetic */ void c(a.InterfaceC1858a interfaceC1858a, a.InterfaceC1858a interfaceC1858a2, vq.b bVar) {
        interfaceC1858a.a(bVar);
        interfaceC1858a2.a(bVar);
    }

    static y e() {
        return new y(f137956c, f137957d);
    }

    static y f(vq.b bVar) {
        return new y(null, bVar);
    }

    @Override // vq.a
    public void a(final a.InterfaceC1858a interfaceC1858a) {
        vq.b bVar;
        vq.b bVar2;
        vq.b bVar3 = this.f137959b;
        vq.b bVar4 = f137957d;
        if (bVar3 != bVar4) {
            interfaceC1858a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f137959b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final a.InterfaceC1858a interfaceC1858a2 = this.f137958a;
                this.f137958a = new a.InterfaceC1858a() { // from class: xp.x
                    @Override // vq.a.InterfaceC1858a
                    public final void a(vq.b bVar5) {
                        y.c(interfaceC1858a2, interfaceC1858a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC1858a.a(bVar);
        }
    }

    void g(vq.b bVar) {
        a.InterfaceC1858a interfaceC1858a;
        if (this.f137959b != f137957d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC1858a = this.f137958a;
            this.f137958a = null;
            this.f137959b = bVar;
        }
        interfaceC1858a.a(bVar);
    }

    @Override // vq.b
    public Object get() {
        return this.f137959b.get();
    }

    public static /* synthetic */ void d(vq.b bVar) {
    }
}
