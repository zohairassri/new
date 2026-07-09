package tl;

import ql.s;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f130193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f130194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f130196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f130197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s f130198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f130199g;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private s f130204e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f130200a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f130201b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f130202c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f130203d = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f130205f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f130206g = false;

        public c a() {
            return new c(this, null);
        }

        public a b(int i11) {
            this.f130205f = i11;
            return this;
        }

        public a c(int i11) {
            this.f130201b = i11;
            return this;
        }

        public a d(int i11) {
            this.f130202c = i11;
            return this;
        }

        public a e(boolean z11) {
            this.f130206g = z11;
            return this;
        }

        public a f(boolean z11) {
            this.f130203d = z11;
            return this;
        }

        public a g(boolean z11) {
            this.f130200a = z11;
            return this;
        }

        public a h(s sVar) {
            this.f130204e = sVar;
            return this;
        }

        final /* synthetic */ boolean i() {
            return this.f130200a;
        }

        final /* synthetic */ int j() {
            return this.f130201b;
        }

        final /* synthetic */ int k() {
            return this.f130202c;
        }

        final /* synthetic */ boolean l() {
            return this.f130203d;
        }

        final /* synthetic */ s m() {
            return this.f130204e;
        }

        final /* synthetic */ int n() {
            return this.f130205f;
        }

        final /* synthetic */ boolean o() {
            return this.f130206g;
        }
    }

    /* synthetic */ c(a aVar, byte[] bArr) {
        this.f130193a = aVar.i();
        this.f130194b = aVar.j();
        this.f130195c = aVar.k();
        this.f130196d = aVar.l();
        this.f130197e = aVar.n();
        this.f130198f = aVar.m();
        this.f130199g = aVar.o();
    }

    public int a() {
        return this.f130197e;
    }

    public int b() {
        return this.f130194b;
    }

    public int c() {
        return this.f130195c;
    }

    public s d() {
        return this.f130198f;
    }

    public boolean e() {
        return this.f130196d;
    }

    public boolean f() {
        return this.f130193a;
    }

    public final boolean g() {
        return this.f130199g;
    }
}
