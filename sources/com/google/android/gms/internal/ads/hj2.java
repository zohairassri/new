package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class hj2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27761b;

    public hj2(String str, boolean z11) {
        this.f27760a = str;
        this.f27761b = z11;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str = this.f27760a;
        f81 f81Var = (f81) obj;
        if (str != null) {
            Bundle bundleA = xz2.a(f81Var.f26097a, "pii");
            bundleA.putString("afai", str);
            bundleA.putBoolean("is_afai_lat", this.f27761b);
        }
    }
}
