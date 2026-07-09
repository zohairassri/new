package com.theathletic.feed.component.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/theathletic/feed/component/data/VideoRatio;", "", "horizontal", "", "vertical", "<init>", "(II)V", "getHorizontal", "()I", "getVertical", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoRatio {
    public static final int $stable = 0;
    private final int horizontal;
    private final int vertical;

    public VideoRatio(int i11, int i12) {
        this.horizontal = i11;
        this.vertical = i12;
    }

    public static /* synthetic */ VideoRatio copy$default(VideoRatio videoRatio, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = videoRatio.horizontal;
        }
        if ((i13 & 2) != 0) {
            i12 = videoRatio.vertical;
        }
        return videoRatio.copy(i11, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHorizontal() {
        return this.horizontal;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVertical() {
        return this.vertical;
    }

    @NotNull
    public final VideoRatio copy(int horizontal, int vertical) {
        return new VideoRatio(horizontal, vertical);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoRatio)) {
            return false;
        }
        VideoRatio videoRatio = (VideoRatio) other;
        return this.horizontal == videoRatio.horizontal && this.vertical == videoRatio.vertical;
    }

    public final int getHorizontal() {
        return this.horizontal;
    }

    public final int getVertical() {
        return this.vertical;
    }

    public int hashCode() {
        return (Integer.hashCode(this.horizontal) * 31) + Integer.hashCode(this.vertical);
    }

    @NotNull
    public String toString() {
        return "VideoRatio(horizontal=" + this.horizontal + ", vertical=" + this.vertical + ")";
    }
}
