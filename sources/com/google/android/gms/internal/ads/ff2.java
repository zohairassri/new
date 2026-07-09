package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ff2 implements xl.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private xl.g f26293a;

    public final synchronized void a(xl.g gVar) {
        this.f26293a = gVar;
    }

    @Override // xl.g
    public final synchronized void zza(View view) {
        xl.g gVar = this.f26293a;
        if (gVar != null) {
            gVar.zza(view);
        }
    }

    @Override // xl.g
    public final synchronized void zzb() {
        xl.g gVar = this.f26293a;
        if (gVar != null) {
            gVar.zzb();
        }
    }

    @Override // xl.g
    public final synchronized void zzc() {
        xl.g gVar = this.f26293a;
        if (gVar != null) {
            gVar.zzc();
        }
    }
}
