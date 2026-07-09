package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class cn2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f24641c;

    /* synthetic */ cn2(String str, String str2, Bundle bundle, byte[] bArr) {
        this.f24639a = str;
        this.f24640b = str2;
        this.f24641c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((f81) obj).f26097a;
        bundle.putString("consent_string", this.f24639a);
        bundle.putString("fc_consent", this.f24640b);
        Bundle bundle2 = this.f24641c;
        if (bundle2 != null) {
            bundle.putBundle("iab_consent_info", bundle2);
        }
    }
}
