package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface AFb1uSDK {
    String AFAdRevenueData(@NotNull AFb1kSDK aFb1kSDK);

    boolean AFAdRevenueData(String str);

    void getCurrencyIso4217Code();

    @NotNull
    List<AFb1kSDK> getMediationNetwork();

    void getMonetizationNetwork();
}
