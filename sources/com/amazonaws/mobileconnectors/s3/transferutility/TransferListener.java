package com.amazonaws.mobileconnectors.s3.transferutility;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface TransferListener {
    void onError(int i11, Exception exc);

    void onProgressChanged(int i11, long j11, long j12);

    void onStateChanged(int i11, TransferState transferState);
}
