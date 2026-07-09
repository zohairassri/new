package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface AFd1eSDK {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface AFa1vSDK {
        void onConfigurationChanged(boolean z11);
    }

    void getCurrencyIso4217Code();

    void getCurrencyIso4217Code(AFa1vSDK aFa1vSDK);

    void getMonetizationNetwork();

    void getRevenue(@NonNull Throwable th2, @NonNull String str);
}
