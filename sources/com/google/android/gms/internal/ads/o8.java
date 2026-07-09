package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class o8 extends m3 implements u8 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f31800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f31801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f31802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f31803j;

    public o8(long j11, long j12, int i11, int i12, boolean z11) {
        super(j11, j12, i11, i12, false);
        this.f31800g = j12;
        this.f31801h = i11;
        this.f31802i = i12;
        this.f31803j = j11 == -1 ? -1L : j11;
    }

    @Override // com.google.android.gms.internal.ads.u8
    public final long a(long j11) {
        return b(j11);
    }

    public final o8 d(long j11) {
        return new o8(j11, this.f31800g, this.f31801h, this.f31802i, false);
    }

    @Override // com.google.android.gms.internal.ads.u8
    public final long zzf() {
        return this.f31803j;
    }

    @Override // com.google.android.gms.internal.ads.u8
    public final int zzg() {
        return this.f31801h;
    }
}
