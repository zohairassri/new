package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class pf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32923c;

    public pf0(boolean z11, String str, boolean z12) {
        this.f32921a = z11;
        this.f32922b = str;
        this.f32923c = z12;
    }

    public static pf0 a(JSONObject jSONObject) {
        return new pf0(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
