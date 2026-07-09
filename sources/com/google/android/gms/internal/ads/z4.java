package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class z4 implements a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f38981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y4 f38982b;

    public z4(long j11, long j12) {
        this.f38981a = j11;
        b5 b5Var = j12 == 0 ? b5.f23678c : new b5(0L, j12);
        this.f38982b = new y4(b5Var, b5Var);
    }

    @Override // com.google.android.gms.internal.ads.a5
    public final long zza() {
        return this.f38981a;
    }

    @Override // com.google.android.gms.internal.ads.a5
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.a5
    public final y4 zzc(long j11) {
        return this.f38982b;
    }
}
