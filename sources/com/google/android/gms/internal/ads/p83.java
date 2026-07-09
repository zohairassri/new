package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class p83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b93 f32775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b93 f32776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t83 f32778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w83 f32779e;

    private p83(t83 t83Var, w83 w83Var, b93 b93Var, b93 b93Var2, boolean z11) {
        this.f32778d = t83Var;
        this.f32779e = w83Var;
        this.f32775a = b93Var;
        if (b93Var2 == null) {
            this.f32776b = b93.NONE;
        } else {
            this.f32776b = b93Var2;
        }
        this.f32777c = z11;
    }

    public static p83 a(t83 t83Var, w83 w83Var, b93 b93Var, b93 b93Var2, boolean z11) {
        na3.b(t83Var, "CreativeType is null");
        na3.b(w83Var, "ImpressionType is null");
        na3.b(b93Var, "Impression owner is null");
        if (b93Var == b93.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (t83Var == t83.DEFINED_BY_JAVASCRIPT && b93Var == b93.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (w83Var == w83.DEFINED_BY_JAVASCRIPT && b93Var == b93.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new p83(t83Var, w83Var, b93Var, b93Var2, z11);
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        ja3.c(jSONObject, "impressionOwner", this.f32775a);
        ja3.c(jSONObject, "mediaEventsOwner", this.f32776b);
        ja3.c(jSONObject, "creativeType", this.f32778d);
        ja3.c(jSONObject, "impressionType", this.f32779e);
        ja3.c(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f32777c));
        return jSONObject;
    }
}
