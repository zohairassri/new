package com.theathletic.boxscore.ui;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.boxscore.ui.ld, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\f¨\u0006 "}, d2 = {"Lcom/theathletic/boxscore/ui/ld;", "Lcom/theathletic/ui/d1;", "", "id", "", "Lcom/theathletic/boxscore/ui/dd;", "comments", "", "showJoinDiscussionIndicator", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", QueryKeys.PAGE_LOAD_TIME, "Ljava/util/List;", "()Ljava/util/List;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.MEMFLY_API_VERSION, "()Z", QueryKeys.SUBDOMAIN, "getStableId", "stableId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopCommentsUiModel implements com.theathletic.ui.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List comments;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showJoinDiscussionIndicator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String stableId;

    public TopCommentsUiModel(String id2, List comments, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(comments, "comments");
        this.id = id2;
        this.comments = comments;
        this.showJoinDiscussionIndicator = z11;
        this.stableId = "BoxScoreTopComments:" + id2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getComments() {
        return this.comments;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowJoinDiscussionIndicator() {
        return this.showJoinDiscussionIndicator;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopCommentsUiModel)) {
            return false;
        }
        TopCommentsUiModel topCommentsUiModel = (TopCommentsUiModel) other;
        return Intrinsics.areEqual(this.id, topCommentsUiModel.id) && Intrinsics.areEqual(this.comments, topCommentsUiModel.comments) && this.showJoinDiscussionIndicator == topCommentsUiModel.showJoinDiscussionIndicator;
    }

    @Override // com.theathletic.ui.d1
    public String getStableId() {
        return this.stableId;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.comments.hashCode()) * 31) + Boolean.hashCode(this.showJoinDiscussionIndicator);
    }

    public String toString() {
        return "TopCommentsUiModel(id=" + this.id + ", comments=" + this.comments + ", showJoinDiscussionIndicator=" + this.showJoinDiscussionIndicator + ")";
    }
}
