package com.theathletic.pickem.component.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/theathletic/pickem/component/data/PickEmPredictionArticle;", "", "id", "", "title", "imageUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getImageUri", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PickEmPredictionArticle {

    @NotNull
    private final String id;
    private final String imageUri;

    @NotNull
    private final String title;

    public PickEmPredictionArticle(@NotNull String id2, @NotNull String title, String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = id2;
        this.title = title;
        this.imageUri = str;
    }

    public static /* synthetic */ PickEmPredictionArticle copy$default(PickEmPredictionArticle pickEmPredictionArticle, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pickEmPredictionArticle.id;
        }
        if ((i11 & 2) != 0) {
            str2 = pickEmPredictionArticle.title;
        }
        if ((i11 & 4) != 0) {
            str3 = pickEmPredictionArticle.imageUri;
        }
        return pickEmPredictionArticle.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUri() {
        return this.imageUri;
    }

    @NotNull
    public final PickEmPredictionArticle copy(@NotNull String id2, @NotNull String title, String imageUri) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new PickEmPredictionArticle(id2, title, imageUri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickEmPredictionArticle)) {
            return false;
        }
        PickEmPredictionArticle pickEmPredictionArticle = (PickEmPredictionArticle) other;
        return Intrinsics.areEqual(this.id, pickEmPredictionArticle.id) && Intrinsics.areEqual(this.title, pickEmPredictionArticle.title) && Intrinsics.areEqual(this.imageUri, pickEmPredictionArticle.imageUri);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getImageUri() {
        return this.imageUri;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.title.hashCode()) * 31;
        String str = this.imageUri;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "PickEmPredictionArticle(id=" + this.id + ", title=" + this.title + ", imageUri=" + this.imageUri + ")";
    }
}
