package com.theathletic.podcasts.component.downloader;

import com.amazonaws.services.s3.internal.Constants;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.podcasts.component.downloader.c, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0004R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0004R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u0004R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u0004¨\u0006\u001c"}, d2 = {"Lcom/theathletic/podcasts/component/downloader/c;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "id", QueryKeys.PAGE_LOAD_TIME, "getTitle", "title", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "getUrl", Constants.URL_ENCODING, QueryKeys.SUBDOMAIN, "getDestinationDir", "destinationDir", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "getSubPath", "subPath", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MediaDownloadRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String destinationDir;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subPath;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaDownloadRequest)) {
            return false;
        }
        MediaDownloadRequest mediaDownloadRequest = (MediaDownloadRequest) other;
        return Intrinsics.areEqual(this.id, mediaDownloadRequest.id) && Intrinsics.areEqual(this.title, mediaDownloadRequest.title) && Intrinsics.areEqual(this.url, mediaDownloadRequest.url) && Intrinsics.areEqual(this.destinationDir, mediaDownloadRequest.destinationDir) && Intrinsics.areEqual(this.subPath, mediaDownloadRequest.subPath);
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.url.hashCode()) * 31) + this.destinationDir.hashCode()) * 31) + this.subPath.hashCode();
    }

    public String toString() {
        return "MediaDownloadRequest(id=" + this.id + ", title=" + this.title + ", url=" + this.url + ", destinationDir=" + this.destinationDir + ", subPath=" + this.subPath + ")";
    }
}
