package com.iterable.iterableapi;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f47723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f47724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f47725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final JSONObject f47726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final String f47727e;

    j(boolean z11, int i11, String str, JSONObject jSONObject, String str2) {
        this.f47723a = z11;
        this.f47724b = i11;
        this.f47725c = str;
        this.f47726d = jSONObject;
        this.f47727e = str2;
    }

    static j a(int i11, String str, JSONObject jSONObject, String str2) {
        return new j(false, i11, str, jSONObject, str2);
    }

    static j b(int i11, String str, JSONObject jSONObject) {
        return new j(true, i11, str, jSONObject, null);
    }
}
