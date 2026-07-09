package com.theathletic.boxscore.ui;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.boxscore.ui.td, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\u0011R\u001a\u0010$\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u000f¨\u0006%"}, d2 = {"Lcom/theathletic/boxscore/ui/td;", "Lcom/theathletic/ui/d1;", "", "id", "subtitle", "", "includeDivider", "", "Lcom/theathletic/boxscore/ui/md$a;", "playerStats", "", "titleResId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.MEMFLY_API_VERSION, "()Z", QueryKeys.SUBDOMAIN, "Ljava/util/List;", "()Ljava/util/List;", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.IDLING, QueryKeys.VISIT_FREQUENCY, "getStableId", "stableId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopLeaderPerformerUiModel implements com.theathletic.ui.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean includeDivider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List playerStats;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int titleResId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String stableId;

    public TopLeaderPerformerUiModel(String id2, String str, boolean z11, List playerStats, int i11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(playerStats, "playerStats");
        this.id = id2;
        this.subtitle = str;
        this.includeDivider = z11;
        this.playerStats = playerStats;
        this.titleResId = i11;
        this.stableId = "TopLeaderPerformer:" + id2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIncludeDivider() {
        return this.includeDivider;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getPlayerStats() {
        return this.playerStats;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTitleResId() {
        return this.titleResId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopLeaderPerformerUiModel)) {
            return false;
        }
        TopLeaderPerformerUiModel topLeaderPerformerUiModel = (TopLeaderPerformerUiModel) other;
        return Intrinsics.areEqual(this.id, topLeaderPerformerUiModel.id) && Intrinsics.areEqual(this.subtitle, topLeaderPerformerUiModel.subtitle) && this.includeDivider == topLeaderPerformerUiModel.includeDivider && Intrinsics.areEqual(this.playerStats, topLeaderPerformerUiModel.playerStats) && this.titleResId == topLeaderPerformerUiModel.titleResId;
    }

    @Override // com.theathletic.ui.d1
    public String getStableId() {
        return this.stableId;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.subtitle;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.includeDivider)) * 31) + this.playerStats.hashCode()) * 31) + Integer.hashCode(this.titleResId);
    }

    public String toString() {
        return "TopLeaderPerformerUiModel(id=" + this.id + ", subtitle=" + this.subtitle + ", includeDivider=" + this.includeDivider + ", playerStats=" + this.playerStats + ", titleResId=" + this.titleResId + ")";
    }
}
