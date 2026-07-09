package com.amazonaws.mobileconnectors.s3.transfermanager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public enum PauseStatus {
    SUCCESS,
    NOT_STARTED,
    CANCELLED_BEFORE_START,
    NO_EFFECT,
    CANCELLED;

    public boolean isCancelled() {
        return this == CANCELLED || this == CANCELLED_BEFORE_START;
    }

    public boolean isPaused() {
        return this == SUCCESS;
    }

    public boolean unchanged() {
        return this == NOT_STARTED || this == NO_EFFECT;
    }
}
