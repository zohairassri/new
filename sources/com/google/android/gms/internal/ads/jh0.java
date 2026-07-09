package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.amazonaws.services.s3.internal.Constants;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class jh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f29055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f29059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f29060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f29061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f29062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f29063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f29064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f29065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f29066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f29067m;

    public jh0(JSONObject jSONObject) {
        this.f29060f = jSONObject.optString(Constants.URL_ENCODING);
        this.f29056b = jSONObject.optString("base_uri");
        this.f29057c = jSONObject.optString("post_parameters");
        this.f29058d = n(jSONObject.optString("drt_include"));
        this.f29067m = jSONObject.optString("content_type");
        this.f29066l = n(jSONObject.optString("use_compression"));
        this.f29059e = n(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String strOptString = jSONObject.optString("errors");
        this.f29055a = strOptString == null ? null : Arrays.asList(strOptString.split(","));
        this.f29061g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f29062h = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f29063i = jSONObject.optString("pool_key");
        this.f29064j = o(jSONObject.optString("start_time")).longValue();
        this.f29065k = o(jSONObject.optString("end_time")).longValue();
    }

    private static boolean n(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }

    private static Long o(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final int a() {
        return this.f29061g;
    }

    public final List b() {
        return this.f29055a;
    }

    public final String c() {
        return this.f29056b;
    }

    public final String d() {
        return this.f29057c;
    }

    public final String e() {
        return this.f29060f;
    }

    public final boolean f() {
        return this.f29058d;
    }

    public final boolean g() {
        return this.f29059e;
    }

    public final JSONObject h() {
        return this.f29062h;
    }

    public final String i() {
        return this.f29063i;
    }

    public final long j() {
        return this.f29064j;
    }

    public final long k() {
        return this.f29065k;
    }

    public final String l() {
        return this.f29067m;
    }

    public final boolean m() {
        return this.f29066l;
    }
}
