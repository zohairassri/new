package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class cz extends fz {
    cz(int i11, String str, Long l11, Long l12) {
        super(1, str, l11, l12, null);
    }

    @Override // com.google.android.gms.internal.ads.fz
    public final /* bridge */ /* synthetic */ Object a(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(e())) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(e()))) : (Long) f();
    }

    @Override // com.google.android.gms.internal.ads.fz
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(e(), ((Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.ads.fz
    public final /* bridge */ /* synthetic */ Object c(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(e(), ((Long) f()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.fz
    public final /* bridge */ /* synthetic */ Object d(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(e(), ((Long) f()).longValue()));
    }
}
