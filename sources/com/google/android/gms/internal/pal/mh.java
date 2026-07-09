package com.google.android.gms.internal.pal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class mh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f41573c = new lh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKey f41574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f41575b;

    public mh(byte[] bArr, boolean z11) throws GeneralSecurityException {
        if (!xh.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        bu.a(bArr.length);
        this.f41574a = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        this.f41575b = z11;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        int length = bArr2.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        boolean z11 = this.f41575b;
        byte[] bArr4 = new byte[z11 ? length + 28 : length + 16];
        if (z11) {
            System.arraycopy(bArr, 0, bArr4, 0, 12);
        }
        au.a();
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        ThreadLocal threadLocal = f41573c;
        ((Cipher) threadLocal.get()).init(1, this.f41574a, gCMParameterSpec);
        int iDoFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, length, bArr4, true != this.f41575b ? 0 : 12);
        if (iDoFinal == length + 16) {
            return bArr4;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - length)));
    }
}
