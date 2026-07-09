package com.google.android.gms.internal.pal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class vh implements ne {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f41893b = new uh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKey f41894a;

    public vh(byte[] bArr) throws InvalidAlgorithmParameterException {
        bu.a(bArr.length);
        this.f41894a = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
    }

    @Override // com.google.android.gms.internal.pal.ne
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec ivParameterSpec;
        int length = bArr.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[length + 28];
        byte[] bArrA = zt.a(12);
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        int length2 = bArrA.length;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            ivParameterSpec = new GCMParameterSpec(128, bArrA, 0, length2);
        } catch (ClassNotFoundException unused) {
            if (!au.a()) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            ivParameterSpec = new IvParameterSpec(bArrA, 0, length2);
        }
        ThreadLocal threadLocal = f41893b;
        ((Cipher) threadLocal.get()).init(1, this.f41894a, ivParameterSpec);
        int iDoFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, length, bArr3, 12);
        if (iDoFinal == length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - length)));
    }
}
