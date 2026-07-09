package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class CodecCapLevels {
    public int hwDecodingLevel;
    public int swDecodingLevel;

    public CodecCapLevels() {
        this.hwDecodingLevel = -1;
        this.swDecodingLevel = -1;
    }

    @CalledByNative
    public CodecCapLevels(int i11, int i12) {
        this.hwDecodingLevel = i11;
        this.swDecodingLevel = i12;
    }
}
