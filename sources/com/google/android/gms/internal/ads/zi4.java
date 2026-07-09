package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f39227a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f39228b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private aj4 f39229c = aj4.f23325e;

    /* synthetic */ zi4(byte[] bArr) {
    }

    public final zi4 a(int i11) throws InvalidAlgorithmParameterException {
        if (i11 != 16 && i11 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i11 * 8)));
        }
        this.f39227a = Integer.valueOf(i11);
        return this;
    }

    public final zi4 b(int i11) throws GeneralSecurityException {
        if (i11 >= 10 && i11 <= 16) {
            this.f39228b = Integer.valueOf(i11);
            return this;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 40);
        sb2.append("Invalid tag size for AesCmacParameters: ");
        sb2.append(i11);
        throw new GeneralSecurityException(sb2.toString());
    }

    public final zi4 c(aj4 aj4Var) {
        this.f39229c = aj4Var;
        return this;
    }

    public final bj4 d() throws GeneralSecurityException {
        Integer num = this.f39227a;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.f39228b == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.f39229c != null) {
            return new bj4(num.intValue(), this.f39228b.intValue(), this.f39229c, null);
        }
        throw new GeneralSecurityException("variant not set");
    }
}
