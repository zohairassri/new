package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class EncodedVideoFrameInfo {
    public long captureTimeMs;
    public int codecType;
    public long decodeTimeMs;
    public int frameType;
    public int framesPerSecond;
    public int height;
    public int rotation;
    public int streamType;
    public int trackId;
    public int uid;
    public int width;

    public EncodedVideoFrameInfo() {
        this.uid = 0;
        this.codecType = 2;
        this.width = 0;
        this.height = 0;
        this.framesPerSecond = 0;
        this.frameType = 0;
        this.rotation = 0;
        this.trackId = 0;
        this.captureTimeMs = 0L;
        this.decodeTimeMs = 0L;
        this.streamType = 0;
    }

    @CalledByNative
    public long getCaptureTimeMs() {
        return this.captureTimeMs;
    }

    @CalledByNative
    public int getCodecType() {
        return this.codecType;
    }

    @CalledByNative
    public long getDecodeTimeMs() {
        return this.decodeTimeMs;
    }

    @CalledByNative
    public int getFrameType() {
        return this.frameType;
    }

    @CalledByNative
    public int getFramesPerSecond() {
        return this.framesPerSecond;
    }

    @CalledByNative
    public int getHeight() {
        return this.height;
    }

    @CalledByNative
    public int getRotation() {
        return this.rotation;
    }

    @CalledByNative
    public int getStreamType() {
        return this.streamType;
    }

    @CalledByNative
    public int getTrackId() {
        return this.trackId;
    }

    @CalledByNative
    public int getUid() {
        return this.uid;
    }

    @CalledByNative
    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "codecType=" + this.codecType + " width=" + this.width + " height=" + this.height + " framesPerSecond=" + this.framesPerSecond + " frameType=" + this.frameType + " rotation=" + this.rotation + " trackId=" + this.trackId + " captureTimeMs=" + this.captureTimeMs + " decodeTimeMs=" + this.decodeTimeMs + " uid=" + this.uid + " streamType=" + this.streamType;
    }

    @CalledByNative
    public EncodedVideoFrameInfo(int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, long j12, int i18, int i19) {
        this.codecType = i11;
        this.width = i12;
        this.height = i13;
        this.framesPerSecond = i14;
        this.frameType = i15;
        this.rotation = i16;
        this.trackId = i17;
        this.captureTimeMs = j11;
        this.decodeTimeMs = j12;
        this.uid = i18;
        this.streamType = i19;
    }
}
