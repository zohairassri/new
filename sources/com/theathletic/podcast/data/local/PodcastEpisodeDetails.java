package com.theathletic.podcast.data.local;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/theathletic/podcast/data/local/PodcastEpisodeDetails;", "", "isFollowed", "", "isDownloaded", "title", "", "downloadUrl", "isTeaser", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Z)V", "()Z", "getTitle", "()Ljava/lang/String;", "getDownloadUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PodcastEpisodeDetails {

    @NotNull
    private final String downloadUrl;
    private final boolean isDownloaded;
    private final boolean isFollowed;
    private final boolean isTeaser;

    @NotNull
    private final String title;

    public PodcastEpisodeDetails(boolean z11, boolean z12, @NotNull String title, @NotNull String downloadUrl, boolean z13) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        this.isFollowed = z11;
        this.isDownloaded = z12;
        this.title = title;
        this.downloadUrl = downloadUrl;
        this.isTeaser = z13;
    }

    public static /* synthetic */ PodcastEpisodeDetails copy$default(PodcastEpisodeDetails podcastEpisodeDetails, boolean z11, boolean z12, String str, String str2, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = podcastEpisodeDetails.isFollowed;
        }
        if ((i11 & 2) != 0) {
            z12 = podcastEpisodeDetails.isDownloaded;
        }
        if ((i11 & 4) != 0) {
            str = podcastEpisodeDetails.title;
        }
        if ((i11 & 8) != 0) {
            str2 = podcastEpisodeDetails.downloadUrl;
        }
        if ((i11 & 16) != 0) {
            z13 = podcastEpisodeDetails.isTeaser;
        }
        boolean z14 = z13;
        String str3 = str;
        return podcastEpisodeDetails.copy(z11, z12, str3, str2, z14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsFollowed() {
        return this.isFollowed;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsDownloaded() {
        return this.isDownloaded;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsTeaser() {
        return this.isTeaser;
    }

    @NotNull
    public final PodcastEpisodeDetails copy(boolean isFollowed, boolean isDownloaded, @NotNull String title, @NotNull String downloadUrl, boolean isTeaser) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        return new PodcastEpisodeDetails(isFollowed, isDownloaded, title, downloadUrl, isTeaser);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PodcastEpisodeDetails)) {
            return false;
        }
        PodcastEpisodeDetails podcastEpisodeDetails = (PodcastEpisodeDetails) other;
        return this.isFollowed == podcastEpisodeDetails.isFollowed && this.isDownloaded == podcastEpisodeDetails.isDownloaded && Intrinsics.areEqual(this.title, podcastEpisodeDetails.title) && Intrinsics.areEqual(this.downloadUrl, podcastEpisodeDetails.downloadUrl) && this.isTeaser == podcastEpisodeDetails.isTeaser;
    }

    @NotNull
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isFollowed) * 31) + Boolean.hashCode(this.isDownloaded)) * 31) + this.title.hashCode()) * 31) + this.downloadUrl.hashCode()) * 31) + Boolean.hashCode(this.isTeaser);
    }

    public final boolean isDownloaded() {
        return this.isDownloaded;
    }

    public final boolean isFollowed() {
        return this.isFollowed;
    }

    public final boolean isTeaser() {
        return this.isTeaser;
    }

    @NotNull
    public String toString() {
        return "PodcastEpisodeDetails(isFollowed=" + this.isFollowed + ", isDownloaded=" + this.isDownloaded + ", title=" + this.title + ", downloadUrl=" + this.downloadUrl + ", isTeaser=" + this.isTeaser + ")";
    }
}
