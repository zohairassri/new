package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class t94 extends f94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f35350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f35353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s94 f35354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r94 f35355f;

    /* synthetic */ t94(int i11, int i12, int i13, int i14, s94 s94Var, r94 r94Var, byte[] bArr) {
        this.f35350a = i11;
        this.f35351b = i12;
        this.f35352c = i13;
        this.f35353d = i14;
        this.f35354e = s94Var;
        this.f35355f = r94Var;
    }

    public static q94 b() {
        return new q94(null);
    }

    @Override // com.google.android.gms.internal.ads.n84
    public final boolean a() {
        return this.f35354e != s94.f34665d;
    }

    public final int c() {
        return this.f35350a;
    }

    public final int d() {
        return this.f35351b;
    }

    public final int e() {
        return this.f35353d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t94)) {
            return false;
        }
        t94 t94Var = (t94) obj;
        return t94Var.f35350a == this.f35350a && t94Var.f35351b == this.f35351b && t94Var.f35352c == this.f35352c && t94Var.f35353d == this.f35353d && t94Var.f35354e == this.f35354e && t94Var.f35355f == this.f35355f;
    }

    public final int f() {
        return this.f35352c;
    }

    public final s94 g() {
        return this.f35354e;
    }

    public final r94 h() {
        return this.f35355f;
    }

    public final int hashCode() {
        return Objects.hash(t94.class, Integer.valueOf(this.f35350a), Integer.valueOf(this.f35351b), Integer.valueOf(this.f35352c), Integer.valueOf(this.f35353d), this.f35354e, this.f35355f);
    }

    public final String toString() {
        r94 r94Var = this.f35355f;
        String strValueOf = String.valueOf(this.f35354e);
        String strValueOf2 = String.valueOf(r94Var);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i11 = this.f35352c;
        int length3 = String.valueOf(i11).length();
        int i12 = this.f35353d;
        int length4 = String.valueOf(i12).length();
        int i13 = this.f35350a;
        int length5 = String.valueOf(i13).length();
        int i14 = this.f35351b;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i14).length() + 15);
        sb2.append("AesCtrHmacAead Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", hashType: ");
        sb2.append(strValueOf2);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append("-byte IV, and ");
        sb2.append(i12);
        sb2.append("-byte tags, and ");
        sb2.append(i13);
        sb2.append("-byte AES key, and ");
        sb2.append(i14);
        sb2.append("-byte HMAC key)");
        return sb2.toString();
    }
}
