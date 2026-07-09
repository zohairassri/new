package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class uk2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.common.util.concurrent.e f36179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f36180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f36181c;

    public uk2(com.google.common.util.concurrent.e eVar, long j11, com.google.android.gms.common.util.f fVar) {
        this.f36179a = eVar;
        this.f36181c = fVar;
        this.f36180b = fVar.b() + j11;
    }

    public final boolean a() {
        return this.f36180b < this.f36181c.b();
    }
}
