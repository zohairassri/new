package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AFi1gSDK {
    public final String AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final long getMonetizationNetwork;
    public final long getRevenue;

    public AFi1gSDK(long j11, long j12, String str, String str2) {
        this.getMonetizationNetwork = j11;
        this.getRevenue = j12;
        this.AFAdRevenueData = str;
        this.getCurrencyIso4217Code = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1gSDK)) {
            return false;
        }
        AFi1gSDK aFi1gSDK = (AFi1gSDK) obj;
        return this.getMonetizationNetwork == aFi1gSDK.getMonetizationNetwork && this.getRevenue == aFi1gSDK.getRevenue && Intrinsics.areEqual(this.AFAdRevenueData, aFi1gSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFi1gSDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        int iHashCode = ((Long.hashCode(this.getMonetizationNetwork) * 31) + Long.hashCode(this.getRevenue)) * 31;
        String str = this.AFAdRevenueData;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.getCurrencyIso4217Code;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PlayIntegrityApiData(piaTimestamp=" + this.getMonetizationNetwork + ", ttrMillis=" + this.getRevenue + ", piaToken=" + this.AFAdRevenueData + ", errorCode=" + this.getCurrencyIso4217Code + ")";
    }
}
