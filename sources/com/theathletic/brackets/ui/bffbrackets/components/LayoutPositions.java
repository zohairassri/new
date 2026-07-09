package com.theathletic.brackets.ui.bffbrackets.components;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.brackets.ui.bffbrackets.components.b1, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/theathletic/brackets/ui/bffbrackets/components/b1;", "", "", "", "placements", "totalHeight", "<init>", "(Ljava/util/Map;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.IDLING, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class LayoutPositions {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map placements;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalHeight;

    public LayoutPositions(Map placements, int i11) {
        Intrinsics.checkNotNullParameter(placements, "placements");
        this.placements = placements;
        this.totalHeight = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getPlacements() {
        return this.placements;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTotalHeight() {
        return this.totalHeight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LayoutPositions)) {
            return false;
        }
        LayoutPositions layoutPositions = (LayoutPositions) other;
        return Intrinsics.areEqual(this.placements, layoutPositions.placements) && this.totalHeight == layoutPositions.totalHeight;
    }

    public int hashCode() {
        return (this.placements.hashCode() * 31) + Integer.hashCode(this.totalHeight);
    }

    public String toString() {
        return "LayoutPositions(placements=" + this.placements + ", totalHeight=" + this.totalHeight + ")";
    }
}
