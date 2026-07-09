package com.statsig.androidsdk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xr.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/statsig/androidsdk/StatsigOfflineRequest;", "", "timestamp", "", "requestBody", "", "retryCount", "", "(JLjava/lang/String;I)V", "getRequestBody", "()Ljava/lang/String;", "getRetryCount", "()I", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "private-android-sdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class StatsigOfflineRequest {

    @c("requestBody")
    @NotNull
    private final String requestBody;

    @c("retryCount")
    private final int retryCount;

    @c("timestamp")
    private final long timestamp;

    public StatsigOfflineRequest(long j11, @NotNull String requestBody, int i11) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        this.timestamp = j11;
        this.requestBody = requestBody;
        this.retryCount = i11;
    }

    public static /* synthetic */ StatsigOfflineRequest copy$default(StatsigOfflineRequest statsigOfflineRequest, long j11, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = statsigOfflineRequest.timestamp;
        }
        if ((i12 & 2) != 0) {
            str = statsigOfflineRequest.requestBody;
        }
        if ((i12 & 4) != 0) {
            i11 = statsigOfflineRequest.retryCount;
        }
        return statsigOfflineRequest.copy(j11, str, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRequestBody() {
        return this.requestBody;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    @NotNull
    public final StatsigOfflineRequest copy(long timestamp, @NotNull String requestBody, int retryCount) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return new StatsigOfflineRequest(timestamp, requestBody, retryCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatsigOfflineRequest)) {
            return false;
        }
        StatsigOfflineRequest statsigOfflineRequest = (StatsigOfflineRequest) other;
        return this.timestamp == statsigOfflineRequest.timestamp && Intrinsics.areEqual(this.requestBody, statsigOfflineRequest.requestBody) && this.retryCount == statsigOfflineRequest.retryCount;
    }

    @NotNull
    public final String getRequestBody() {
        return this.requestBody;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((Long.hashCode(this.timestamp) * 31) + this.requestBody.hashCode()) * 31) + Integer.hashCode(this.retryCount);
    }

    @NotNull
    public String toString() {
        return "StatsigOfflineRequest(timestamp=" + this.timestamp + ", requestBody=" + this.requestBody + ", retryCount=" + this.retryCount + ')';
    }

    public /* synthetic */ StatsigOfflineRequest(long j11, String str, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, (i12 & 4) != 0 ? 0 : i11);
    }
}
