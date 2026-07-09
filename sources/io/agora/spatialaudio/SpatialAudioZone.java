package io.agora.spatialaudio;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class SpatialAudioZone {
    public int zoneSetId = -1;
    public float[] position = {0.0f, 0.0f, 0.0f};
    public float[] forward = {0.0f, 0.0f, 0.0f};
    public float[] right = {0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: up, reason: collision with root package name */
    public float[] f103977up = {0.0f, 0.0f, 0.0f};
    public float forwardLength = 0.0f;
    public float rightLength = 0.0f;
    public float upLength = 0.0f;
    public float audioAttenuation = 0.0f;

    @CalledByNative
    public float getAudioAttenuation() {
        return this.audioAttenuation;
    }

    @CalledByNative
    public float[] getForward() {
        return this.forward;
    }

    @CalledByNative
    public float getForwardLength() {
        return this.forwardLength;
    }

    @CalledByNative
    public float[] getPosition() {
        return this.position;
    }

    @CalledByNative
    public float[] getRight() {
        return this.right;
    }

    @CalledByNative
    public float getRightLength() {
        return this.rightLength;
    }

    @CalledByNative
    public float[] getUp() {
        return this.f103977up;
    }

    @CalledByNative
    public float getUpLength() {
        return this.upLength;
    }

    @CalledByNative
    public int getZoneSetId() {
        return this.zoneSetId;
    }
}
