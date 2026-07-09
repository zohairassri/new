package com.theathletic.pickem.component.data.local;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/theathletic/pickem/component/data/local/PickEmPagination;", "", "hasNextPage", "", "hasPrevPage", "page", "", "<init>", "(ZZI)V", "getHasNextPage", "()Z", "getHasPrevPage", "getPage", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PickEmPagination {
    private final boolean hasNextPage;
    private final boolean hasPrevPage;
    private final int page;

    public PickEmPagination(boolean z11, boolean z12, int i11) {
        this.hasNextPage = z11;
        this.hasPrevPage = z12;
        this.page = i11;
    }

    public static /* synthetic */ PickEmPagination copy$default(PickEmPagination pickEmPagination, boolean z11, boolean z12, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = pickEmPagination.hasNextPage;
        }
        if ((i12 & 2) != 0) {
            z12 = pickEmPagination.hasPrevPage;
        }
        if ((i12 & 4) != 0) {
            i11 = pickEmPagination.page;
        }
        return pickEmPagination.copy(z11, z12, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasPrevPage() {
        return this.hasPrevPage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    @NotNull
    public final PickEmPagination copy(boolean hasNextPage, boolean hasPrevPage, int page) {
        return new PickEmPagination(hasNextPage, hasPrevPage, page);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickEmPagination)) {
            return false;
        }
        PickEmPagination pickEmPagination = (PickEmPagination) other;
        return this.hasNextPage == pickEmPagination.hasNextPage && this.hasPrevPage == pickEmPagination.hasPrevPage && this.page == pickEmPagination.page;
    }

    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public final boolean getHasPrevPage() {
        return this.hasPrevPage;
    }

    public final int getPage() {
        return this.page;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.hasNextPage) * 31) + Boolean.hashCode(this.hasPrevPage)) * 31) + Integer.hashCode(this.page);
    }

    @NotNull
    public String toString() {
        return "PickEmPagination(hasNextPage=" + this.hasNextPage + ", hasPrevPage=" + this.hasPrevPage + ", page=" + this.page + ")";
    }
}
