package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class la4 extends f94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30136b = 12;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30137c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ka4 f30138d;

    /* synthetic */ la4(int i11, int i12, int i13, ka4 ka4Var, byte[] bArr) {
        this.f30135a = i11;
        this.f30138d = ka4Var;
    }

    public static ja4 b() {
        return new ja4(null);
    }

    @Override // com.google.android.gms.internal.ads.n84
    public final boolean a() {
        return this.f30138d != ka4.f29500d;
    }

    public final int c() {
        return this.f30135a;
    }

    public final ka4 d() {
        return this.f30138d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof la4)) {
            return false;
        }
        la4 la4Var = (la4) obj;
        return la4Var.f30135a == this.f30135a && la4Var.f30138d == this.f30138d;
    }

    public final int hashCode() {
        return Objects.hash(la4.class, Integer.valueOf(this.f30135a), 12, 16, this.f30138d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f30138d);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i11 = this.f30135a;
        StringBuilder sb2 = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i11).length() + 10);
        sb2.append("AesGcm Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(12);
        sb2.append("-byte IV, ");
        sb2.append(16);
        sb2.append("-byte tag, and ");
        sb2.append(i11);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}
