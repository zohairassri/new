package io.agora.musiccontentcenter;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class MusicCacheInfo {
    public long songCode;
    public int status;

    public MusicCacheInfo() {
    }

    @CalledByNative
    public long getSongCode() {
        return this.songCode;
    }

    @CalledByNative
    public int getStatus() {
        return this.status;
    }

    public String toString() {
        return "MusicCacheInfo{songCode=" + this.songCode + ", status=" + this.status + '}';
    }

    @CalledByNative
    public MusicCacheInfo(long j11, int i11) {
        this.songCode = j11;
        this.status = i11;
    }
}
