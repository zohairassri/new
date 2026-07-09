package com.theathletic.article.ui.webview;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/theathletic/article/ui/webview/e2;", "", "<init>", "()V", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "a", "Lcom/theathletic/article/ui/webview/e2$a;", "Lcom/theathletic/article/ui/webview/e2$b;", "Lcom/theathletic/article/ui/webview/e2$c;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class e2 {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/article/ui/webview/e2$a;", "Lcom/theathletic/article/ui/webview/e2;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends e2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50333a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.theathletic.article.ui.webview.e2$b, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/theathletic/article/ui/webview/e2$b;", "Lcom/theathletic/article/ui/webview/e2;", "", "commentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Flag extends e2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String commentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Flag(String commentId) {
            super(null);
            Intrinsics.checkNotNullParameter(commentId, "commentId");
            this.commentId = commentId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCommentId() {
            return this.commentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Flag) && Intrinsics.areEqual(this.commentId, ((Flag) other).commentId);
        }

        public int hashCode() {
            return this.commentId.hashCode();
        }

        public String toString() {
            return "Flag(commentId=" + this.commentId + ")";
        }
    }

    /* JADX INFO: renamed from: com.theathletic.article.ui.webview.e2$c, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/theathletic/article/ui/webview/e2$c;", "Lcom/theathletic/article/ui/webview/e2;", "", "commentId", "commentPermalink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Share extends e2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String commentId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String commentPermalink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Share(String commentId, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(commentId, "commentId");
            this.commentId = commentId;
            this.commentPermalink = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCommentId() {
            return this.commentId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCommentPermalink() {
            return this.commentPermalink;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Share)) {
                return false;
            }
            Share share = (Share) other;
            return Intrinsics.areEqual(this.commentId, share.commentId) && Intrinsics.areEqual(this.commentPermalink, share.commentPermalink);
        }

        public int hashCode() {
            int iHashCode = this.commentId.hashCode() * 31;
            String str = this.commentPermalink;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Share(commentId=" + this.commentId + ", commentPermalink=" + this.commentPermalink + ")";
        }
    }

    public /* synthetic */ e2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e2() {
    }
}
