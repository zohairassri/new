package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class b7 implements gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f23709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23710f;

    static {
        ki5 ki5Var = new ki5();
        ki5Var.l0("application/id3");
        ki5Var.m();
        ki5 ki5Var2 = new ki5();
        ki5Var2.l0("application/x-scte35");
        ki5Var2.m();
    }

    public b7(String str, String str2, long j11, long j12, byte[] bArr) {
        this.f23705a = str;
        this.f23706b = str2;
        this.f23707c = j11;
        this.f23708d = j12;
        this.f23709e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b7.class == obj.getClass()) {
            b7 b7Var = (b7) obj;
            if (this.f23707c == b7Var.f23707c && this.f23708d == b7Var.f23708d && Objects.equals(this.f23705a, b7Var.f23705a) && Objects.equals(this.f23706b, b7Var.f23706b) && Arrays.equals(this.f23709e, b7Var.f23709e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f23710f;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((this.f23705a.hashCode() + 527) * 31) + this.f23706b.hashCode();
        long j11 = this.f23707c;
        int iHashCode2 = (((((iHashCode * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) this.f23708d)) * 31) + Arrays.hashCode(this.f23709e);
        this.f23710f = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        long j11 = this.f23708d;
        int length = String.valueOf(j11).length();
        long j12 = this.f23707c;
        int length2 = String.valueOf(j12).length();
        String str = this.f23705a;
        int length3 = str.length() + 18 + length + 13 + length2;
        String str2 = this.f23706b;
        StringBuilder sb2 = new StringBuilder(length3 + 8 + str2.length());
        sb2.append("EMSG: scheme=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(j11);
        sb2.append(", durationMs=");
        sb2.append(j12);
        sb2.append(", value=");
        sb2.append(str2);
        return sb2.toString();
    }
}
