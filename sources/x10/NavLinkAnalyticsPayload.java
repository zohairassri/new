package x10;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: x10.g, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001f\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u0011R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b#\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\u001e\u0010\u0011¨\u0006%"}, d2 = {"Lx10/g;", "", "", "objectType", "", "moduleIndex", "container", "boxScoreTab", "", "vIndex", "hIndex", "parentType", "parentId", "deepLink", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.VISIT_FREQUENCY, QueryKeys.PAGE_LOAD_TIME, QueryKeys.IDLING, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN, "J", QueryKeys.VIEW_TITLE, "()J", QueryKeys.ACCOUNT_ID, QueryKeys.HOST, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NavLinkAnalyticsPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String objectType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int moduleIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String container;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String boxScoreTab;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long vIndex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long hIndex;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deepLink;

    public NavLinkAnalyticsPayload(String objectType, int i11, String container, String boxScoreTab, long j11, long j12, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(boxScoreTab, "boxScoreTab");
        this.objectType = objectType;
        this.moduleIndex = i11;
        this.container = container;
        this.boxScoreTab = boxScoreTab;
        this.vIndex = j11;
        this.hIndex = j12;
        this.parentType = str;
        this.parentId = str2;
        this.deepLink = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBoxScoreTab() {
        return this.boxScoreTab;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContainer() {
        return this.container;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDeepLink() {
        return this.deepLink;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getHIndex() {
        return this.hIndex;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getModuleIndex() {
        return this.moduleIndex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavLinkAnalyticsPayload)) {
            return false;
        }
        NavLinkAnalyticsPayload navLinkAnalyticsPayload = (NavLinkAnalyticsPayload) other;
        return Intrinsics.areEqual(this.objectType, navLinkAnalyticsPayload.objectType) && this.moduleIndex == navLinkAnalyticsPayload.moduleIndex && Intrinsics.areEqual(this.container, navLinkAnalyticsPayload.container) && Intrinsics.areEqual(this.boxScoreTab, navLinkAnalyticsPayload.boxScoreTab) && this.vIndex == navLinkAnalyticsPayload.vIndex && this.hIndex == navLinkAnalyticsPayload.hIndex && Intrinsics.areEqual(this.parentType, navLinkAnalyticsPayload.parentType) && Intrinsics.areEqual(this.parentId, navLinkAnalyticsPayload.parentId) && Intrinsics.areEqual(this.deepLink, navLinkAnalyticsPayload.deepLink);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getObjectType() {
        return this.objectType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getParentType() {
        return this.parentType;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.objectType.hashCode() * 31) + Integer.hashCode(this.moduleIndex)) * 31) + this.container.hashCode()) * 31) + this.boxScoreTab.hashCode()) * 31) + Long.hashCode(this.vIndex)) * 31) + Long.hashCode(this.hIndex)) * 31;
        String str = this.parentType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.parentId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deepLink;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getVIndex() {
        return this.vIndex;
    }

    public String toString() {
        return "NavLinkAnalyticsPayload(objectType=" + this.objectType + ", moduleIndex=" + this.moduleIndex + ", container=" + this.container + ", boxScoreTab=" + this.boxScoreTab + ", vIndex=" + this.vIndex + ", hIndex=" + this.hIndex + ", parentType=" + this.parentType + ", parentId=" + this.parentId + ", deepLink=" + this.deepLink + ")";
    }
}
