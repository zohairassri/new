package com.appsflyer.internal;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\t\u0010\fj\u0002\b\rj\u0002\b\u0010"}, d2 = {"Lcom/appsflyer/internal/AFg1hSDK;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getRevenue", QueryKeys.MEMFLY_API_VERSION, "AFAdRevenueData", "()Z", "getMediationNetwork", "Ljava/lang/String;", "getMonetizationNetwork", "getCurrencyIso4217Code"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum AFg1hSDK {
    IS_SAMSUNG_PRELOAD_REFERRER_COLLECTION_ENABLED("isSamsungPreloadReferrerEnabled", false),
    IS_PLAY_INTEGRITY_DATA_COLLECTION_ENABLED("isPlayIntegrityDataCollectionEnabled", true);


    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    private final String getRevenue;
    private final boolean getMonetizationNetwork = false;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    private final boolean getMediationNetwork;

    AFg1hSDK(String str, boolean z11) {
        this.getRevenue = str;
        this.getMediationNetwork = z11;
    }

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from getter */
    public final boolean getGetMediationNetwork() {
        return this.getMediationNetwork;
    }

    /* JADX INFO: renamed from: getRevenue, reason: from getter */
    public final boolean getGetMonetizationNetwork() {
        return this.getMonetizationNetwork;
    }
}
