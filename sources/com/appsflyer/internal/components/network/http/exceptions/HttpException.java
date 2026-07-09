package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1nSDK;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class HttpException extends IOException {
    private final AFe1nSDK AFAdRevenueData;

    public HttpException(@NonNull Throwable th2, @NonNull AFe1nSDK aFe1nSDK) {
        super(th2.getMessage(), th2);
        this.AFAdRevenueData = aFe1nSDK;
    }

    @NonNull
    public AFe1nSDK getMetrics() {
        return this.AFAdRevenueData;
    }
}
