package a50;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: a50.v0, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u0015\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u001f¨\u0006 "}, d2 = {"La50/v0;", "", "", "id", "displayName", "logo", "", "pickPercentage", "score", "color", "penaltyScore", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.PAGE_LOAD_TIME, QueryKeys.SUBDOMAIN, QueryKeys.IDLING, QueryKeys.VISIT_FREQUENCY, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.ACCOUNT_ID, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "sharedui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UnifiedPickEmTeamUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String logo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pickPercentage;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String score;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer color;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer penaltyScore;

    public UnifiedPickEmTeamUiModel(String id2, String displayName, String logo, int i11, String score, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(score, "score");
        this.id = id2;
        this.displayName = displayName;
        this.logo = logo;
        this.pickPercentage = i11;
        this.score = score;
        this.color = num;
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
        if (!(other instanceof UnifiedPickEmTeamUiModel)) {
            return false;
        }
        UnifiedPickEmTeamUiModel unifiedPickEmTeamUiModel = (UnifiedPickEmTeamUiModel) other;
        return Intrinsics.areEqual(this.id, unifiedPickEmTeamUiModel.id) && Intrinsics.areEqual(this.displayName, unifiedPickEmTeamUiModel.displayName) && Intrinsics.areEqual(this.logo, unifiedPickEmTeamUiModel.logo) && this.pickPercentage == unifiedPickEmTeamUiModel.pickPercentage && Intrinsics.areEqual(this.score, unifiedPickEmTeamUiModel.score) && Intrinsics.areEqual(this.color, unifiedPickEmTeamUiModel.color) && Intrinsics.areEqual(this.penaltyScore, unifiedPickEmTeamUiModel.penaltyScore);
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
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.logo.hashCode()) * 31) + Integer.hashCode(this.pickPercentage)) * 31) + this.score.hashCode()) * 31;
        Integer num = this.color;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.penaltyScore;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "UnifiedPickEmTeamUiModel(id=" + this.id + ", displayName=" + this.displayName + ", logo=" + this.logo + ", pickPercentage=" + this.pickPercentage + ", score=" + this.score + ", color=" + this.color + ", penaltyScore=" + this.penaltyScore + ")";
    }

    public /* synthetic */ UnifiedPickEmTeamUiModel(String str, String str2, String str3, int i11, String str4, Integer num, Integer num2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i11, str4, num, (i12 & 64) != 0 ? null : num2);
    }
}
