package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class in2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28483b;

    public in2(String str, boolean z11) {
        this.f28482a = str;
        this.f28483b = z11;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((f81) obj).f26097a;
        bundle.putString("gct", this.f28482a);
        if (this.f28483b) {
            bundle.putString("de", "1");
        }
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((f81) obj).f26098b.putString("gct", this.f28482a);
    }
}
