package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.chartbeat.androidsdk.QueryKeys;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ja3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WindowManager f28972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f28973b = {"x", QueryKeys.CONTENT_HEIGHT, "width", "height"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static float f28974c = Resources.getSystem().getDisplayMetrics().density;

    public static void a(Context context) {
        if (context != null) {
            f28974c = context.getResources().getDisplayMetrics().density;
            f28972a = (WindowManager) context.getSystemService("window");
        }
    }

    public static JSONObject b(int i11, int i12, int i13, int i14) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i11 / f28974c);
            jSONObject.put(QueryKeys.CONTENT_HEIGHT, i12 / f28974c);
            jSONObject.put("width", i13 / f28974c);
            jSONObject.put("height", i14 / f28974c);
            return jSONObject;
        } catch (JSONException e11) {
            ka3.a("Error with creating viewStateObject", e11);
            return jSONObject;
        }
    }

    public static void c(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e11) {
            StringBuilder sb2 = new StringBuilder(str.length() + 47);
            sb2.append("JSONException during JSONObject.put for name [");
            sb2.append(str);
            sb2.append("]");
            ka3.a(sb2.toString(), e11);
        }
    }

    public static void d(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e11) {
            ka3.a("Error with setting ad session id", e11);
        }
    }

    public static void e(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    public static void f(JSONObject jSONObject) {
        float f11;
        float f12;
        if (f28972a != null) {
            Point point = new Point(0, 0);
            f28972a.getDefaultDisplay().getRealSize(point);
            float f13 = point.x;
            float f14 = f28974c;
            f11 = f13 / f14;
            f12 = point.y / f14;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        try {
            jSONObject.put("width", f11);
            jSONObject.put("height", f12);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(org.json.JSONObject r9, org.json.JSONObject r10) {
        /*
            r0 = 1
            if (r9 != 0) goto L7
            if (r10 == 0) goto L6
            goto L7
        L6:
            return r0
        L7:
            r1 = 0
            if (r9 == 0) goto Lc3
            if (r10 != 0) goto Le
            goto Lc3
        Le:
            java.lang.String[] r2 = com.google.android.gms.internal.ads.ja3.f28973b
            r3 = r1
        L11:
            r4 = 4
            if (r3 >= r4) goto L27
            r4 = r2[r3]
            double r5 = r9.optDouble(r4)
            double r7 = r10.optDouble(r4)
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 == 0) goto L24
            goto Lc3
        L24:
            int r3 = r3 + 1
            goto L11
        L27:
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r9.optString(r2, r3)
            java.lang.String r2 = r10.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lc3
            java.lang.String r2 = "noOutputDevice"
            boolean r4 = r9.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r10.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lc3
            java.lang.String r2 = "hasWindowFocus"
            boolean r4 = r9.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r10.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lc3
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r9.optJSONArray(r2)
            org.json.JSONArray r2 = r10.optJSONArray(r2)
            if (r4 != 0) goto L78
            if (r2 != 0) goto L78
            goto L96
        L78:
            boolean r5 = h(r4, r2)
            if (r5 == 0) goto Lc3
            r5 = r1
        L7f:
            int r6 = r4.length()
            if (r5 >= r6) goto L96
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto Lc3
            int r5 = r5 + 1
            goto L7f
        L96:
            java.lang.String r2 = "childViews"
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            if (r9 != 0) goto La4
            if (r10 == 0) goto Lc2
        La4:
            boolean r2 = h(r9, r10)
            if (r2 == 0) goto Lc3
            r2 = r1
        Lab:
            int r3 = r9.length()
            if (r2 >= r3) goto Lc2
            org.json.JSONObject r3 = r9.optJSONObject(r2)
            org.json.JSONObject r4 = r10.optJSONObject(r2)
            boolean r3 = g(r3, r4)
            if (r3 == 0) goto Lc3
            int r2 = r2 + 1
            goto Lab
        Lc2:
            return r0
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ja3.g(org.json.JSONObject, org.json.JSONObject):boolean");
    }

    private static boolean h(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
