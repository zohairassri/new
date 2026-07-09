package com.google.android.gms.internal.ads;

import com.amazonaws.event.ProgressEvent;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class qr4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final BigInteger f33770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final BigInteger f33771h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f33772a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BigInteger f33773b = tr4.f35720g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private rr4 f33774c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private rr4 f33775d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f33776e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private sr4 f33777f = sr4.f35023e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f33770g = bigIntegerValueOf;
        f33771h = bigIntegerValueOf.pow(256);
    }

    /* synthetic */ qr4(byte[] bArr) {
    }

    public final qr4 a(int i11) {
        this.f33772a = Integer.valueOf(i11);
        return this;
    }

    public final qr4 b(BigInteger bigInteger) {
        this.f33773b = bigInteger;
        return this;
    }

    public final qr4 c(sr4 sr4Var) {
        this.f33777f = sr4Var;
        return this;
    }

    public final qr4 d(rr4 rr4Var) {
        this.f33774c = rr4Var;
        return this;
    }

    public final qr4 e(rr4 rr4Var) {
        this.f33775d = rr4Var;
        return this;
    }

    public final qr4 f(int i11) throws GeneralSecurityException {
        if (i11 < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i11)));
        }
        this.f33776e = Integer.valueOf(i11);
        return this;
    }

    public final tr4 g() throws GeneralSecurityException {
        Integer num = this.f33772a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f33773b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f33774c == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.f33775d == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.f33777f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.f33776e == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f33772a, Integer.valueOf(ProgressEvent.PART_COMPLETED_EVENT_CODE)));
        }
        if (this.f33774c != this.f33775d) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.f33773b;
        int iCompareTo = bigInteger.compareTo(tr4.f35720g);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f33770g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f33771h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new tr4(this.f33772a.intValue(), this.f33773b, this.f33777f, this.f33774c, this.f33775d, this.f33776e.intValue(), null);
    }
}
