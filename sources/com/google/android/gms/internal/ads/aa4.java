package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class aa4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f23206a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f23207b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f23208c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ba4 f23209d = ba4.f23765d;

    /* synthetic */ aa4(byte[] bArr) {
    }

    public final aa4 a(int i11) throws InvalidAlgorithmParameterException {
        if (i11 != 16 && i11 != 24 && i11 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i11)));
        }
        this.f23206a = Integer.valueOf(i11);
        return this;
    }

    public final aa4 b(int i11) throws GeneralSecurityException {
        if (i11 != 12 && i11 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i11)));
        }
        this.f23207b = Integer.valueOf(i11);
        return this;
    }

    public final aa4 c(int i11) {
        this.f23208c = 16;
        return this;
    }

    public final aa4 d(ba4 ba4Var) {
        this.f23209d = ba4Var;
        return this;
    }

    public final ca4 e() throws GeneralSecurityException {
        Integer num = this.f23206a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f23207b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f23209d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f23208c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.f23207b.intValue();
        this.f23208c.getClass();
        return new ca4(iIntValue, iIntValue2, 16, this.f23209d, null);
    }
}
