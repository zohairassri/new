package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Date f46963h = new Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f46964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f46965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Date f46966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONArray f46967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f46968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f46969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONArray f46970g;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f46971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f46972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private JSONArray f46973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f46974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f46975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private JSONArray f46976f;

        public g a() {
            return new g(this.f46971a, this.f46972b, this.f46973c, this.f46974d, this.f46975e, this.f46976f);
        }

        public b b(Map map) {
            this.f46971a = new JSONObject(map);
            return this;
        }

        public b c(JSONObject jSONObject) {
            try {
                this.f46971a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(JSONArray jSONArray) {
            try {
                this.f46973c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b e(Date date) {
            this.f46972b = date;
            return this;
        }

        public b f(JSONObject jSONObject) {
            try {
                this.f46974d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b g(JSONArray jSONArray) {
            try {
                this.f46976f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b h(long j11) {
            this.f46975e = j11;
            return this;
        }

        private b() {
            this.f46971a = new JSONObject();
            this.f46972b = g.f46963h;
            this.f46973c = new JSONArray();
            this.f46974d = new JSONObject();
            this.f46975e = 0L;
            this.f46976f = new JSONArray();
        }
    }

    static g b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    private Map c() throws JSONException {
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < j().length(); i11++) {
            JSONObject jSONObject = j().getJSONObject(i11);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                String string3 = jSONArray.getString(i12);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
        }
        return map;
    }

    private static g d(JSONObject jSONObject) {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static b l() {
        return new b();
    }

    public JSONArray e() {
        return this.f46967d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f46964a.toString().equals(((g) obj).toString());
        }
        return false;
    }

    public Set f(g gVar) throws JSONException {
        JSONObject jSONObjectG = d(gVar.f46964a).g();
        Map mapC = c();
        Map mapC2 = gVar.c();
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = g().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!gVar.g().has(next)) {
                hashSet.add(next);
            } else if (!g().get(next).equals(gVar.g().get(next))) {
                hashSet.add(next);
            } else if ((i().has(next) && !gVar.i().has(next)) || (!i().has(next) && gVar.i().has(next))) {
                hashSet.add(next);
            } else if (i().has(next) && gVar.i().has(next) && !i().getJSONObject(next).toString().equals(gVar.i().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (mapC.containsKey(next) != mapC2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapC.containsKey(next) && mapC2.containsKey(next) && !((Map) mapC.get(next)).equals(mapC2.get(next))) {
                hashSet.add(next);
            } else {
                jSONObjectG.remove(next);
            }
        }
        Iterator<String> itKeys2 = jSONObjectG.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        return hashSet;
    }

    public JSONObject g() {
        return this.f46965b;
    }

    public Date h() {
        return this.f46966c;
    }

    public int hashCode() {
        return this.f46964a.hashCode();
    }

    public JSONObject i() {
        return this.f46968e;
    }

    public JSONArray j() {
        return this.f46970g;
    }

    public long k() {
        return this.f46969f;
    }

    public String toString() {
        return this.f46964a.toString();
    }

    private g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j11, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j11);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f46965b = jSONObject;
        this.f46966c = date;
        this.f46967d = jSONArray;
        this.f46968e = jSONObject2;
        this.f46969f = j11;
        this.f46970g = jSONArray2;
        this.f46964a = jSONObject3;
    }
}
