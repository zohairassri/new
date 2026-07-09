package com.amazonaws.services.s3.internal.crypto;

import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class CipherFactory {
    private final int cipherMode;
    private final Provider cryptoProvider;
    private byte[] initVectorBytes;
    private final SecretKey symmetricKey;

    public CipherFactory(SecretKey secretKey, int i11, byte[] bArr, Provider provider) {
        this.symmetricKey = secretKey;
        this.cipherMode = i11;
        this.initVectorBytes = bArr;
        this.cryptoProvider = provider;
    }

    public Cipher createCipher() {
        Cipher cipherCreateSymmetricCipher = EncryptionUtils.createSymmetricCipher(this.symmetricKey, this.cipherMode, this.cryptoProvider, this.initVectorBytes);
        if (this.initVectorBytes == null) {
            this.initVectorBytes = cipherCreateSymmetricCipher.getIV();
        }
        return cipherCreateSymmetricCipher;
    }

    public int getCipherMode() {
        return this.cipherMode;
    }

    public Provider getCryptoProvider() {
        return this.cryptoProvider;
    }

    public byte[] getIV() {
        byte[] bArr = this.initVectorBytes;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }
}
