package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.AmazonClientException;
import com.chartbeat.androidsdk.QueryKeys;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
abstract class ContentCryptoScheme {
    private static final int BYTE_SIZE = 4;
    private static final int CBC_SHIFT_VALUE = 48;
    private static final int DEFAULT_BIT_COUNTER = 16;
    private static final int DEFAULT_RIGHTMOST_BIT_START = 12;
    private static final int GCM_SHIFT_VALUE = 32;
    private static final int LONG_BYTE_SIZE = 8;
    private static final long LONG_VALUE = 1;
    static final long MAX_CBC_BYTES = 4503599627370496L;
    static final long MAX_CTR_BYTES = -1;
    static final long MAX_GCM_BLOCKS = 4294967294L;
    static final long MAX_GCM_BYTES = 68719476704L;
    static final ContentCryptoScheme AES_CBC = new AesCbc();
    static final ContentCryptoScheme AES_GCM = new AesGcm();
    static final ContentCryptoScheme AES_CTR = new AesCtr();

    ContentCryptoScheme() {
    }

    static ContentCryptoScheme fromCEKAlgo(String str) {
        return fromCEKAlgo(str, false);
    }

    static byte[] incrementBlocks(byte[] bArr, long j11) {
        if (j11 == 0) {
            return bArr;
        }
        if (bArr == null || bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (j11 > MAX_GCM_BLOCKS) {
            throw new IllegalStateException();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        for (int i11 = 12; i11 <= 15; i11++) {
            byteBufferAllocate.put(i11 - 8, bArr[i11]);
        }
        long j12 = byteBufferAllocate.getLong() + j11;
        if (j12 > MAX_GCM_BLOCKS) {
            throw new IllegalStateException();
        }
        byteBufferAllocate.rewind();
        byte[] bArrArray = byteBufferAllocate.putLong(j12).array();
        for (int i12 = 12; i12 <= 15; i12++) {
            bArr[i12] = bArrArray[i12 - 8];
        }
        return bArr;
    }

    CipherLite createAuxillaryCipher(SecretKey secretKey, byte[] bArr, int i11, Provider provider, long j11) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        return null;
    }

    CipherLite createCipherLite(SecretKey secretKey, byte[] bArr, int i11, Provider provider) {
        String specificCipherProvider = getSpecificCipherProvider();
        try {
            Cipher cipher = provider != null ? Cipher.getInstance(getCipherAlgorithm(), provider) : specificCipherProvider != null ? Cipher.getInstance(getCipherAlgorithm(), specificCipherProvider) : Cipher.getInstance(getCipherAlgorithm());
            cipher.init(i11, secretKey, new IvParameterSpec(bArr));
            return newCipherLite(cipher, secretKey, i11);
        } catch (Exception e11) {
            if (e11 instanceof RuntimeException) {
                throw ((RuntimeException) e11);
            }
            throw new AmazonClientException("Unable to build cipher: " + e11.getMessage() + "\nMake sure you have the JCE unlimited strength policy files installed and configured for your JVM", e11);
        }
    }

    abstract int getBlockSizeInBytes();

    abstract String getCipherAlgorithm();

    abstract int getIVLengthInBytes();

    abstract String getKeyGeneratorAlgorithm();

    abstract int getKeyLengthInBits();

    final String getKeySpec() {
        return getKeyGeneratorAlgorithm() + QueryKeys.END_MARKER + getKeyLengthInBits();
    }

    abstract long getMaxPlaintextSize();

    String getSpecificCipherProvider() {
        return null;
    }

    int getTagLengthInBits() {
        return 0;
    }

    protected CipherLite newCipherLite(Cipher cipher, SecretKey secretKey, int i11) {
        return new CipherLite(cipher, this, secretKey, i11);
    }

    public String toString() {
        return "cipherAlgo=" + getCipherAlgorithm() + ", blockSizeInBytes=" + getBlockSizeInBytes() + ", ivLengthInBytes=" + getIVLengthInBytes() + ", keyGenAlgo=" + getKeyGeneratorAlgorithm() + ", keyLengthInBits=" + getKeyLengthInBits() + ", specificProvider=" + getSpecificCipherProvider() + ", tagLengthInBits=" + getTagLengthInBits();
    }

    static ContentCryptoScheme fromCEKAlgo(String str, boolean z11) {
        ContentCryptoScheme contentCryptoScheme = AES_GCM;
        if (contentCryptoScheme.getCipherAlgorithm().equals(str)) {
            return z11 ? AES_CTR : contentCryptoScheme;
        }
        if (str == null || AES_CBC.getCipherAlgorithm().equals(str)) {
            return AES_CBC;
        }
        throw new UnsupportedOperationException("Unsupported content encryption scheme: " + str);
    }

    CipherLite createCipherLite(SecretKey secretKey, byte[] bArr, int i11) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        return createCipherLite(secretKey, bArr, i11, null);
    }

    byte[] adjustIV(byte[] bArr, long j11) {
        return bArr;
    }
}
