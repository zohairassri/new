package com.amazonaws.services.s3.internal.crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.NullCipher;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
class CipherLite {
    static final CipherLite NULL = new CipherLite() { // from class: com.amazonaws.services.s3.internal.crypto.CipherLite.1
        @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
        CipherLite createInverse() {
            return this;
        }

        @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
        CipherLite createAuxiliary(long j11) {
            return this;
        }
    };
    private final Cipher cipher;
    private final int cipherMode;
    private final ContentCryptoScheme scheme;
    private final SecretKey secreteKey;

    CipherLite createAuxiliary(long j11) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        return this.scheme.createAuxillaryCipher(this.secreteKey, this.cipher.getIV(), this.cipherMode, this.cipher.getProvider(), j11);
    }

    CipherLite createInverse() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        int i11 = this.cipherMode;
        int i12 = 1;
        if (i11 != 2) {
            if (i11 != 1) {
                throw new UnsupportedOperationException();
            }
            i12 = 2;
        }
        return this.scheme.createCipherLite(this.secreteKey, this.cipher.getIV(), i12, this.cipher.getProvider());
    }

    CipherLite createUsingIV(byte[] bArr) {
        return this.scheme.createCipherLite(this.secreteKey, bArr, this.cipherMode, this.cipher.getProvider());
    }

    byte[] doFinal() throws BadPaddingException, IllegalBlockSizeException {
        return this.cipher.doFinal();
    }

    final int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    final Cipher getCipher() {
        return this.cipher;
    }

    final String getCipherAlgorithm() {
        return this.cipher.getAlgorithm();
    }

    final int getCipherMode() {
        return this.cipherMode;
    }

    final Provider getCipherProvider() {
        return this.cipher.getProvider();
    }

    final ContentCryptoScheme getContentCryptoScheme() {
        return this.scheme;
    }

    final byte[] getIV() {
        return this.cipher.getIV();
    }

    int getOutputSize(int i11) {
        return this.cipher.getOutputSize(i11);
    }

    final String getSecretKeyAlgorithm() {
        return this.secreteKey.getAlgorithm();
    }

    long mark() {
        return -1L;
    }

    boolean markSupported() {
        return false;
    }

    CipherLite recreate() {
        return this.scheme.createCipherLite(this.secreteKey, this.cipher.getIV(), this.cipherMode, this.cipher.getProvider());
    }

    void reset() {
        throw new IllegalStateException("mark/reset not supported");
    }

    byte[] update(byte[] bArr, int i11, int i12) {
        return this.cipher.update(bArr, i11, i12);
    }

    private CipherLite() {
        this.cipher = new NullCipher();
        this.scheme = null;
        this.secreteKey = null;
        this.cipherMode = -1;
    }

    byte[] doFinal(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException {
        return this.cipher.doFinal(bArr);
    }

    byte[] doFinal(byte[] bArr, int i11, int i12) throws BadPaddingException, IllegalBlockSizeException {
        return this.cipher.doFinal(bArr, i11, i12);
    }

    CipherLite(Cipher cipher, ContentCryptoScheme contentCryptoScheme, SecretKey secretKey, int i11) {
        this.cipher = cipher;
        this.scheme = contentCryptoScheme;
        this.secreteKey = secretKey;
        this.cipherMode = i11;
    }
}
