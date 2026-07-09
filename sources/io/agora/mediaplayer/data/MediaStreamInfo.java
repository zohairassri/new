package io.agora.mediaplayer.data;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class MediaStreamInfo {
    private int audioBytesPerSample;
    private int audioChannels;
    private int audioSampleRate;
    private String codecName;
    private long duration;
    private String language;
    private int mediaStreamType;
    private int streamIndex;
    private int videoBitRate;
    private int videoFrameRate;
    private int videoHeight;
    private int videoRotation;
    private int videoWidth;

    public MediaStreamInfo() {
    }

    @CalledByNative
    public int getAudioBytesPerSample() {
        return this.audioBytesPerSample;
    }

    @CalledByNative
    public int getAudioChannels() {
        return this.audioChannels;
    }

    @CalledByNative
    public int getAudioSampleRate() {
        return this.audioSampleRate;
    }

    @CalledByNative
    public String getCodecName() {
        return this.codecName;
    }

    @CalledByNative
    public long getDuration() {
        return this.duration;
    }

    @CalledByNative
    public String getLanguage() {
        return this.language;
    }

    @CalledByNative
    public int getMediaStreamType() {
        return this.mediaStreamType;
    }

    @CalledByNative
    public int getStreamIndex() {
        return this.streamIndex;
    }

    @CalledByNative
    public int getVideoBitRate() {
        return this.videoBitRate;
    }

    @CalledByNative
    public int getVideoFrameRate() {
        return this.videoFrameRate;
    }

    @CalledByNative
    public int getVideoHeight() {
        return this.videoHeight;
    }

    public int getVideoRotation() {
        return this.videoRotation;
    }

    @CalledByNative
    public int getVideoWidth() {
        return this.videoWidth;
    }

    public void setAudioBytesPerSample(int i11) {
        this.audioBytesPerSample = i11;
    }

    public void setAudioChannels(int i11) {
        this.audioChannels = i11;
    }

    public void setAudioSampleRate(int i11) {
        this.audioSampleRate = i11;
    }

    public void setCodecName(String str) {
        this.codecName = str;
    }

    public void setDuration(long j11) {
        this.duration = j11;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setMediaStreamType(int i11) {
        this.mediaStreamType = i11;
    }

    public void setStreamIndex(int i11) {
        this.streamIndex = i11;
    }

    public void setVideoBitRate(int i11) {
        this.videoBitRate = i11;
    }

    public void setVideoFrameRate(int i11) {
        this.videoFrameRate = i11;
    }

    public void setVideoHeight(int i11) {
        this.videoHeight = i11;
    }

    public void setVideoRotation(int i11) {
        this.videoRotation = i11;
    }

    public void setVideoWidth(int i11) {
        this.videoWidth = i11;
    }

    public String toString() {
        return "MediaStreamInfo{streamIndex=" + this.streamIndex + ", mediaStreamType=" + this.mediaStreamType + ", codecName='" + this.codecName + "', language='" + this.language + "', videoFrameRate=" + this.videoFrameRate + ", videoBitRate=" + this.videoBitRate + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", audioSampleRate=" + this.audioSampleRate + ", videoRotation=" + this.videoRotation + ", audioChannels=" + this.audioChannels + ", duration=" + this.duration + '}';
    }

    @CalledByNative
    public MediaStreamInfo(int i11, int i12, String str, String str2, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11) {
        this.streamIndex = i11;
        this.mediaStreamType = i12;
        this.codecName = str;
        this.language = str2;
        this.videoFrameRate = i13;
        this.videoBitRate = i14;
        this.videoWidth = i15;
        this.videoHeight = i16;
        this.videoRotation = i17;
        this.audioSampleRate = i18;
        this.audioChannels = i19;
        this.duration = j11;
    }
}
