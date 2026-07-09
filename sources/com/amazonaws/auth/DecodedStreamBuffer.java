package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class DecodedStreamBuffer {
    private static final Log log = LogFactory.getLog(DecodedStreamBuffer.class);
    private byte[] bufferArray;
    private boolean bufferSizeOverflow;
    private int byteBuffered;
    private int maxBufferSize;
    private int pos = -1;

    public DecodedStreamBuffer(int i11) {
        this.bufferArray = new byte[i11];
        this.maxBufferSize = i11;
    }

    public void buffer(byte b11) {
        this.pos = -1;
        int i11 = this.byteBuffered;
        if (i11 < this.maxBufferSize) {
            byte[] bArr = this.bufferArray;
            this.byteBuffered = i11 + 1;
            bArr[i11] = b11;
            return;
        }
        Log log2 = log;
        if (log2.isDebugEnabled()) {
            log2.debug("Buffer size " + this.maxBufferSize + " has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
        }
        this.bufferSizeOverflow = true;
    }

    public boolean hasNext() {
        int i11 = this.pos;
        return i11 != -1 && i11 < this.byteBuffered;
    }

    public byte next() {
        byte[] bArr = this.bufferArray;
        int i11 = this.pos;
        this.pos = i11 + 1;
        return bArr[i11];
    }

    public void startReadBuffer() {
        if (!this.bufferSizeOverflow) {
            this.pos = 0;
            return;
        }
        throw new AmazonClientException("The input stream is not repeatable since the buffer size " + this.maxBufferSize + " has been exceeded.");
    }

    public void buffer(byte[] bArr, int i11, int i12) {
        this.pos = -1;
        int i13 = this.byteBuffered;
        if (i13 + i12 > this.maxBufferSize) {
            Log log2 = log;
            if (log2.isDebugEnabled()) {
                log2.debug("Buffer size " + this.maxBufferSize + " has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
            }
            this.bufferSizeOverflow = true;
            return;
        }
        System.arraycopy(bArr, i11, this.bufferArray, i13, i12);
        this.byteBuffered += i12;
    }
}
