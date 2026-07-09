package com.theathletic.boxscore.component.analytics;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.boxscore.component.analytics.a, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJT\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u001c\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b \u0010\u0010¨\u0006!"}, d2 = {"Lcom/theathletic/boxscore/component/analytics/a;", "", "", "isTopPerformers", "", "pageOrder", "vIndex", "", "objectId", "filterId", "parentObjectId", "<init>", "(Ljava/lang/Boolean;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/Boolean;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/theathletic/boxscore/component/analytics/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", QueryKeys.HOST, "()Ljava/lang/Boolean;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.IDLING, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.ACCOUNT_ID, QueryKeys.SUBDOMAIN, "Ljava/lang/String;", QueryKeys.VISIT_FREQUENCY, "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BoxScoreAnalyticsPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isTopPerformers;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pageOrder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int vIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String objectId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String filterId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentObjectId;

    public BoxScoreAnalyticsPayload() {
        this(null, 0, 0, null, null, null, 63, null);
    }

    public static /* synthetic */ BoxScoreAnalyticsPayload b(BoxScoreAnalyticsPayload boxScoreAnalyticsPayload, Boolean bool, int i11, int i12, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = boxScoreAnalyticsPayload.isTopPerformers;
        }
        if ((i13 & 2) != 0) {
            i11 = boxScoreAnalyticsPayload.pageOrder;
        }
        if ((i13 & 4) != 0) {
            i12 = boxScoreAnalyticsPayload.vIndex;
        }
        if ((i13 & 8) != 0) {
            str = boxScoreAnalyticsPayload.objectId;
        }
        if ((i13 & 16) != 0) {
            str2 = boxScoreAnalyticsPayload.filterId;
        }
        if ((i13 & 32) != 0) {
            str3 = boxScoreAnalyticsPayload.parentObjectId;
        }
        String str4 = str2;
        String str5 = str3;
        return boxScoreAnalyticsPayload.a(bool, i11, i12, str, str4, str5);
    }

    public final BoxScoreAnalyticsPayload a(Boolean isTopPerformers, int pageOrder, int vIndex, String objectId, String filterId, String parentObjectId) {
        return new BoxScoreAnalyticsPayload(isTopPerformers, pageOrder, vIndex, objectId, filterId, parentObjectId);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFilterId() {
        return this.filterId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getObjectId() {
        return this.objectId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getPageOrder() {
        return this.pageOrder;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxScoreAnalyticsPayload)) {
            return false;
        }
        BoxScoreAnalyticsPayload boxScoreAnalyticsPayload = (BoxScoreAnalyticsPayload) other;
        return Intrinsics.areEqual(this.isTopPerformers, boxScoreAnalyticsPayload.isTopPerformers) && this.pageOrder == boxScoreAnalyticsPayload.pageOrder && this.vIndex == boxScoreAnalyticsPayload.vIndex && Intrinsics.areEqual(this.objectId, boxScoreAnalyticsPayload.objectId) && Intrinsics.areEqual(this.filterId, boxScoreAnalyticsPayload.filterId) && Intrinsics.areEqual(this.parentObjectId, boxScoreAnalyticsPayload.parentObjectId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getParentObjectId() {
        return this.parentObjectId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getVIndex() {
        return this.vIndex;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getIsTopPerformers() {
        return this.isTopPerformers;
    }

    public int hashCode() {
        Boolean bool = this.isTopPerformers;
        int iHashCode = (((((bool == null ? 0 : bool.hashCode()) * 31) + Integer.hashCode(this.pageOrder)) * 31) + Integer.hashCode(this.vIndex)) * 31;
        String str = this.objectId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.filterId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.parentObjectId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "BoxScoreAnalyticsPayload(isTopPerformers=" + this.isTopPerformers + ", pageOrder=" + this.pageOrder + ", vIndex=" + this.vIndex + ", objectId=" + this.objectId + ", filterId=" + this.filterId + ", parentObjectId=" + this.parentObjectId + ")";
    }

    public BoxScoreAnalyticsPayload(Boolean bool, int i11, int i12, String str, String str2, String str3) {
        this.isTopPerformers = bool;
        this.pageOrder = i11;
        this.vIndex = i12;
        this.objectId = str;
        this.filterId = str2;
        this.parentObjectId = str3;
    }

    public /* synthetic */ BoxScoreAnalyticsPayload(Boolean bool, int i11, int i12, String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? -1 : i11, (i13 & 4) != 0 ? -1 : i12, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : str3);
    }
}
