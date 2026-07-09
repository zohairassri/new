package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class RecorderInfo {
    public int durationMs;
    public String fileName;
    public int fileSize;

    @CalledByNative
    public RecorderInfo(String str, int i11, int i12) {
        this.fileName = str;
        this.durationMs = i11;
        this.fileSize = i12;
    }
}
