package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface AFd1vSDK {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class AFa1zSDK {
        public final String AFAdRevenueData;
        public final float getCurrencyIso4217Code;

        public AFa1zSDK(float f11, String str) {
            this.getCurrencyIso4217Code = f11;
            this.AFAdRevenueData = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1zSDK)) {
                return false;
            }
            AFa1zSDK aFa1zSDK = (AFa1zSDK) obj;
            return Float.compare(this.getCurrencyIso4217Code, aFa1zSDK.getCurrencyIso4217Code) == 0 && Intrinsics.areEqual(this.AFAdRevenueData, aFa1zSDK.AFAdRevenueData);
        }

        public final int hashCode() {
            int iHashCode = Float.hashCode(this.getCurrencyIso4217Code) * 31;
            String str = this.AFAdRevenueData;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            return "BatteryData(level=" + this.getCurrencyIso4217Code + ", charging=" + this.AFAdRevenueData + ")";
        }
    }

    @NotNull
    AFa1zSDK AFAdRevenueData(@NotNull Context context);
}
