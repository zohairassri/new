package com.theathletic.comments.ui;

import com.amazonaws.services.s3.internal.Constants;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/theathletic/comments/ui/v;", "", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.VISIT_FREQUENCY, QueryKeys.DECAY, QueryKeys.HOST, QueryKeys.ACCOUNT_ID, "k", "a", QueryKeys.VIEW_TITLE, QueryKeys.SUBDOMAIN, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "Lcom/theathletic/comments/ui/v$a;", "Lcom/theathletic/comments/ui/v$b;", "Lcom/theathletic/comments/ui/v$c;", "Lcom/theathletic/comments/ui/v$d;", "Lcom/theathletic/comments/ui/v$e;", "Lcom/theathletic/comments/ui/v$f;", "Lcom/theathletic/comments/ui/v$g;", "Lcom/theathletic/comments/ui/v$h;", "Lcom/theathletic/comments/ui/v$i;", "Lcom/theathletic/comments/ui/v$j;", "Lcom/theathletic/comments/ui/v$k;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface v {

    /* JADX INFO: renamed from: com.theathletic.comments.ui.v$a, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/theathletic/comments/ui/v$a;", "Lcom/theathletic/comments/ui/v;", "", "commentId", "legacyId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FlagComment implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String commentId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String legacyId;

        public FlagComment(String commentId, String str) {
            Intrinsics.checkNotNullParameter(commentId, "commentId");
            this.commentId = commentId;
            this.legacyId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCommentId() {
            return this.commentId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLegacyId() {
            return this.legacyId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlagComment)) {
                return false;
            }
            FlagComment flagComment = (FlagComment) other;
            return Intrinsics.areEqual(this.commentId, flagComment.commentId) && Intrinsics.areEqual(this.legacyId, flagComment.legacyId);
        }

        public int hashCode() {
            int iHashCode = this.commentId.hashCode() * 31;
            String str = this.legacyId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "FlagComment(commentId=" + this.commentId + ", legacyId=" + this.legacyId + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/comments/ui/v$b;", "Lcom/theathletic/comments/ui/v;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f55608a = new b();

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/comments/ui/v$c;", "Lcom/theathletic/comments/ui/v;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f55609a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.theathletic.comments.ui.v$d, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/theathletic/comments/ui/v$d;", "Lcom/theathletic/comments/ui/v;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "tweetUrl", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenTweet implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String tweetUrl;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTweetUrl() {
            return this.tweetUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenTweet) && Intrinsics.areEqual(this.tweetUrl, ((OpenTweet) other).tweetUrl);
        }

        public int hashCode() {
            return this.tweetUrl.hashCode();
        }

        public String toString() {
            return "OpenTweet(tweetUrl=" + this.tweetUrl + ")";
        }
    }

    /* JADX INFO: renamed from: com.theathletic.comments.ui.v$e, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/theathletic/comments/ui/v$e;", "Lcom/theathletic/comments/ui/v;", "", Constants.URL_ENCODING, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenUrl implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        public OpenUrl(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenUrl) && Intrinsics.areEqual(this.url, ((OpenUrl) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "OpenUrl(url=" + this.url + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/theathletic/comments/ui/v$f;", "Lcom/theathletic/comments/ui/v;", "", "commentLink", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String commentLink;

        public f(String commentLink) {
            Intrinsics.checkNotNullParameter(commentLink, "commentLink");
            this.commentLink = commentLink;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCommentLink() {
            return this.commentLink;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/comments/ui/v$g;", "Lcom/theathletic/comments/ui/v;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f55613a = new g();

        private g() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/comments/ui/v$h;", "Lcom/theathletic/comments/ui/v;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class h implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f55614a = new h();

        private h() {
        }
    }

    /* JADX INFO: renamed from: com.theathletic.comments.ui.v$i, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/theathletic/comments/ui/v$i;", "Lcom/theathletic/comments/ui/v;", "", "stringRes", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.IDLING, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowFeedbackMessage implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int stringRes;

        public ShowFeedbackMessage(int i11) {
            this.stringRes = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getStringRes() {
            return this.stringRes;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowFeedbackMessage) && this.stringRes == ((ShowFeedbackMessage) other).stringRes;
        }

        public int hashCode() {
            return Integer.hashCode(this.stringRes);
        }

        public String toString() {
            return "ShowFeedbackMessage(stringRes=" + this.stringRes + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/comments/ui/v$j;", "Lcom/theathletic/comments/ui/v;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class j implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f55616a = new j();

        private j() {
        }
    }

    /* JADX INFO: renamed from: com.theathletic.comments.ui.v$k, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/theathletic/comments/ui/v$k;", "Lcom/theathletic/comments/ui/v;", "", "daysLeft", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.IDLING, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowTempBanMessage implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int daysLeft;

        public ShowTempBanMessage(int i11) {
            this.daysLeft = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getDaysLeft() {
            return this.daysLeft;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowTempBanMessage) && this.daysLeft == ((ShowTempBanMessage) other).daysLeft;
        }

        public int hashCode() {
            return Integer.hashCode(this.daysLeft);
        }

        public String toString() {
            return "ShowTempBanMessage(daysLeft=" + this.daysLeft + ")";
        }
    }
}
