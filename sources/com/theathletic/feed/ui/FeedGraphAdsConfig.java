package com.theathletic.feed.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.feed.ui.r, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0010\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/theathletic/feed/ui/r;", "", "", "shouldImproveImpressions", "", "appVersionName", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.MEMFLY_API_VERSION, QueryKeys.PAGE_LOAD_TIME, "()Z", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeedGraphAdsConfig {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f59096c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldImproveImpressions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appVersionName;

    public FeedGraphAdsConfig(boolean z11, String appVersionName) {
        Intrinsics.checkNotNullParameter(appVersionName, "appVersionName");
        this.shouldImproveImpressions = z11;
        this.appVersionName = appVersionName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAppVersionName() {
        return this.appVersionName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShouldImproveImpressions() {
        return this.shouldImproveImpressions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedGraphAdsConfig)) {
            return false;
        }
        FeedGraphAdsConfig feedGraphAdsConfig = (FeedGraphAdsConfig) other;
        return this.shouldImproveImpressions == feedGraphAdsConfig.shouldImproveImpressions && Intrinsics.areEqual(this.appVersionName, feedGraphAdsConfig.appVersionName);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.shouldImproveImpressions) * 31) + this.appVersionName.hashCode();
    }

    public String toString() {
        return "FeedGraphAdsConfig(shouldImproveImpressions=" + this.shouldImproveImpressions + ", appVersionName=" + this.appVersionName + ")";
    }
}
