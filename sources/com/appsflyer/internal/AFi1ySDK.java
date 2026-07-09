package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AFi1ySDK {

    @NonNull
    public final String AFAdRevenueData;
    public final AFi1wSDK component1;
    public final Throwable component2;
    public final String component4;
    public final long getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final int getMonetizationNetwork;
    public final long getRevenue;

    public AFi1ySDK(String str, @NonNull String str2, long j11, long j12, int i11, AFi1wSDK aFi1wSDK, String str3, Throwable th2) {
        this.getMediationNetwork = str;
        this.AFAdRevenueData = str2;
        this.getRevenue = j11;
        this.getCurrencyIso4217Code = j12;
        this.getMonetizationNetwork = i11;
        this.component1 = aFi1wSDK;
        this.component4 = str3;
        this.component2 = th2;
    }
}
