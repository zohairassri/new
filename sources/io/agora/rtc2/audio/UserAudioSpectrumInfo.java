package io.agora.rtc2.audio;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class UserAudioSpectrumInfo {
    private AudioSpectrumInfo audioSpectrumInfo;
    private int uid;

    @CalledByNative
    public UserAudioSpectrumInfo(int i11, AudioSpectrumInfo audioSpectrumInfo) {
        this.uid = i11;
        this.audioSpectrumInfo = audioSpectrumInfo;
    }

    public AudioSpectrumInfo getAudioSpectrumInfo() {
        return this.audioSpectrumInfo;
    }

    public int getUid() {
        return this.uid;
    }
}
