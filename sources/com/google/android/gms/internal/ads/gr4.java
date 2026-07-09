package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class gr4 extends ds4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f27278e = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BigInteger f27280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fr4 f27281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final er4 f27282d;

    /* synthetic */ gr4(int i11, BigInteger bigInteger, fr4 fr4Var, er4 er4Var, byte[] bArr) {
        this.f27279a = i11;
        this.f27280b = bigInteger;
        this.f27281c = fr4Var;
        this.f27282d = er4Var;
    }

    public static dr4 b() {
        return new dr4(null);
    }

    @Override // com.google.android.gms.internal.ads.n84
    public final boolean a() {
        return this.f27281c != fr4.f26542e;
    }

    public final int c() {
        return this.f27279a;
    }

    public final BigInteger d() {
        return this.f27280b;
    }

    public final fr4 e() {
        return this.f27281c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gr4)) {
            return false;
        }
        gr4 gr4Var = (gr4) obj;
        return gr4Var.f27279a == this.f27279a && Objects.equals(gr4Var.f27280b, this.f27280b) && gr4Var.f27281c == this.f27281c && gr4Var.f27282d == this.f27282d;
    }

    public final er4 f() {
        return this.f27282d;
    }

    public final int hashCode() {
        return Objects.hash(gr4.class, Integer.valueOf(this.f27279a), this.f27280b, this.f27281c, this.f27282d);
    }

    public final String toString() {
        BigInteger bigInteger = this.f27280b;
        er4 er4Var = this.f27282d;
        String strValueOf = String.valueOf(this.f27281c);
        String strValueOf2 = String.valueOf(er4Var);
        String strValueOf3 = String.valueOf(bigInteger);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i11 = this.f27279a;
        StringBuilder sb2 = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i11).length() + 13);
        sb2.append("RSA SSA PKCS1 Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", hashType: ");
        sb2.append(strValueOf2);
        sb2.append(", publicExponent: ");
        sb2.append(strValueOf3);
        sb2.append(", and ");
        sb2.append(i11);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }
}
