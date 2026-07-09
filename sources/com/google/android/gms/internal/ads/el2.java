package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class el2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f25797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f25798b;

    public el2(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f25797a = jSONObject;
        this.f25798b = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((f81) obj).f26097a;
        JSONObject jSONObject = this.f25797a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f25798b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        JSONObject jSONObject = this.f25798b;
        f81 f81Var = (f81) obj;
        if (jSONObject != null) {
            f81Var.f26098b.putString("fwd_common_cld", jSONObject.toString());
        }
    }
}
