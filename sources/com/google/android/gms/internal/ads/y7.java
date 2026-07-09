package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class y7 implements gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f38344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f38345e;

    public y7(long j11, long j12, long j13, long j14, long j15) {
        this.f38341a = j11;
        this.f38342b = j12;
        this.f38343c = j13;
        this.f38344d = j14;
        this.f38345e = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            y7 y7Var = (y7) obj;
            if (this.f38341a == y7Var.f38341a && this.f38342b == y7Var.f38342b && this.f38343c == y7Var.f38343c && this.f38344d == y7Var.f38344d && this.f38345e == y7Var.f38345e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Long.hashCode(this.f38341a) + 527) * 31) + Long.hashCode(this.f38342b)) * 31) + Long.hashCode(this.f38343c)) * 31) + Long.hashCode(this.f38344d)) * 31) + Long.hashCode(this.f38345e);
    }

    public final String toString() {
        long j11 = this.f38341a;
        int length = String.valueOf(j11).length();
        long j12 = this.f38342b;
        int length2 = String.valueOf(j12).length();
        long j13 = this.f38343c;
        int length3 = String.valueOf(j13).length();
        long j14 = this.f38344d;
        int length4 = String.valueOf(j14).length();
        long j15 = this.f38345e;
        StringBuilder sb2 = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j15).length());
        sb2.append("Motion photo metadata: photoStartPosition=");
        sb2.append(j11);
        sb2.append(", photoSize=");
        sb2.append(j12);
        sb2.append(", photoPresentationTimestampUs=");
        sb2.append(j13);
        sb2.append(", videoStartPosition=");
        sb2.append(j14);
        sb2.append(", videoSize=");
        sb2.append(j15);
        return sb2.toString();
    }
}
