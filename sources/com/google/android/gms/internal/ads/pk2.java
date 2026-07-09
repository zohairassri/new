package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class pk2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f32992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f32993b;

    public pk2(double d11, boolean z11) {
        this.f32992a = d11;
        this.f32993b = z11;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((f81) obj).f26097a;
        Bundle bundleA = xz2.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = xz2.a(bundleA, "battery");
        bundleA.putBundle("battery", bundleA2);
        bundleA2.putBoolean("is_charging", this.f32993b);
        bundleA2.putDouble("battery_level", this.f32992a);
    }
}
