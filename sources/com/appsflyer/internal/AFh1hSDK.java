package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AFh1hSDK extends AFa1oSDK {
    public final AFf1zSDK equals;

    @Deprecated
    public AFh1hSDK() {
        this.equals = null;
    }

    @Override // com.appsflyer.internal.AFa1oSDK
    public final AFf1zSDK getCurrencyIso4217Code() {
        AFf1zSDK aFf1zSDK = this.equals;
        return aFf1zSDK != null ? aFf1zSDK : AFf1zSDK.CACHED_EVENT;
    }

    public AFh1hSDK(String str, byte[] bArr, String str2, AFf1zSDK aFf1zSDK) {
        super(null, str, Boolean.FALSE);
        this.getMonetizationNetwork = str2;
        AFAdRevenueData(bArr);
        this.equals = aFf1zSDK;
    }
}
