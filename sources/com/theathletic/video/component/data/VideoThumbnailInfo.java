package com.theathletic.video.component.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lcom/theathletic/video/component/data/VideoThumbnailInfo;", "", "tileCols", "", "tileRows", "segmentDurationSec", "", "segmentTemplateUrl", "", VideoRepository.XML_ATTR_START_NUMBER, "totalThumbnailsPerImage", "<init>", "(IIDLjava/lang/String;II)V", "getTileCols", "()I", "getTileRows", "getSegmentDurationSec", "()D", "getSegmentTemplateUrl", "()Ljava/lang/String;", "getStartNumber", "getTotalThumbnailsPerImage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoThumbnailInfo {
    private final double segmentDurationSec;

    @NotNull
    private final String segmentTemplateUrl;
    private final int startNumber;
    private final int tileCols;
    private final int tileRows;
    private final int totalThumbnailsPerImage;

    public VideoThumbnailInfo(int i11, int i12, double d11, @NotNull String segmentTemplateUrl, int i13, int i14) {
        Intrinsics.checkNotNullParameter(segmentTemplateUrl, "segmentTemplateUrl");
        this.tileCols = i11;
        this.tileRows = i12;
        this.segmentDurationSec = d11;
        this.segmentTemplateUrl = segmentTemplateUrl;
        this.startNumber = i13;
        this.totalThumbnailsPerImage = i14;
    }

    public static /* synthetic */ VideoThumbnailInfo copy$default(VideoThumbnailInfo videoThumbnailInfo, int i11, int i12, double d11, String str, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = videoThumbnailInfo.tileCols;
        }
        if ((i15 & 2) != 0) {
            i12 = videoThumbnailInfo.tileRows;
        }
        if ((i15 & 4) != 0) {
            d11 = videoThumbnailInfo.segmentDurationSec;
        }
        if ((i15 & 8) != 0) {
            str = videoThumbnailInfo.segmentTemplateUrl;
        }
        if ((i15 & 16) != 0) {
            i13 = videoThumbnailInfo.startNumber;
        }
        if ((i15 & 32) != 0) {
            i14 = videoThumbnailInfo.totalThumbnailsPerImage;
        }
        int i16 = i14;
        String str2 = str;
        double d12 = d11;
        return videoThumbnailInfo.copy(i11, i12, d12, str2, i13, i16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTileCols() {
        return this.tileCols;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTileRows() {
        return this.tileRows;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getSegmentDurationSec() {
        return this.segmentDurationSec;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSegmentTemplateUrl() {
        return this.segmentTemplateUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStartNumber() {
        return this.startNumber;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTotalThumbnailsPerImage() {
        return this.totalThumbnailsPerImage;
    }

    @NotNull
    public final VideoThumbnailInfo copy(int tileCols, int tileRows, double segmentDurationSec, @NotNull String segmentTemplateUrl, int startNumber, int totalThumbnailsPerImage) {
        Intrinsics.checkNotNullParameter(segmentTemplateUrl, "segmentTemplateUrl");
        return new VideoThumbnailInfo(tileCols, tileRows, segmentDurationSec, segmentTemplateUrl, startNumber, totalThumbnailsPerImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoThumbnailInfo)) {
            return false;
        }
        VideoThumbnailInfo videoThumbnailInfo = (VideoThumbnailInfo) other;
        return this.tileCols == videoThumbnailInfo.tileCols && this.tileRows == videoThumbnailInfo.tileRows && Double.compare(this.segmentDurationSec, videoThumbnailInfo.segmentDurationSec) == 0 && Intrinsics.areEqual(this.segmentTemplateUrl, videoThumbnailInfo.segmentTemplateUrl) && this.startNumber == videoThumbnailInfo.startNumber && this.totalThumbnailsPerImage == videoThumbnailInfo.totalThumbnailsPerImage;
    }

    public final double getSegmentDurationSec() {
        return this.segmentDurationSec;
    }

    @NotNull
    public final String getSegmentTemplateUrl() {
        return this.segmentTemplateUrl;
    }

    public final int getStartNumber() {
        return this.startNumber;
    }

    public final int getTileCols() {
        return this.tileCols;
    }

    public final int getTileRows() {
        return this.tileRows;
    }

    public final int getTotalThumbnailsPerImage() {
        return this.totalThumbnailsPerImage;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.tileCols) * 31) + Integer.hashCode(this.tileRows)) * 31) + Double.hashCode(this.segmentDurationSec)) * 31) + this.segmentTemplateUrl.hashCode()) * 31) + Integer.hashCode(this.startNumber)) * 31) + Integer.hashCode(this.totalThumbnailsPerImage);
    }

    @NotNull
    public String toString() {
        return "VideoThumbnailInfo(tileCols=" + this.tileCols + ", tileRows=" + this.tileRows + ", segmentDurationSec=" + this.segmentDurationSec + ", segmentTemplateUrl=" + this.segmentTemplateUrl + ", startNumber=" + this.startNumber + ", totalThumbnailsPerImage=" + this.totalThumbnailsPerImage + ")";
    }
}
