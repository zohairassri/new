package com.theathletic.entity.main;

import com.theathletic.video.component.data.VideoRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/theathletic/entity/main/PodcastDownloadEntity;", "", "<init>", "()V", "podcastEpisodeId", "", "getPodcastEpisodeId", "()J", "setPodcastEpisodeId", "(J)V", "podcastEpisodeName", "", "getPodcastEpisodeName", "()Ljava/lang/String;", "setPodcastEpisodeName", "(Ljava/lang/String;)V", "downloadId", "getDownloadId", "setDownloadId", VideoRepository.XML_ATTR_VALUE, "progress", "getProgress", "isDownloaded", "", "isDownloading", "markAsNotDownloaded", "", "markAsDownloaded", "setProgress", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PodcastDownloadEntity {
    private long podcastEpisodeId;

    @NotNull
    private String podcastEpisodeName = "";
    private long downloadId = -1;
    private long progress = -1;

    public final long getDownloadId() {
        return this.downloadId;
    }

    public final long getPodcastEpisodeId() {
        return this.podcastEpisodeId;
    }

    @NotNull
    public final String getPodcastEpisodeName() {
        return this.podcastEpisodeName;
    }

    public final long getProgress() {
        return this.progress;
    }

    public final boolean isDownloaded() {
        return this.progress == 100;
    }

    public final boolean isDownloading() {
        long j11 = this.progress;
        return 0 <= j11 && j11 < 100;
    }

    public final void markAsDownloaded() {
        this.progress = 100L;
    }

    public final void markAsNotDownloaded() {
        this.progress = -1L;
    }

    public final void setDownloadId(long j11) {
        this.downloadId = j11;
    }

    public final void setPodcastEpisodeId(long j11) {
        this.podcastEpisodeId = j11;
    }

    public final void setPodcastEpisodeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.podcastEpisodeName = str;
    }

    public final void setProgress(long progress) {
        this.progress = progress;
    }
}
