package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class an5 implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f23386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f23388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public an5 f23389d;

    public an5(long j11, int i11) {
        a(j11, 65536);
    }

    public final void a(long j11, int i11) {
        jx3.i(this.f23388c == null);
        this.f23386a = j11;
        this.f23387b = j11 + 65536;
    }

    public final int b(long j11) {
        long j12 = j11 - this.f23386a;
        int i11 = this.f23388c.f31120b;
        return (int) j12;
    }

    public final an5 c() {
        this.f23388c = null;
        an5 an5Var = this.f23389d;
        this.f23389d = null;
        return an5Var;
    }

    @Override // com.google.android.gms.internal.ads.o
    public final n zzd() {
        n nVar = this.f23388c;
        nVar.getClass();
        return nVar;
    }

    @Override // com.google.android.gms.internal.ads.o
    public final o zze() {
        an5 an5Var = this.f23389d;
        if (an5Var == null || an5Var.f23388c == null) {
            return null;
        }
        return an5Var;
    }
}
