package com.appsflyer.internal;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface AFb1cSDK {
    void AFAdRevenueData();

    boolean areAllFieldsValid();

    void getCurrencyIso4217Code(@NotNull String str, @NotNull String str2);

    boolean getCurrencyIso4217Code();

    void getMediationNetwork();

    void getMediationNetwork(@NotNull String str, int i11, @NotNull String str2);

    void getMediationNetwork(@NotNull String str, @NotNull String str2);

    void getMediationNetwork(@NotNull String str, @NotNull String... strArr);

    void getMonetizationNetwork();

    void getRevenue();

    void getRevenue(@NotNull Throwable th2);

    void k_(String str, PackageManager packageManager);
}
