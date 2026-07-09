package com.nytimes.android.hybrid.model;

import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/nytimes/android/hybrid/model/HybridImageCrop;", "", "target", "", "minViewportWidth", "", "(Ljava/lang/String;I)V", "getMinViewportWidth", "()I", "getTarget", "()Ljava/lang/String;", "compareTo", "other", "component1", "component2", "copy", "equals", "", "", "hashCode", "toString", "hybrid_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class HybridImageCrop implements Comparable<HybridImageCrop> {
    private final int minViewportWidth;

    @NotNull
    private final String target;

    public HybridImageCrop(@NotNull String target, int i11) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.target = target;
        this.minViewportWidth = i11;
    }

    public static /* synthetic */ HybridImageCrop copy$default(HybridImageCrop hybridImageCrop, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = hybridImageCrop.target;
        }
        if ((i12 & 2) != 0) {
            i11 = hybridImageCrop.minViewportWidth;
        }
        return hybridImageCrop.copy(str, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinViewportWidth() {
        return this.minViewportWidth;
    }

    @NotNull
    public final HybridImageCrop copy(@NotNull String target, int minViewportWidth) {
        Intrinsics.checkNotNullParameter(target, "target");
        return new HybridImageCrop(target, minViewportWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybridImageCrop)) {
            return false;
        }
        HybridImageCrop hybridImageCrop = (HybridImageCrop) other;
        return Intrinsics.areEqual(this.target, hybridImageCrop.target) && this.minViewportWidth == hybridImageCrop.minViewportWidth;
    }

    public final int getMinViewportWidth() {
        return this.minViewportWidth;
    }

    @NotNull
    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        return (this.target.hashCode() * 31) + Integer.hashCode(this.minViewportWidth);
    }

    @NotNull
    public String toString() {
        return "HybridImageCrop(target=" + this.target + ", minViewportWidth=" + this.minViewportWidth + ")";
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull HybridImageCrop other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Integer.compare(this.minViewportWidth, other.minViewportWidth);
    }

    public /* synthetic */ HybridImageCrop(String str, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? 0 : i11);
    }
}
