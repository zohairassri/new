package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class g3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g3 f26799d = new g3(-3, -9223372036854775807L, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26802c;

    private g3(int i11, long j11, long j12) {
        this.f26800a = i11;
        this.f26801b = j11;
        this.f26802c = j12;
    }

    public static g3 a(long j11, long j12) {
        return new g3(-1, j11, j12);
    }

    public static g3 b(long j11, long j12) {
        return new g3(-2, j11, j12);
    }

    public static g3 c(long j11) {
        return new g3(0, -9223372036854775807L, j11);
    }

    final /* synthetic */ int d() {
        return this.f26800a;
    }

    final /* synthetic */ long e() {
        return this.f26801b;
    }

    final /* synthetic */ long f() {
        return this.f26802c;
    }
}
