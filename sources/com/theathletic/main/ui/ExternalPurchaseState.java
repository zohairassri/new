package com.theathletic.main.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.theathletic.main.ui.r, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/theathletic/main/ui/r;", "", "", "showExternalPurchaseDialog", "<init>", "(Z)V", "a", "(Z)Lcom/theathletic/main/ui/r;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", QueryKeys.MEMFLY_API_VERSION, QueryKeys.PAGE_LOAD_TIME, "()Z", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalPurchaseState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showExternalPurchaseDialog;

    public ExternalPurchaseState() {
        this(false, 1, null);
    }

    public final ExternalPurchaseState a(boolean showExternalPurchaseDialog) {
        return new ExternalPurchaseState(showExternalPurchaseDialog);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowExternalPurchaseDialog() {
        return this.showExternalPurchaseDialog;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExternalPurchaseState) && this.showExternalPurchaseDialog == ((ExternalPurchaseState) other).showExternalPurchaseDialog;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showExternalPurchaseDialog);
    }

    public String toString() {
        return "ExternalPurchaseState(showExternalPurchaseDialog=" + this.showExternalPurchaseDialog + ")";
    }

    public ExternalPurchaseState(boolean z11) {
        this.showExternalPurchaseDialog = z11;
    }

    public /* synthetic */ ExternalPurchaseState(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
