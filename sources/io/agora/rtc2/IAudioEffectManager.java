package io.agora.rtc2;

/* JADX INFO: loaded from: classes7.dex */
public interface IAudioEffectManager {
    double getEffectsVolume();

    int pauseAllEffects();

    int pauseEffect(int i11);

    int playEffect(int i11, String str, int i12, double d11, double d12, double d13);

    int playEffect(int i11, String str, int i12, double d11, double d12, double d13, boolean z11);

    int playEffect(int i11, String str, int i12, double d11, double d12, double d13, boolean z11, int i13);

    int playEffectEx(RtcConnection rtcConnection, int i11, String str, int i12, double d11, double d12, double d13, boolean z11);

    int playEffectEx(RtcConnection rtcConnection, int i11, String str, int i12, double d11, double d12, double d13, boolean z11, int i13);

    int preloadEffect(int i11, String str);

    int preloadEffect(int i11, String str, int i12);

    int preloadEffectEx(RtcConnection rtcConnection, int i11, String str);

    int preloadEffectEx(RtcConnection rtcConnection, int i11, String str, int i12);

    int resumeAllEffects();

    int resumeEffect(int i11);

    int setEffectsVolume(double d11);

    int setVolumeOfEffect(int i11, double d11);

    int stopAllEffects();

    int stopEffect(int i11);

    int unloadEffect(int i11);
}
