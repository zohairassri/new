package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class dr4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final BigInteger f25234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final BigInteger f25235f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f25236a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BigInteger f25237b = gr4.f27278e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private er4 f25238c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private fr4 f25239d = fr4.f26542e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f25234e = bigIntegerValueOf;
        f25235f = bigIntegerValueOf.pow(256);
    }

    /* synthetic */ dr4(byte[] bArr) {
    }

    public final dr4 a(int i11) {
        this.f25236a = Integer.valueOf(i11);
        return this;
    }

    public final dr4 b(BigInteger bigInteger) {
        this.f25237b = bigInteger;
        return this;
    }

    public final dr4 c(fr4 fr4Var) {
        this.f25239d = fr4Var;
        return this;
    }

    public final dr4 d(er4 er4Var) {
        this.f25238c = er4Var;
        return this;
    }

    public final gr4 e() throws GeneralSecurityException {
        Integer num = this.f25236a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f25237b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f25238c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f25239d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f25236a));
        }
        BigInteger bigInteger = this.f25237b;
        int iCompareTo = bigInteger.compareTo(gr4.f27278e);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f25234e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f25235f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new gr4(this.f25236a.intValue(), this.f25237b, this.f25239d, this.f25238c, null);
    }
}
