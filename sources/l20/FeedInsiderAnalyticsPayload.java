package l20;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l20.k, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0017"}, d2 = {"Ll20/k;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAuthorId", "authorId", QueryKeys.PAGE_LOAD_TIME, QueryKeys.IDLING, "getModuleIndex", "moduleIndex", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "getHIndex", "hIndex", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeedInsiderAnalyticsPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authorId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int moduleIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int hIndex;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedInsiderAnalyticsPayload)) {
            return false;
        }
        FeedInsiderAnalyticsPayload feedInsiderAnalyticsPayload = (FeedInsiderAnalyticsPayload) other;
        return Intrinsics.areEqual(this.authorId, feedInsiderAnalyticsPayload.authorId) && this.moduleIndex == feedInsiderAnalyticsPayload.moduleIndex && this.hIndex == feedInsiderAnalyticsPayload.hIndex;
    }

    public int hashCode() {
        return (((this.authorId.hashCode() * 31) + Integer.hashCode(this.moduleIndex)) * 31) + Integer.hashCode(this.hIndex);
    }

    public String toString() {
        return "FeedInsiderAnalyticsPayload(authorId=" + this.authorId + ", moduleIndex=" + this.moduleIndex + ", hIndex=" + this.hIndex + ")";
    }
}
