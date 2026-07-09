package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class mt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f30997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f30998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f30999c;

    mt(long j11, String str, int i11) {
        this.f30997a = j11;
        this.f30998b = str;
        this.f30999c = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mt)) {
            return false;
        }
        mt mtVar = (mt) obj;
        return mtVar.f30997a == this.f30997a && mtVar.f30999c == this.f30999c;
    }

    public final int hashCode() {
        return (int) this.f30997a;
    }
}
