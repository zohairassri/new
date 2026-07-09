package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class fz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f26754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f26755d;

    /* synthetic */ fz(int i11, String str, Object obj, Object obj2, byte[] bArr) {
        this.f26752a = i11;
        this.f26753b = str;
        this.f26754c = obj;
        this.f26755d = obj2;
        yl.e.b().a(this);
    }

    public static fz h(int i11, String str, int i12, int i13) {
        return new bz(1, str, Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static fz i(int i11, String str, long j11, long j12) {
        return new cz(1, str, Long.valueOf(j11), Long.valueOf(j12));
    }

    public static fz j(int i11, String str, float f11, float f12) {
        return new dz(1, str, Float.valueOf(f11), Float.valueOf(f12));
    }

    public static fz k(int i11, String str) {
        ez ezVar = new ez(1, "gads:sdk_core_constants:experiment_id", null, null);
        yl.e.b().b(ezVar);
        return ezVar;
    }

    public static fz l(int i11, String str) {
        ez ezVar = new ez(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        yl.e.b().c(ezVar);
        return ezVar;
    }

    public abstract Object a(Bundle bundle);

    public abstract void b(SharedPreferences.Editor editor, Object obj);

    protected abstract Object c(JSONObject jSONObject);

    protected abstract Object d(SharedPreferences sharedPreferences);

    public final String e() {
        return this.f26753b;
    }

    public final Object f() {
        return yl.e.c().b() ? this.f26755d : this.f26754c;
    }

    public final Object g() {
        return yl.e.c().d(this);
    }

    public final int m() {
        return this.f26752a;
    }
}
