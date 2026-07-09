package l20;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l20.r, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0007R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0004¨\u0006\""}, d2 = {"Ll20/r;", "Lcom/theathletic/ui/l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.IDLING, "getId", "id", "", "Lcom/theathletic/ui/d1;", QueryKeys.PAGE_LOAD_TIME, "Ljava/util/List;", "getCarouselItemModels", "()Ljava/util/List;", "carouselItemModels", "", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SCREEN_WIDTH, "getFirstVisibleIndex", "()S", "firstVisibleIndex", QueryKeys.SUBDOMAIN, "Ljava/lang/String;", "getStableId", "stableId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeedScoresCarousel implements com.theathletic.ui.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List carouselItemModels;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final short firstVisibleIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String stableId;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedScoresCarousel)) {
            return false;
        }
        FeedScoresCarousel feedScoresCarousel = (FeedScoresCarousel) other;
        return this.id == feedScoresCarousel.id && Intrinsics.areEqual(this.carouselItemModels, feedScoresCarousel.carouselItemModels) && this.firstVisibleIndex == feedScoresCarousel.firstVisibleIndex;
    }

    @Override // com.theathletic.ui.d1
    public String getStableId() {
        return this.stableId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.carouselItemModels.hashCode()) * 31) + Short.hashCode(this.firstVisibleIndex);
    }

    public String toString() {
        return "FeedScoresCarousel(id=" + this.id + ", carouselItemModels=" + this.carouselItemModels + ", firstVisibleIndex=" + ((int) this.firstVisibleIndex) + ")";
    }
}
