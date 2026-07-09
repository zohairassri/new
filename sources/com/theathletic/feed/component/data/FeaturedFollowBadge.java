package com.theathletic.feed.component.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/theathletic/feed/component/data/FeaturedFollowBadge;", "", "leagueId", "", "isFollowing", "", "<init>", "(Ljava/lang/String;Z)V", "getLeagueId", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeaturedFollowBadge {
    public static final int $stable = 0;
    private final boolean isFollowing;

    @NotNull
    private final String leagueId;

    public FeaturedFollowBadge(@NotNull String leagueId, boolean z11) {
        Intrinsics.checkNotNullParameter(leagueId, "leagueId");
        this.leagueId = leagueId;
        this.isFollowing = z11;
    }

    public static /* synthetic */ FeaturedFollowBadge copy$default(FeaturedFollowBadge featuredFollowBadge, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = featuredFollowBadge.leagueId;
        }
        if ((i11 & 2) != 0) {
            z11 = featuredFollowBadge.isFollowing;
        }
        return featuredFollowBadge.copy(str, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsFollowing() {
        return this.isFollowing;
    }

    @NotNull
    public final FeaturedFollowBadge copy(@NotNull String leagueId, boolean isFollowing) {
        Intrinsics.checkNotNullParameter(leagueId, "leagueId");
        return new FeaturedFollowBadge(leagueId, isFollowing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeaturedFollowBadge)) {
            return false;
        }
        FeaturedFollowBadge featuredFollowBadge = (FeaturedFollowBadge) other;
        return Intrinsics.areEqual(this.leagueId, featuredFollowBadge.leagueId) && this.isFollowing == featuredFollowBadge.isFollowing;
    }

    @NotNull
    public final String getLeagueId() {
        return this.leagueId;
    }

    public int hashCode() {
        return (this.leagueId.hashCode() * 31) + Boolean.hashCode(this.isFollowing);
    }

    public final boolean isFollowing() {
        return this.isFollowing;
    }

    @NotNull
    public String toString() {
        return "FeaturedFollowBadge(leagueId=" + this.leagueId + ", isFollowing=" + this.isFollowing + ")";
    }
}
