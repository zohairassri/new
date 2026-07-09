package com.theathletic.podcast.downloaded.ui;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.ui.d1;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.theathletic.podcast.downloaded.ui.h, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/theathletic/podcast/downloaded/ui/h;", "Lcom/theathletic/ui/d1;", "", "downloadedSize", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/String;", "getStableId", "stableId", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PodcastDownloadedSizeItem implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float downloadedSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String stableId = "DOWNLOADED_SIZE";

    public PodcastDownloadedSizeItem(float f11) {
        this.downloadedSize = f11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getDownloadedSize() {
        return this.downloadedSize;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PodcastDownloadedSizeItem) && Float.compare(this.downloadedSize, ((PodcastDownloadedSizeItem) other).downloadedSize) == 0;
    }

    @Override // com.theathletic.ui.d1
    public String getStableId() {
        return this.stableId;
    }

    public int hashCode() {
        return Float.hashCode(this.downloadedSize);
    }

    public String toString() {
        return "PodcastDownloadedSizeItem(downloadedSize=" + this.downloadedSize + ")";
    }
}
