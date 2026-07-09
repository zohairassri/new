package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class c3 implements a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f3 f24364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f24366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f24367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f24368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f24369f;

    public c3(f3 f3Var, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f24364a = f3Var;
        this.f24365b = j11;
        this.f24366c = j13;
        this.f24367d = j14;
        this.f24368e = j15;
        this.f24369f = j16;
    }

    public final long b(long j11) {
        return this.f24364a.a(j11);
    }

    final /* synthetic */ long c() {
        return this.f24366c;
    }

    final /* synthetic */ long d() {
        return this.f24368e;
    }

    final /* synthetic */ long e() {
        return this.f24369f;
    }

    @Override // com.google.android.gms.internal.ads.a5
    public final long zza() {
        return this.f24365b;
    }

    @Override // com.google.android.gms.internal.ads.a5
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.a5
    public final y4 zzc(long j11) {
        b5 b5Var = new b5(j11, e3.a(this.f24364a.a(j11), 0L, this.f24366c, this.f24367d, this.f24368e, this.f24369f));
        return new y4(b5Var, b5Var);
    }

    final /* synthetic */ long zzf() {
        return this.f24367d;
    }
}
