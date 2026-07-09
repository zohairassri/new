package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ez extends fz {
    ez(int i11, String str, String str2, String str3) {
        super(1, str, str2, str3, null);
    }

    @Override // com.google.android.gms.internal.ads.fz
    public final /* bridge */ /* synthetic */ Object a(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(e())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(e())) : (String) f();
    }

    @Override // com.google.android.gms.internal.ads.fz
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Object obj) {
        editor.putString(e(), (String) obj);
    }

    @Override // com.google.android.gms.internal.ads.fz
    public final /* bridge */ /* synthetic */ Object c(JSONObject jSONObject) {
        return jSONObject.optString(e(), (String) f());
    }

    @Override // com.google.android.gms.internal.ads.fz
    public final /* bridge */ /* synthetic */ Object d(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(e(), (String) f());
    }
}
