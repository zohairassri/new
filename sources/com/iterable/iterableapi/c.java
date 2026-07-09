package com.iterable.iterableapi;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f47634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f47635b;

    private c(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f47634a = jSONObject;
        } else {
            this.f47634a = new JSONObject();
        }
    }

    static c a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", str);
            return new c(jSONObject);
        } catch (JSONException unused) {
            return null;
        }
    }

    static c b(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "openUrl");
            jSONObject.put("data", str);
            return new c(jSONObject);
        } catch (JSONException unused) {
            return null;
        }
    }

    static c c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return new c(jSONObject);
        }
        return null;
    }

    public String d() {
        return this.f47634a.optString("data", null);
    }

    public String e() {
        return this.f47634a.optString("type", null);
    }

    public boolean f(String str) {
        return e() != null && e().equals(str);
    }
}
