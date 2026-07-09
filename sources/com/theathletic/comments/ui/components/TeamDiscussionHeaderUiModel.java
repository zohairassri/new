package com.theathletic.comments.ui.components;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.comments.ui.components.l8, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/theathletic/comments/ui/components/l8;", "", "", "label", "imageUrl", "backgroundColor", "", "isLightForeground", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.PAGE_LOAD_TIME, QueryKeys.SUBDOMAIN, QueryKeys.MEMFLY_API_VERSION, "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TeamDiscussionHeaderUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String backgroundColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLightForeground;

    public TeamDiscussionHeaderUiModel(String label, String str, String backgroundColor, boolean z11) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.label = label;
        this.imageUrl = str;
        this.backgroundColor = backgroundColor;
        this.isLightForeground = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsLightForeground() {
        return this.isLightForeground;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamDiscussionHeaderUiModel)) {
            return false;
        }
        TeamDiscussionHeaderUiModel teamDiscussionHeaderUiModel = (TeamDiscussionHeaderUiModel) other;
        return Intrinsics.areEqual(this.label, teamDiscussionHeaderUiModel.label) && Intrinsics.areEqual(this.imageUrl, teamDiscussionHeaderUiModel.imageUrl) && Intrinsics.areEqual(this.backgroundColor, teamDiscussionHeaderUiModel.backgroundColor) && this.isLightForeground == teamDiscussionHeaderUiModel.isLightForeground;
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        String str = this.imageUrl;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.backgroundColor.hashCode()) * 31) + Boolean.hashCode(this.isLightForeground);
    }

    public String toString() {
        return "TeamDiscussionHeaderUiModel(label=" + this.label + ", imageUrl=" + this.imageUrl + ", backgroundColor=" + this.backgroundColor + ", isLightForeground=" + this.isLightForeground + ")";
    }
}
