package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AFh1mSDK {
    public final Intent getCurrencyIso4217Code;
    public final String getMonetizationNetwork;

    @NotNull
    public final String getRevenue;

    public AFh1mSDK(@NotNull Activity activity, @NotNull AFi1mSDK aFi1mSDK) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(aFi1mSDK, "");
        this.getCurrencyIso4217Code = activity.getIntent();
        this.getRevenue = aFi1mSDK.getCurrencyIso4217Code(activity);
        this.getMonetizationNetwork = aFi1mSDK.getMediationNetwork(activity);
    }
}
