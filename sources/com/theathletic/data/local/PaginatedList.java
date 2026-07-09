package com.theathletic.data.local;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/theathletic/data/local/PaginatedList;", "T", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "hasNextPage", QueryKeys.MEMFLY_API_VERSION, "getHasNextPage", "()Z", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaginatedList<T> {
    private final boolean hasNextPage;

    @NotNull
    private final List<List<T>> items;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaginatedList)) {
            return false;
        }
        PaginatedList paginatedList = (PaginatedList) other;
        return Intrinsics.areEqual(this.items, paginatedList.items) && this.hasNextPage == paginatedList.hasNextPage;
    }

    public int hashCode() {
        return (this.items.hashCode() * 31) + Boolean.hashCode(this.hasNextPage);
    }

    public String toString() {
        return "PaginatedList(items=" + this.items + ", hasNextPage=" + this.hasNextPage + ")";
    }
}
