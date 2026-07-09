package com.theathletic.feed.ui.items.insiders;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.feed.ui.items.insiders.f, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/theathletic/feed/ui/items/insiders/f;", "", "", "imageUrl", "author", "authorRole", "excerpt", "lastUpdated", "commentCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN, QueryKeys.VISIT_FREQUENCY, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsiderUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String author;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authorRole;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String excerpt;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastUpdated;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String commentCount;

    public InsiderUiModel(String imageUrl, String author, String authorRole, String excerpt, String lastUpdated, String commentCount) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(authorRole, "authorRole");
        Intrinsics.checkNotNullParameter(excerpt, "excerpt");
        Intrinsics.checkNotNullParameter(lastUpdated, "lastUpdated");
        Intrinsics.checkNotNullParameter(commentCount, "commentCount");
        this.imageUrl = imageUrl;
        this.author = author;
        this.authorRole = authorRole;
        this.excerpt = excerpt;
        this.lastUpdated = lastUpdated;
        this.commentCount = commentCount;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAuthorRole() {
        return this.authorRole;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCommentCount() {
        return this.commentCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getExcerpt() {
        return this.excerpt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsiderUiModel)) {
            return false;
        }
        InsiderUiModel insiderUiModel = (InsiderUiModel) other;
        return Intrinsics.areEqual(this.imageUrl, insiderUiModel.imageUrl) && Intrinsics.areEqual(this.author, insiderUiModel.author) && Intrinsics.areEqual(this.authorRole, insiderUiModel.authorRole) && Intrinsics.areEqual(this.excerpt, insiderUiModel.excerpt) && Intrinsics.areEqual(this.lastUpdated, insiderUiModel.lastUpdated) && Intrinsics.areEqual(this.commentCount, insiderUiModel.commentCount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLastUpdated() {
        return this.lastUpdated;
    }

    public int hashCode() {
        return (((((((((this.imageUrl.hashCode() * 31) + this.author.hashCode()) * 31) + this.authorRole.hashCode()) * 31) + this.excerpt.hashCode()) * 31) + this.lastUpdated.hashCode()) * 31) + this.commentCount.hashCode();
    }

    public String toString() {
        return "InsiderUiModel(imageUrl=" + this.imageUrl + ", author=" + this.author + ", authorRole=" + this.authorRole + ", excerpt=" + this.excerpt + ", lastUpdated=" + this.lastUpdated + ", commentCount=" + this.commentCount + ")";
    }
}
