package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ca4 extends f94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24459c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ba4 f24460d;

    /* synthetic */ ca4(int i11, int i12, int i13, ba4 ba4Var, byte[] bArr) {
        this.f24457a = i11;
        this.f24458b = i12;
        this.f24460d = ba4Var;
    }

    public static aa4 b() {
        return new aa4(null);
    }

    @Override // com.google.android.gms.internal.ads.n84
    public final boolean a() {
        return this.f24460d != ba4.f23765d;
    }

    public final int c() {
        return this.f24457a;
    }

    public final int d() {
        return this.f24458b;
    }

    public final ba4 e() {
        return this.f24460d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ca4)) {
            return false;
        }
        ca4 ca4Var = (ca4) obj;
        return ca4Var.f24457a == this.f24457a && ca4Var.f24458b == this.f24458b && ca4Var.f24460d == this.f24460d;
    }

    public final int hashCode() {
        return Objects.hash(ca4.class, Integer.valueOf(this.f24457a), Integer.valueOf(this.f24458b), 16, this.f24460d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f24460d);
        int length = strValueOf.length();
        int i11 = this.f24458b;
        int length2 = String.valueOf(i11).length();
        int length3 = String.valueOf(16).length();
        int i12 = this.f24457a;
        StringBuilder sb2 = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i12).length() + 10);
        sb2.append("AesEax Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append("-byte IV, ");
        sb2.append(16);
        sb2.append("-byte tag, and ");
        sb2.append(i12);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}
