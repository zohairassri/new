package com.theathletic.feed.component.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/theathletic/feed/component/data/AlternateMedia;", "", "contentUriLight", "", "contentUriDark", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContentUriLight", "()Ljava/lang/String;", "getContentUriDark", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AlternateMedia {
    public static final int $stable = 0;
    private final String contentUriDark;
    private final String contentUriLight;

    public AlternateMedia(String str, String str2) {
        this.contentUriLight = str;
        this.contentUriDark = str2;
    }

    public static /* synthetic */ AlternateMedia copy$default(AlternateMedia alternateMedia, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = alternateMedia.contentUriLight;
        }
        if ((i11 & 2) != 0) {
            str2 = alternateMedia.contentUriDark;
        }
        return alternateMedia.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentUriLight() {
        return this.contentUriLight;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentUriDark() {
        return this.contentUriDark;
    }

    @NotNull
    public final AlternateMedia copy(String contentUriLight, String contentUriDark) {
        return new AlternateMedia(contentUriLight, contentUriDark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlternateMedia)) {
            return false;
        }
        AlternateMedia alternateMedia = (AlternateMedia) other;
        return Intrinsics.areEqual(this.contentUriLight, alternateMedia.contentUriLight) && Intrinsics.areEqual(this.contentUriDark, alternateMedia.contentUriDark);
    }

    public final String getContentUriDark() {
        return this.contentUriDark;
    }

    public final String getContentUriLight() {
        return this.contentUriLight;
    }

    public int hashCode() {
        String str = this.contentUriLight;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contentUriDark;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AlternateMedia(contentUriLight=" + this.contentUriLight + ", contentUriDark=" + this.contentUriDark + ")";
    }
}
