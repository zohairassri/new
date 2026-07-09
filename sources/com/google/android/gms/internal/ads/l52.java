package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final /* synthetic */ class l52 implements u23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ l52 f30016a = new l52();

    private /* synthetic */ l52() {
    }

    @Override // com.google.android.gms.internal.ads.u23
    public final /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        bm.k1.k("Ad request signals:");
        bm.k1.k(jSONObject.toString(2));
        return jSONObject;
    }
}
