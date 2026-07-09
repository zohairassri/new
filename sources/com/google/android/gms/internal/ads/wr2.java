package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class wr2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37563a;

    public wr2(String str) {
        this.f37563a = str;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f37563a);
        } catch (JSONException e11) {
            bm.k1.l("Failed putting Ad ID.", e11);
        }
    }
}
