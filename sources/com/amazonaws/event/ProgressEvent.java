package com.amazonaws.event;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ProgressEvent {
    public static final int CANCELED_EVENT_CODE = 16;
    public static final int COMPLETED_EVENT_CODE = 4;
    public static final int FAILED_EVENT_CODE = 8;
    public static final int PART_COMPLETED_EVENT_CODE = 2048;
    public static final int PART_FAILED_EVENT_CODE = 4096;
    public static final int PART_STARTED_EVENT_CODE = 1024;
    public static final int PREPARING_EVENT_CODE = 1;
    public static final int RESET_EVENT_CODE = 32;
    public static final int STARTED_EVENT_CODE = 2;
    protected long bytesTransferred;
    protected int eventCode;

    public ProgressEvent(long j11) {
        this.bytesTransferred = j11;
    }

    public long getBytesTransferred() {
        return this.bytesTransferred;
    }

    public int getEventCode() {
        return this.eventCode;
    }

    public void setBytesTransferred(long j11) {
        this.bytesTransferred = j11;
    }

    public void setEventCode(int i11) {
        this.eventCode = i11;
    }

    public ProgressEvent(int i11, long j11) {
        this.eventCode = i11;
        this.bytesTransferred = j11;
    }
}
