package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;
import io.agora.rtc2.audio.AudioParams;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public interface IAudioFrameObserver {
    @CalledByNative
    AudioParams getEarMonitoringAudioParams();

    @CalledByNative
    AudioParams getMixedAudioParams();

    @CalledByNative
    int getObservedAudioFramePosition();

    @CalledByNative
    AudioParams getPlaybackAudioParams();

    @CalledByNative
    AudioParams getRecordAudioParams();

    @CalledByNative
    boolean onEarMonitoringAudioFrame(int i11, int i12, int i13, int i14, int i15, ByteBuffer byteBuffer, long j11, int i16);

    @CalledByNative
    boolean onMixedAudioFrame(String str, int i11, int i12, int i13, int i14, int i15, ByteBuffer byteBuffer, long j11, int i16);

    @CalledByNative
    boolean onPlaybackAudioFrame(String str, int i11, int i12, int i13, int i14, int i15, ByteBuffer byteBuffer, long j11, int i16);

    @CalledByNative
    boolean onPlaybackAudioFrameBeforeMixing(String str, int i11, int i12, int i13, int i14, int i15, int i16, ByteBuffer byteBuffer, long j11, int i17, int i18, long j12);

    @CalledByNative
    boolean onRecordAudioFrame(String str, int i11, int i12, int i13, int i14, int i15, ByteBuffer byteBuffer, long j11, int i16);
}
