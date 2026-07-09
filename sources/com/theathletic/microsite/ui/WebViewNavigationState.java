package com.theathletic.microsite.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.theathletic.microsite.ui.d1, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/theathletic/microsite/ui/d1;", "", "", "canGoBack", "canGoForward", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.MEMFLY_API_VERSION, "()Z", QueryKeys.PAGE_LOAD_TIME, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WebViewNavigationState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canGoBack;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canGoForward;

    public WebViewNavigationState(boolean z11, boolean z12) {
        this.canGoBack = z11;
        this.canGoForward = z12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCanGoBack() {
        return this.canGoBack;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCanGoForward() {
        return this.canGoForward;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebViewNavigationState)) {
            return false;
        }
        WebViewNavigationState webViewNavigationState = (WebViewNavigationState) other;
        return this.canGoBack == webViewNavigationState.canGoBack && this.canGoForward == webViewNavigationState.canGoForward;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.canGoBack) * 31) + Boolean.hashCode(this.canGoForward);
    }

    public String toString() {
        return "WebViewNavigationState(canGoBack=" + this.canGoBack + ", canGoForward=" + this.canGoForward + ")";
    }
}
