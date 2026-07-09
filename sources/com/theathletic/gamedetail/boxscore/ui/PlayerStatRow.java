package com.theathletic.gamedetail.boxscore.ui;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.gamedetail.boxscore.ui.n1, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJT\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001d\u0010\u0011¨\u0006#"}, d2 = {"Lcom/theathletic/gamedetail/boxscore/ui/n1;", "", "", "id", "playerName", "playerPosition", "", "playerOrder", "", "Lcom/theathletic/gamedetail/data/local/GameDetailLocalModel$Statistic;", "stats", "playerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;)Lcom/theathletic/gamedetail/boxscore/ui/n1;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.PAGE_LOAD_TIME, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.ACCOUNT_ID, QueryKeys.SUBDOMAIN, QueryKeys.IDLING, QueryKeys.VISIT_FREQUENCY, "Ljava/util/List;", QueryKeys.HOST, "()Ljava/util/List;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlayerStatRow {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String playerName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String playerPosition;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int playerOrder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List stats;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String playerId;

    public PlayerStatRow(String id2, String playerName, String str, int i11, List stats, String playerId) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(playerName, "playerName");
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(playerId, "playerId");
        this.id = id2;
        this.playerName = playerName;
        this.playerPosition = str;
        this.playerOrder = i11;
        this.stats = stats;
        this.playerId = playerId;
    }

    public static /* synthetic */ PlayerStatRow b(PlayerStatRow playerStatRow, String str, String str2, String str3, int i11, List list, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = playerStatRow.id;
        }
        if ((i12 & 2) != 0) {
            str2 = playerStatRow.playerName;
        }
        if ((i12 & 4) != 0) {
            str3 = playerStatRow.playerPosition;
        }
        if ((i12 & 8) != 0) {
            i11 = playerStatRow.playerOrder;
        }
        if ((i12 & 16) != 0) {
            list = playerStatRow.stats;
        }
        if ((i12 & 32) != 0) {
            str4 = playerStatRow.playerId;
        }
        List list2 = list;
        String str5 = str4;
        return playerStatRow.a(str, str2, str3, i11, list2, str5);
    }

    public final PlayerStatRow a(String id2, String playerName, String playerPosition, int playerOrder, List stats, String playerId) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(playerName, "playerName");
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(playerId, "playerId");
        return new PlayerStatRow(id2, playerName, playerPosition, playerOrder, stats, playerId);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPlayerId() {
        return this.playerId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPlayerName() {
        return this.playerName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerStatRow)) {
            return false;
        }
        PlayerStatRow playerStatRow = (PlayerStatRow) other;
        return Intrinsics.areEqual(this.id, playerStatRow.id) && Intrinsics.areEqual(this.playerName, playerStatRow.playerName) && Intrinsics.areEqual(this.playerPosition, playerStatRow.playerPosition) && this.playerOrder == playerStatRow.playerOrder && Intrinsics.areEqual(this.stats, playerStatRow.stats) && Intrinsics.areEqual(this.playerId, playerStatRow.playerId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getPlayerOrder() {
        return this.playerOrder;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPlayerPosition() {
        return this.playerPosition;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getStats() {
        return this.stats;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.playerName.hashCode()) * 31;
        String str = this.playerPosition;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.playerOrder)) * 31) + this.stats.hashCode()) * 31) + this.playerId.hashCode();
    }

    public String toString() {
        return "PlayerStatRow(id=" + this.id + ", playerName=" + this.playerName + ", playerPosition=" + this.playerPosition + ", playerOrder=" + this.playerOrder + ", stats=" + this.stats + ", playerId=" + this.playerId + ")";
    }
}
