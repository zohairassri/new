package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ps2 implements pq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final u64 f33229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final List f33230b;

    public ps2(yy yyVar, u64 u64Var, List list) {
        this.f33229a = u64Var;
        this.f33230b = list;
    }

    @Override // com.google.android.gms.internal.ads.pq2
    public final com.google.common.util.concurrent.e zza() {
        return this.f33229a.M0(new Callable() { // from class: com.google.android.gms.internal.ads.os2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new qs2(this.f32094a.f33230b);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.pq2
    public final int zzb() {
        return 48;
    }
}
