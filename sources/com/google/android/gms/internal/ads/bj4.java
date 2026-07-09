package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class bj4 extends tj4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aj4 f23956c;

    /* synthetic */ bj4(int i11, int i12, aj4 aj4Var, byte[] bArr) {
        this.f23954a = i11;
        this.f23955b = i12;
        this.f23956c = aj4Var;
    }

    public static zi4 b() {
        return new zi4(null);
    }

    @Override // com.google.android.gms.internal.ads.n84
    public final boolean a() {
        return this.f23956c != aj4.f23325e;
    }

    public final int c() {
        return this.f23954a;
    }

    public final int d() {
        return this.f23955b;
    }

    public final int e() {
        aj4 aj4Var = this.f23956c;
        if (aj4Var == aj4.f23325e) {
            return this.f23955b;
        }
        if (aj4Var == aj4.f23322b || aj4Var == aj4.f23323c || aj4Var == aj4.f23324d) {
            return this.f23955b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bj4)) {
            return false;
        }
        bj4 bj4Var = (bj4) obj;
        return bj4Var.f23954a == this.f23954a && bj4Var.e() == e() && bj4Var.f23956c == this.f23956c;
    }

    public final aj4 f() {
        return this.f23956c;
    }

    public final int hashCode() {
        return Objects.hash(bj4.class, Integer.valueOf(this.f23954a), Integer.valueOf(this.f23955b), this.f23956c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f23956c);
        int length = strValueOf.length();
        int i11 = this.f23955b;
        int length2 = String.valueOf(i11).length();
        int i12 = this.f23954a;
        StringBuilder sb2 = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i12).length() + 10);
        sb2.append("AES-CMAC Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append("-byte tags, and ");
        sb2.append(i12);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}
