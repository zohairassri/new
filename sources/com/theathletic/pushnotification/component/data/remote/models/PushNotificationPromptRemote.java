package com.theathletic.pushnotification.component.data.remote.models;

import com.theathletic.pushnotification.component.data.remote.PushNotificationPromptRemoteDataStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/theathletic/pushnotification/component/data/remote/models/PushNotificationPromptRemote;", "", "title", "", "description", "skipButtonText", "ctaButtonText", "shouldSkipPrePrompt", "", PushNotificationPromptRemoteDataStore.PARAM_LOCATION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getSkipButtonText", "getCtaButtonText", "getShouldSkipPrePrompt", "()Z", "getLocation", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushNotificationPromptRemote {
    private final String ctaButtonText;
    private final String description;
    private final String location;
    private final boolean shouldSkipPrePrompt;
    private final String skipButtonText;
    private final String title;

    public PushNotificationPromptRemote(String str, String str2, String str3, String str4, boolean z11, String str5) {
        this.title = str;
        this.description = str2;
        this.skipButtonText = str3;
        this.ctaButtonText = str4;
        this.shouldSkipPrePrompt = z11;
        this.location = str5;
    }

    public static /* synthetic */ PushNotificationPromptRemote copy$default(PushNotificationPromptRemote pushNotificationPromptRemote, String str, String str2, String str3, String str4, boolean z11, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pushNotificationPromptRemote.title;
        }
        if ((i11 & 2) != 0) {
            str2 = pushNotificationPromptRemote.description;
        }
        if ((i11 & 4) != 0) {
            str3 = pushNotificationPromptRemote.skipButtonText;
        }
        if ((i11 & 8) != 0) {
            str4 = pushNotificationPromptRemote.ctaButtonText;
        }
        if ((i11 & 16) != 0) {
            z11 = pushNotificationPromptRemote.shouldSkipPrePrompt;
        }
        if ((i11 & 32) != 0) {
            str5 = pushNotificationPromptRemote.location;
        }
        boolean z12 = z11;
        String str6 = str5;
        return pushNotificationPromptRemote.copy(str, str2, str3, str4, z12, str6);
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
    public final String getSkipButtonText() {
        return this.skipButtonText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCtaButtonText() {
        return this.ctaButtonText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShouldSkipPrePrompt() {
        return this.shouldSkipPrePrompt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @NotNull
    public final PushNotificationPromptRemote copy(String title, String description, String skipButtonText, String ctaButtonText, boolean shouldSkipPrePrompt, String location) {
        return new PushNotificationPromptRemote(title, description, skipButtonText, ctaButtonText, shouldSkipPrePrompt, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushNotificationPromptRemote)) {
            return false;
        }
        PushNotificationPromptRemote pushNotificationPromptRemote = (PushNotificationPromptRemote) other;
        return Intrinsics.areEqual(this.title, pushNotificationPromptRemote.title) && Intrinsics.areEqual(this.description, pushNotificationPromptRemote.description) && Intrinsics.areEqual(this.skipButtonText, pushNotificationPromptRemote.skipButtonText) && Intrinsics.areEqual(this.ctaButtonText, pushNotificationPromptRemote.ctaButtonText) && this.shouldSkipPrePrompt == pushNotificationPromptRemote.shouldSkipPrePrompt && Intrinsics.areEqual(this.location, pushNotificationPromptRemote.location);
    }

    public final String getCtaButtonText() {
        return this.ctaButtonText;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLocation() {
        return this.location;
    }

    public final boolean getShouldSkipPrePrompt() {
        return this.shouldSkipPrePrompt;
    }

    public final String getSkipButtonText() {
        return this.skipButtonText;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.skipButtonText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ctaButtonText;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.shouldSkipPrePrompt)) * 31;
        String str5 = this.location;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PushNotificationPromptRemote(title=" + this.title + ", description=" + this.description + ", skipButtonText=" + this.skipButtonText + ", ctaButtonText=" + this.ctaButtonText + ", shouldSkipPrePrompt=" + this.shouldSkipPrePrompt + ", location=" + this.location + ")";
    }
}
