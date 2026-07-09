package com.theathletic.article.ui.webview;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.article.ui.webview.f2, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/theathletic/article/ui/webview/f2;", "", "", "commentId", "commentPermalink", "", "isVisible", "", "menuX", "menuY", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZII)V", "a", "(Ljava/lang/String;Ljava/lang/String;ZII)Lcom/theathletic/article/ui/webview/f2;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.PAGE_LOAD_TIME, QueryKeys.SUBDOMAIN, QueryKeys.MEMFLY_API_VERSION, QueryKeys.ACCOUNT_ID, "()Z", QueryKeys.IDLING, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.VISIT_FREQUENCY, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommentsMenuUiState {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f50348f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String commentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String commentPermalink;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVisible;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int menuX;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int menuY;

    public CommentsMenuUiState() {
        this(null, null, false, 0, 0, 31, null);
    }

    public static /* synthetic */ CommentsMenuUiState b(CommentsMenuUiState commentsMenuUiState, String str, String str2, boolean z11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = commentsMenuUiState.commentId;
        }
        if ((i13 & 2) != 0) {
            str2 = commentsMenuUiState.commentPermalink;
        }
        if ((i13 & 4) != 0) {
            z11 = commentsMenuUiState.isVisible;
        }
        if ((i13 & 8) != 0) {
            i11 = commentsMenuUiState.menuX;
        }
        if ((i13 & 16) != 0) {
            i12 = commentsMenuUiState.menuY;
        }
        int i14 = i12;
        boolean z12 = z11;
        return commentsMenuUiState.a(str, str2, z12, i11, i14);
    }

    public final CommentsMenuUiState a(String commentId, String commentPermalink, boolean isVisible, int menuX, int menuY) {
        return new CommentsMenuUiState(commentId, commentPermalink, isVisible, menuX, menuY);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCommentId() {
        return this.commentId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCommentPermalink() {
        return this.commentPermalink;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMenuX() {
        return this.menuX;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentsMenuUiState)) {
            return false;
        }
        CommentsMenuUiState commentsMenuUiState = (CommentsMenuUiState) other;
        return Intrinsics.areEqual(this.commentId, commentsMenuUiState.commentId) && Intrinsics.areEqual(this.commentPermalink, commentsMenuUiState.commentPermalink) && this.isVisible == commentsMenuUiState.isVisible && this.menuX == commentsMenuUiState.menuX && this.menuY == commentsMenuUiState.menuY;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMenuY() {
        return this.menuY;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public int hashCode() {
        String str = this.commentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.commentPermalink;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isVisible)) * 31) + Integer.hashCode(this.menuX)) * 31) + Integer.hashCode(this.menuY);
    }

    public String toString() {
        return "CommentsMenuUiState(commentId=" + this.commentId + ", commentPermalink=" + this.commentPermalink + ", isVisible=" + this.isVisible + ", menuX=" + this.menuX + ", menuY=" + this.menuY + ")";
    }

    public CommentsMenuUiState(String str, String str2, boolean z11, int i11, int i12) {
        this.commentId = str;
        this.commentPermalink = str2;
        this.isVisible = z11;
        this.menuX = i11;
        this.menuY = i12;
    }

    public /* synthetic */ CommentsMenuUiState(String str, String str2, boolean z11, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? false : z11, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? 0 : i12);
    }
}
