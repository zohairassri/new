package com.theathletic.feed.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.feed.ui.u4, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/theathletic/feed/ui/u4;", "", "", "pixels", "", "isInStartViewport", "<init>", "(ILjava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.IDLING, QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScrollDepth {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pixels;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isInStartViewport;

    public ScrollDepth(int i11, Boolean bool) {
        this.pixels = i11;
        this.isInStartViewport = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getPixels() {
        return this.pixels;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getIsInStartViewport() {
        return this.isInStartViewport;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollDepth)) {
            return false;
        }
        ScrollDepth scrollDepth = (ScrollDepth) other;
        return this.pixels == scrollDepth.pixels && Intrinsics.areEqual(this.isInStartViewport, scrollDepth.isInStartViewport);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.pixels) * 31;
        Boolean bool = this.isInStartViewport;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "ScrollDepth(pixels=" + this.pixels + ", isInStartViewport=" + this.isInStartViewport + ")";
    }
}
