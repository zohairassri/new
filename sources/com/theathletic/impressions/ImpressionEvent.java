package com.theathletic.impressions;

import com.amazonaws.event.ProgressEvent;
import com.chartbeat.androidsdk.QueryKeys;
import io.agora.rtc2.Constants;
import io.agora.rtc2.internal.AudioRoutingController;
import io.agora.rtc2.internal.Marshallable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: renamed from: com.theathletic.impressions.a, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B×\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJà\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b%\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b(\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b4\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b5\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010$\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b9\u00100R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b-\u00100R\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b;\u0010 R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b%\u0010<\u001a\u0004\b6\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b7\u0010\u001eR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010$\u001a\u0004\b:\u0010\u001eR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010$\u001a\u0004\b8\u0010\u001eR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010$\u001a\u0004\b,\u0010\u001e¨\u0006>"}, d2 = {"Lcom/theathletic/impressions/a;", "", "", "objectType", "objectId", "element", "", "pageOrder", "container", "", "hIndex", "vIndex", "parentObjectType", "parentObjectId", "filterType", "filterId", "startTime", "endTime", "scrollDepth", "", "inStartingViewport", "moduleId", "moduleName", "moduleLabel", "elementLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/theathletic/impressions/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", QueryKeys.DOCUMENT_WIDTH, QueryKeys.PAGE_LOAD_TIME, QueryKeys.IS_NEW_USER, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN, QueryKeys.IDLING, QueryKeys.VIEW_ID, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.VISIT_FREQUENCY, "J", QueryKeys.VIEW_TITLE, "()J", QueryKeys.ACCOUNT_ID, QueryKeys.USER_ID, QueryKeys.HOST, QueryKeys.EXTERNAL_REFERRER, "q", QueryKeys.DECAY, "k", "l", QueryKeys.TOKEN, QueryKeys.MAX_SCROLL_DEPTH, "s", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ImpressionEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String objectType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String objectId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String element;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pageOrder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String container;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long hIndex;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long vIndex;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentObjectType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentObjectId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String filterType;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String filterId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final long startTime;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final long endTime;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final int scrollDepth;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean inStartingViewport;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String moduleId;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String moduleName;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String moduleLabel;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final String elementLabel;

    public ImpressionEvent() {
        this(null, null, null, 0, null, 0L, 0L, null, null, null, null, 0L, 0L, 0, null, null, null, null, null, 524287, null);
    }

    public static /* synthetic */ ImpressionEvent b(ImpressionEvent impressionEvent, String str, String str2, String str3, int i11, String str4, long j11, long j12, String str5, String str6, String str7, String str8, long j13, long j14, int i12, Boolean bool, String str9, String str10, String str11, String str12, int i13, Object obj) {
        String str13;
        String str14;
        String str15 = (i13 & 1) != 0 ? impressionEvent.objectType : str;
        String str16 = (i13 & 2) != 0 ? impressionEvent.objectId : str2;
        String str17 = (i13 & 4) != 0 ? impressionEvent.element : str3;
        int i14 = (i13 & 8) != 0 ? impressionEvent.pageOrder : i11;
        String str18 = (i13 & 16) != 0 ? impressionEvent.container : str4;
        long j15 = (i13 & 32) != 0 ? impressionEvent.hIndex : j11;
        long j16 = (i13 & 64) != 0 ? impressionEvent.vIndex : j12;
        String str19 = (i13 & 128) != 0 ? impressionEvent.parentObjectType : str5;
        String str20 = (i13 & 256) != 0 ? impressionEvent.parentObjectId : str6;
        String str21 = (i13 & AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER) != 0 ? impressionEvent.filterType : str7;
        String str22 = (i13 & 1024) != 0 ? impressionEvent.filterId : str8;
        String str23 = str15;
        String str24 = str16;
        long j17 = (i13 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? impressionEvent.startTime : j13;
        long j18 = (i13 & 4096) != 0 ? impressionEvent.endTime : j14;
        int i15 = (i13 & Marshallable.PROTO_PACKET_SIZE) != 0 ? impressionEvent.scrollDepth : i12;
        long j19 = j18;
        Boolean bool2 = (i13 & 16384) != 0 ? impressionEvent.inStartingViewport : bool;
        String str25 = (32768 & i13) != 0 ? impressionEvent.moduleId : str9;
        String str26 = (i13 & 65536) != 0 ? impressionEvent.moduleName : str10;
        String str27 = (i13 & 131072) != 0 ? impressionEvent.moduleLabel : str11;
        if ((i13 & 262144) != 0) {
            str14 = str27;
            str13 = impressionEvent.elementLabel;
        } else {
            str13 = str12;
            str14 = str27;
        }
        return impressionEvent.a(str23, str24, str17, i14, str18, j15, j16, str19, str20, str21, str22, j17, j19, i15, bool2, str25, str26, str14, str13);
    }

    public final ImpressionEvent a(String objectType, String objectId, String element, int pageOrder, String container, long hIndex, long vIndex, String parentObjectType, String parentObjectId, String filterType, String filterId, long startTime, long endTime, int scrollDepth, Boolean inStartingViewport, String moduleId, String moduleName, String moduleLabel, String elementLabel) {
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return new ImpressionEvent(objectType, objectId, element, pageOrder, container, hIndex, vIndex, parentObjectType, parentObjectId, filterType, filterId, startTime, endTime, scrollDepth, inStartingViewport, moduleId, moduleName, moduleLabel, elementLabel);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getContainer() {
        return this.container;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getElement() {
        return this.element;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getElementLabel() {
        return this.elementLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImpressionEvent)) {
            return false;
        }
        ImpressionEvent impressionEvent = (ImpressionEvent) other;
        return Intrinsics.areEqual(this.objectType, impressionEvent.objectType) && Intrinsics.areEqual(this.objectId, impressionEvent.objectId) && Intrinsics.areEqual(this.element, impressionEvent.element) && this.pageOrder == impressionEvent.pageOrder && Intrinsics.areEqual(this.container, impressionEvent.container) && this.hIndex == impressionEvent.hIndex && this.vIndex == impressionEvent.vIndex && Intrinsics.areEqual(this.parentObjectType, impressionEvent.parentObjectType) && Intrinsics.areEqual(this.parentObjectId, impressionEvent.parentObjectId) && Intrinsics.areEqual(this.filterType, impressionEvent.filterType) && Intrinsics.areEqual(this.filterId, impressionEvent.filterId) && this.startTime == impressionEvent.startTime && this.endTime == impressionEvent.endTime && this.scrollDepth == impressionEvent.scrollDepth && Intrinsics.areEqual(this.inStartingViewport, impressionEvent.inStartingViewport) && Intrinsics.areEqual(this.moduleId, impressionEvent.moduleId) && Intrinsics.areEqual(this.moduleName, impressionEvent.moduleName) && Intrinsics.areEqual(this.moduleLabel, impressionEvent.moduleLabel) && Intrinsics.areEqual(this.elementLabel, impressionEvent.elementLabel);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFilterId() {
        return this.filterId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getFilterType() {
        return this.filterType;
    }

    public int hashCode() {
        int iHashCode = ((((((this.objectType.hashCode() * 31) + this.objectId.hashCode()) * 31) + this.element.hashCode()) * 31) + Integer.hashCode(this.pageOrder)) * 31;
        String str = this.container;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.hIndex)) * 31) + Long.hashCode(this.vIndex)) * 31;
        String str2 = this.parentObjectType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.parentObjectId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.filterType;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.filterId;
        int iHashCode6 = (((((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31) + Integer.hashCode(this.scrollDepth)) * 31;
        Boolean bool = this.inStartingViewport;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.moduleId;
        int iHashCode8 = (((iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.moduleName.hashCode()) * 31;
        String str7 = this.moduleLabel;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.elementLabel;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getHIndex() {
        return this.hIndex;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getInStartingViewport() {
        return this.inStartingViewport;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getModuleId() {
        return this.moduleId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getModuleLabel() {
        return this.moduleLabel;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getModuleName() {
        return this.moduleName;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getObjectId() {
        return this.objectId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getObjectType() {
        return this.objectType;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getPageOrder() {
        return this.pageOrder;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getParentObjectId() {
        return this.parentObjectId;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getParentObjectType() {
        return this.parentObjectType;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getScrollDepth() {
        return this.scrollDepth;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    public String toString() {
        return "ImpressionEvent(objectType=" + this.objectType + ", objectId=" + this.objectId + ", element=" + this.element + ", pageOrder=" + this.pageOrder + ", container=" + this.container + ", hIndex=" + this.hIndex + ", vIndex=" + this.vIndex + ", parentObjectType=" + this.parentObjectType + ", parentObjectId=" + this.parentObjectId + ", filterType=" + this.filterType + ", filterId=" + this.filterId + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", scrollDepth=" + this.scrollDepth + ", inStartingViewport=" + this.inStartingViewport + ", moduleId=" + this.moduleId + ", moduleName=" + this.moduleName + ", moduleLabel=" + this.moduleLabel + ", elementLabel=" + this.elementLabel + ")";
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final long getVIndex() {
        return this.vIndex;
    }

    public ImpressionEvent(String objectType, String objectId, String element, int i11, String str, long j11, long j12, String str2, String str3, String str4, String str5, long j13, long j14, int i12, Boolean bool, String str6, String moduleName, String str7, String str8) {
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        this.objectType = objectType;
        this.objectId = objectId;
        this.element = element;
        this.pageOrder = i11;
        this.container = str;
        this.hIndex = j11;
        this.vIndex = j12;
        this.parentObjectType = str2;
        this.parentObjectId = str3;
        this.filterType = str4;
        this.filterId = str5;
        this.startTime = j13;
        this.endTime = j14;
        this.scrollDepth = i12;
        this.inStartingViewport = bool;
        this.moduleId = str6;
        this.moduleName = moduleName;
        this.moduleLabel = str7;
        this.elementLabel = str8;
    }

    public /* synthetic */ ImpressionEvent(String str, String str2, String str3, int i11, String str4, long j11, long j12, String str5, String str6, String str7, String str8, long j13, long j14, int i12, Boolean bool, String str9, String str10, String str11, String str12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? -1L : j11, (i13 & 64) == 0 ? j12 : -1L, (i13 & 128) != 0 ? null : str5, (i13 & 256) != 0 ? null : str6, (i13 & AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER) != 0 ? null : str7, (i13 & 1024) != 0 ? null : str8, (i13 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? Long.MAX_VALUE : j13, (i13 & 4096) == 0 ? j14 : LongCompanionObject.MAX_VALUE, (i13 & Marshallable.PROTO_PACKET_SIZE) != 0 ? -1 : i12, (i13 & 16384) != 0 ? null : bool, (i13 & Constants.EAR_MONITORING_FILTER_REUSE_POST_PROCESSING_FILTER) != 0 ? null : str9, (i13 & 65536) == 0 ? str10 : "", (i13 & 131072) != 0 ? null : str11, (i13 & 262144) != 0 ? null : str12);
    }
}
