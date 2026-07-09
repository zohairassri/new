package com.google.android.gms.internal.pal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class pa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f41645c;

    /* synthetic */ pa(int i11, String str, Object obj, oa oaVar) {
        this.f41643a = i11;
        this.f41644b = str;
        this.f41645c = obj;
        ha.a().b(this);
    }

    public static pa e(int i11, String str, float f11) {
        return new la(1, str, Float.valueOf(f11));
    }

    public static pa f(int i11, String str, int i12) {
        return new ja(1, str, Integer.valueOf(i12));
    }

    public static pa g(int i11, String str, long j11) {
        return new ka(1, str, Long.valueOf(j11));
    }

    public static pa h(int i11, String str, Boolean bool) {
        return new ia(i11, str, bool);
    }

    public static pa i(int i11, String str, String str2) {
        return new na(1, str, str2);
    }

    public static pa j(int i11, String str) {
        pa paVarI = i(1, "gads:sdk_core_constants:experiment_id", null);
        ha.a().a(paVarI);
        return paVarI;
    }

    protected abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    protected abstract Object c(SharedPreferences sharedPreferences);

    public final int d() {
        return this.f41643a;
    }

    public final Object k() {
        return this.f41645c;
    }

    public final String l() {
        return this.f41644b;
    }
}
