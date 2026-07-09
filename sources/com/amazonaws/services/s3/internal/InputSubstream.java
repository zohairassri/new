package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class InputSubstream extends SdkFilterInputStream {
    private final boolean closeSourceStream;
    private long currentPosition;
    private long markedPosition;
    private final long requestedLength;
    private final long requestedOffset;

    public InputSubstream(InputStream inputStream, long j11, long j12, boolean z11) {
        super(inputStream);
        this.markedPosition = 0L;
        this.currentPosition = 0L;
        this.requestedLength = j12;
        this.requestedOffset = j11;
        this.closeSourceStream = z11;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        long j11 = this.currentPosition;
        long j12 = this.requestedOffset;
        return (int) Math.min(j11 < j12 ? this.requestedLength : (this.requestedLength + j12) - j11, super.available());
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closeSourceStream) {
            super.close();
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i11) {
        this.markedPosition = this.currentPosition;
        super.mark(i11);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        int i11 = read(bArr, 0, 1);
        return i11 == -1 ? i11 : bArr[0];
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        this.currentPosition = this.markedPosition;
        super.reset();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        long j11;
        long j12;
        while (true) {
            j11 = this.currentPosition;
            j12 = this.requestedOffset;
            if (j11 >= j12) {
                break;
            }
            this.currentPosition += super.skip(j12 - j11);
        }
        long j13 = (this.requestedLength + j12) - j11;
        if (j13 <= 0) {
            return -1;
        }
        int i13 = super.read(bArr, i11, (int) Math.min(i12, j13));
        this.currentPosition += (long) i13;
        return i13;
    }
}
