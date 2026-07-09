package com.theathletic.slidestories.component.data.local;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/theathletic/slidestories/component/data/local/LocalSlideStoryUserData;", "", "id", "", "slideStoryId", "isFinished", "", "readSlides", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getId", "()Ljava/lang/String;", "getSlideStoryId", "()Z", "getReadSlides", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocalSlideStoryUserData {

    @NotNull
    private final String id;
    private final boolean isFinished;

    @NotNull
    private final List<String> readSlides;

    @NotNull
    private final String slideStoryId;

    public LocalSlideStoryUserData(@NotNull String id2, @NotNull String slideStoryId, boolean z11, @NotNull List<String> readSlides) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(slideStoryId, "slideStoryId");
        Intrinsics.checkNotNullParameter(readSlides, "readSlides");
        this.id = id2;
        this.slideStoryId = slideStoryId;
        this.isFinished = z11;
        this.readSlides = readSlides;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalSlideStoryUserData copy$default(LocalSlideStoryUserData localSlideStoryUserData, String str, String str2, boolean z11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = localSlideStoryUserData.id;
        }
        if ((i11 & 2) != 0) {
            str2 = localSlideStoryUserData.slideStoryId;
        }
        if ((i11 & 4) != 0) {
            z11 = localSlideStoryUserData.isFinished;
        }
        if ((i11 & 8) != 0) {
            list = localSlideStoryUserData.readSlides;
        }
        return localSlideStoryUserData.copy(str, str2, z11, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSlideStoryId() {
        return this.slideStoryId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsFinished() {
        return this.isFinished;
    }

    @NotNull
    public final List<String> component4() {
        return this.readSlides;
    }

    @NotNull
    public final LocalSlideStoryUserData copy(@NotNull String id2, @NotNull String slideStoryId, boolean isFinished, @NotNull List<String> readSlides) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(slideStoryId, "slideStoryId");
        Intrinsics.checkNotNullParameter(readSlides, "readSlides");
        return new LocalSlideStoryUserData(id2, slideStoryId, isFinished, readSlides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalSlideStoryUserData)) {
            return false;
        }
        LocalSlideStoryUserData localSlideStoryUserData = (LocalSlideStoryUserData) other;
        return Intrinsics.areEqual(this.id, localSlideStoryUserData.id) && Intrinsics.areEqual(this.slideStoryId, localSlideStoryUserData.slideStoryId) && this.isFinished == localSlideStoryUserData.isFinished && Intrinsics.areEqual(this.readSlides, localSlideStoryUserData.readSlides);
    }

    @NotNull
    public final String getId() {
        return this.id;
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
        return (((((this.id.hashCode() * 31) + this.slideStoryId.hashCode()) * 31) + Boolean.hashCode(this.isFinished)) * 31) + this.readSlides.hashCode();
    }

    public final boolean isFinished() {
        return this.isFinished;
    }

    @NotNull
    public String toString() {
        return "LocalSlideStoryUserData(id=" + this.id + ", slideStoryId=" + this.slideStoryId + ", isFinished=" + this.isFinished + ", readSlides=" + this.readSlides + ")";
    }
}
