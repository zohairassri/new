package k70;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.analytics.data.ObjectType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k70.id, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u000eR\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001e\u0010\u001b¨\u0006\u001f"}, d2 = {"Lk70/id;", "", "", "comment", "content_id", "Llc/t0;", "Lk70/se;", "content_type", "parent_id", "platform", ObjectType.TEAM_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Llc/t0;Llc/t0;Ljava/lang/String;Llc/t0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "Llc/t0;", "()Llc/t0;", QueryKeys.SUBDOMAIN, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.VISIT_FREQUENCY, "graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommentInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String comment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String content_id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 content_type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 parent_id;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String platform;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 team_id;

    public CommentInput(String comment, String content_id, lc.t0 content_type, lc.t0 parent_id, String platform, lc.t0 team_id) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(content_id, "content_id");
        Intrinsics.checkNotNullParameter(content_type, "content_type");
        Intrinsics.checkNotNullParameter(parent_id, "parent_id");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(team_id, "team_id");
        this.comment = comment;
        this.content_id = content_id;
        this.content_type = content_type;
        this.parent_id = parent_id;
        this.platform = platform;
        this.team_id = team_id;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContent_id() {
        return this.content_id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final lc.t0 getContent_type() {
        return this.content_type;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final lc.t0 getParent_id() {
        return this.parent_id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentInput)) {
            return false;
        }
        CommentInput commentInput = (CommentInput) other;
        return Intrinsics.areEqual(this.comment, commentInput.comment) && Intrinsics.areEqual(this.content_id, commentInput.content_id) && Intrinsics.areEqual(this.content_type, commentInput.content_type) && Intrinsics.areEqual(this.parent_id, commentInput.parent_id) && Intrinsics.areEqual(this.platform, commentInput.platform) && Intrinsics.areEqual(this.team_id, commentInput.team_id);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final lc.t0 getTeam_id() {
        return this.team_id;
    }

    public int hashCode() {
        return (((((((((this.comment.hashCode() * 31) + this.content_id.hashCode()) * 31) + this.content_type.hashCode()) * 31) + this.parent_id.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.team_id.hashCode();
    }

    public String toString() {
        return "CommentInput(comment=" + this.comment + ", content_id=" + this.content_id + ", content_type=" + this.content_type + ", parent_id=" + this.parent_id + ", platform=" + this.platform + ", team_id=" + this.team_id + ")";
    }
}
