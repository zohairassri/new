package l20;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: renamed from: l20.w, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u0010"}, d2 = {"Ll20/w;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.IDLING, "getModuleIndex", "moduleIndex", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LiveRoomAnalyticsPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int moduleIndex;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LiveRoomAnalyticsPayload) && this.moduleIndex == ((LiveRoomAnalyticsPayload) other).moduleIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.moduleIndex);
    }

    public String toString() {
        return "LiveRoomAnalyticsPayload(moduleIndex=" + this.moduleIndex + ")";
    }
}
