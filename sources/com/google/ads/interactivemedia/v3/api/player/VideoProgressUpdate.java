package com.google.ads.interactivemedia.v3.api.player;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class VideoProgressUpdate {

    @NonNull
    public static final VideoProgressUpdate VIDEO_TIME_NOT_READY = new VideoProgressUpdate(-1, -1);
    private final long zza;
    private final long zzb;

    public VideoProgressUpdate(long j11, long j12) {
        this.zza = j11;
        this.zzb = j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VideoProgressUpdate.class != obj.getClass()) {
            return false;
        }
        VideoProgressUpdate videoProgressUpdate = (VideoProgressUpdate) obj;
        return this.zza == videoProgressUpdate.zza && this.zzb == videoProgressUpdate.zzb;
    }

    @Deprecated
    public float getCurrentTime() {
        return this.zza / 1000.0f;
    }

    public long getCurrentTimeMs() {
        return this.zza;
    }

    @Deprecated
    public float getDuration() {
        return this.zzb / 1000.0f;
    }

    public long getDurationMs() {
        return this.zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Long.valueOf(this.zzb)});
    }
}
