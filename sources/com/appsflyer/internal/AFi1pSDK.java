package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AFi1pSDK {

    @NotNull
    public final String AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final String getMediationNetwork;
    private final boolean getRevenue;

    public AFi1pSDK(@NotNull String str, String str2, String str3, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFAdRevenueData = str;
        this.getMediationNetwork = str2;
        this.getCurrencyIso4217Code = str3;
        this.getRevenue = z11;
    }

    public final boolean getMediationNetwork() {
        return this.getRevenue;
    }
}
