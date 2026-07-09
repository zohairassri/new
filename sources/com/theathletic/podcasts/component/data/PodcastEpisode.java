package com.theathletic.podcasts.component.data;

import com.theathletic.video.component.data.VideoRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\fHÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/theathletic/podcasts/component/data/PodcastEpisode;", "", "id", "", "podcastId", "title", "", "mp3Url", "description", "imageUrl", VideoRepository.XML_ATTR_DURATION, "episodeNumber", "", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "getId", "()J", "getPodcastId", "getTitle", "()Ljava/lang/String;", "getMp3Url", "getDescription", "getImageUrl", "getDuration", "getEpisodeNumber", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PodcastEpisode {

    @NotNull
    private final String description;
    private final long duration;
    private final int episodeNumber;
    private final long id;

    @NotNull
    private final String imageUrl;

    @NotNull
    private final String mp3Url;
    private final long podcastId;

    @NotNull
    private final String title;

    public PodcastEpisode(long j11, long j12, @NotNull String title, @NotNull String mp3Url, @NotNull String description, @NotNull String imageUrl, long j13, int i11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mp3Url, "mp3Url");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.id = j11;
        this.podcastId = j12;
        this.title = title;
        this.mp3Url = mp3Url;
        this.description = description;
        this.imageUrl = imageUrl;
        this.duration = j13;
        this.episodeNumber = i11;
    }

    public static /* synthetic */ PodcastEpisode copy$default(PodcastEpisode podcastEpisode, long j11, long j12, String str, String str2, String str3, String str4, long j13, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = podcastEpisode.id;
        }
        return podcastEpisode.copy(j11, (i12 & 2) != 0 ? podcastEpisode.podcastId : j12, (i12 & 4) != 0 ? podcastEpisode.title : str, (i12 & 8) != 0 ? podcastEpisode.mp3Url : str2, (i12 & 16) != 0 ? podcastEpisode.description : str3, (i12 & 32) != 0 ? podcastEpisode.imageUrl : str4, (i12 & 64) != 0 ? podcastEpisode.duration : j13, (i12 & 128) != 0 ? podcastEpisode.episodeNumber : i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPodcastId() {
        return this.podcastId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMp3Url() {
        return this.mp3Url;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getEpisodeNumber() {
        return this.episodeNumber;
    }

    @NotNull
    public final PodcastEpisode copy(long id2, long podcastId, @NotNull String title, @NotNull String mp3Url, @NotNull String description, @NotNull String imageUrl, long duration, int episodeNumber) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mp3Url, "mp3Url");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new PodcastEpisode(id2, podcastId, title, mp3Url, description, imageUrl, duration, episodeNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PodcastEpisode)) {
            return false;
        }
        PodcastEpisode podcastEpisode = (PodcastEpisode) other;
        return this.id == podcastEpisode.id && this.podcastId == podcastEpisode.podcastId && Intrinsics.areEqual(this.title, podcastEpisode.title) && Intrinsics.areEqual(this.mp3Url, podcastEpisode.mp3Url) && Intrinsics.areEqual(this.description, podcastEpisode.description) && Intrinsics.areEqual(this.imageUrl, podcastEpisode.imageUrl) && this.duration == podcastEpisode.duration && this.episodeNumber == podcastEpisode.episodeNumber;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getEpisodeNumber() {
        return this.episodeNumber;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getMp3Url() {
        return this.mp3Url;
    }

    public final long getPodcastId() {
        return this.podcastId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.podcastId)) * 31) + this.title.hashCode()) * 31) + this.mp3Url.hashCode()) * 31) + this.description.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + Long.hashCode(this.duration)) * 31) + Integer.hashCode(this.episodeNumber);
    }

    @NotNull
    public String toString() {
        return "PodcastEpisode(id=" + this.id + ", podcastId=" + this.podcastId + ", title=" + this.title + ", mp3Url=" + this.mp3Url + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ", duration=" + this.duration + ", episodeNumber=" + this.episodeNumber + ")";
    }

    public /* synthetic */ PodcastEpisode(long j11, long j12, String str, String str2, String str3, String str4, long j13, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, str, str2, (i12 & 16) != 0 ? "" : str3, (i12 & 32) != 0 ? "" : str4, (i12 & 64) != 0 ? 0L : j13, (i12 & 128) != 0 ? 0 : i11);
    }
}
