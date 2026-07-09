package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1kSDK;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ParsingException extends IOException {

    @NonNull
    private final AFe1kSDK<String> getRevenue;

    public ParsingException(String str, Throwable th2, @NonNull AFe1kSDK<String> aFe1kSDK) {
        super(str, th2);
        this.getRevenue = aFe1kSDK;
    }

    @NonNull
    public AFe1kSDK<String> getRawResponse() {
        return this.getRevenue;
    }
}
