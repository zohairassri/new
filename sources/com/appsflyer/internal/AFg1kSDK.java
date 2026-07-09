package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface AFg1kSDK {
    Long AFAdRevenueData();

    void AFAdRevenueData(@NotNull AFa1oSDK aFa1oSDK);

    void AFAdRevenueData(@NotNull Map<String, Object> map);

    long getCurrencyIso4217Code();

    void getCurrencyIso4217Code(@NotNull AFa1oSDK aFa1oSDK);

    void getCurrencyIso4217Code(@NotNull Map<String, Object> map);

    void getCurrencyIso4217Code(@NotNull Map<String, Object> map, int i11, int i12);

    void getMediationNetwork(@NotNull AFa1oSDK aFa1oSDK);

    void getMediationNetwork(@NotNull Map<String, Object> map);

    void getMonetizationNetwork(@NotNull AFa1oSDK aFa1oSDK);

    void getMonetizationNetwork(@NotNull Map<String, Object> map, int i11);
}
