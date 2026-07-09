package com.google.android.gms.internal.ads;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class oc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f31858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f31859e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f31865k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f31866l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Layout.Alignment f31869o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Layout.Alignment f31870p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private hc f31872r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f31874t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f31875u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31860f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f31861g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f31862h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f31863i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f31864j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f31867m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f31868n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f31871q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f31873s = Float.MAX_VALUE;

    public final int A() {
        if (this.f31859e) {
            return this.f31858d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final oc B(int i11) {
        this.f31858d = i11;
        this.f31859e = true;
        return this;
    }

    public final boolean C() {
        return this.f31859e;
    }

    public final oc D(float f11) {
        this.f31873s = f11;
        return this;
    }

    public final float E() {
        return this.f31873s;
    }

    public final oc F(oc ocVar) {
        int i11;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ocVar != null) {
            if (!this.f31857c && ocVar.f31857c) {
                y(ocVar.f31856b);
            }
            if (this.f31862h == -1) {
                this.f31862h = ocVar.f31862h;
            }
            if (this.f31863i == -1) {
                this.f31863i = ocVar.f31863i;
            }
            if (this.f31855a == null && (str = ocVar.f31855a) != null) {
                this.f31855a = str;
            }
            if (this.f31860f == -1) {
                this.f31860f = ocVar.f31860f;
            }
            if (this.f31861g == -1) {
                this.f31861g = ocVar.f31861g;
            }
            if (this.f31868n == -1) {
                this.f31868n = ocVar.f31868n;
            }
            if (this.f31869o == null && (alignment2 = ocVar.f31869o) != null) {
                this.f31869o = alignment2;
            }
            if (this.f31870p == null && (alignment = ocVar.f31870p) != null) {
                this.f31870p = alignment;
            }
            if (this.f31871q == -1) {
                this.f31871q = ocVar.f31871q;
            }
            if (this.f31864j == -1) {
                this.f31864j = ocVar.f31864j;
                this.f31865k = ocVar.f31865k;
            }
            if (this.f31872r == null) {
                this.f31872r = ocVar.f31872r;
            }
            if (this.f31873s == Float.MAX_VALUE) {
                this.f31873s = ocVar.f31873s;
            }
            if (this.f31874t == null) {
                this.f31874t = ocVar.f31874t;
            }
            if (this.f31875u == null) {
                this.f31875u = ocVar.f31875u;
            }
            if (!this.f31859e && ocVar.f31859e) {
                B(ocVar.f31858d);
            }
            if (this.f31867m == -1 && (i11 = ocVar.f31867m) != -1) {
                this.f31867m = i11;
            }
        }
        return this;
    }

    public final oc G(String str) {
        this.f31866l = str;
        return this;
    }

    public final String H() {
        return this.f31866l;
    }

    public final oc I(int i11) {
        this.f31867m = i11;
        return this;
    }

    public final int J() {
        return this.f31867m;
    }

    public final oc K(int i11) {
        this.f31868n = i11;
        return this;
    }

    public final int L() {
        return this.f31868n;
    }

    public final Layout.Alignment M() {
        return this.f31869o;
    }

    public final oc N(Layout.Alignment alignment) {
        this.f31869o = alignment;
        return this;
    }

    public final Layout.Alignment a() {
        return this.f31870p;
    }

    public final oc b(Layout.Alignment alignment) {
        this.f31870p = alignment;
        return this;
    }

    public final boolean c() {
        return this.f31871q == 1;
    }

    public final oc d(boolean z11) {
        this.f31871q = z11 ? 1 : 0;
        return this;
    }

    public final hc e() {
        return this.f31872r;
    }

    public final oc f(hc hcVar) {
        this.f31872r = hcVar;
        return this;
    }

    public final oc g(float f11) {
        this.f31865k = f11;
        return this;
    }

    public final oc h(int i11) {
        this.f31864j = i11;
        return this;
    }

    public final int i() {
        return this.f31864j;
    }

    public final float j() {
        return this.f31865k;
    }

    public final oc k(String str) {
        this.f31874t = str;
        return this;
    }

    public final String l() {
        return this.f31874t;
    }

    public final oc m(String str) {
        this.f31875u = str;
        return this;
    }

    public final String n() {
        return this.f31875u;
    }

    public final int o() {
        int i11 = this.f31862h;
        if (i11 == -1 && this.f31863i == -1) {
            return -1;
        }
        return (i11 == 1 ? 1 : 0) | (this.f31863i == 1 ? 2 : 0);
    }

    public final boolean p() {
        return this.f31860f == 1;
    }

    public final oc q(boolean z11) {
        this.f31860f = z11 ? 1 : 0;
        return this;
    }

    public final boolean r() {
        return this.f31861g == 1;
    }

    public final oc s(boolean z11) {
        this.f31861g = z11 ? 1 : 0;
        return this;
    }

    public final oc t(boolean z11) {
        this.f31862h = z11 ? 1 : 0;
        return this;
    }

    public final oc u(boolean z11) {
        this.f31863i = z11 ? 1 : 0;
        return this;
    }

    public final String v() {
        return this.f31855a;
    }

    public final oc w(String str) {
        this.f31855a = str;
        return this;
    }

    public final int x() {
        if (this.f31857c) {
            return this.f31856b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final oc y(int i11) {
        this.f31856b = i11;
        this.f31857c = true;
        return this;
    }

    public final boolean z() {
        return this.f31857c;
    }
}
