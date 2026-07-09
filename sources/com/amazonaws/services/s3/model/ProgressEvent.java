package com.amazonaws.services.s3.model;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class ProgressEvent extends com.amazonaws.event.ProgressEvent {
    public ProgressEvent(int i11) {
        super(i11);
    }

    @Deprecated
    public int getBytesTransfered() {
        return (int) getBytesTransferred();
    }

    @Deprecated
    public void setBytesTransfered(int i11) {
        setBytesTransferred(i11);
    }

    public ProgressEvent(int i11, long j11) {
        super(i11, j11);
    }
}
