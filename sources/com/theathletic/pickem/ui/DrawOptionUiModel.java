package com.theathletic.pickem.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.pickem.ui.l, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/theathletic/pickem/ui/l;", "", "", "teamId", "displayName", "", "isSelected", "", "pickPercentage", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.SUBDOMAIN, QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.MEMFLY_API_VERSION, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "()Z", QueryKeys.IDLING, "showPercentage", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DrawOptionUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String teamId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pickPercentage;

    public DrawOptionUiModel(String teamId, String displayName, boolean z11, int i11) {
        Intrinsics.checkNotNullParameter(teamId, "teamId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.teamId = teamId;
        this.displayName = displayName;
        this.isSelected = z11;
        this.pickPercentage = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPickPercentage() {
        return this.pickPercentage;
    }

    public final boolean c() {
        return this.pickPercentage > 0;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTeamId() {
        return this.teamId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawOptionUiModel)) {
            return false;
        }
        DrawOptionUiModel drawOptionUiModel = (DrawOptionUiModel) other;
        return Intrinsics.areEqual(this.teamId, drawOptionUiModel.teamId) && Intrinsics.areEqual(this.displayName, drawOptionUiModel.displayName) && this.isSelected == drawOptionUiModel.isSelected && this.pickPercentage == drawOptionUiModel.pickPercentage;
    }

    public int hashCode() {
        return (((((this.teamId.hashCode() * 31) + this.displayName.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Integer.hashCode(this.pickPercentage);
    }

    public String toString() {
        return "DrawOptionUiModel(teamId=" + this.teamId + ", displayName=" + this.displayName + ", isSelected=" + this.isSelected + ", pickPercentage=" + this.pickPercentage + ")";
    }
}
