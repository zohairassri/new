package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class wj2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f37421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f37422b;

    public wj2(String str, int i11) {
        this.f37421a = str;
        this.f37422b = i11;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i11;
        Bundle bundle = ((f81) obj).f26097a;
        String str = this.f37421a;
        if (TextUtils.isEmpty(str) || (i11 = this.f37422b) == -1) {
            return;
        }
        Bundle bundleA = xz2.a(bundle, "pii");
        bundle.putBundle("pii", bundleA);
        bundleA.putString("pvid", str);
        bundleA.putInt("pvid_s", i11);
    }
}
