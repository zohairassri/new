package com.theathletic.analytics.data.local;

import io.agora.rtc2.internal.AudioRoutingController;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.e;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u000eHÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\u0093\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR&\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010 R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$¨\u00069"}, d2 = {"Lcom/theathletic/analytics/data/local/AnalyticsEvent;", "", "verb", "", "previousView", "view", "element", "objectType", "objectId", "source", "metaBlob", "", "dateTime", "timestampMs", "", "uid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V", "getVerb", "()Ljava/lang/String;", "getPreviousView", "getView", "getElement", "getObjectType", "getObjectId", "getSource", "getMetaBlob", "()Ljava/util/Map;", "getDateTime$annotations", "()V", "getDateTime", "setDateTime", "(Ljava/lang/String;)V", "getTimestampMs", "()J", "setTimestampMs", "(J)V", "getUid", "setUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AnalyticsEvent {
    public static final int $stable = 8;
    private String dateTime;
    private final String element;
    private final Map<String, String> metaBlob;
    private final String objectId;
    private final String objectType;
    private final String previousView;
    private final String source;
    private long timestampMs;
    private long uid;

    @NotNull
    private final String verb;
    private final String view;

    public AnalyticsEvent(@NotNull String verb, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, String str7, long j11, long j12) {
        Intrinsics.checkNotNullParameter(verb, "verb");
        this.verb = verb;
        this.previousView = str;
        this.view = str2;
        this.element = str3;
        this.objectType = str4;
        this.objectId = str5;
        this.source = str6;
        this.metaBlob = map;
        this.dateTime = str7;
        this.timestampMs = j11;
        this.uid = j12;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVerb() {
        return this.verb;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getTimestampMs() {
        return this.timestampMs;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPreviousView() {
        return this.previousView;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getElement() {
        return this.element;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getObjectType() {
        return this.objectType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getObjectId() {
        return this.objectId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final Map<String, String> component8() {
        return this.metaBlob;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDateTime() {
        return this.dateTime;
    }

    @NotNull
    public final AnalyticsEvent copy(@NotNull String verb, String previousView, String view, String element, String objectType, String objectId, String source, Map<String, String> metaBlob, String dateTime, long timestampMs, long uid) {
        Intrinsics.checkNotNullParameter(verb, "verb");
        return new AnalyticsEvent(verb, previousView, view, element, objectType, objectId, source, metaBlob, dateTime, timestampMs, uid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsEvent)) {
            return false;
        }
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) other;
        return Intrinsics.areEqual(this.verb, analyticsEvent.verb) && Intrinsics.areEqual(this.previousView, analyticsEvent.previousView) && Intrinsics.areEqual(this.view, analyticsEvent.view) && Intrinsics.areEqual(this.element, analyticsEvent.element) && Intrinsics.areEqual(this.objectType, analyticsEvent.objectType) && Intrinsics.areEqual(this.objectId, analyticsEvent.objectId) && Intrinsics.areEqual(this.source, analyticsEvent.source) && Intrinsics.areEqual(this.metaBlob, analyticsEvent.metaBlob) && Intrinsics.areEqual(this.dateTime, analyticsEvent.dateTime) && this.timestampMs == analyticsEvent.timestampMs && this.uid == analyticsEvent.uid;
    }

    public final String getDateTime() {
        return this.dateTime;
    }

    public final String getElement() {
        return this.element;
    }

    public final Map<String, String> getMetaBlob() {
        return this.metaBlob;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final String getObjectType() {
        return this.objectType;
    }

    public final String getPreviousView() {
        return this.previousView;
    }

    public final String getSource() {
        return this.source;
    }

    public final long getTimestampMs() {
        return this.timestampMs;
    }

    public final long getUid() {
        return this.uid;
    }

    @NotNull
    public final String getVerb() {
        return this.verb;
    }

    public final String getView() {
        return this.view;
    }

    public int hashCode() {
        int iHashCode = this.verb.hashCode() * 31;
        String str = this.previousView;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.view;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.element;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.objectType;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.objectId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.source;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map<String, String> map = this.metaBlob;
        int iHashCode8 = (iHashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        String str7 = this.dateTime;
        return ((((iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31) + Long.hashCode(this.timestampMs)) * 31) + Long.hashCode(this.uid);
    }

    public final void setDateTime(String str) {
        this.dateTime = str;
    }

    public final void setTimestampMs(long j11) {
        this.timestampMs = j11;
    }

    public final void setUid(long j11) {
        this.uid = j11;
    }

    @NotNull
    public String toString() {
        return "AnalyticsEvent(verb=" + this.verb + ", previousView=" + this.previousView + ", view=" + this.view + ", element=" + this.element + ", objectType=" + this.objectType + ", objectId=" + this.objectId + ", source=" + this.source + ", metaBlob=" + this.metaBlob + ", dateTime=" + this.dateTime + ", timestampMs=" + this.timestampMs + ", uid=" + this.uid + ")";
    }

    public /* synthetic */ AnalyticsEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, String str8, long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : map, (i11 & 256) == 0 ? str8 : null, (i11 & AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER) != 0 ? 0L : j11, (i11 & 1024) != 0 ? 0L : j12);
    }

    @e
    public static /* synthetic */ void getDateTime$annotations() {
    }
}
