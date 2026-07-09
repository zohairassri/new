package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f18607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f18609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f18610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f18611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f18612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f18613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f18614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f18615j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f18616k;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f18617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18618b;

        a(JSONObject jSONObject) {
            this.f18617a = jSONObject.getInt("commitmentPaymentsCount");
            this.f18618b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f18619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f18620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f18621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f18622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f18623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final o1 f18624f;

        b(JSONObject jSONObject) throws JSONException {
            this.f18619a = jSONObject.optString("formattedPrice");
            this.f18620b = jSONObject.optLong("priceAmountMicros");
            this.f18621c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f18622d = true == strOptString.isEmpty() ? null : strOptString;
            jSONObject.optString("offerId").getClass();
            jSONObject.optString("purchaseOptionId").getClass();
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i11));
                }
            }
            com.google.android.gms.internal.play_billing.f1.s(arrayList);
            if (jSONObject.has("fullPriceMicros")) {
                jSONObject.optLong("fullPriceMicros");
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.getInt("percentageDiscount");
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getLong("startTimeMillis");
                jSONObjectOptJSONObject2.getLong("endTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject3.getInt("maximumQuantity");
                jSONObjectOptJSONObject3.getInt("remainingQuantity");
            }
            this.f18623e = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
                jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            if (jSONObjectOptJSONObject5 != null) {
                jSONObjectOptJSONObject5.getString("rentalPeriod");
                jSONObjectOptJSONObject5.optString("rentalExpirationPeriod").getClass();
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f18624f = jSONObjectOptJSONObject6 != null ? new o1(jSONObjectOptJSONObject6) : null;
        }

        public String a() {
            return this.f18619a;
        }

        public long b() {
            return this.f18620b;
        }

        public String c() {
            return this.f18621c;
        }

        public final o1 d() {
            return this.f18624f;
        }

        public final String e() {
            return this.f18622d;
        }

        final String f() {
            return this.f18623e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f18625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f18626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f18627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f18628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f18629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f18630f;

        c(JSONObject jSONObject) {
            this.f18628d = jSONObject.optString("billingPeriod");
            this.f18627c = jSONObject.optString("priceCurrencyCode");
            this.f18625a = jSONObject.optString("formattedPrice");
            this.f18626b = jSONObject.optLong("priceAmountMicros");
            this.f18630f = jSONObject.optInt("recurrenceMode");
            this.f18629e = jSONObject.optInt("billingCycleCount");
        }

        public int a() {
            return this.f18629e;
        }

        public String b() {
            return this.f18628d;
        }

        public String c() {
            return this.f18625a;
        }

        public long d() {
            return this.f18626b;
        }

        public String e() {
            return this.f18627c;
        }

        public int f() {
            return this.f18630f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f18631a;

        d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new c(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f18631a = arrayList;
        }

        public List a() {
            return this.f18631a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f18632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f18633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f18634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f18635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f18636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final a f18637f;

        e(JSONObject jSONObject) throws JSONException {
            this.f18632a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f18633b = true == strOptString.isEmpty() ? null : strOptString;
            this.f18634c = jSONObject.getString("offerIdToken");
            this.f18635d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f18637f = jSONObjectOptJSONObject != null ? new a(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString("productId");
                jSONObjectOptJSONObject2.optString("title");
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new c(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i11));
                }
            }
            this.f18636e = arrayList;
        }

        public String a() {
            return this.f18632a;
        }

        public String b() {
            return this.f18633b;
        }

        public List c() {
            return this.f18636e;
        }

        public String d() {
            return this.f18634c;
        }

        public d e() {
            return this.f18635d;
        }
    }

    n(String str) {
        this.f18606a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f18607b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f18608c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f18609d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f18610e = jSONObject.optString("title");
        this.f18611f = jSONObject.optString("name");
        this.f18612g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f18613h = jSONObject.optString("skuDetailsToken");
        this.f18614i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                arrayList.add(new e(jSONArrayOptJSONArray.getJSONObject(i11)));
            }
            this.f18615j = arrayList;
        } else {
            this.f18615j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f18607b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f18607b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                arrayList2.add(new b(jSONArrayOptJSONArray2.getJSONObject(i12)));
            }
            this.f18616k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f18616k = null;
        } else {
            arrayList2.add(new b(jSONObjectOptJSONObject));
            this.f18616k = arrayList2;
        }
    }

    public String a() {
        return this.f18612g;
    }

    public String b() {
        return this.f18611f;
    }

    public b c() {
        List list = this.f18616k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) this.f18616k.get(0);
    }

    public String d() {
        return this.f18608c;
    }

    public String e() {
        return this.f18609d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return TextUtils.equals(this.f18606a, ((n) obj).f18606a);
        }
        return false;
    }

    public List f() {
        return this.f18615j;
    }

    public String g() {
        return this.f18610e;
    }

    public final String h() {
        return this.f18607b.optString("packageName");
    }

    public int hashCode() {
        return this.f18606a.hashCode();
    }

    final String i() {
        return this.f18613h;
    }

    public String j() {
        return this.f18614i;
    }

    final List k() {
        return this.f18616k;
    }

    public String toString() {
        List list = this.f18615j;
        return "ProductDetails{jsonString='" + this.f18606a + "', parsedJson=" + this.f18607b.toString() + ", productId='" + this.f18608c + "', productType='" + this.f18609d + "', title='" + this.f18610e + "', productDetailsToken='" + this.f18613h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
