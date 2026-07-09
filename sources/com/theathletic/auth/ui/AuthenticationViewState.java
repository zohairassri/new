package com.theathletic.auth.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.theathletic.auth.ui.o, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/theathletic/auth/ui/o;", "", "", "isLoading", "shouldShowPushNotificationPrePrompt", "<init>", "(ZZ)V", "a", "(ZZ)Lcom/theathletic/auth/ui/o;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", QueryKeys.MEMFLY_API_VERSION, QueryKeys.SUBDOMAIN, "()Z", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AuthenticationViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldShowPushNotificationPrePrompt;

    /* JADX WARN: Illegal instructions before constructor call */
    public AuthenticationViewState() {
        boolean z11 = false;
        this(z11, z11, 3, null);
    }

    public static /* synthetic */ AuthenticationViewState b(AuthenticationViewState authenticationViewState, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = authenticationViewState.isLoading;
        }
        if ((i11 & 2) != 0) {
            z12 = authenticationViewState.shouldShowPushNotificationPrePrompt;
        }
        return authenticationViewState.a(z11, z12);
    }

    public final AuthenticationViewState a(boolean isLoading, boolean shouldShowPushNotificationPrePrompt) {
        return new AuthenticationViewState(isLoading, shouldShowPushNotificationPrePrompt);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShouldShowPushNotificationPrePrompt() {
        return this.shouldShowPushNotificationPrePrompt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationViewState)) {
            return false;
        }
        AuthenticationViewState authenticationViewState = (AuthenticationViewState) other;
        return this.isLoading == authenticationViewState.isLoading && this.shouldShowPushNotificationPrePrompt == authenticationViewState.shouldShowPushNotificationPrePrompt;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.shouldShowPushNotificationPrePrompt);
    }

    public String toString() {
        return "AuthenticationViewState(isLoading=" + this.isLoading + ", shouldShowPushNotificationPrePrompt=" + this.shouldShowPushNotificationPrePrompt + ")";
    }

    public AuthenticationViewState(boolean z11, boolean z12) {
        this.isLoading = z11;
        this.shouldShowPushNotificationPrePrompt = z12;
    }

    public /* synthetic */ AuthenticationViewState(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? false : z12);
    }
}
