package io.agora.spatialaudio;

import io.agora.rtc2.RtcConnection;

/* JADX INFO: loaded from: classes7.dex */
public abstract class IBaseSpatialAudioEngine {
    public abstract int clearRemotePositions();

    public abstract int muteAllRemoteAudioStreams(boolean z11);

    public abstract int muteLocalAudioStream(boolean z11);

    public abstract int muteRemoteAudioStream(int i11, boolean z11);

    protected abstract int release();

    public abstract int setAudioRecvRange(float f11);

    public abstract int setDistanceUnit(float f11);

    public abstract int setMaxAudioRecvCount(int i11);

    public abstract int setPlayerAttenuation(int i11, double d11, boolean z11);

    public abstract int setZones(SpatialAudioZone[] spatialAudioZoneArr);

    public abstract int updatePlayerPositionInfo(int i11, RemoteVoicePositionInfo remoteVoicePositionInfo);

    public abstract int updateSelfPosition(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4);

    public abstract int updateSelfPositionEx(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, RtcConnection rtcConnection);
}
