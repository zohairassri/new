package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class tr4 extends ds4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f35720g = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f35721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BigInteger f35722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sr4 f35723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rr4 f35724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rr4 f35725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f35726f;

    /* synthetic */ tr4(int i11, BigInteger bigInteger, sr4 sr4Var, rr4 rr4Var, rr4 rr4Var2, int i12, byte[] bArr) {
        this.f35721a = i11;
        this.f35722b = bigInteger;
        this.f35723c = sr4Var;
        this.f35724d = rr4Var;
        this.f35725e = rr4Var2;
        this.f35726f = i12;
    }

    public static qr4 b() {
        return new qr4(null);
    }

    @Override // com.google.android.gms.internal.ads.n84
    public final boolean a() {
        return this.f35723c != sr4.f35023e;
    }

    public final int c() {
        return this.f35721a;
    }

    public final BigInteger d() {
        return this.f35722b;
    }

    public final sr4 e() {
        return this.f35723c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tr4)) {
            return false;
        }
        tr4 tr4Var = (tr4) obj;
        return tr4Var.f35721a == this.f35721a && Objects.equals(tr4Var.f35722b, this.f35722b) && Objects.equals(tr4Var.f35723c, this.f35723c) && Objects.equals(tr4Var.f35724d, this.f35724d) && Objects.equals(tr4Var.f35725e, this.f35725e) && tr4Var.f35726f == this.f35726f;
    }

    public final rr4 f() {
        return this.f35724d;
    }

    public final rr4 g() {
        return this.f35725e;
    }

    public final int h() {
        return this.f35726f;
    }

    public final int hashCode() {
        return Objects.hash(tr4.class, Integer.valueOf(this.f35721a), this.f35722b, this.f35723c, this.f35724d, this.f35725e, Integer.valueOf(this.f35726f));
    }

    public final String toString() {
        BigInteger bigInteger = this.f35722b;
        rr4 rr4Var = this.f35725e;
        rr4 rr4Var2 = this.f35724d;
        String strValueOf = String.valueOf(this.f35723c);
        String strValueOf2 = String.valueOf(rr4Var2);
        String strValueOf3 = String.valueOf(rr4Var);
        String strValueOf4 = String.valueOf(bigInteger);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i11 = this.f35726f;
        int length4 = String.valueOf(i11).length();
        int length5 = strValueOf4.length();
        int i12 = this.f35721a;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i12).length() + 13);
        sb2.append("RSA SSA PSS Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", signature hashType: ");
        sb2.append(strValueOf2);
        sb2.append(", mgf1 hashType: ");
        sb2.append(strValueOf3);
        sb2.append(", saltLengthBytes: ");
        sb2.append(i11);
        sb2.append(", publicExponent: ");
        sb2.append(strValueOf4);
        sb2.append(", and ");
        sb2.append(i12);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }
}
