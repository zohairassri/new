package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AFg1oSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;

    @NotNull
    final String getMediationNetwork;
    final int getMonetizationNetwork;
    final int getRevenue;

    public AFg1oSDK(int i11, int i12, int i13, int i14, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFAdRevenueData = i11;
        this.getRevenue = i12;
        this.getMonetizationNetwork = i13;
        this.getCurrencyIso4217Code = i14;
        this.getMediationNetwork = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1oSDK)) {
            return false;
        }
        AFg1oSDK aFg1oSDK = (AFg1oSDK) obj;
        return this.AFAdRevenueData == aFg1oSDK.AFAdRevenueData && this.getRevenue == aFg1oSDK.getRevenue && this.getMonetizationNetwork == aFg1oSDK.getMonetizationNetwork && this.getCurrencyIso4217Code == aFg1oSDK.getCurrencyIso4217Code && Intrinsics.areEqual(this.getMediationNetwork, aFg1oSDK.getMediationNetwork);
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.AFAdRevenueData) * 31) + Integer.hashCode(this.getRevenue)) * 31) + Integer.hashCode(this.getMonetizationNetwork)) * 31) + Integer.hashCode(this.getCurrencyIso4217Code)) * 31) + this.getMediationNetwork.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CmpTcfData(policyVersion=" + this.AFAdRevenueData + ", gdprApplies=" + this.getRevenue + ", cmpSdkId=" + this.getMonetizationNetwork + ", cmpSdkVersion=" + this.getCurrencyIso4217Code + ", tcString=" + this.getMediationNetwork + ")";
    }
}
