package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class b5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b5 f23678c = new b5(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23680b;

    public b5(long j11, long j12) {
        this.f23679a = j11;
        this.f23680b = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b5.class == obj.getClass()) {
            b5 b5Var = (b5) obj;
            if (this.f23679a == b5Var.f23679a && this.f23680b == b5Var.f23680b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f23679a) * 31) + ((int) this.f23680b);
    }

    public final String toString() {
        long j11 = this.f23679a;
        int length = String.valueOf(j11).length();
        long j12 = this.f23680b;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(j12).length() + 1);
        sb2.append("[timeUs=");
        sb2.append(j11);
        sb2.append(", position=");
        sb2.append(j12);
        sb2.append("]");
        return sb2.toString();
    }
}
