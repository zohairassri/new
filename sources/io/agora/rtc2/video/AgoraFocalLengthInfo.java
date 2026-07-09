package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class AgoraFocalLengthInfo {
    public int cameraDirection;
    public int focalLengthType;

    @CalledByNative
    public AgoraFocalLengthInfo(int i11, int i12) {
        this.cameraDirection = i11;
        this.focalLengthType = i12;
    }

    public String toString() {
        return "AgoraFocalLengthInfo{cameraDirection=" + this.cameraDirection + ", focalLengthType=" + this.focalLengthType + '}';
    }
}
