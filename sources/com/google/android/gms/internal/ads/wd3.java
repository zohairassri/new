package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class wd3 implements gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37338c;

    public wd3(long j11, long j12, long j13) {
        this.f37336a = j11;
        this.f37337b = j12;
        this.f37338c = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd3)) {
            return false;
        }
        wd3 wd3Var = (wd3) obj;
        return this.f37336a == wd3Var.f37336a && this.f37337b == wd3Var.f37337b && this.f37338c == wd3Var.f37338c;
    }

    public final int hashCode() {
        return ((((Long.hashCode(this.f37336a) + 527) * 31) + Long.hashCode(this.f37337b)) * 31) + Long.hashCode(this.f37338c);
    }

    public final String toString() {
        long j11 = this.f37336a;
        int length = String.valueOf(j11).length();
        long j12 = this.f37337b;
        int length2 = String.valueOf(j12).length();
        long j13 = this.f37338c;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j13).length());
        sb2.append("Mp4Timestamp: creation time=");
        sb2.append(j11);
        sb2.append(", modification time=");
        sb2.append(j12);
        sb2.append(", timescale=");
        sb2.append(j13);
        return sb2.toString();
    }
}
