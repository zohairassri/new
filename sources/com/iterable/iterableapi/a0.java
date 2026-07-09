package com.iterable.iterableapi;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f47616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f47617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f47618f;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f47620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f47621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f47622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f47623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f47624f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f47625g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f47626h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final c f47627i;

        a(JSONObject jSONObject) {
            this.f47619a = jSONObject.optString("identifier");
            this.f47620b = jSONObject.optString("title");
            this.f47621c = jSONObject.optString("buttonType", "default");
            this.f47622d = jSONObject.optBoolean("openApp", true);
            this.f47623e = jSONObject.optBoolean("requiresUnlock", true);
            this.f47624f = jSONObject.optInt("icon", 0);
            this.f47625g = jSONObject.optString("inputPlaceholder");
            this.f47626h = jSONObject.optString("inputTitle");
            this.f47627i = c.c(jSONObject.optJSONObject("action"));
        }
    }

    a0(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f47613a = jSONObject.optInt("campaignId");
            this.f47614b = jSONObject.optInt("templateId");
            this.f47615c = jSONObject.optString("messageId");
            this.f47616d = jSONObject.optBoolean("isGhostPush");
            this.f47617e = c.c(jSONObject.optJSONObject("defaultAction"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("actionButtons");
            if (jSONArrayOptJSONArray != null) {
                this.f47618f = new ArrayList();
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    this.f47618f.add(new a(jSONArrayOptJSONArray.getJSONObject(i11)));
                }
            }
        } catch (JSONException e11) {
            x.b("IterableNoticationData", e11.toString());
        }
    }

    public a a(String str) {
        for (a aVar : this.f47618f) {
            if (aVar.f47619a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    public List b() {
        return this.f47618f;
    }

    public int c() {
        return this.f47613a;
    }

    public c d() {
        return this.f47617e;
    }

    public boolean e() {
        return this.f47616d;
    }

    public String f() {
        return this.f47615c;
    }

    public int g() {
        return this.f47614b;
    }

    a0(Bundle bundle) {
        this(bundle.getString("itbl"));
    }
}
