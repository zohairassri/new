package com.iterable.iterableapi;

import android.graphics.Rect;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f47867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f47868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Date f47869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Date f47870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f47871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f47872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Boolean f47873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d f47874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Long f47875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f47876k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f47877l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f47878m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f47879n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f47880o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private w f47881p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private e f47882q;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f47884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f47885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f47886d;

        a(String str, Rect rect, double d11, boolean z11, c cVar) {
            this.f47883a = str;
            this.f47884b = rect;
            this.f47885c = d11;
            this.f47886d = cVar;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return w4.c.a(this.f47883a, aVar.f47883a) && w4.c.a(this.f47884b, aVar.f47884b) && this.f47885c == aVar.f47885c;
        }

        public int hashCode() {
            return w4.c.b(this.f47883a, this.f47884b, Double.valueOf(this.f47885c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f47887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f47888b;

        public b(String str, double d11) {
            this.f47887a = str;
            this.f47888b = d11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f47889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b f47890b;

        public c(boolean z11, b bVar) {
            this.f47889a = z11;
            this.f47890b = bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f47892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f47893c;

        public d(String str, String str2, String str3) {
            this.f47891a = str;
            this.f47892b = str2;
            this.f47893c = str3;
        }

        static d a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new d(jSONObject.optString("title"), jSONObject.optString("subtitle"), jSONObject.optString("icon"));
        }

        JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("title", this.f47891a);
                jSONObject.putOpt("subtitle", this.f47892b);
                jSONObject.putOpt("icon", this.f47893c);
                return jSONObject;
            } catch (JSONException e11) {
                x.c("IterableInAppMessage", "Error while serializing inbox metadata", e11);
                return jSONObject;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return w4.c.a(this.f47891a, dVar.f47891a) && w4.c.a(this.f47892b, dVar.f47892b) && w4.c.a(this.f47893c, dVar.f47893c);
        }

        public int hashCode() {
            return w4.c.b(this.f47891a, this.f47892b, this.f47893c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    interface e {
        void e(v vVar);
    }

    v(String str, a aVar, JSONObject jSONObject, Date date, Date date2, f fVar, Double d11, Boolean bool, d dVar, Long l11) {
        this.f47866a = str;
        this.f47867b = aVar;
        this.f47868c = jSONObject;
        this.f47869d = date;
        this.f47870e = date2;
        this.f47871f = fVar;
        this.f47872g = d11.doubleValue();
        this.f47873h = bool;
        this.f47874i = dVar;
        this.f47875j = l11;
    }

    static int a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        if ("AutoExpand".equalsIgnoreCase(jSONObject.optString("displayOption"))) {
            return -1;
        }
        return jSONObject.optInt("percentage", 0);
    }

    static JSONObject b(int i11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (i11 == -1) {
            jSONObject.putOpt("displayOption", "AutoExpand");
            return jSONObject;
        }
        jSONObject.putOpt("percentage", Integer.valueOf(i11));
        return jSONObject;
    }

    static JSONObject c(Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("top", b(rect.top));
        jSONObject.putOpt("left", b(rect.left));
        jSONObject.putOpt("bottom", b(rect.bottom));
        jSONObject.putOpt("right", b(rect.right));
        return jSONObject;
    }

    static v d(JSONObject jSONObject, w wVar) {
        JSONObject jSONObjectOptJSONObject;
        double dOptDouble;
        String strOptString;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("content")) == null) {
            return null;
        }
        String strOptString2 = jSONObject.optString("messageId");
        Long lJ = n0.j(jSONObject, "campaignId");
        long jOptLong = jSONObject.optLong("createdAt");
        Date date = jOptLong != 0 ? new Date(jOptLong) : null;
        long jOptLong2 = jSONObject.optLong("expiresAt");
        Date date2 = jOptLong2 != 0 ? new Date(jOptLong2) : null;
        String strOptString3 = jSONObjectOptJSONObject.optString("html", null);
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("inAppDisplaySettings");
        Rect rectH = h(jSONObjectOptJSONObject2);
        double dOptDouble2 = jSONObjectOptJSONObject.optDouble("backgroundAlpha", 0.0d);
        boolean zOptBoolean = jSONObjectOptJSONObject2.optBoolean("shouldAnimate", false);
        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("bgColor");
        if (jSONObjectOptJSONObject3 != null) {
            strOptString = jSONObjectOptJSONObject3.optString("hex");
            dOptDouble = jSONObjectOptJSONObject3.optDouble("alpha");
        } else {
            dOptDouble = 0.0d;
            strOptString = null;
        }
        c cVar = new c(zOptBoolean, new b(strOptString, dOptDouble));
        f fVarA = f.a(jSONObject.optJSONObject("trigger"));
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("customPayload");
        if (jSONObjectOptJSONObject4 == null) {
            jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("payload");
        }
        if (jSONObjectOptJSONObject4 == null) {
            jSONObjectOptJSONObject4 = new JSONObject();
        }
        v vVar = new v(strOptString2, new a(strOptString3, rectH, dOptDouble2, zOptBoolean, cVar), jSONObjectOptJSONObject4, date, date2, fVarA, Double.valueOf(jSONObject.optDouble("priorityLevel", 300.5d)), jSONObject.has("saveToInbox") ? Boolean.valueOf(jSONObject.optBoolean("saveToInbox")) : null, d.a(jSONObject.optJSONObject("inboxMetadata")), lJ);
        vVar.f47881p = wVar;
        if (strOptString3 != null) {
            vVar.u(true);
        }
        vVar.f47876k = jSONObject.optBoolean("processed", false);
        vVar.f47877l = jSONObject.optBoolean("consumed", false);
        vVar.f47878m = jSONObject.optBoolean("read", false);
        return vVar;
    }

    static Rect h(JSONObject jSONObject) {
        Rect rect = new Rect();
        rect.top = a(jSONObject.optJSONObject("top"));
        rect.left = a(jSONObject.optJSONObject("left"));
        rect.bottom = a(jSONObject.optJSONObject("bottom"));
        rect.right = a(jSONObject.optJSONObject("right"));
        return rect;
    }

    private void s() {
        e eVar = this.f47882q;
        if (eVar != null) {
            eVar.e(this);
        }
    }

    public a e() {
        a aVar = this.f47867b;
        if (aVar.f47883a == null) {
            aVar.f47883a = this.f47881p.c(this.f47866a);
        }
        return this.f47867b;
    }

    public Date f() {
        return this.f47870e;
    }

    public String g() {
        return this.f47866a;
    }

    public double i() {
        return this.f47872g;
    }

    f.a j() {
        return this.f47871f.f47895b;
    }

    boolean k() {
        return this.f47879n;
    }

    boolean l() {
        return this.f47877l;
    }

    public boolean m() {
        Boolean bool = this.f47873h;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public boolean n() {
        return this.f47880o;
    }

    boolean o() {
        return this.f47876k;
    }

    public boolean p() {
        return this.f47878m;
    }

    public boolean q() {
        return m() && j() == f.a.NEVER;
    }

    public void r(boolean z11) {
        this.f47880o = z11;
    }

    void t(boolean z11) {
        this.f47877l = z11;
        s();
    }

    void u(boolean z11) {
        this.f47879n = z11;
    }

    void v(e eVar) {
        this.f47882q = eVar;
    }

    void w(boolean z11) {
        this.f47876k = z11;
        s();
    }

    void x(boolean z11) {
        this.f47878m = z11;
        s();
    }

    JSONObject y() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.putOpt("messageId", this.f47866a);
            Long l11 = this.f47875j;
            if (l11 != null && n0.h(l11.longValue())) {
                jSONObject.put("campaignId", this.f47875j);
            }
            Date date = this.f47869d;
            if (date != null) {
                jSONObject.putOpt("createdAt", Long.valueOf(date.getTime()));
            }
            Date date2 = this.f47870e;
            if (date2 != null) {
                jSONObject.putOpt("expiresAt", Long.valueOf(date2.getTime()));
            }
            jSONObject.putOpt("trigger", this.f47871f.b());
            jSONObject.putOpt("priorityLevel", Double.valueOf(this.f47872g));
            JSONObject jSONObjectC = c(this.f47867b.f47884b);
            jSONObjectC.put("shouldAnimate", this.f47867b.f47886d.f47889a);
            b bVar = this.f47867b.f47886d.f47890b;
            if (bVar != null && bVar.f47887a != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("alpha", this.f47867b.f47886d.f47890b.f47888b);
                jSONObject3.putOpt("hex", this.f47867b.f47886d.f47890b.f47887a);
                jSONObjectC.put("bgColor", jSONObject3);
            }
            jSONObject2.putOpt("inAppDisplaySettings", jSONObjectC);
            double d11 = this.f47867b.f47885c;
            if (d11 != 0.0d) {
                jSONObject2.putOpt("backgroundAlpha", Double.valueOf(d11));
            }
            jSONObject.putOpt("content", jSONObject2);
            jSONObject.putOpt("customPayload", this.f47868c);
            Object obj = this.f47873h;
            if (obj != null) {
                jSONObject.putOpt("saveToInbox", obj);
            }
            d dVar = this.f47874i;
            if (dVar != null) {
                jSONObject.putOpt("inboxMetadata", dVar.b());
            }
            jSONObject.putOpt("processed", Boolean.valueOf(this.f47876k));
            jSONObject.putOpt("consumed", Boolean.valueOf(this.f47877l));
            jSONObject.putOpt("read", Boolean.valueOf(this.f47878m));
            return jSONObject;
        } catch (JSONException e11) {
            x.c("IterableInAppMessage", "Error while serializing an in-app message", e11);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final JSONObject f47894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a f47895b;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        enum a {
            IMMEDIATE,
            EVENT,
            NEVER
        }

        private f(JSONObject jSONObject) {
            this.f47894a = jSONObject;
            String strOptString = jSONObject.optString("type");
            strOptString.getClass();
            if (strOptString.equals("never")) {
                this.f47895b = a.NEVER;
            } else if (strOptString.equals("immediate")) {
                this.f47895b = a.IMMEDIATE;
            } else {
                this.f47895b = a.NEVER;
            }
        }

        static f a(JSONObject jSONObject) {
            return jSONObject == null ? new f(a.IMMEDIATE) : new f(jSONObject);
        }

        JSONObject b() {
            return this.f47894a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof f) {
                return w4.c.a(this.f47894a, ((f) obj).f47894a);
            }
            return false;
        }

        public int hashCode() {
            return w4.c.b(this.f47894a);
        }

        f(a aVar) {
            this.f47894a = null;
            this.f47895b = aVar;
        }
    }
}
