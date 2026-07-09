package io.agora.base.internal.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class FrameExtraInfo {
    public final long captureTimeNs;
    public final long captureTimeRtp;
    public final long ntpTimestamp;

    /* JADX INFO: renamed from: qp, reason: collision with root package name */
    public final int f103947qp;
    public final long rtpTimestampMs;

    public FrameExtraInfo() {
        this.captureTimeNs = 0L;
        this.captureTimeRtp = 0L;
        this.rtpTimestampMs = 0L;
        this.ntpTimestamp = 0L;
        this.f103947qp = 0;
    }

    @CalledByNative
    public long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    @CalledByNative
    public long getCaptureTimeRtp() {
        return this.captureTimeRtp;
    }

    @CalledByNative
    public long getNtpTimestamp() {
        return this.ntpTimestamp;
    }

    @CalledByNative
    public int getQp() {
        return this.f103947qp;
    }

    @CalledByNative
    public long getRtpTimestampMs() {
        return this.rtpTimestampMs;
    }

    @CalledByNative
    private FrameExtraInfo(long j11, long j12, long j13, long j14, int i11) {
        this.captureTimeNs = j11;
        this.captureTimeRtp = j12;
        this.rtpTimestampMs = j13;
        this.ntpTimestamp = j14;
        this.f103947qp = i11;
    }
}
