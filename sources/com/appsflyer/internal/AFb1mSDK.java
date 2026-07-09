package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import io.agora.utils2.internal.CommonUtility;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AFb1mSDK extends AFc1dSDK<String> {
    public AFb1mSDK(Context context, Executor executor) {
        super(context, executor, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1dSDK
    /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
    public String getMonetizationNetwork() throws Throwable {
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = this.getRevenue.getContentResolver();
            StringBuilder sb2 = new StringBuilder(CommonUtility.PREFIX_URI);
            sb2.append(this.AFAdRevenueData);
            Cursor cursorQuery = contentResolver.query(Uri.parse(sb2.toString()), new String[]{"aid"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("aid"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final /* synthetic */ String AFAdRevenueData() {
        this.getCurrencyIso4217Code.execute(this.getMediationNetwork);
        return (String) super.AFAdRevenueData();
    }

    public final String getMediationNetwork() {
        this.getCurrencyIso4217Code.execute(this.getMediationNetwork);
        return (String) super.AFAdRevenueData();
    }
}
