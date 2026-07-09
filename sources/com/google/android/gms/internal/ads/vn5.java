package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class vn5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36918b;

    public vn5(long j11, long j12) {
        this.f36917a = j11;
        this.f36918b = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn5)) {
            return false;
        }
        vn5 vn5Var = (vn5) obj;
        return this.f36917a == vn5Var.f36917a && this.f36918b == vn5Var.f36918b;
    }

    public final int hashCode() {
        return (((int) this.f36917a) * 31) + ((int) this.f36918b);
    }
}
