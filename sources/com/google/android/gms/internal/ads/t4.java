package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35254g;

    public t4() {
    }

    public final boolean a(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (!u4.l(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0 || (i14 = (i11 >>> 12) & 15) == 0 || i14 == 15 || (i15 = (i11 >>> 10) & 3) == 3) {
            return false;
        }
        int i16 = i14 - 1;
        this.f35248a = i12;
        this.f35249b = u4.f35890a[3 - i13];
        int i17 = u4.f35891b[i15];
        this.f35251d = i17;
        if (i12 == 2) {
            i17 /= 2;
            this.f35251d = i17;
        } else if (i12 == 0) {
            i17 /= 4;
            this.f35251d = i17;
        }
        int i18 = (i11 >>> 9) & 1;
        this.f35254g = u4.m(i12, i13);
        if (i13 == 3) {
            int i19 = i12 == 3 ? u4.f35892c[i16] : u4.f35893d[i16];
            this.f35253f = i19;
            this.f35250c = (((i19 * 12) / i17) + i18) * 4;
        } else {
            if (i12 == 3) {
                int i21 = i13 == 2 ? u4.f35894e[i16] : u4.f35895f[i16];
                this.f35253f = i21;
                this.f35250c = ((i21 * 144) / i17) + i18;
            } else {
                int i22 = u4.f35896g[i16];
                this.f35253f = i22;
                this.f35250c = (((i13 == 1 ? 72 : 144) * i22) / i17) + i18;
            }
        }
        this.f35252e = ((i11 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public t4(t4 t4Var) {
        this.f35248a = t4Var.f35248a;
        this.f35249b = t4Var.f35249b;
        this.f35250c = t4Var.f35250c;
        this.f35251d = t4Var.f35251d;
        this.f35252e = t4Var.f35252e;
        this.f35253f = t4Var.f35253f;
        this.f35254g = t4Var.f35254g;
    }
}
