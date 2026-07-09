package com.theathletic.billing;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\f\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/theathletic/billing/h;", "", "", QueryKeys.SUBDOMAIN, "()Ljava/lang/String;", "sku", QueryKeys.PAGE_LOAD_TIME, "subscriptionPeriod", "a", "priceCurrencyCode", "getPrice", "price", "", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()J", "priceAmountMicros", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "introductoryPrice", QueryKeys.VISIT_FREQUENCY, "introductoryPriceAmountMicros", QueryKeys.ACCOUNT_ID, "introductoryPricePeriod", QueryKeys.HOST, "freeTrialPeriod", "billing_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h {
    String a();

    String b();

    long c();

    String d();

    String e();

    long f();

    String g();

    String getPrice();

    String h();
}
