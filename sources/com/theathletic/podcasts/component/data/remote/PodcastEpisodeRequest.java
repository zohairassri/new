package com.theathletic.podcasts.component.data.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/theathletic/podcasts/component/data/remote/PodcastEpisodeRequest;", "", "podcastId", "", "episodeNumber", "", "<init>", "(Ljava/lang/String;I)V", "getPodcastId", "()Ljava/lang/String;", "getEpisodeNumber", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PodcastEpisodeRequest {
    private final int episodeNumber;

    @NotNull
    private final String podcastId;

    public PodcastEpisodeRequest(@NotNull String podcastId, int i11) {
        Intrinsics.checkNotNullParameter(podcastId, "podcastId");
        this.podcastId = podcastId;
        this.episodeNumber = i11;
    }

    public static /* synthetic */ PodcastEpisodeRequest copy$default(PodcastEpisodeRequest podcastEpisodeRequest, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = podcastEpisodeRequest.podcastId;
        }
        if ((i12 & 2) != 0) {
            i11 = podcastEpisodeRequest.episodeNumber;
        }
        return podcastEpisodeRequest.copy(str, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPodcastId() {
        return this.podcastId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEpisodeNumber() {
        return this.episodeNumber;
    }

    @NotNull
    public final PodcastEpisodeRequest copy(@NotNull String podcastId, int episodeNumber) {
        Intrinsics.checkNotNullParameter(podcastId, "podcastId");
        return new PodcastEpisodeRequest(podcastId, episodeNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PodcastEpisodeRequest)) {
            return false;
        }
        PodcastEpisodeRequest podcastEpisodeRequest = (PodcastEpisodeRequest) other;
        return Intrinsics.areEqual(this.podcastId, podcastEpisodeRequest.podcastId) && this.episodeNumber == podcastEpisodeRequest.episodeNumber;
    }

    public final int getEpisodeNumber() {
        return this.episodeNumber;
    }

    @NotNull
    public final String getPodcastId() {
        return this.podcastId;
    }

    public int hashCode() {
        return (this.podcastId.hashCode() * 31) + Integer.hashCode(this.episodeNumber);
    }

    @NotNull
    public String toString() {
        return "PodcastEpisodeRequest(podcastId=" + this.podcastId + ", episodeNumber=" + this.episodeNumber + ")";
    }
}
