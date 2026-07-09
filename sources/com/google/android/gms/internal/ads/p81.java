package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class p81 implements i75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m81 f32765a;

    private p81(m81 m81Var) {
        this.f32765a = m81Var;
    }

    public static p81 b(m81 m81Var) {
        return new p81(m81Var);
    }

    public final Bundle a() {
        return this.f32765a.d();
    }

    @Override // com.google.android.gms.internal.ads.w75
    public final /* synthetic */ Object zzb() {
        return this.f32765a.d();
    }
}
