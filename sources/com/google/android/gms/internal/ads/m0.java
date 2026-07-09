package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class m0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Executor f30520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ np1 f30521b;

    m0(Executor executor, np1 np1Var) {
        this.f30520a = executor;
        this.f30521b = np1Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f30520a.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.n0
    public final void zza() {
        this.f30521b.zza(this.f30520a);
    }
}
