package com.amazonaws.mobileconnectors.s3.transferutility;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class TransferUtilityOptions implements Serializable {
    private static final int MILLIS_IN_MINUTE = 60000;
    private static final long serialVersionUID = 1;

    @Deprecated
    private long transferServiceCheckTimeInterval = getDefaultCheckTimeInterval();
    private int transferThreadPoolSize = getDefaultThreadPoolSize();

    @Deprecated
    static long getDefaultCheckTimeInterval() {
        return 60000L;
    }

    static int getDefaultThreadPoolSize() {
        return (Runtime.getRuntime().availableProcessors() + 1) * 2;
    }

    @Deprecated
    public long getTransferServiceCheckTimeInterval() {
        return this.transferServiceCheckTimeInterval;
    }

    public int getTransferThreadPoolSize() {
        return this.transferThreadPoolSize;
    }

    public void setTransferThreadPoolSize(int i11) {
        if (i11 < 0) {
            this.transferThreadPoolSize = getDefaultThreadPoolSize();
        } else {
            this.transferThreadPoolSize = i11;
        }
    }

    @Deprecated
    public void setTransferServiceCheckTimeInterval(long j11) {
    }
}
