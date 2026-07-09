package com.nytimes.android.subauth.core.database.purchase;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private final String campaignCode;
    private final Boolean isAutoRenewing;
    private final String orderId;
    private final String originalJson;
    private final String packageName;
    private final Long purchaseTime;
    private final String receipt;

    @NotNull
    private final String sku;

    public a(@NotNull String sku, String str, String str2, String str3, String str4, Long l11, Boolean bool, String str5) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.sku = sku;
        this.receipt = str;
        this.packageName = str2;
        this.campaignCode = str3;
        this.orderId = str4;
        this.purchaseTime = l11;
        this.isAutoRenewing = bool;
        this.originalJson = str5;
    }

    public final String a() {
        return this.campaignCode;
    }

    public final String b() {
        return this.orderId;
    }

    public final String c() {
        return this.originalJson;
    }

    public final String d() {
        return this.packageName;
    }

    public final Long e() {
        return this.purchaseTime;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.sku, aVar.sku) && Intrinsics.areEqual(this.receipt, aVar.receipt) && Intrinsics.areEqual(this.packageName, aVar.packageName) && Intrinsics.areEqual(this.campaignCode, aVar.campaignCode) && Intrinsics.areEqual(this.orderId, aVar.orderId) && Intrinsics.areEqual(this.purchaseTime, aVar.purchaseTime) && Intrinsics.areEqual(this.isAutoRenewing, aVar.isAutoRenewing) && Intrinsics.areEqual(this.originalJson, aVar.originalJson);
    }

    public final String f() {
        return this.receipt;
    }

    public final String g() {
        return this.sku;
    }

    public final Boolean h() {
        return this.isAutoRenewing;
    }

    public int hashCode() {
        int iHashCode = this.sku.hashCode() * 31;
        String str = this.receipt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.packageName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.campaignCode;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l11 = this.purchaseTime;
        int iHashCode6 = (iHashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.isAutoRenewing;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.originalJson;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "SkuPurchase(sku=" + this.sku + ", receipt=" + this.receipt + ", packageName=" + this.packageName + ", campaignCode=" + this.campaignCode + ", orderId=" + this.orderId + ", purchaseTime=" + this.purchaseTime + ", isAutoRenewing=" + this.isAutoRenewing + ", originalJson=" + this.originalJson + ")";
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, Long l11, Boolean bool, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : l11, (i11 & 64) != 0 ? null : bool, (i11 & 128) != 0 ? null : str6);
    }
}
