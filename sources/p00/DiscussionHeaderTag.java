package p00;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: p00.h, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lp00/h;", "", "", "imageUrl", "", "showImage", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.MEMFLY_API_VERSION, "getShowImage", "()Z", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DiscussionHeaderTag {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showImage;

    /* JADX WARN: Multi-variable type inference failed */
    public DiscussionHeaderTag() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscussionHeaderTag)) {
            return false;
        }
        DiscussionHeaderTag discussionHeaderTag = (DiscussionHeaderTag) other;
        return Intrinsics.areEqual(this.imageUrl, discussionHeaderTag.imageUrl) && this.showImage == discussionHeaderTag.showImage;
    }

    public int hashCode() {
        return (this.imageUrl.hashCode() * 31) + Boolean.hashCode(this.showImage);
    }

    public String toString() {
        return "DiscussionHeaderTag(imageUrl=" + this.imageUrl + ", showImage=" + this.showImage + ")";
    }

    public DiscussionHeaderTag(String imageUrl, boolean z11) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.imageUrl = imageUrl;
        this.showImage = z11;
    }

    public /* synthetic */ DiscussionHeaderTag(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? false : z11);
    }
}
