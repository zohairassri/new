package com.appsflyer.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AFh1dSDK {
    public final long AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final int getMediationNetwork;
    public final int getMonetizationNetwork;

    public AFh1dSDK(String str, int i11, int i12, long j11) {
        this.getCurrencyIso4217Code = str;
        this.getMediationNetwork = i11;
        this.getMonetizationNetwork = i12;
        this.AFAdRevenueData = j11;
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && AFh1dSDK.class == obj.getClass()) {
            AFh1dSDK aFh1dSDK = (AFh1dSDK) obj;
            if (this.getMediationNetwork == aFh1dSDK.getMediationNetwork && this.getMonetizationNetwork == aFh1dSDK.getMonetizationNetwork && this.AFAdRevenueData == aFh1dSDK.AFAdRevenueData && (str = this.getCurrencyIso4217Code) != null && str.equals(aFh1dSDK.getCurrencyIso4217Code)) {
                return true;
            }
        }
        return false;
    }

    public final String getRevenue() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.getCurrencyIso4217Code);
            jSONObject.put("min", this.getMediationNetwork);
            jSONObject.put("expire", this.getMonetizationNetwork);
            jSONObject.put("ttl", this.AFAdRevenueData);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final int hashCode() {
        String str = this.getCurrencyIso4217Code;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.getMediationNetwork) * 31) + this.getMonetizationNetwork) * 31) + ((int) this.AFAdRevenueData);
    }
}
