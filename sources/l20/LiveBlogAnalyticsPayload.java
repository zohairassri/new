package l20;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.analytics.AnalyticsPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l20.u, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Ll20/u;", "Lcom/theathletic/analytics/AnalyticsPayload;", "", "pageOrder", "horizontalIndex", "verticalIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPageOrder", QueryKeys.PAGE_LOAD_TIME, "getHorizontalIndex", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "getVerticalIndex", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LiveBlogAnalyticsPayload implements AnalyticsPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pageOrder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String horizontalIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String verticalIndex;

    public LiveBlogAnalyticsPayload() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveBlogAnalyticsPayload)) {
            return false;
        }
        LiveBlogAnalyticsPayload liveBlogAnalyticsPayload = (LiveBlogAnalyticsPayload) other;
        return Intrinsics.areEqual(this.pageOrder, liveBlogAnalyticsPayload.pageOrder) && Intrinsics.areEqual(this.horizontalIndex, liveBlogAnalyticsPayload.horizontalIndex) && Intrinsics.areEqual(this.verticalIndex, liveBlogAnalyticsPayload.verticalIndex);
    }

    public int hashCode() {
        return (((this.pageOrder.hashCode() * 31) + this.horizontalIndex.hashCode()) * 31) + this.verticalIndex.hashCode();
    }

    public String toString() {
        return "LiveBlogAnalyticsPayload(pageOrder=" + this.pageOrder + ", horizontalIndex=" + this.horizontalIndex + ", verticalIndex=" + this.verticalIndex + ")";
    }

    public LiveBlogAnalyticsPayload(String pageOrder, String horizontalIndex, String verticalIndex) {
        Intrinsics.checkNotNullParameter(pageOrder, "pageOrder");
        Intrinsics.checkNotNullParameter(horizontalIndex, "horizontalIndex");
        Intrinsics.checkNotNullParameter(verticalIndex, "verticalIndex");
        this.pageOrder = pageOrder;
        this.horizontalIndex = horizontalIndex;
        this.verticalIndex = verticalIndex;
    }

    public /* synthetic */ LiveBlogAnalyticsPayload(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "-1" : str3);
    }
}
