package com.theathletic.pickem.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.pickem.ui.q0, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Lcom/theathletic/pickem/ui/q0;", "", "", "id", "displayName", "", "color", "logo", "pickPercentage", "score", "penaltyScore", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", QueryKeys.SUBDOMAIN, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.IDLING, QueryKeys.VISIT_FREQUENCY, QueryKeys.ACCOUNT_ID, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PickEmTeamUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer color;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String logo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pickPercentage;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String score;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer penaltyScore;

    public PickEmTeamUiModel(String id2, String displayName, Integer num, String logo, int i11, String score, Integer num2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(score, "score");
        this.id = id2;
        this.displayName = displayName;
        this.color = num;
        this.logo = logo;
        this.pickPercentage = i11;
        this.score = score;
        this.penaltyScore = num2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getPenaltyScore() {
        return this.penaltyScore;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickEmTeamUiModel)) {
            return false;
        }
        PickEmTeamUiModel pickEmTeamUiModel = (PickEmTeamUiModel) other;
        return Intrinsics.areEqual(this.id, pickEmTeamUiModel.id) && Intrinsics.areEqual(this.displayName, pickEmTeamUiModel.displayName) && Intrinsics.areEqual(this.color, pickEmTeamUiModel.color) && Intrinsics.areEqual(this.logo, pickEmTeamUiModel.logo) && this.pickPercentage == pickEmTeamUiModel.pickPercentage && Intrinsics.areEqual(this.score, pickEmTeamUiModel.score) && Intrinsics.areEqual(this.penaltyScore, pickEmTeamUiModel.penaltyScore);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getPickPercentage() {
        return this.pickPercentage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getScore() {
        return this.score;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.displayName.hashCode()) * 31;
        Integer num = this.color;
        int iHashCode2 = (((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.logo.hashCode()) * 31) + Integer.hashCode(this.pickPercentage)) * 31) + this.score.hashCode()) * 31;
        Integer num2 = this.penaltyScore;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "PickEmTeamUiModel(id=" + this.id + ", displayName=" + this.displayName + ", color=" + this.color + ", logo=" + this.logo + ", pickPercentage=" + this.pickPercentage + ", score=" + this.score + ", penaltyScore=" + this.penaltyScore + ")";
    }

    public /* synthetic */ PickEmTeamUiModel(String str, String str2, Integer num, String str3, int i11, String str4, Integer num2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? null : num, str3, (i12 & 16) != 0 ? 0 : i11, (i12 & 32) != 0 ? "" : str4, (i12 & 64) != 0 ? null : num2);
    }
}
