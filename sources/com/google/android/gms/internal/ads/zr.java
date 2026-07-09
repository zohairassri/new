package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f39368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f39369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f39370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f39371e;

    public zr(String str, VersionInfoParcel versionInfoParcel, String str2, JSONObject jSONObject, boolean z11, boolean z12) {
        this.f39370d = versionInfoParcel.f22410a;
        this.f39368b = jSONObject;
        this.f39369c = str;
        this.f39367a = str2;
        this.f39371e = z12;
    }

    public final String a() {
        return this.f39367a;
    }

    public final String b() {
        return this.f39370d;
    }

    public final JSONObject c() {
        return this.f39368b;
    }

    public final String d() {
        return this.f39369c;
    }

    public final boolean e() {
        return this.f39371e;
    }
}
