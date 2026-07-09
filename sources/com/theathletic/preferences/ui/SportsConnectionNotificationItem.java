package com.theathletic.preferences.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.theathletic.preferences.ui.n1, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/theathletic/preferences/ui/n1;", "Lcom/theathletic/ui/d1;", "", "title", "imageUrl", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.IDLING, "getTitle", QueryKeys.PAGE_LOAD_TIME, "getImageUrl", "getStableId", "stableId", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SportsConnectionNotificationItem implements com.theathletic.ui.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int imageUrl;

    /* JADX INFO: renamed from: com.theathletic.preferences.ui.n1$a */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/theathletic/preferences/ui/n1$a;", "", "", "z", "()V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void z();
    }

    public SportsConnectionNotificationItem(int i11, int i12) {
        this.title = i11;
        this.imageUrl = i12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportsConnectionNotificationItem)) {
            return false;
        }
        SportsConnectionNotificationItem sportsConnectionNotificationItem = (SportsConnectionNotificationItem) other;
        return this.title == sportsConnectionNotificationItem.title && this.imageUrl == sportsConnectionNotificationItem.imageUrl;
    }

    @Override // com.theathletic.ui.d1
    public String getStableId() {
        return String.valueOf(this.title);
    }

    public int hashCode() {
        return (Integer.hashCode(this.title) * 31) + Integer.hashCode(this.imageUrl);
    }

    public String toString() {
        return "SportsConnectionNotificationItem(title=" + this.title + ", imageUrl=" + this.imageUrl + ")";
    }
}
