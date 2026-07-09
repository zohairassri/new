package com.theathletic.rooms.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.theathletic.rooms.ui.a, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0003\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0004\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/theathletic/rooms/ui/a;", "", "", "isHost", "isModerator", "isOnStage", "isMuted", "requestPending", "", "audienceRequestCount", "<init>", "(ZZZZZI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.MEMFLY_API_VERSION, "()Z", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "getRequestPending", QueryKeys.VISIT_FREQUENCY, QueryKeys.IDLING, "getAudienceRequestCount", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class ButtonConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isHost;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isModerator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOnStage;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMuted;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean requestPending;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int audienceRequestCount;

    public ButtonConfig(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11) {
        this.isHost = z11;
        this.isModerator = z12;
        this.isOnStage = z13;
        this.isMuted = z14;
        this.requestPending = z15;
        this.audienceRequestCount = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonConfig)) {
            return false;
        }
        ButtonConfig buttonConfig = (ButtonConfig) other;
        return this.isHost == buttonConfig.isHost && this.isModerator == buttonConfig.isModerator && this.isOnStage == buttonConfig.isOnStage && this.isMuted == buttonConfig.isMuted && this.requestPending == buttonConfig.requestPending && this.audienceRequestCount == buttonConfig.audienceRequestCount;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.isHost) * 31) + Boolean.hashCode(this.isModerator)) * 31) + Boolean.hashCode(this.isOnStage)) * 31) + Boolean.hashCode(this.isMuted)) * 31) + Boolean.hashCode(this.requestPending)) * 31) + Integer.hashCode(this.audienceRequestCount);
    }

    public String toString() {
        return "ButtonConfig(isHost=" + this.isHost + ", isModerator=" + this.isModerator + ", isOnStage=" + this.isOnStage + ", isMuted=" + this.isMuted + ", requestPending=" + this.requestPending + ", audienceRequestCount=" + this.audienceRequestCount + ")";
    }
}
