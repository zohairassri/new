package com.theathletic.slidestories.component.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/theathletic/slidestories/component/data/SlideStoryUserData;", "", "slideStoryId", "", "isFinished", "", "readSlides", "", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "getSlideStoryId", "()Ljava/lang/String;", "()Z", "getReadSlides", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SlideStoryUserData {
    private final boolean isFinished;

    @NotNull
    private final List<String> readSlides;

    @NotNull
    private final String slideStoryId;

    public SlideStoryUserData(@NotNull String slideStoryId, boolean z11, @NotNull List<String> readSlides) {
        Intrinsics.checkNotNullParameter(slideStoryId, "slideStoryId");
        Intrinsics.checkNotNullParameter(readSlides, "readSlides");
        this.slideStoryId = slideStoryId;
        this.isFinished = z11;
        this.readSlides = readSlides;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SlideStoryUserData copy$default(SlideStoryUserData slideStoryUserData, String str, boolean z11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = slideStoryUserData.slideStoryId;
        }
        if ((i11 & 2) != 0) {
            z11 = slideStoryUserData.isFinished;
        }
        if ((i11 & 4) != 0) {
            list = slideStoryUserData.readSlides;
        }
        return slideStoryUserData.copy(str, z11, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSlideStoryId() {
        return this.slideStoryId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsFinished() {
        return this.isFinished;
    }

    @NotNull
    public final List<String> component3() {
        return this.readSlides;
    }

    @NotNull
    public final SlideStoryUserData copy(@NotNull String slideStoryId, boolean isFinished, @NotNull List<String> readSlides) {
        Intrinsics.checkNotNullParameter(slideStoryId, "slideStoryId");
        Intrinsics.checkNotNullParameter(readSlides, "readSlides");
        return new SlideStoryUserData(slideStoryId, isFinished, readSlides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlideStoryUserData)) {
            return false;
        }
        SlideStoryUserData slideStoryUserData = (SlideStoryUserData) other;
        return Intrinsics.areEqual(this.slideStoryId, slideStoryUserData.slideStoryId) && this.isFinished == slideStoryUserData.isFinished && Intrinsics.areEqual(this.readSlides, slideStoryUserData.readSlides);
    }

    @NotNull
    public final List<String> getReadSlides() {
        return this.readSlides;
    }

    @NotNull
    public final String getSlideStoryId() {
        return this.slideStoryId;
    }

    public int hashCode() {
        return (((this.slideStoryId.hashCode() * 31) + Boolean.hashCode(this.isFinished)) * 31) + this.readSlides.hashCode();
    }

    public final boolean isFinished() {
        return this.isFinished;
    }

    @NotNull
    public String toString() {
        return "SlideStoryUserData(slideStoryId=" + this.slideStoryId + ", isFinished=" + this.isFinished + ", readSlides=" + this.readSlides + ")";
    }
}
