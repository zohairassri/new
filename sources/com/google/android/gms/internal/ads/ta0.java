package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final /* synthetic */ class ta0 implements pa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ ta0 f35364a = new ta0();

    private /* synthetic */ ta0() {
    }

    @Override // com.google.android.gms.internal.ads.pa0
    public final /* synthetic */ Object e(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
    }
}
