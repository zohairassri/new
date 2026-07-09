package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class uy2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f36505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f36506d;

    uy2(JsonReader jsonReader) {
        JSONObject jSONObjectD = bm.o0.d(jsonReader);
        this.f36506d = jSONObjectD;
        this.f36503a = jSONObjectD.optString("ad_html", null);
        this.f36504b = jSONObjectD.optString("ad_base_url", null);
        this.f36505c = jSONObjectD.optJSONObject("ad_json");
    }
}
