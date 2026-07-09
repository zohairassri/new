package com.theathletic.notifications.ui;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.notifications.ui.u0;
import com.theathletic.ui.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\u000bB%\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/theathletic/notifications/ui/a;", "", "Lcom/theathletic/ui/s0;", "title", "description", "", "isSwitchOn", "<init>", "(Lcom/theathletic/ui/s0;Lcom/theathletic/ui/s0;Z)V", "a", "Lcom/theathletic/ui/s0;", QueryKeys.PAGE_LOAD_TIME, "()Lcom/theathletic/ui/s0;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.MEMFLY_API_VERSION, "()Z", "Lcom/theathletic/notifications/ui/a$a;", "Lcom/theathletic/notifications/ui/a$b;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.theathletic.ui.s0 title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.theathletic.ui.s0 description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isSwitchOn;

    /* JADX INFO: renamed from: com.theathletic.notifications.ui.a$a, reason: collision with other inner class name and from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/theathletic/notifications/ui/a$a;", "Lcom/theathletic/notifications/ui/a;", "", "switchOn", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", QueryKeys.SUBDOMAIN, QueryKeys.MEMFLY_API_VERSION, "getSwitchOn", "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CommentReplies extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean switchOn;

        public CommentReplies(boolean z11) {
            super(new s0.StringWithParams(u0.p.preferences_comment_replies, new Object[0]), null, z11, 2, null);
            this.switchOn = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CommentReplies) && this.switchOn == ((CommentReplies) other).switchOn;
        }

        public int hashCode() {
            return Boolean.hashCode(this.switchOn);
        }

        public String toString() {
            return "CommentReplies(switchOn=" + this.switchOn + ")";
        }
    }

    /* JADX INFO: renamed from: com.theathletic.notifications.ui.a$b, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/theathletic/notifications/ui/a$b;", "Lcom/theathletic/notifications/ui/a;", "", "switchOn", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", QueryKeys.SUBDOMAIN, QueryKeys.MEMFLY_API_VERSION, "getSwitchOn", "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopSportsNews extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean switchOn;

        public TopSportsNews(boolean z11) {
            super(new s0.StringWithParams(u0.p.preferences_top_sports_news, new Object[0]), new s0.StringWithParams(u0.p.preferences_top_sports_news_description, new Object[0]), z11, null);
            this.switchOn = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TopSportsNews) && this.switchOn == ((TopSportsNews) other).switchOn;
        }

        public int hashCode() {
            return Boolean.hashCode(this.switchOn);
        }

        public String toString() {
            return "TopSportsNews(switchOn=" + this.switchOn + ")";
        }
    }

    public /* synthetic */ a(com.theathletic.ui.s0 s0Var, com.theathletic.ui.s0 s0Var2, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(s0Var, s0Var2, z11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.theathletic.ui.s0 getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.theathletic.ui.s0 getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSwitchOn() {
        return this.isSwitchOn;
    }

    private a(com.theathletic.ui.s0 s0Var, com.theathletic.ui.s0 s0Var2, boolean z11) {
        this.title = s0Var;
        this.description = s0Var2;
        this.isSwitchOn = z11;
    }

    public /* synthetic */ a(com.theathletic.ui.s0 s0Var, com.theathletic.ui.s0 s0Var2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(s0Var, (i11 & 2) != 0 ? null : s0Var2, z11, null);
    }
}
