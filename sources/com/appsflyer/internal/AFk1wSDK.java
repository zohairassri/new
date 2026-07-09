package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AFk1wSDK {
    public String getMediationNetwork;
    public final WeakReference<Context> getRevenue;

    public AFk1wSDK(@NonNull Context context) {
        this.getRevenue = new WeakReference<>(context);
    }
}
