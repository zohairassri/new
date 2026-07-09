package com.iterable.iterableapi;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f47704a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f47706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final JSONObject f47707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final String f47708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f47709f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ds.g f47711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ds.i f47712i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f47710g = b.f47713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f47705b = null;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f47713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f47714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f47715c;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        enum a extends b {
            a(String str, int i11) {
                super(str, i11);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Online";
            }
        }

        /* JADX INFO: renamed from: com.iterable.iterableapi.i$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        enum C0355b extends b {
            C0355b(String str, int i11) {
                super(str, i11);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Offline";
            }
        }

        static {
            a aVar = new a("ONLINE", 0);
            f47713a = aVar;
            C0355b c0355b = new C0355b("OFFLINE", 1);
            f47714b = c0355b;
            f47715c = new b[]{aVar, c0355b};
        }

        private b(String str, int i11) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f47715c.clone();
        }
    }

    i(String str, String str2, JSONObject jSONObject, String str3, String str4, ds.i iVar, ds.f fVar) {
        this.f47704a = str;
        this.f47706c = str2;
        this.f47707d = jSONObject;
        this.f47708e = str3;
        this.f47709f = str4;
        this.f47712i = iVar;
    }

    static i a(JSONObject jSONObject, ds.i iVar, ds.f fVar) {
        try {
            return new i(jSONObject.getString("apiKey"), jSONObject.getString("resourcePath"), jSONObject.getJSONObject("data"), jSONObject.getString("requestType"), jSONObject.has("authToken") ? jSONObject.getString("authToken") : "", iVar, fVar);
        } catch (JSONException unused) {
            x.b("IterableApiRequest", "Failed to create Iterable request from JSON");
            return null;
        }
    }

    public b b() {
        return this.f47710g;
    }

    void c(b bVar) {
        this.f47710g = bVar;
    }

    public JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("apiKey", this.f47704a);
        jSONObject.put("resourcePath", this.f47706c);
        jSONObject.put("authToken", this.f47709f);
        jSONObject.put("requestType", this.f47708e);
        jSONObject.put("data", this.f47707d);
        return jSONObject;
    }

    i(String str, String str2, JSONObject jSONObject, String str3, String str4, ds.g gVar) {
        this.f47704a = str;
        this.f47706c = str2;
        this.f47707d = jSONObject;
        this.f47708e = str3;
        this.f47709f = str4;
        this.f47711h = gVar;
    }
}
