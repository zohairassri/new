package hl;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f102228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f102229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f102230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f102231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f102232e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f102238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f102239l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Layout.Alignment f102242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Layout.Alignment f102243p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f102245r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f102233f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f102234g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f102235h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f102236i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f102237j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f102240m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f102241n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f102244q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f102246s = Float.MAX_VALUE;

    private g r(g gVar, boolean z11) {
        int i11;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f102230c && gVar.f102230c) {
                w(gVar.f102229b);
            }
            if (this.f102235h == -1) {
                this.f102235h = gVar.f102235h;
            }
            if (this.f102236i == -1) {
                this.f102236i = gVar.f102236i;
            }
            if (this.f102228a == null && (str = gVar.f102228a) != null) {
                this.f102228a = str;
            }
            if (this.f102233f == -1) {
                this.f102233f = gVar.f102233f;
            }
            if (this.f102234g == -1) {
                this.f102234g = gVar.f102234g;
            }
            if (this.f102241n == -1) {
                this.f102241n = gVar.f102241n;
            }
            if (this.f102242o == null && (alignment2 = gVar.f102242o) != null) {
                this.f102242o = alignment2;
            }
            if (this.f102243p == null && (alignment = gVar.f102243p) != null) {
                this.f102243p = alignment;
            }
            if (this.f102244q == -1) {
                this.f102244q = gVar.f102244q;
            }
            if (this.f102237j == -1) {
                this.f102237j = gVar.f102237j;
                this.f102238k = gVar.f102238k;
            }
            if (this.f102245r == null) {
                this.f102245r = gVar.f102245r;
            }
            if (this.f102246s == Float.MAX_VALUE) {
                this.f102246s = gVar.f102246s;
            }
            if (z11 && !this.f102232e && gVar.f102232e) {
                u(gVar.f102231d);
            }
            if (z11 && this.f102240m == -1 && (i11 = gVar.f102240m) != -1) {
                this.f102240m = i11;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f102239l = str;
        return this;
    }

    public g B(boolean z11) {
        this.f102236i = z11 ? 1 : 0;
        return this;
    }

    public g C(boolean z11) {
        this.f102233f = z11 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f102243p = alignment;
        return this;
    }

    public g E(int i11) {
        this.f102241n = i11;
        return this;
    }

    public g F(int i11) {
        this.f102240m = i11;
        return this;
    }

    public g G(float f11) {
        this.f102246s = f11;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f102242o = alignment;
        return this;
    }

    public g I(boolean z11) {
        this.f102244q = z11 ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.f102245r = bVar;
        return this;
    }

    public g K(boolean z11) {
        this.f102234g = z11 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f102232e) {
            return this.f102231d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f102230c) {
            return this.f102229b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f102228a;
    }

    public float e() {
        return this.f102238k;
    }

    public int f() {
        return this.f102237j;
    }

    public String g() {
        return this.f102239l;
    }

    public Layout.Alignment h() {
        return this.f102243p;
    }

    public int i() {
        return this.f102241n;
    }

    public int j() {
        return this.f102240m;
    }

    public float k() {
        return this.f102246s;
    }

    public int l() {
        int i11 = this.f102235h;
        if (i11 == -1 && this.f102236i == -1) {
            return -1;
        }
        return (i11 == 1 ? 1 : 0) | (this.f102236i == 1 ? 2 : 0);
    }

    public Layout.Alignment m() {
        return this.f102242o;
    }

    public boolean n() {
        return this.f102244q == 1;
    }

    public b o() {
        return this.f102245r;
    }

    public boolean p() {
        return this.f102232e;
    }

    public boolean q() {
        return this.f102230c;
    }

    public boolean s() {
        return this.f102233f == 1;
    }

    public boolean t() {
        return this.f102234g == 1;
    }

    public g u(int i11) {
        this.f102231d = i11;
        this.f102232e = true;
        return this;
    }

    public g v(boolean z11) {
        this.f102235h = z11 ? 1 : 0;
        return this;
    }

    public g w(int i11) {
        this.f102229b = i11;
        this.f102230c = true;
        return this;
    }

    public g x(String str) {
        this.f102228a = str;
        return this;
    }

    public g y(float f11) {
        this.f102238k = f11;
        return this;
    }

    public g z(int i11) {
        this.f102237j = i11;
        return this;
    }
}
