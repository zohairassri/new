package com.theathletic.pushnotification.component.data.remote.models;

import com.theathletic.pushnotification.component.data.remote.PushNotificationRePromptRemoteDataStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/theathletic/pushnotification/component/data/remote/models/PushNotificationRePromptRemote;", "", "title", "", "description", "ctaText", "ctaTextDenied", PushNotificationRePromptRemoteDataStore.PARAM_STYLE, "delayMs", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getCtaText", "getCtaTextDenied", "getStyle", "getDelayMs", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushNotificationRePromptRemote {
    private final String ctaText;
    private final String ctaTextDenied;
    private final long delayMs;
    private final String description;

    @NotNull
    private final String style;
    private final String title;

    public PushNotificationRePromptRemote(String str, String str2, String str3, String str4, @NotNull String style, long j11) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.title = str;
        this.description = str2;
        this.ctaText = str3;
        this.ctaTextDenied = str4;
        this.style = style;
        this.delayMs = j11;
    }

    public static /* synthetic */ PushNotificationRePromptRemote copy$default(PushNotificationRePromptRemote pushNotificationRePromptRemote, String str, String str2, String str3, String str4, String str5, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pushNotificationRePromptRemote.title;
        }
        if ((i11 & 2) != 0) {
            str2 = pushNotificationRePromptRemote.description;
        }
        if ((i11 & 4) != 0) {
            str3 = pushNotificationRePromptRemote.ctaText;
        }
        if ((i11 & 8) != 0) {
            str4 = pushNotificationRePromptRemote.ctaTextDenied;
        }
        if ((i11 & 16) != 0) {
            str5 = pushNotificationRePromptRemote.style;
        }
        if ((i11 & 32) != 0) {
            j11 = pushNotificationRePromptRemote.delayMs;
        }
        long j12 = j11;
        String str6 = str5;
        String str7 = str3;
        return pushNotificationRePromptRemote.copy(str, str2, str7, str4, str6, j12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCtaTextDenied() {
        return this.ctaTextDenied;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getDelayMs() {
        return this.delayMs;
    }

    @NotNull
    public final PushNotificationRePromptRemote copy(String title, String description, String ctaText, String ctaTextDenied, @NotNull String style, long delayMs) {
        Intrinsics.checkNotNullParameter(style, "style");
        return new PushNotificationRePromptRemote(title, description, ctaText, ctaTextDenied, style, delayMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushNotificationRePromptRemote)) {
            return false;
        }
        PushNotificationRePromptRemote pushNotificationRePromptRemote = (PushNotificationRePromptRemote) other;
        return Intrinsics.areEqual(this.title, pushNotificationRePromptRemote.title) && Intrinsics.areEqual(this.description, pushNotificationRePromptRemote.description) && Intrinsics.areEqual(this.ctaText, pushNotificationRePromptRemote.ctaText) && Intrinsics.areEqual(this.ctaTextDenied, pushNotificationRePromptRemote.ctaTextDenied) && Intrinsics.areEqual(this.style, pushNotificationRePromptRemote.style) && this.delayMs == pushNotificationRePromptRemote.delayMs;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getCtaTextDenied() {
        return this.ctaTextDenied;
    }

    public final long getDelayMs() {
        return this.delayMs;
    }

    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ctaText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ctaTextDenied;
        return ((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.style.hashCode()) * 31) + Long.hashCode(this.delayMs);
    }

    @NotNull
    public String toString() {
        return "PushNotificationRePromptRemote(title=" + this.title + ", description=" + this.description + ", ctaText=" + this.ctaText + ", ctaTextDenied=" + this.ctaTextDenied + ", style=" + this.style + ", delayMs=" + this.delayMs + ")";
    }
}
