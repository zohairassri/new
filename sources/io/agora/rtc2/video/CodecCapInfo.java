package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class CodecCapInfo {
    public int codecCapMask;
    public CodecCapLevels codecLevels;
    public int codecType;

    @CalledByNative
    public CodecCapInfo(int i11, int i12, CodecCapLevels codecCapLevels) {
        this.codecType = i11;
        this.codecCapMask = i12;
        this.codecLevels = codecCapLevels;
    }

    @CalledByNative
    public void SetCodecCapMask(int i11) {
        this.codecCapMask = i11;
    }

    @CalledByNative
    public void SetCodecType(int i11) {
        this.codecType = i11;
    }
}
