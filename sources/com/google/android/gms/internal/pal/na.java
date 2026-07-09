package com.google.android.gms.internal.pal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class na extends pa {
    na(int i11, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // com.google.android.gms.internal.pal.pa
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optString(l(), (String) k());
    }

    @Override // com.google.android.gms.internal.pal.pa
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(l())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(l())) : (String) k();
    }

    @Override // com.google.android.gms.internal.pal.pa
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(l(), (String) k());
    }
}
