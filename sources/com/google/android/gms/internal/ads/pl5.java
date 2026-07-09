package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class pl5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f33025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33026e;

    private pl5(Object obj, int i11, int i12, long j11, int i13) {
        this.f33022a = obj;
        this.f33023b = i11;
        this.f33024c = i12;
        this.f33025d = j11;
        this.f33026e = i13;
    }

    public final pl5 a(Object obj) {
        return this.f33022a.equals(obj) ? this : new pl5(obj, this.f33023b, this.f33024c, this.f33025d, this.f33026e);
    }

    public final boolean b() {
        return this.f33023b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl5)) {
            return false;
        }
        pl5 pl5Var = (pl5) obj;
        return this.f33022a.equals(pl5Var.f33022a) && this.f33023b == pl5Var.f33023b && this.f33024c == pl5Var.f33024c && this.f33025d == pl5Var.f33025d && this.f33026e == pl5Var.f33026e;
    }

    public final int hashCode() {
        return ((((((((this.f33022a.hashCode() + 527) * 31) + this.f33023b) * 31) + this.f33024c) * 31) + ((int) this.f33025d)) * 31) + this.f33026e;
    }

    public pl5(Object obj, int i11, int i12, long j11) {
        this(obj, i11, i12, j11, -1);
    }

    public pl5(Object obj, long j11) {
        this(obj, -1, -1, j11, -1);
    }

    public pl5(Object obj, long j11, int i11) {
        this(obj, -1, -1, j11, i11);
    }
}
