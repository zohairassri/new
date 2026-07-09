package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkDigestInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class DigestValidationInputStream extends SdkDigestInputStream {
    private boolean digestValidated;
    private byte[] expectedHash;

    public DigestValidationInputStream(InputStream inputStream, MessageDigest messageDigest, byte[] bArr) {
        super(inputStream, messageDigest);
        this.digestValidated = false;
        this.expectedHash = bArr;
    }

    private void validateMD5Digest() {
        if (this.expectedHash == null || this.digestValidated) {
            return;
        }
        this.digestValidated = true;
        if (!Arrays.equals(((DigestInputStream) this).digest.digest(), this.expectedHash)) {
            throw new AmazonClientException("Unable to verify integrity of data download.  Client calculated content hash didn't match hash calculated by Amazon S3.  The data may be corrupt.");
        }
    }

    public byte[] getMD5Checksum() {
        return ((DigestInputStream) this).digest.digest();
    }

    @Override // java.security.DigestInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i11 = super.read();
        if (i11 == -1) {
            validateMD5Digest();
        }
        return i11;
    }

    @Override // java.security.DigestInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = super.read(bArr, i11, i12);
        if (i13 == -1) {
            validateMD5Digest();
        }
        return i13;
    }
}
