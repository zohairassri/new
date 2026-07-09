package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class az extends fz {
    az(int i11, String str, Boolean bool, Boolean bool2) {
        super(i11, str, bool, bool2, null);
    }

    @Override // com.google.android.gms.internal.ads.fz
    public final /* bridge */ /* synthetic */ Object a(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(e())) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(e()))) : (Boolean) f();
    }

    @Override // com.google.android.gms.internal.ads.fz
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(e(), ((Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.ads.fz
    public final /* bridge */ /* synthetic */ Object c(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(e(), ((Boolean) f()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.fz
    public final /* bridge */ /* synthetic */ Object d(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(e(), ((Boolean) f()).booleanValue()));
    }
}
