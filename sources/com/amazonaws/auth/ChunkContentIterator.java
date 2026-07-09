package com.amazonaws.auth;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class ChunkContentIterator {
    private int pos;
    private final byte[] signedChunk;

    public ChunkContentIterator(byte[] bArr) {
        this.signedChunk = bArr;
    }

    public boolean hasNext() {
        return this.pos < this.signedChunk.length;
    }

    public int read(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        if (!hasNext()) {
            return -1;
        }
        int iMin = Math.min(this.signedChunk.length - this.pos, i12);
        System.arraycopy(this.signedChunk, this.pos, bArr, i11, iMin);
        this.pos += iMin;
        return iMin;
    }
}
