package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class iz1 implements tg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f28786a = new Bundle();

    public final synchronized Bundle a() {
        return new Bundle(this.f28786a);
    }

    @Override // com.google.android.gms.internal.ads.tg1
    public final synchronized void b(String str) {
        this.f28786a.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.tg1
    public final synchronized void d(String str) {
        this.f28786a.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.tg1
    public final synchronized void g(String str, String str2) {
        this.f28786a.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.tg1
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.tg1
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.tg1
    public final void T(String str) {
    }
}
