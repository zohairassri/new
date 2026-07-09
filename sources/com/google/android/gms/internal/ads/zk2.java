package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zk2 implements pq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u64 f39249a;

    zk2(u64 u64Var) {
        this.f39249a = u64Var;
    }

    @Override // com.google.android.gms.internal.ads.pq2
    public final com.google.common.util.concurrent.e zza() {
        return this.f39249a.M0(new Callable(this) { // from class: com.google.android.gms.internal.ads.yk2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new al2(xl.r.o().a() - xl.r.l().r().zzi().b());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.pq2
    public final int zzb() {
        return 55;
    }
}
