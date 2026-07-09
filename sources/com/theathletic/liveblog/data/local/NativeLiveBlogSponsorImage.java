package com.theathletic.liveblog.data.local;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/theathletic/liveblog/data/local/NativeLiveBlogSponsorImage;", "", "imageUriLight", "", "imageUriDark", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageUriLight", "()Ljava/lang/String;", "getImageUriDark", "getLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "entity_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NativeLiveBlogSponsorImage {

    @NotNull
    private final String imageUriDark;

    @NotNull
    private final String imageUriLight;
    private final String label;

    public NativeLiveBlogSponsorImage() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ NativeLiveBlogSponsorImage copy$default(NativeLiveBlogSponsorImage nativeLiveBlogSponsorImage, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = nativeLiveBlogSponsorImage.imageUriLight;
        }
        if ((i11 & 2) != 0) {
            str2 = nativeLiveBlogSponsorImage.imageUriDark;
        }
        if ((i11 & 4) != 0) {
            str3 = nativeLiveBlogSponsorImage.label;
        }
        return nativeLiveBlogSponsorImage.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUriLight() {
        return this.imageUriLight;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUriDark() {
        return this.imageUriDark;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final NativeLiveBlogSponsorImage copy(@NotNull String imageUriLight, @NotNull String imageUriDark, String label) {
        Intrinsics.checkNotNullParameter(imageUriLight, "imageUriLight");
        Intrinsics.checkNotNullParameter(imageUriDark, "imageUriDark");
        return new NativeLiveBlogSponsorImage(imageUriLight, imageUriDark, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeLiveBlogSponsorImage)) {
            return false;
        }
        NativeLiveBlogSponsorImage nativeLiveBlogSponsorImage = (NativeLiveBlogSponsorImage) other;
        return Intrinsics.areEqual(this.imageUriLight, nativeLiveBlogSponsorImage.imageUriLight) && Intrinsics.areEqual(this.imageUriDark, nativeLiveBlogSponsorImage.imageUriDark) && Intrinsics.areEqual(this.label, nativeLiveBlogSponsorImage.label);
    }

    @NotNull
    public final String getImageUriDark() {
        return this.imageUriDark;
    }

    @NotNull
    public final String getImageUriLight() {
        return this.imageUriLight;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iHashCode = ((this.imageUriLight.hashCode() * 31) + this.imageUriDark.hashCode()) * 31;
        String str = this.label;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "NativeLiveBlogSponsorImage(imageUriLight=" + this.imageUriLight + ", imageUriDark=" + this.imageUriDark + ", label=" + this.label + ")";
    }

    public NativeLiveBlogSponsorImage(@NotNull String imageUriLight, @NotNull String imageUriDark, String str) {
        Intrinsics.checkNotNullParameter(imageUriLight, "imageUriLight");
        Intrinsics.checkNotNullParameter(imageUriDark, "imageUriDark");
        this.imageUriLight = imageUriLight;
        this.imageUriDark = imageUriDark;
        this.label = str;
    }

    public /* synthetic */ NativeLiveBlogSponsorImage(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3);
    }
}
