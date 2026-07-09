package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f43144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f43145b;

    public ka(com.google.android.gms.common.util.f fVar) {
        com.google.android.gms.common.internal.n.l(fVar);
        this.f43144a = fVar;
    }

    public final void a() {
        this.f43145b = 0L;
    }

    public final boolean b(long j11) {
        return this.f43145b == 0 || this.f43144a.b() - this.f43145b >= 3600000;
    }

    public final void c() {
        this.f43145b = this.f43144a.b();
    }
}
