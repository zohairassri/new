package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class f64 extends g64 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.util.concurrent.e f26085a;

    protected f64(com.google.common.util.concurrent.e eVar) {
        this.f26085a = eVar;
    }

    @Override // com.google.android.gms.internal.ads.e64
    protected final /* synthetic */ Future l() {
        return this.f26085a;
    }

    @Override // com.google.android.gms.internal.ads.g64
    protected final com.google.common.util.concurrent.e x() {
        return this.f26085a;
    }

    @Override // com.google.android.gms.internal.ads.e04
    protected final /* synthetic */ Object zzb() {
        return this.f26085a;
    }
}
