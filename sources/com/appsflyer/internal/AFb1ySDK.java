package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AFb1ySDK implements AFa1aSDK {

    @NotNull
    private Map<String, String> getRevenue = new LinkedHashMap();

    @Override // com.appsflyer.internal.AFa1aSDK
    @NotNull
    public final Map<String, String> getCurrencyIso4217Code(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (this.getRevenue.isEmpty()) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i11 = resources.getConfiguration().screenLayout & 15;
            this.getRevenue.put("xdp", String.valueOf(displayMetrics.xdpi));
            this.getRevenue.put("ydp", String.valueOf(displayMetrics.ydpi));
            this.getRevenue.put("x_px", String.valueOf(displayMetrics.widthPixels));
            this.getRevenue.put("y_px", String.valueOf(displayMetrics.heightPixels));
            this.getRevenue.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            this.getRevenue.put("size", String.valueOf(i11));
        }
        return this.getRevenue;
    }
}
