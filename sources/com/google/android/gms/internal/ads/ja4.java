package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ja4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f28975a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f28976b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f28977c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ka4 f28978d = ka4.f29500d;

    /* synthetic */ ja4(byte[] bArr) {
    }

    public final ja4 a(int i11) throws InvalidAlgorithmParameterException {
        if (i11 != 16 && i11 != 24 && i11 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i11)));
        }
        this.f28975a = Integer.valueOf(i11);
        return this;
    }

    public final ja4 b(int i11) {
        this.f28976b = 12;
        return this;
    }

    public final ja4 c(int i11) {
        this.f28977c = 16;
        return this;
    }

    public final ja4 d(ka4 ka4Var) {
        this.f28978d = ka4Var;
        return this;
    }

    public final la4 e() throws GeneralSecurityException {
        Integer num = this.f28975a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f28978d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f28976b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f28977c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.f28976b.getClass();
        this.f28977c.getClass();
        return new la4(iIntValue, 12, 16, this.f28978d, null);
    }
}
