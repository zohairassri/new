package io.agora.rtc2.audio;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class AudioSpectrumInfo {
    private float[] audioSpectrumData;
    private int dataLength;

    @CalledByNative
    public AudioSpectrumInfo(float[] fArr, int i11) {
        this.audioSpectrumData = fArr;
        this.dataLength = i11;
    }

    public float[] getAudioSpectrumData() {
        return this.audioSpectrumData;
    }

    public int getDataLength() {
        return this.dataLength;
    }
}
