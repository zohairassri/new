package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class xf5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37955d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w71 f37957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f37958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f37959h;

    /* synthetic */ xf5(wf5 wf5Var, byte[] bArr) {
        this.f37952a = wf5Var.i();
        this.f37953b = wf5Var.j();
        this.f37954c = wf5Var.k();
        this.f37956e = wf5Var.l();
        this.f37957f = wf5Var.m();
        this.f37958g = wf5Var.n();
        this.f37959h = wf5Var.o();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xf5.class == obj.getClass()) {
            xf5 xf5Var = (xf5) obj;
            if (this.f37952a == xf5Var.f37952a && this.f37953b == xf5Var.f37953b && this.f37954c == xf5Var.f37954c && this.f37956e == xf5Var.f37956e && this.f37958g == xf5Var.f37958g && this.f37959h == xf5Var.f37959h && this.f37957f.equals(xf5Var.f37957f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f37952a);
        Integer numValueOf2 = Integer.valueOf(this.f37953b);
        Integer numValueOf3 = Integer.valueOf(this.f37954c);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(numValueOf, numValueOf2, numValueOf3, bool, bool, Integer.valueOf(this.f37956e), this.f37957f, Integer.valueOf(this.f37958g), Integer.valueOf(this.f37959h), bool, bool);
    }
}
