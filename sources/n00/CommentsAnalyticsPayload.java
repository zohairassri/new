package n00;

import com.chartbeat.androidsdk.QueryKeys;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: n00.b, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u001c"}, d2 = {"Ln00/b;", "Ljava/io/Serializable;", "", "additionalIdRef", "", "vIndex", "leagueId", "gameStatusView", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAdditionalIdRef", QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/Integer;", "getVIndex", "()Ljava/lang/Integer;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN, "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommentsAnalyticsPayload implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String additionalIdRef;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer vIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String leagueId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String gameStatusView;

    public CommentsAnalyticsPayload() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getGameStatusView() {
        return this.gameStatusView;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentsAnalyticsPayload)) {
            return false;
        }
        CommentsAnalyticsPayload commentsAnalyticsPayload = (CommentsAnalyticsPayload) other;
        return Intrinsics.areEqual(this.additionalIdRef, commentsAnalyticsPayload.additionalIdRef) && Intrinsics.areEqual(this.vIndex, commentsAnalyticsPayload.vIndex) && Intrinsics.areEqual(this.leagueId, commentsAnalyticsPayload.leagueId) && Intrinsics.areEqual(this.gameStatusView, commentsAnalyticsPayload.gameStatusView);
    }

    public int hashCode() {
        String str = this.additionalIdRef;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.vIndex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.leagueId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gameStatusView;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "CommentsAnalyticsPayload(additionalIdRef=" + this.additionalIdRef + ", vIndex=" + this.vIndex + ", leagueId=" + this.leagueId + ", gameStatusView=" + this.gameStatusView + ")";
    }

    public CommentsAnalyticsPayload(String str, Integer num, String str2, String str3) {
        this.additionalIdRef = str;
        this.vIndex = num;
        this.leagueId = str2;
        this.gameStatusView = str3;
    }

    public /* synthetic */ CommentsAnalyticsPayload(String str, Integer num, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
    }
}
