package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class g5 extends k4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26820b;

    public g5(x3 x3Var, long j11) {
        super(x3Var);
        jx3.a(x3Var.zzn() >= j11);
        this.f26820b = j11;
    }

    @Override // com.google.android.gms.internal.ads.k4, com.google.android.gms.internal.ads.x3
    public final long zzm() {
        return super.zzm() - this.f26820b;
    }

    @Override // com.google.android.gms.internal.ads.k4, com.google.android.gms.internal.ads.x3
    public final long zzn() {
        return super.zzn() - this.f26820b;
    }

    @Override // com.google.android.gms.internal.ads.k4, com.google.android.gms.internal.ads.x3
    public final long zzo() {
        return super.zzo() - this.f26820b;
    }
}
