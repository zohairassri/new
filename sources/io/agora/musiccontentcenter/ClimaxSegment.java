package io.agora.musiccontentcenter;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class ClimaxSegment {
    public int endTimeMs;
    public int startTimeMs;

    @CalledByNative
    public ClimaxSegment(int i11, int i12) {
        this.startTimeMs = i11;
        this.endTimeMs = i12;
    }

    @CalledByNative
    public int getEndTimeMs() {
        return this.endTimeMs;
    }

    @CalledByNative
    public int getStartTimeMs() {
        return this.startTimeMs;
    }
}
