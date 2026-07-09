package com.amazonaws.mobileconnectors.s3.transfermanager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class PauseResult<T> {
    private final T infoToResume;
    private final PauseStatus pauseStatus;

    public PauseResult(PauseStatus pauseStatus, T t11) {
        if (pauseStatus == null) {
            throw new IllegalArgumentException();
        }
        this.pauseStatus = pauseStatus;
        this.infoToResume = t11;
    }

    public T getInfoToResume() {
        return this.infoToResume;
    }

    public PauseStatus getPauseStatus() {
        return this.pauseStatus;
    }

    public PauseResult(PauseStatus pauseStatus) {
        this(pauseStatus, null);
    }
}
