package com.theathletic.pickem.component.data.local;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/theathletic/pickem/component/data/local/PickEmCacheKey;", "", "<init>", "()V", "UserPicked", "TodaysPicked", "TodaysLeaguePicked", "FinishedLeaguePicked", "Lcom/theathletic/pickem/component/data/local/PickEmCacheKey$FinishedLeaguePicked;", "Lcom/theathletic/pickem/component/data/local/PickEmCacheKey$TodaysLeaguePicked;", "Lcom/theathletic/pickem/component/data/local/PickEmCacheKey$TodaysPicked;", "Lcom/theathletic/pickem/component/data/local/PickEmCacheKey$UserPicked;", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PickEmCacheKey {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/theathletic/pickem/component/data/local/PickEmCacheKey$FinishedLeaguePicked;", "Lcom/theathletic/pickem/component/data/local/PickEmCacheKey;", "leagueCode", "", "page", "", "<init>", "(Ljava/lang/String;I)V", "getLeagueCode", "()Ljava/lang/String;", "getPage", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FinishedLeaguePicked extends PickEmCacheKey {

        @NotNull
        private final String leagueCode;
        private final int page;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinishedLeaguePicked(@NotNull String leagueCode, int i11) {
            super(null);
            Intrinsics.checkNotNullParameter(leagueCode, "leagueCode");
            this.leagueCode = leagueCode;
            this.page = i11;
        }

        public static /* synthetic */ FinishedLeaguePicked copy$default(FinishedLeaguePicked finishedLeaguePicked, String str, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = finishedLeaguePicked.leagueCode;
            }
            if ((i12 & 2) != 0) {
                i11 = finishedLeaguePicked.page;
            }
            return finishedLeaguePicked.copy(str, i11);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLeagueCode() {
            return this.leagueCode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getPage() {
            return this.page;
        }

        @NotNull
        public final FinishedLeaguePicked copy(@NotNull String leagueCode, int page) {
            Intrinsics.checkNotNullParameter(leagueCode, "leagueCode");
            return new FinishedLeaguePicked(leagueCode, page);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinishedLeaguePicked)) {
                return false;
            }
            FinishedLeaguePicked finishedLeaguePicked = (FinishedLeaguePicked) other;
            return Intrinsics.areEqual(this.leagueCode, finishedLeaguePicked.leagueCode) && this.page == finishedLeaguePicked.page;
        }

        @NotNull
        public final String getLeagueCode() {
            return this.leagueCode;
        }

        public final int getPage() {
            return this.page;
        }

        public int hashCode() {
            return (this.leagueCode.hashCode() * 31) + Integer.hashCode(this.page);
        }

        @NotNull
        public String toString() {
            return "FinishedLeaguePicked(leagueCode=" + this.leagueCode + ", page=" + this.page + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/theathletic/pickem/component/data/local/PickEmCacheKey$TodaysLeaguePicked;", "Lcom/theathletic/pickem/component/data/local/PickEmCacheKey;", "leagueCode", "", "page", "", "<init>", "(Ljava/lang/String;I)V", "getLeagueCode", "()Ljava/lang/String;", "getPage", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TodaysLeaguePicked extends PickEmCacheKey {

        @NotNull
        private final String leagueCode;
        private final int page;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TodaysLeaguePicked(@NotNull String leagueCode, int i11) {
            super(null);
            Intrinsics.checkNotNullParameter(leagueCode, "leagueCode");
            this.leagueCode = leagueCode;
            this.page = i11;
        }

        public static /* synthetic */ TodaysLeaguePicked copy$default(TodaysLeaguePicked todaysLeaguePicked, String str, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = todaysLeaguePicked.leagueCode;
            }
            if ((i12 & 2) != 0) {
                i11 = todaysLeaguePicked.page;
            }
            return todaysLeaguePicked.copy(str, i11);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLeagueCode() {
            return this.leagueCode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getPage() {
            return this.page;
        }

        @NotNull
        public final TodaysLeaguePicked copy(@NotNull String leagueCode, int page) {
            Intrinsics.checkNotNullParameter(leagueCode, "leagueCode");
            return new TodaysLeaguePicked(leagueCode, page);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TodaysLeaguePicked)) {
                return false;
            }
            TodaysLeaguePicked todaysLeaguePicked = (TodaysLeaguePicked) other;
            return Intrinsics.areEqual(this.leagueCode, todaysLeaguePicked.leagueCode) && this.page == todaysLeaguePicked.page;
        }

        @NotNull
        public final String getLeagueCode() {
            return this.leagueCode;
        }

        public final int getPage() {
            return this.page;
        }

        public int hashCode() {
            return (this.leagueCode.hashCode() * 31) + Integer.hashCode(this.page);
        }

        @NotNull
        public String toString() {
            return "TodaysLeaguePicked(leagueCode=" + this.leagueCode + ", page=" + this.page + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/theathletic/pickem/component/data/local/PickEmCacheKey$TodaysPicked;", "Lcom/theathletic/pickem/component/data/local/PickEmCacheKey;", "isFollowsSearch", "", "league", "", "excludeAlreadyPicked", "<init>", "(ZLjava/lang/String;Z)V", "()Z", "getLeague", "()Ljava/lang/String;", "getExcludeAlreadyPicked", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TodaysPicked extends PickEmCacheKey {
        private final boolean excludeAlreadyPicked;
        private final boolean isFollowsSearch;
        private final String league;

        public TodaysPicked() {
            this(false, null, false, 7, null);
        }

        public static /* synthetic */ TodaysPicked copy$default(TodaysPicked todaysPicked, boolean z11, String str, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = todaysPicked.isFollowsSearch;
            }
            if ((i11 & 2) != 0) {
                str = todaysPicked.league;
            }
            if ((i11 & 4) != 0) {
                z12 = todaysPicked.excludeAlreadyPicked;
            }
            return todaysPicked.copy(z11, str, z12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsFollowsSearch() {
            return this.isFollowsSearch;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLeague() {
            return this.league;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getExcludeAlreadyPicked() {
            return this.excludeAlreadyPicked;
        }

        @NotNull
        public final TodaysPicked copy(boolean isFollowsSearch, String league, boolean excludeAlreadyPicked) {
            return new TodaysPicked(isFollowsSearch, league, excludeAlreadyPicked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TodaysPicked)) {
                return false;
            }
            TodaysPicked todaysPicked = (TodaysPicked) other;
            return this.isFollowsSearch == todaysPicked.isFollowsSearch && Intrinsics.areEqual(this.league, todaysPicked.league) && this.excludeAlreadyPicked == todaysPicked.excludeAlreadyPicked;
        }

        public final boolean getExcludeAlreadyPicked() {
            return this.excludeAlreadyPicked;
        }

        public final String getLeague() {
            return this.league;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isFollowsSearch) * 31;
            String str = this.league;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.excludeAlreadyPicked);
        }

        public final boolean isFollowsSearch() {
            return this.isFollowsSearch;
        }

        @NotNull
        public String toString() {
            return "TodaysPicked(isFollowsSearch=" + this.isFollowsSearch + ", league=" + this.league + ", excludeAlreadyPicked=" + this.excludeAlreadyPicked + ")";
        }

        public /* synthetic */ TodaysPicked(boolean z11, String str, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? true : z12);
        }

        public TodaysPicked(boolean z11, String str, boolean z12) {
            super(null);
            this.isFollowsSearch = z11;
            this.league = str;
            this.excludeAlreadyPicked = z12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/pickem/component/data/local/PickEmCacheKey$UserPicked;", "Lcom/theathletic/pickem/component/data/local/PickEmCacheKey;", "<init>", "()V", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UserPicked extends PickEmCacheKey {

        @NotNull
        public static final UserPicked INSTANCE = new UserPicked();

        private UserPicked() {
            super(null);
        }
    }

    public /* synthetic */ PickEmCacheKey(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PickEmCacheKey() {
    }
}
