package com.amazonaws.mobileconnectors.s3.transfermanager;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class TransferProgress {
    private static final Log log = LogFactory.getLog(TransferProgress.class);
    protected volatile long bytesTransferred = 0;
    protected volatile long totalBytesToTransfer = -1;

    @Deprecated
    public long getBytesTransfered() {
        return getBytesTransferred();
    }

    public long getBytesTransferred() {
        return this.bytesTransferred;
    }

    @Deprecated
    public synchronized double getPercentTransfered() {
        return getPercentTransferred();
    }

    public synchronized double getPercentTransferred() {
        double d11;
        if (getBytesTransferred() < 0) {
            return 0.0d;
        }
        if (this.totalBytesToTransfer < 0) {
            d11 = -1.0d;
        } else {
            d11 = (this.bytesTransferred / this.totalBytesToTransfer) * 100.0d;
        }
        return d11;
    }

    public long getTotalBytesToTransfer() {
        return this.totalBytesToTransfer;
    }

    public void setTotalBytesToTransfer(long j11) {
        this.totalBytesToTransfer = j11;
    }

    public synchronized void updateProgress(long j11) {
        this.bytesTransferred += j11;
        if (this.totalBytesToTransfer > -1 && this.bytesTransferred > this.totalBytesToTransfer) {
            this.bytesTransferred = this.totalBytesToTransfer;
            Log log2 = log;
            if (log2.isDebugEnabled()) {
                log2.debug("Number of bytes transfered is more than the actual total bytes to transfer. Total number of bytes to Transfer : " + this.totalBytesToTransfer + ". Bytes Transferred : " + (this.bytesTransferred + j11));
            }
        }
    }
}
