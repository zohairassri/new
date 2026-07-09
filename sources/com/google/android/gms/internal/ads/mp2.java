package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class mp2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30964b;

    public mp2(String str, int i11) {
        this.f30963a = str;
        this.f30964b = i11;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((f81) obj).f26097a;
        bundle.putString("request_id", this.f30963a);
        if (this.f30964b == 2) {
            bundle.putInt("sod", 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((f81) obj).f26098b.putString("request_id", this.f30963a);
    }
}
