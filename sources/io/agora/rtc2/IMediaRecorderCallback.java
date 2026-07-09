package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public interface IMediaRecorderCallback {
    @CalledByNative
    void onRecorderInfoUpdated(String str, int i11, RecorderInfo recorderInfo);

    @CalledByNative
    void onRecorderStateChanged(String str, int i11, int i12, int i13);
}
