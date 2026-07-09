package io.agora.rtc2.audio;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class AudioParams {
    public int channel;
    public int mode;
    public int sampleRate;
    public int samplesPerCall;

    @CalledByNative
    public AudioParams(int i11, int i12, int i13, int i14) {
        this.sampleRate = i11;
        this.channel = i12;
        this.mode = i13;
        this.samplesPerCall = i14;
    }

    @CalledByNative
    public int getChannel() {
        return this.channel;
    }

    @CalledByNative
    public int getMode() {
        return this.mode;
    }

    @CalledByNative
    public int getSampleRate() {
        return this.sampleRate;
    }

    @CalledByNative
    public int getSamplesPerCall() {
        return this.samplesPerCall;
    }

    public String toString() {
        return "AudioParams{sampleRate=" + this.sampleRate + ", channel=" + this.channel + ", mode=" + this.mode + ", samplesPerCall=" + this.samplesPerCall + '}';
    }
}
