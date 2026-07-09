package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ByteRangeCapturingInputStream extends SdkFilterInputStream {
    private final byte[] block;
    private int blockPosition;
    private final long endingPosition;
    private int markedBlockPosition;
    private long markedStreamPosition;
    private final long startingPosition;
    private long streamPosition;

    public ByteRangeCapturingInputStream(InputStream inputStream, long j11, long j12) {
        super(inputStream);
        this.blockPosition = 0;
        if (j11 >= j12) {
            throw new IllegalArgumentException("Invalid byte range specified: the starting position must be less than the ending position");
        }
        this.startingPosition = j11;
        this.endingPosition = j12;
        this.block = new byte[(int) (j12 - j11)];
    }

    public byte[] getBlock() {
        return this.block;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i11) {
        super.mark(i11);
        if (markSupported()) {
            this.markedStreamPosition = this.streamPosition;
            this.markedBlockPosition = this.blockPosition;
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i11 = super.read();
        if (i11 == -1) {
            return -1;
        }
        long j11 = this.streamPosition;
        if (j11 >= this.startingPosition && j11 <= this.endingPosition) {
            byte[] bArr = this.block;
            int i12 = this.blockPosition;
            this.blockPosition = i12 + 1;
            bArr[i12] = (byte) i11;
        }
        this.streamPosition = j11 + 1;
        return i11;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        if (markSupported()) {
            this.streamPosition = this.markedStreamPosition;
            this.blockPosition = this.markedBlockPosition;
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = super.read(bArr, i11, i12);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.streamPosition;
        long j12 = i13;
        if (j11 + j12 >= this.startingPosition && j11 <= this.endingPosition) {
            for (int i14 = 0; i14 < i13; i14++) {
                long j13 = this.streamPosition;
                long j14 = i14;
                if (j13 + j14 >= this.startingPosition && j13 + j14 < this.endingPosition) {
                    byte[] bArr2 = this.block;
                    int i15 = this.blockPosition;
                    this.blockPosition = i15 + 1;
                    bArr2[i15] = bArr[i11 + i14];
                }
            }
        }
        this.streamPosition += j12;
        return i13;
    }
}
