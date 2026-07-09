package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.internal.SdkInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class AdjustedRangeInputStream extends SdkInputStream {
    private boolean closed = false;
    private InputStream decryptedContents;
    private long virtualAvailable;

    public AdjustedRangeInputStream(InputStream inputStream, long j11, long j12) throws IOException {
        this.decryptedContents = inputStream;
        initializeForRead(j11, j12);
    }

    private void initializeForRead(long j11, long j12) throws IOException {
        int i11 = j11 < 16 ? (int) j11 : ((int) (j11 % 16)) + 16;
        if (i11 != 0) {
            while (i11 > 0) {
                this.decryptedContents.read();
                i11--;
            }
        }
        this.virtualAvailable = (j12 - j11) + 1;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        abortIfNeeded();
        int iAvailable = this.decryptedContents.available();
        long j11 = iAvailable;
        long j12 = this.virtualAvailable;
        return j11 < j12 ? iAvailable : (int) j12;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.closed) {
            this.closed = true;
            this.decryptedContents.close();
        }
        abortIfNeeded();
    }

    @Override // com.amazonaws.internal.SdkInputStream
    protected InputStream getWrappedInputStream() {
        return this.decryptedContents;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        abortIfNeeded();
        int i11 = this.virtualAvailable <= 0 ? -1 : this.decryptedContents.read();
        if (i11 != -1) {
            this.virtualAvailable--;
            return i11;
        }
        close();
        this.virtualAvailable = 0L;
        return i11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13;
        abortIfNeeded();
        long j11 = this.virtualAvailable;
        if (j11 <= 0) {
            i13 = -1;
        } else {
            if (i12 > j11) {
                i12 = j11 < 2147483647L ? (int) j11 : Integer.MAX_VALUE;
            }
            i13 = this.decryptedContents.read(bArr, i11, i12);
        }
        if (i13 != -1) {
            this.virtualAvailable -= (long) i13;
            return i13;
        }
        close();
        this.virtualAvailable = 0L;
        return i13;
    }
}
