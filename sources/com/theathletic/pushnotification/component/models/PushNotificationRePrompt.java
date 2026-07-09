package com.theathletic.pushnotification.component.models;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.pushnotification.component.data.remote.PushNotificationRePromptRemoteDataStore;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.pushnotification.component.models.d, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, d2 = {"Lcom/theathletic/pushnotification/component/models/d;", "", "", "title", "description", "ctaButtonText", PushNotificationRePromptRemoteDataStore.PARAM_STYLE, "", "delayMs", "", "canShowSystemPrompt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.VISIT_FREQUENCY, QueryKeys.PAGE_LOAD_TIME, QueryKeys.SUBDOMAIN, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "J", "()J", QueryKeys.MEMFLY_API_VERSION, "()Z", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushNotificationRePrompt {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ctaButtonText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String style;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long delayMs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canShowSystemPrompt;

    public PushNotificationRePrompt() {
        this(null, null, null, null, 0L, false, 63, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCanShowSystemPrompt() {
        return this.canShowSystemPrompt;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCtaButtonText() {
        return this.ctaButtonText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getDelayMs() {
        return this.delayMs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushNotificationRePrompt)) {
            return false;
        }
        PushNotificationRePrompt pushNotificationRePrompt = (PushNotificationRePrompt) other;
        return Intrinsics.areEqual(this.title, pushNotificationRePrompt.title) && Intrinsics.areEqual(this.description, pushNotificationRePrompt.description) && Intrinsics.areEqual(this.ctaButtonText, pushNotificationRePrompt.ctaButtonText) && Intrinsics.areEqual(this.style, pushNotificationRePrompt.style) && this.delayMs == pushNotificationRePrompt.delayMs && this.canShowSystemPrompt == pushNotificationRePrompt.canShowSystemPrompt;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ctaButtonText;
        return ((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.style.hashCode()) * 31) + Long.hashCode(this.delayMs)) * 31) + Boolean.hashCode(this.canShowSystemPrompt);
    }

    public String toString() {
        return "PushNotificationRePrompt(title=" + this.title + ", description=" + this.description + ", ctaButtonText=" + this.ctaButtonText + ", style=" + this.style + ", delayMs=" + this.delayMs + ", canShowSystemPrompt=" + this.canShowSystemPrompt + ")";
    }

    public PushNotificationRePrompt(String str, String str2, String str3, String style, long j11, boolean z11) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.title = str;
        this.description = str2;
        this.ctaButtonText = str3;
        this.style = style;
        this.delayMs = j11;
        this.canShowSystemPrompt = z11;
    }

    public /* synthetic */ PushNotificationRePrompt(String str, String str2, String str3, String str4, long j11, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? PushNotificationRePromptRemoteDataStore.DEFAULT_DELAY_MS : j11, (i11 & 32) != 0 ? true : z11);
    }
}
