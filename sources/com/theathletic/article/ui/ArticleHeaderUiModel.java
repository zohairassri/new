package com.theathletic.article.ui;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.entity.article.HasPostType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.article.ui.h0, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lcom/theathletic/article/ui/h0;", "Lcom/theathletic/entity/article/HasPostType;", "", "id", "", "commentCount", "postTypeId", "", "isSaved", "isRead", "<init>", "(Ljava/lang/String;JJZZ)V", "a", "(Ljava/lang/String;JJZZ)Lcom/theathletic/article/ui/h0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", QueryKeys.SUBDOMAIN, QueryKeys.PAGE_LOAD_TIME, "J", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()J", "getPostTypeId", "()Ljava/lang/Long;", QueryKeys.MEMFLY_API_VERSION, QueryKeys.VISIT_FREQUENCY, "()Z", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ArticleHeaderUiModel implements HasPostType {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f50045f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long commentCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long postTypeId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSaved;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRead;

    public ArticleHeaderUiModel(String id2, long j11, long j12, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.commentCount = j11;
        this.postTypeId = j12;
        this.isSaved = z11;
        this.isRead = z12;
    }

    public static /* synthetic */ ArticleHeaderUiModel b(ArticleHeaderUiModel articleHeaderUiModel, String str, long j11, long j12, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = articleHeaderUiModel.id;
        }
        if ((i11 & 2) != 0) {
            j11 = articleHeaderUiModel.commentCount;
        }
        if ((i11 & 4) != 0) {
            j12 = articleHeaderUiModel.postTypeId;
        }
        if ((i11 & 8) != 0) {
            z11 = articleHeaderUiModel.isSaved;
        }
        if ((i11 & 16) != 0) {
            z12 = articleHeaderUiModel.isRead;
        }
        long j13 = j12;
        return articleHeaderUiModel.a(str, j11, j13, z11, z12);
    }

    public final ArticleHeaderUiModel a(String id2, long commentCount, long postTypeId, boolean isSaved, boolean isRead) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new ArticleHeaderUiModel(id2, commentCount, postTypeId, isSaved, isRead);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCommentCount() {
        return this.commentCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleHeaderUiModel)) {
            return false;
        }
        ArticleHeaderUiModel articleHeaderUiModel = (ArticleHeaderUiModel) other;
        return Intrinsics.areEqual(this.id, articleHeaderUiModel.id) && this.commentCount == articleHeaderUiModel.commentCount && this.postTypeId == articleHeaderUiModel.postTypeId && this.isSaved == articleHeaderUiModel.isSaved && this.isRead == articleHeaderUiModel.isRead;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsSaved() {
        return this.isSaved;
    }

    @Override // com.theathletic.entity.article.HasPostType
    public Long getPostTypeId() {
        return Long.valueOf(this.postTypeId);
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + Long.hashCode(this.commentCount)) * 31) + Long.hashCode(this.postTypeId)) * 31) + Boolean.hashCode(this.isSaved)) * 31) + Boolean.hashCode(this.isRead);
    }

    public String toString() {
        return "ArticleHeaderUiModel(id=" + this.id + ", commentCount=" + this.commentCount + ", postTypeId=" + this.postTypeId + ", isSaved=" + this.isSaved + ", isRead=" + this.isRead + ")";
    }
}
