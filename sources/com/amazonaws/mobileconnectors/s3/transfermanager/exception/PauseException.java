package com.amazonaws.mobileconnectors.s3.transfermanager.exception;

import com.amazonaws.AmazonClientException;
import com.amazonaws.mobileconnectors.s3.transfermanager.PauseStatus;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class PauseException extends AmazonClientException {
    private static final long serialVersionUID = 1;
    private final PauseStatus status;

    public PauseException(PauseStatus pauseStatus) {
        super("Failed to pause operation; status=" + pauseStatus);
        if (pauseStatus == null || pauseStatus == PauseStatus.SUCCESS) {
            throw new IllegalArgumentException();
        }
        this.status = pauseStatus;
    }

    public PauseStatus getPauseStatus() {
        return this.status;
    }

    @Override // com.amazonaws.AmazonClientException
    public boolean isRetryable() {
        return false;
    }
}
