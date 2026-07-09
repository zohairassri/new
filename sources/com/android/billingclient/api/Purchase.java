package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f18459c;

    public Purchase(String str, String str2) {
        this.f18457a = str;
        this.f18458b = str2;
        this.f18459c = new JSONObject(str);
    }

    private final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        if (this.f18459c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f18459c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i11));
                }
            }
        } else if (this.f18459c.has("productId")) {
            arrayList.add(this.f18459c.optString("productId"));
        }
        return arrayList;
    }

    public String a() {
        String strOptString = this.f18459c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public String b() {
        return this.f18457a;
    }

    public String c() {
        return this.f18459c.optString("packageName");
    }

    public List d() {
        return l();
    }

    public int e() {
        return this.f18459c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f18457a, purchase.b()) && TextUtils.equals(this.f18458b, purchase.h());
    }

    public long f() {
        return this.f18459c.optLong("purchaseTime");
    }

    public String g() {
        JSONObject jSONObject = this.f18459c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String h() {
        return this.f18458b;
    }

    public int hashCode() {
        return this.f18457a.hashCode();
    }

    public ArrayList i() {
        return l();
    }

    public boolean j() {
        return this.f18459c.optBoolean("acknowledged", true);
    }

    public boolean k() {
        return this.f18459c.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f18457a));
    }
}
