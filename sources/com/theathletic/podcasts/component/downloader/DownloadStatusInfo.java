package com.theathletic.podcasts.component.downloader;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.podcasts.component.downloader.b, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R\u0017\u0010\u001f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u0007¨\u0006 "}, d2 = {"Lcom/theathletic/podcasts/component/downloader/b;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.IDLING, "getStatus", "status", "", QueryKeys.PAGE_LOAD_TIME, "J", "getDownloadedBytes", "()J", "downloadedBytes", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "getTotalBytes", "totalBytes", QueryKeys.SUBDOMAIN, "Ljava/lang/String;", "getLocalUri", "localUri", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "getReason", "reason", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DownloadStatusInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long downloadedBytes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long totalBytes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String localUri;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int reason;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadStatusInfo)) {
            return false;
        }
        DownloadStatusInfo downloadStatusInfo = (DownloadStatusInfo) other;
        return this.status == downloadStatusInfo.status && this.downloadedBytes == downloadStatusInfo.downloadedBytes && this.totalBytes == downloadStatusInfo.totalBytes && Intrinsics.areEqual(this.localUri, downloadStatusInfo.localUri) && this.reason == downloadStatusInfo.reason;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.status) * 31) + Long.hashCode(this.downloadedBytes)) * 31) + Long.hashCode(this.totalBytes)) * 31;
        String str = this.localUri;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.reason);
    }

    public String toString() {
        return "DownloadStatusInfo(status=" + this.status + ", downloadedBytes=" + this.downloadedBytes + ", totalBytes=" + this.totalBytes + ", localUri=" + this.localUri + ", reason=" + this.reason + ")";
    }
}
