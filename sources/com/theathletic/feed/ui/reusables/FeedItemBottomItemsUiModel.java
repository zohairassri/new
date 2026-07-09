package com.theathletic.feed.ui.reusables;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.feed.ui.reusables.r0, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/theathletic/feed/ui/reusables/r0;", "", "", "isBookmarked", "", "byline", "commentCount", "", "avatarUrls", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.MEMFLY_API_VERSION, QueryKeys.SUBDOMAIN, "()Z", QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/String;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeedItemBottomItemsUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBookmarked;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String byline;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String commentCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List avatarUrls;

    public FeedItemBottomItemsUiModel(boolean z11, String byline, String commentCount, List list) {
        Intrinsics.checkNotNullParameter(byline, "byline");
        Intrinsics.checkNotNullParameter(commentCount, "commentCount");
        this.isBookmarked = z11;
        this.byline = byline;
        this.commentCount = commentCount;
        this.avatarUrls = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAvatarUrls() {
        return this.avatarUrls;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getByline() {
        return this.byline;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCommentCount() {
        return this.commentCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsBookmarked() {
        return this.isBookmarked;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedItemBottomItemsUiModel)) {
            return false;
        }
        FeedItemBottomItemsUiModel feedItemBottomItemsUiModel = (FeedItemBottomItemsUiModel) other;
        return this.isBookmarked == feedItemBottomItemsUiModel.isBookmarked && Intrinsics.areEqual(this.byline, feedItemBottomItemsUiModel.byline) && Intrinsics.areEqual(this.commentCount, feedItemBottomItemsUiModel.commentCount) && Intrinsics.areEqual(this.avatarUrls, feedItemBottomItemsUiModel.avatarUrls);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isBookmarked) * 31) + this.byline.hashCode()) * 31) + this.commentCount.hashCode()) * 31;
        List list = this.avatarUrls;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "FeedItemBottomItemsUiModel(isBookmarked=" + this.isBookmarked + ", byline=" + this.byline + ", commentCount=" + this.commentCount + ", avatarUrls=" + this.avatarUrls + ")";
    }

    public /* synthetic */ FeedItemBottomItemsUiModel(boolean z11, String str, String str2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, str, str2, (i11 & 8) != 0 ? null : list);
    }
}
