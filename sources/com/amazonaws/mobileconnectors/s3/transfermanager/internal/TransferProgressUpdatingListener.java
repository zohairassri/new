package com.amazonaws.mobileconnectors.s3.transfermanager.internal;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.mobileconnectors.s3.transfermanager.TransferProgress;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class TransferProgressUpdatingListener implements ProgressListener {
    private final TransferProgress transferProgress;

    public TransferProgressUpdatingListener(TransferProgress transferProgress) {
        this.transferProgress = transferProgress;
    }

    @Override // com.amazonaws.event.ProgressListener
    public void progressChanged(ProgressEvent progressEvent) {
        long bytesTransferred = progressEvent.getBytesTransferred();
        if (bytesTransferred == 0) {
            return;
        }
        this.transferProgress.updateProgress(bytesTransferred);
    }
}
