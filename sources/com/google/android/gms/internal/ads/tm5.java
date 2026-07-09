package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class tm5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35644b;

    public tm5(int i11, boolean z11) {
        this.f35643a = i11;
        this.f35644b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tm5.class == obj.getClass()) {
            tm5 tm5Var = (tm5) obj;
            if (this.f35643a == tm5Var.f35643a && this.f35644b == tm5Var.f35644b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f35643a * 31) + (this.f35644b ? 1 : 0);
    }
}
