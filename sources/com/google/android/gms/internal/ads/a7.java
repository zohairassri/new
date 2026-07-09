package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class a7 implements gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23097a;

    public a7(long j11) {
        this.f23097a = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a7.class == obj.getClass() && this.f23097a == ((a7) obj).f23097a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23097a) + 527;
    }

    public final String toString() {
        long j11 = this.f23097a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 38);
        sb2.append("ThumbnailMetadata: presentationTimeUs=");
        sb2.append(j11);
        return sb2.toString();
    }
}
