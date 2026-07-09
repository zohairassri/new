package l20;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.ui.d1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l20.f, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0004R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0004R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0004R\u0017\u0010\"\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0004¨\u0006'"}, d2 = {"Ll20/f;", "Lcom/theathletic/ui/d1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "J", "getId", "()J", "id", QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/String;", "getName", "name", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "getImageUrl", "imageUrl", QueryKeys.SUBDOMAIN, "getDescription", "description", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "getTwitterHandle", "twitterHandle", QueryKeys.VISIT_FREQUENCY, QueryKeys.MEMFLY_API_VERSION, "isUserFollowing", "()Z", QueryKeys.ACCOUNT_ID, "getStableId", "stableId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeedAuthorHeader implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String twitterHandle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isUserFollowing;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String stableId;

    /* JADX INFO: renamed from: l20.f$a */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Ll20/f$a;", "", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedAuthorHeader)) {
            return false;
        }
        FeedAuthorHeader feedAuthorHeader = (FeedAuthorHeader) other;
        return this.id == feedAuthorHeader.id && Intrinsics.areEqual(this.name, feedAuthorHeader.name) && Intrinsics.areEqual(this.imageUrl, feedAuthorHeader.imageUrl) && Intrinsics.areEqual(this.description, feedAuthorHeader.description) && Intrinsics.areEqual(this.twitterHandle, feedAuthorHeader.twitterHandle) && this.isUserFollowing == feedAuthorHeader.isUserFollowing;
    }

    @Override // com.theathletic.ui.d1
    public String getStableId() {
        return this.stableId;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.imageUrl.hashCode()) * 31;
        String str = this.description;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.twitterHandle.hashCode()) * 31) + Boolean.hashCode(this.isUserFollowing);
    }

    public String toString() {
        return "FeedAuthorHeader(id=" + this.id + ", name=" + this.name + ", imageUrl=" + this.imageUrl + ", description=" + this.description + ", twitterHandle=" + this.twitterHandle + ", isUserFollowing=" + this.isUserFollowing + ")";
    }
}
