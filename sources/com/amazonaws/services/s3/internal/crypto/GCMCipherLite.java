package com.amazonaws.services.s3.internal.crypto;

import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
final class GCMCipherLite extends CipherLite {
    private static final int BITS = 8;
    private static final int TAG_LENGTH = ContentCryptoScheme.AES_GCM.getTagLengthInBits() / 8;
    private CipherLite aux;
    private long currentCount;
    private boolean doneFinal;
    private byte[] finalBytes;
    private boolean invisiblyProcessed;
    private long markedCount;
    private long outputByteCount;
    private boolean securityViolated;
    private final int tagLen;

    GCMCipherLite(Cipher cipher, SecretKey secretKey, int i11) {
        super(cipher, ContentCryptoScheme.AES_GCM, secretKey, i11);
        this.tagLen = i11 == 1 ? TAG_LENGTH : 0;
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException();
        }
    }

    private int checkMax(int i11) {
        if (this.outputByteCount + ((long) i11) <= 68719476704L) {
            return i11;
        }
        this.securityViolated = true;
        throw new SecurityException("Number of bytes processed has exceeded the maximum allowed by AES/GCM; [outputByteCount=" + this.outputByteCount + ", delta=" + i11 + "]");
    }

    private final byte[] doFinal0(byte[] bArr, int i11, int i12) throws BadPaddingException, IllegalBlockSizeException {
        if (!this.doneFinal) {
            this.doneFinal = true;
            byte[] bArrDoFinal = super.doFinal(bArr, i11, i12);
            this.finalBytes = bArrDoFinal;
            if (bArrDoFinal == null) {
                return null;
            }
            this.outputByteCount += (long) checkMax(bArrDoFinal.length - this.tagLen);
            return (byte[]) this.finalBytes.clone();
        }
        if (this.securityViolated) {
            throw new SecurityException();
        }
        if (2 == getCipherMode()) {
            byte[] bArr2 = this.finalBytes;
            if (bArr2 == null) {
                return null;
            }
            return (byte[]) bArr2.clone();
        }
        byte[] bArr3 = this.finalBytes;
        int length = bArr3.length;
        int i13 = this.tagLen;
        int i14 = length - i13;
        if (i12 == i14) {
            return (byte[]) bArr3.clone();
        }
        if (i12 >= i14 || ((long) i12) + this.currentCount != this.outputByteCount) {
            throw new IllegalStateException("Inconsistent re-rencryption");
        }
        return Arrays.copyOfRange(bArr3, (bArr3.length - i13) - i12, bArr3.length);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    byte[] doFinal() throws BadPaddingException, IllegalBlockSizeException {
        if (this.doneFinal) {
            if (this.securityViolated) {
                throw new SecurityException();
            }
            byte[] bArr = this.finalBytes;
            if (bArr == null) {
                return null;
            }
            return (byte[]) bArr.clone();
        }
        this.doneFinal = true;
        byte[] bArrDoFinal = super.doFinal();
        this.finalBytes = bArrDoFinal;
        if (bArrDoFinal == null) {
            return null;
        }
        this.outputByteCount += (long) checkMax(bArrDoFinal.length - this.tagLen);
        return (byte[]) this.finalBytes.clone();
    }

    long getCurrentCount() {
        return this.currentCount;
    }

    byte[] getFinalBytes() {
        byte[] bArr = this.finalBytes;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    long getMarkedCount() {
        return this.markedCount;
    }

    long getOutputByteCount() {
        return this.outputByteCount;
    }

    byte[] getTag() {
        byte[] bArr;
        if (getCipherMode() != 1 || (bArr = this.finalBytes) == null) {
            return null;
        }
        return Arrays.copyOfRange(bArr, bArr.length - this.tagLen, bArr.length);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    long mark() {
        long j11 = this.aux == null ? this.outputByteCount : this.currentCount;
        this.markedCount = j11;
        return j11;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    boolean markSupported() {
        return true;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    void reset() {
        long j11 = this.markedCount;
        if (j11 < this.outputByteCount || this.invisiblyProcessed) {
            try {
                this.aux = createAuxiliary(j11);
                this.currentCount = this.markedCount;
            } catch (Exception e11) {
                if (!(e11 instanceof RuntimeException)) {
                    throw new IllegalStateException(e11);
                }
            }
        }
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    byte[] update(byte[] bArr, int i11, int i12) {
        CipherLite cipherLite = this.aux;
        z = false;
        boolean z11 = false;
        if (cipherLite == null) {
            byte[] bArrUpdate = super.update(bArr, i11, i12);
            if (bArrUpdate == null) {
                this.invisiblyProcessed = bArr.length > 0;
                return null;
            }
            this.outputByteCount += (long) checkMax(bArrUpdate.length);
            if (bArrUpdate.length == 0 && i12 > 0) {
                z11 = true;
            }
            this.invisiblyProcessed = z11;
            return bArrUpdate;
        }
        byte[] bArrUpdate2 = cipherLite.update(bArr, i11, i12);
        if (bArrUpdate2 == null) {
            return null;
        }
        long length = this.currentCount + ((long) bArrUpdate2.length);
        this.currentCount = length;
        long j11 = this.outputByteCount;
        if (length == j11) {
            this.aux = null;
            return bArrUpdate2;
        }
        if (length <= j11) {
            return bArrUpdate2;
        }
        if (1 == getCipherMode()) {
            throw new IllegalStateException("currentCount=" + this.currentCount + " > outputByteCount=" + this.outputByteCount);
        }
        byte[] bArr2 = this.finalBytes;
        int length2 = bArr2 != null ? bArr2.length : 0;
        long j12 = this.outputByteCount;
        long length3 = j12 - (this.currentCount - ((long) bArrUpdate2.length));
        long j13 = length2;
        this.currentCount = j12 - j13;
        this.aux = null;
        return Arrays.copyOf(bArrUpdate2, (int) (length3 - j13));
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    final byte[] doFinal(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException {
        return doFinal0(bArr, 0, bArr.length);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    final byte[] doFinal(byte[] bArr, int i11, int i12) throws BadPaddingException, IllegalBlockSizeException {
        return doFinal0(bArr, i11, i12);
    }
}
