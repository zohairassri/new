package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class it2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28550a;

    public it2(String str) {
        this.f28550a = str;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            String str = this.f28550a;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            bm.o0.h(jSONObject, "pii").put("adsid", str);
        } catch (JSONException e11) {
            int i11 = bm.k1.f14837b;
            cm.o.g("Failed putting trustless token.", e11);
        }
    }
}
