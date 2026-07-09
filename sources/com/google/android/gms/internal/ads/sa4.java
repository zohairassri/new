package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class sa4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f34678a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ta4 f34679b = ta4.f35371d;

    /* synthetic */ sa4(byte[] bArr) {
    }

    public final sa4 a(int i11) throws InvalidAlgorithmParameterException {
        if (i11 != 16 && i11 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i11)));
        }
        this.f34678a = Integer.valueOf(i11);
        return this;
    }

    public final sa4 b(ta4 ta4Var) {
        this.f34679b = ta4Var;
        return this;
    }

    public final ua4 c() throws GeneralSecurityException {
        Integer num = this.f34678a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f34679b != null) {
            return new ua4(num.intValue(), this.f34679b, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }
}
