package com.theathletic.boxscore.component.data.local;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ<\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/theathletic/boxscore/component/data/local/PodcastEpisodeClip;", "", "id", "", "title", "", "startPosition", "endPosition", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getId", "()I", "getTitle", "()Ljava/lang/String;", "getStartPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEndPosition", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/theathletic/boxscore/component/data/local/PodcastEpisodeClip;", "equals", "", "other", "hashCode", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PodcastEpisodeClip {
    private final Integer endPosition;
    private final int id;
    private final Integer startPosition;
    private final String title;

    public PodcastEpisodeClip(int i11, String str, Integer num, Integer num2) {
        this.id = i11;
        this.title = str;
        this.startPosition = num;
        this.endPosition = num2;
    }

    public static /* synthetic */ PodcastEpisodeClip copy$default(PodcastEpisodeClip podcastEpisodeClip, int i11, String str, Integer num, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = podcastEpisodeClip.id;
        }
        if ((i12 & 2) != 0) {
            str = podcastEpisodeClip.title;
        }
        if ((i12 & 4) != 0) {
            num = podcastEpisodeClip.startPosition;
        }
        if ((i12 & 8) != 0) {
            num2 = podcastEpisodeClip.endPosition;
        }
        return podcastEpisodeClip.copy(i11, str, num, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getStartPosition() {
        return this.startPosition;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getEndPosition() {
        return this.endPosition;
    }

    @NotNull
    public final PodcastEpisodeClip copy(int id2, String title, Integer startPosition, Integer endPosition) {
        return new PodcastEpisodeClip(id2, title, startPosition, endPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PodcastEpisodeClip)) {
            return false;
        }
        PodcastEpisodeClip podcastEpisodeClip = (PodcastEpisodeClip) other;
        return this.id == podcastEpisodeClip.id && Intrinsics.areEqual(this.title, podcastEpisodeClip.title) && Intrinsics.areEqual(this.startPosition, podcastEpisodeClip.startPosition) && Intrinsics.areEqual(this.endPosition, podcastEpisodeClip.endPosition);
    }

    public final Integer getEndPosition() {
        return this.endPosition;
    }

    public final int getId() {
        return this.id;
    }

    public final Integer getStartPosition() {
        return this.startPosition;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.startPosition;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.endPosition;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PodcastEpisodeClip(id=" + this.id + ", title=" + this.title + ", startPosition=" + this.startPosition + ", endPosition=" + this.endPosition + ")";
    }
}
