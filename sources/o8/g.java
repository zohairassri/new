package o8;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f120148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f120149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f120150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f120151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f120152e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f120158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f120159l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Layout.Alignment f120162o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Layout.Alignment f120163p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f120165r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f120167t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f120168u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f120153f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f120154g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f120155h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f120156i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f120157j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f120160m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f120161n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f120164q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f120166s = Float.MAX_VALUE;

    private g t(g gVar, boolean z11) {
        int i11;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f120150c && gVar.f120150c) {
                z(gVar.f120149b);
            }
            if (this.f120155h == -1) {
                this.f120155h = gVar.f120155h;
            }
            if (this.f120156i == -1) {
                this.f120156i = gVar.f120156i;
            }
            if (this.f120148a == null && (str = gVar.f120148a) != null) {
                this.f120148a = str;
            }
            if (this.f120153f == -1) {
                this.f120153f = gVar.f120153f;
            }
            if (this.f120154g == -1) {
                this.f120154g = gVar.f120154g;
            }
            if (this.f120161n == -1) {
                this.f120161n = gVar.f120161n;
            }
            if (this.f120162o == null && (alignment2 = gVar.f120162o) != null) {
                this.f120162o = alignment2;
            }
            if (this.f120163p == null && (alignment = gVar.f120163p) != null) {
                this.f120163p = alignment;
            }
            if (this.f120164q == -1) {
                this.f120164q = gVar.f120164q;
            }
            if (this.f120157j == -1) {
                this.f120157j = gVar.f120157j;
                this.f120158k = gVar.f120158k;
            }
            if (this.f120165r == null) {
                this.f120165r = gVar.f120165r;
            }
            if (this.f120166s == Float.MAX_VALUE) {
                this.f120166s = gVar.f120166s;
            }
            if (this.f120167t == null) {
                this.f120167t = gVar.f120167t;
            }
            if (this.f120168u == null) {
                this.f120168u = gVar.f120168u;
            }
            if (z11 && !this.f120152e && gVar.f120152e) {
                w(gVar.f120151d);
            }
            if (z11 && this.f120160m == -1 && (i11 = gVar.f120160m) != -1) {
                this.f120160m = i11;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f120148a = str;
        return this;
    }

    public g B(float f11) {
        this.f120158k = f11;
        return this;
    }

    public g C(int i11) {
        this.f120157j = i11;
        return this;
    }

    public g D(String str) {
        this.f120159l = str;
        return this;
    }

    public g E(boolean z11) {
        this.f120156i = z11 ? 1 : 0;
        return this;
    }

    public g F(boolean z11) {
        this.f120153f = z11 ? 1 : 0;
        return this;
    }

    public g G(Layout.Alignment alignment) {
        this.f120163p = alignment;
        return this;
    }

    public g H(String str) {
        this.f120167t = str;
        return this;
    }

    public g I(int i11) {
        this.f120161n = i11;
        return this;
    }

    public g J(int i11) {
        this.f120160m = i11;
        return this;
    }

    public g K(float f11) {
        this.f120166s = f11;
        return this;
    }

    public g L(Layout.Alignment alignment) {
        this.f120162o = alignment;
        return this;
    }

    public g M(boolean z11) {
        this.f120164q = z11 ? 1 : 0;
        return this;
    }

    public g N(b bVar) {
        this.f120165r = bVar;
        return this;
    }

    public g O(boolean z11) {
        this.f120154g = z11 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return t(gVar, true);
    }

    public int b() {
        if (this.f120152e) {
            return this.f120151d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public String c() {
        return this.f120168u;
    }

    public int d() {
        if (this.f120150c) {
            return this.f120149b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String e() {
        return this.f120148a;
    }

    public float f() {
        return this.f120158k;
    }

    public int g() {
        return this.f120157j;
    }

    public String h() {
        return this.f120159l;
    }

    public Layout.Alignment i() {
        return this.f120163p;
    }

    public String j() {
        return this.f120167t;
    }

    public int k() {
        return this.f120161n;
    }

    public int l() {
        return this.f120160m;
    }

    public float m() {
        return this.f120166s;
    }

    public int n() {
        int i11 = this.f120155h;
        if (i11 == -1 && this.f120156i == -1) {
            return -1;
        }
        return (i11 == 1 ? 1 : 0) | (this.f120156i == 1 ? 2 : 0);
    }

    public Layout.Alignment o() {
        return this.f120162o;
    }

    public boolean p() {
        return this.f120164q == 1;
    }

    public b q() {
        return this.f120165r;
    }

    public boolean r() {
        return this.f120152e;
    }

    public boolean s() {
        return this.f120150c;
    }

    public boolean u() {
        return this.f120153f == 1;
    }

    public boolean v() {
        return this.f120154g == 1;
    }

    public g w(int i11) {
        this.f120151d = i11;
        this.f120152e = true;
        return this;
    }

    public g x(boolean z11) {
        this.f120155h = z11 ? 1 : 0;
        return this;
    }

    public g y(String str) {
        this.f120168u = str;
        return this;
    }

    public g z(int i11) {
        this.f120149b = i11;
        this.f120150c = true;
        return this;
    }
}
