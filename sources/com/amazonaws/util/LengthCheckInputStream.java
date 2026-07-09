package com.amazonaws.util;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class LengthCheckInputStream extends SdkFilterInputStream {
    public static final boolean EXCLUDE_SKIPPED_BYTES = false;
    public static final boolean INCLUDE_SKIPPED_BYTES = true;
    private long dataLength;
    private final long expectedLength;
    private final boolean includeSkipped;
    private long marked;

    public LengthCheckInputStream(InputStream inputStream, long j11, boolean z11) {
        super(inputStream);
        if (j11 < 0) {
            throw new IllegalArgumentException();
        }
        this.expectedLength = j11;
        this.includeSkipped = z11;
    }

    private void checkLength(boolean z11) {
        if (z11) {
            if (this.dataLength == this.expectedLength) {
                return;
            }
            throw new AmazonClientException("Data read (" + this.dataLength + ") has a different length than the expected (" + this.expectedLength + ")");
        }
        if (this.dataLength <= this.expectedLength) {
            return;
        }
        throw new AmazonClientException("More data read (" + this.dataLength + ") than expected (" + this.expectedLength + ")");
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i11) {
        super.mark(i11);
        this.marked = this.dataLength;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i11 = super.read();
        if (i11 >= 0) {
            this.dataLength++;
        }
        checkLength(i11 == -1);
        return i11;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        super.reset();
        if (super.markSupported()) {
            this.dataLength = this.marked;
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) throws IOException {
        long jSkip = super.skip(j11);
        if (this.includeSkipped && jSkip > 0) {
            this.dataLength += jSkip;
            checkLength(false);
        }
        return jSkip;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = super.read(bArr, i11, i12);
        this.dataLength += i13 >= 0 ? i13 : 0L;
        checkLength(i13 == -1);
        return i13;
    }
}
