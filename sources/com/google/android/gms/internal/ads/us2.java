package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class us2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f36317a;

    public us2(Bundle bundle) {
        this.f36317a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Bundle bundle = this.f36317a;
        if (bundle != null) {
            try {
                bm.o0.h(bm.o0.h(jSONObject, "device"), "play_store").put("parental_controls", yl.c.a().u(bundle));
            } catch (JSONException unused) {
                bm.k1.k("Failed putting parental controls bundle.");
            }
        }
    }
}
