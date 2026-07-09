package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class AFe1kSDK<Body> implements ResponseNetwork<Body> {

    @NonNull
    public final AFe1nSDK AFAdRevenueData;

    @NonNull
    private final Body getCurrencyIso4217Code;
    final int getMediationNetwork;

    @NonNull
    final Map<String, List<String>> getMonetizationNetwork;
    final boolean getRevenue;

    public AFe1kSDK(@NonNull Body body, int i11, boolean z11, Map<String, List<String>> map, @NonNull AFe1nSDK aFe1nSDK) {
        this.getCurrencyIso4217Code = body;
        this.getMediationNetwork = i11;
        this.getRevenue = z11;
        this.getMonetizationNetwork = new HashMap(map);
        this.AFAdRevenueData = aFe1nSDK;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1kSDK aFe1kSDK = (AFe1kSDK) obj;
        if (this.getMediationNetwork == aFe1kSDK.getMediationNetwork && this.getRevenue == aFe1kSDK.getRevenue && this.getCurrencyIso4217Code.equals(aFe1kSDK.getCurrencyIso4217Code) && this.getMonetizationNetwork.equals(aFe1kSDK.getMonetizationNetwork)) {
            return this.AFAdRevenueData.equals(aFe1kSDK.AFAdRevenueData);
        }
        return false;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.getMonetizationNetwork.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.getMonetizationNetwork.get(str2);
            }
        }
        return null;
    }

    public final String getRevenue(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb2 = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        return sb2.toString();
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.getMediationNetwork;
    }

    public int hashCode() {
        return (((((((this.getCurrencyIso4217Code.hashCode() * 31) + this.getMediationNetwork) * 31) + (this.getRevenue ? 1 : 0)) * 31) + this.getMonetizationNetwork.hashCode()) * 31) + this.AFAdRevenueData.hashCode();
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.getRevenue;
    }
}
