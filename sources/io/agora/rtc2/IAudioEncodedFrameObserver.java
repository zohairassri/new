package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public interface IAudioEncodedFrameObserver {
    @CalledByNative
    void onMixedAudioEncodedFrame(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14);

    @CalledByNative
    void onPlaybackAudioEncodedFrame(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14);

    @CalledByNative
    void onRecordAudioEncodedFrame(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14);
}
