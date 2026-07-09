package io.agora.mediaplayer.data;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class CacheStatistics {
    private long fileSize = 0;
    private long cacheSize = 0;
    private long downloadSize = 0;

    @CalledByNative
    public CacheStatistics() {
    }

    public long getCacheSize() {
        return this.cacheSize;
    }

    public long getDownloadSize() {
        return this.downloadSize;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    @CalledByNative
    public void setCacheSize(long j11) {
        this.cacheSize = j11;
    }

    @CalledByNative
    public void setDownloadSize(long j11) {
        this.downloadSize = j11;
    }

    @CalledByNative
    public void setFileSize(long j11) {
        this.fileSize = j11;
    }

    public String toString() {
        return "CacheStatistics{fileSize=" + this.fileSize + ", cacheSize=" + this.cacheSize + ", downloadSize=" + this.downloadSize + '}';
    }
}
