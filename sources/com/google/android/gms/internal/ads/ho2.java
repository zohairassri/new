package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ho2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f27855a;

    public ho2(Bundle bundle) {
        this.f27855a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((f81) obj).f26097a;
        Bundle bundleA = xz2.a(bundle, "device");
        bundleA.putBundle("android_mem_info", this.f27855a);
        bundle.putBundle("device", bundleA);
    }
}
