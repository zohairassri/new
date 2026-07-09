package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class SkuDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f18461b;

    public SkuDetails(String str) {
        this.f18460a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f18461b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public String a() {
        return this.f18461b.optString("description");
    }

    public String b() {
        return this.f18461b.optString("freeTrialPeriod");
    }

    public String c() {
        return this.f18461b.optString("introductoryPrice");
    }

    public long d() {
        return this.f18461b.optLong("introductoryPriceAmountMicros");
    }

    public int e() {
        return this.f18461b.optInt("introductoryPriceCycles");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f18460a, ((SkuDetails) obj).f18460a);
        }
        return false;
    }

    public String f() {
        return this.f18461b.optString("introductoryPricePeriod");
    }

    public String g() {
        return this.f18461b.optString("price");
    }

    public long h() {
        return this.f18461b.optLong("price_amount_micros");
    }

    public int hashCode() {
        return this.f18460a.hashCode();
    }

    public String i() {
        return this.f18461b.optString("price_currency_code");
    }

    public String j() {
        return this.f18461b.optString("productId");
    }

    public String k() {
        return this.f18461b.optString("subscriptionPeriod");
    }

    public String l() {
        return this.f18461b.optString("title");
    }

    public String m() {
        return this.f18461b.optString("type");
    }

    public int n() {
        return this.f18461b.optInt("offer_type");
    }

    public String o() {
        return this.f18461b.optString("offer_id");
    }

    public String p() {
        String strOptString = this.f18461b.optString("offerIdToken");
        return strOptString.isEmpty() ? this.f18461b.optString("offer_id_token") : strOptString;
    }

    public final String q() {
        return this.f18461b.optString("packageName");
    }

    public String r() {
        return this.f18461b.optString("serializedDocid");
    }

    final String s() {
        return this.f18461b.optString("skuDetailsToken");
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f18460a));
    }
}
