package com.google.android.gms.internal.ads;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ut4 implements av4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f36327d = new tt4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f36328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36330c;

    public ut4(byte[] bArr, int i11) throws GeneralSecurityException {
        if (!gf4.a(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        ov4.a(bArr.length);
        this.f36328a = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        int blockSize = ((Cipher) f36327d.get()).getBlockSize();
        this.f36330c = blockSize;
        if (i11 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f36329b = i11;
    }

    @Override // com.google.android.gms.internal.ads.av4
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i11 = this.f36329b;
        if (length < i11) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        int i12 = length - i11;
        byte[] bArr3 = new byte[i12];
        Cipher cipher = (Cipher) f36327d.get();
        byte[] bArr4 = new byte[this.f36330c];
        System.arraycopy(bArr2, 0, bArr4, 0, i11);
        cipher.init(2, this.f36328a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i11, i12, bArr3, 0) == i12) {
            return bArr3;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
