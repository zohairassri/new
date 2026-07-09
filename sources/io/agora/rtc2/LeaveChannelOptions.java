package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class LeaveChannelOptions {
    public boolean stopAudioMixing = true;
    public boolean stopAllEffect = true;
    public boolean unloadAllEffect = false;
    public boolean stopMicrophoneRecording = true;

    @CalledByNative
    public boolean isStopAllEffect() {
        return this.stopAllEffect;
    }

    @CalledByNative
    public boolean isStopAudioMixing() {
        return this.stopAudioMixing;
    }

    @CalledByNative
    public boolean isStopMicrophoneRecording() {
        return this.stopMicrophoneRecording;
    }

    @CalledByNative
    public boolean isUnloadAllEffect() {
        return this.unloadAllEffect;
    }

    public String toString() {
        return "stopAudioMixing=" + this.stopAudioMixing + "stopAllEffect=" + this.stopAllEffect + "unloadAllEffect=" + this.unloadAllEffect + "stopMicrophoneRecording=" + this.stopMicrophoneRecording;
    }
}
