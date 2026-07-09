package com.theathletic.brackets.ui.bffbrackets.components;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.brackets.ui.bffbrackets.components.z0, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/theathletic/brackets/ui/bffbrackets/components/z0;", "", "Lcom/theathletic/brackets/ui/bffbrackets/components/y0;", "tag", "", "placeableIndex", "height", "<init>", "(Lcom/theathletic/brackets/ui/bffbrackets/components/y0;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/theathletic/brackets/ui/bffbrackets/components/y0;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()Lcom/theathletic/brackets/ui/bffbrackets/components/y0;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.IDLING, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class GameEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final GameBlockTag tag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int placeableIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int height;

    public GameEntry(GameBlockTag tag, int i11, int i12) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
        this.placeableIndex = i11;
        this.height = i12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPlaceableIndex() {
        return this.placeableIndex;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final GameBlockTag getTag() {
        return this.tag;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameEntry)) {
            return false;
        }
        GameEntry gameEntry = (GameEntry) other;
        return Intrinsics.areEqual(this.tag, gameEntry.tag) && this.placeableIndex == gameEntry.placeableIndex && this.height == gameEntry.height;
    }

    public int hashCode() {
        return (((this.tag.hashCode() * 31) + Integer.hashCode(this.placeableIndex)) * 31) + Integer.hashCode(this.height);
    }

    public String toString() {
        return "GameEntry(tag=" + this.tag + ", placeableIndex=" + this.placeableIndex + ", height=" + this.height + ")";
    }
}
