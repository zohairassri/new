package com.theathletic.scores.standings.data.local;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/theathletic/scores/standings/data/local/StandingsGroupHeader;", "", "id", "", "headerName", "groupIds", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getHeaderName", "getGroupIds", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StandingsGroupHeader {

    @NotNull
    private final List<String> groupIds;
    private final String headerName;

    @NotNull
    private final String id;

    public StandingsGroupHeader(@NotNull String id2, String str, @NotNull List<String> groupIds) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(groupIds, "groupIds");
        this.id = id2;
        this.headerName = str;
        this.groupIds = groupIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StandingsGroupHeader copy$default(StandingsGroupHeader standingsGroupHeader, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = standingsGroupHeader.id;
        }
        if ((i11 & 2) != 0) {
            str2 = standingsGroupHeader.headerName;
        }
        if ((i11 & 4) != 0) {
            list = standingsGroupHeader.groupIds;
        }
        return standingsGroupHeader.copy(str, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeaderName() {
        return this.headerName;
    }

    @NotNull
    public final List<String> component3() {
        return this.groupIds;
    }

    @NotNull
    public final StandingsGroupHeader copy(@NotNull String id2, String headerName, @NotNull List<String> groupIds) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(groupIds, "groupIds");
        return new StandingsGroupHeader(id2, headerName, groupIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StandingsGroupHeader)) {
            return false;
        }
        StandingsGroupHeader standingsGroupHeader = (StandingsGroupHeader) other;
        return Intrinsics.areEqual(this.id, standingsGroupHeader.id) && Intrinsics.areEqual(this.headerName, standingsGroupHeader.headerName) && Intrinsics.areEqual(this.groupIds, standingsGroupHeader.groupIds);
    }

    @NotNull
    public final List<String> getGroupIds() {
        return this.groupIds;
    }

    public final String getHeaderName() {
        return this.headerName;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.headerName;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.groupIds.hashCode();
    }

    @NotNull
    public String toString() {
        return "StandingsGroupHeader(id=" + this.id + ", headerName=" + this.headerName + ", groupIds=" + this.groupIds + ")";
    }
}
