package p60;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: p60.a, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001d"}, d2 = {"Lp60/a;", "", "", "gameId", "", "leagueId", "", "index", "provider", "vIndex", "<init>", "(Ljava/lang/String;Ljava/lang/Long;ILjava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/Long;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()Ljava/lang/Long;", QueryKeys.IDLING, QueryKeys.SUBDOMAIN, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "sharedui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CtaAnalyticsPayload {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f121206f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String gameId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long leagueId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String provider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int vIndex;

    public CtaAnalyticsPayload(String gameId, Long l11, int i11, String provider, int i12) {
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.gameId = gameId;
        this.leagueId = l11;
        this.index = i11;
        this.provider = provider;
        this.vIndex = i12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getGameId() {
        return this.gameId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getLeagueId() {
        return this.leagueId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getVIndex() {
        return this.vIndex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CtaAnalyticsPayload)) {
            return false;
        }
        CtaAnalyticsPayload ctaAnalyticsPayload = (CtaAnalyticsPayload) other;
        return Intrinsics.areEqual(this.gameId, ctaAnalyticsPayload.gameId) && Intrinsics.areEqual(this.leagueId, ctaAnalyticsPayload.leagueId) && this.index == ctaAnalyticsPayload.index && Intrinsics.areEqual(this.provider, ctaAnalyticsPayload.provider) && this.vIndex == ctaAnalyticsPayload.vIndex;
    }

    public int hashCode() {
        int iHashCode = this.gameId.hashCode() * 31;
        Long l11 = this.leagueId;
        return ((((((iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31) + Integer.hashCode(this.index)) * 31) + this.provider.hashCode()) * 31) + Integer.hashCode(this.vIndex);
    }

    public String toString() {
        return "CtaAnalyticsPayload(gameId=" + this.gameId + ", leagueId=" + this.leagueId + ", index=" + this.index + ", provider=" + this.provider + ", vIndex=" + this.vIndex + ")";
    }

    public /* synthetic */ CtaAnalyticsPayload(String str, Long l11, int i11, String str2, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : l11, (i13 & 4) != 0 ? -1 : i11, str2, (i13 & 16) != 0 ? -1 : i12);
    }
}
