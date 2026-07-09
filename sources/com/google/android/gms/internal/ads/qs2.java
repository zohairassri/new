package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class qs2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33781a;

    public qs2(List list) {
        this.f33781a = list;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f33781a));
        } catch (JSONException unused) {
            bm.k1.k("Failed putting experiment ids.");
        }
    }
}
