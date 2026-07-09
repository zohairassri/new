package com.theathletic.billing;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.billing.u, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b#\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b&\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b$\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b\u001d\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b!\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b)\u0010\u0014R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,¨\u0006-"}, d2 = {"Lcom/theathletic/billing/u;", "", "", "googleToken", "", "price", "priceCurrency", "planId", "productSku", "planTerm", "planNum", "", "lastArticleId", "lastPodcastId", "source", "", "isSubPurchase", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/Double;", QueryKeys.ACCOUNT_ID, "()Ljava/lang/Double;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.HOST, QueryKeys.SUBDOMAIN, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.VIEW_TITLE, QueryKeys.VISIT_FREQUENCY, "Ljava/lang/Long;", "()Ljava/lang/Long;", QueryKeys.DECAY, "k", QueryKeys.MEMFLY_API_VERSION, "()Z", "db_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PurchaseDataEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String googleToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double price;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String priceCurrency;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String planId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productSku;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String planTerm;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String planNum;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long lastArticleId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long lastPodcastId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String source;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSubPurchase;

    public PurchaseDataEntity(String googleToken, Double d11, String str, String planId, String productSku, String str2, String planNum, Long l11, Long l12, String str3, boolean z11) {
        Intrinsics.checkNotNullParameter(googleToken, "googleToken");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(productSku, "productSku");
        Intrinsics.checkNotNullParameter(planNum, "planNum");
        this.googleToken = googleToken;
        this.price = d11;
        this.priceCurrency = str;
        this.planId = planId;
        this.productSku = productSku;
        this.planTerm = str2;
        this.planNum = planNum;
        this.lastArticleId = l11;
        this.lastPodcastId = l12;
        this.source = str3;
        this.isSubPurchase = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getGoogleToken() {
        return this.googleToken;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getLastArticleId() {
        return this.lastArticleId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getLastPodcastId() {
        return this.lastPodcastId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPlanNum() {
        return this.planNum;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseDataEntity)) {
            return false;
        }
        PurchaseDataEntity purchaseDataEntity = (PurchaseDataEntity) other;
        return Intrinsics.areEqual(this.googleToken, purchaseDataEntity.googleToken) && Intrinsics.areEqual((Object) this.price, (Object) purchaseDataEntity.price) && Intrinsics.areEqual(this.priceCurrency, purchaseDataEntity.priceCurrency) && Intrinsics.areEqual(this.planId, purchaseDataEntity.planId) && Intrinsics.areEqual(this.productSku, purchaseDataEntity.productSku) && Intrinsics.areEqual(this.planTerm, purchaseDataEntity.planTerm) && Intrinsics.areEqual(this.planNum, purchaseDataEntity.planNum) && Intrinsics.areEqual(this.lastArticleId, purchaseDataEntity.lastArticleId) && Intrinsics.areEqual(this.lastPodcastId, purchaseDataEntity.lastPodcastId) && Intrinsics.areEqual(this.source, purchaseDataEntity.source) && this.isSubPurchase == purchaseDataEntity.isSubPurchase;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPlanTerm() {
        return this.planTerm;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPriceCurrency() {
        return this.priceCurrency;
    }

    public int hashCode() {
        int iHashCode = this.googleToken.hashCode() * 31;
        Double d11 = this.price;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str = this.priceCurrency;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.planId.hashCode()) * 31) + this.productSku.hashCode()) * 31;
        String str2 = this.planTerm;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.planNum.hashCode()) * 31;
        Long l11 = this.lastArticleId;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.lastPodcastId;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str3 = this.source;
        return ((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSubPurchase);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getProductSku() {
        return this.productSku;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsSubPurchase() {
        return this.isSubPurchase;
    }

    public String toString() {
        return "PurchaseDataEntity(googleToken=" + this.googleToken + ", price=" + this.price + ", priceCurrency=" + this.priceCurrency + ", planId=" + this.planId + ", productSku=" + this.productSku + ", planTerm=" + this.planTerm + ", planNum=" + this.planNum + ", lastArticleId=" + this.lastArticleId + ", lastPodcastId=" + this.lastPodcastId + ", source=" + this.source + ", isSubPurchase=" + this.isSubPurchase + ")";
    }

    public /* synthetic */ PurchaseDataEntity(String str, Double d11, String str2, String str3, String str4, String str5, String str6, Long l11, Long l12, String str7, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d11, str2, (i11 & 8) != 0 ? "" : str3, str4, str5, str6, l11, l12, str7, z11);
    }
}
