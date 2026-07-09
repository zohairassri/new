package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class pl1 implements i75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nl1 f33020a;

    private pl1(nl1 nl1Var) {
        this.f33020a = nl1Var;
    }

    public static pl1 b(nl1 nl1Var) {
        return new pl1(nl1Var);
    }

    public static JSONObject c(nl1 nl1Var) {
        JSONObject jSONObjectC = nl1Var.c();
        q75.b(jSONObjectC);
        return jSONObjectC;
    }

    public final JSONObject a() {
        return c(this.f33020a);
    }

    @Override // com.google.android.gms.internal.ads.w75
    public final /* synthetic */ Object zzb() {
        return c(this.f33020a);
    }
}
