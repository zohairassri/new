package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class dz extends fz {
    dz(int i11, String str, Float f11, Float f12) {
        super(1, str, f11, f12, null);
    }

    @Override // com.google.android.gms.internal.ads.fz
    public final /* bridge */ /* synthetic */ Object a(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(e())) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(e()))) : (Float) f();
    }

    @Override // com.google.android.gms.internal.ads.fz
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(e(), ((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.fz
    public final /* bridge */ /* synthetic */ Object c(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(e(), ((Float) f()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.fz
    public final /* bridge */ /* synthetic */ Object d(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(e(), ((Float) f()).floatValue()));
    }
}
