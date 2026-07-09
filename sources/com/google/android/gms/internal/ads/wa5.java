package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class wa5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f37254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f37255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f37256c;

    public wa5() {
        this.f37254a = -9223372036854775807L;
        this.f37255b = -3.4028235E38f;
        this.f37256c = -9223372036854775807L;
    }

    public final wa5 a(long j11) {
        this.f37254a = j11;
        return this;
    }

    public final wa5 b(float f11) {
        boolean z11 = true;
        if (f11 <= 0.0f && f11 != -3.4028235E38f) {
            z11 = false;
        }
        jx3.a(z11);
        this.f37255b = f11;
        return this;
    }

    public final wa5 c(long j11) {
        boolean z11 = true;
        if (j11 < 0) {
            if (j11 == -9223372036854775807L) {
                j11 = -9223372036854775807L;
            } else {
                z11 = false;
            }
        }
        jx3.a(z11);
        this.f37256c = j11;
        return this;
    }

    public final xa5 d() {
        return new xa5(this, null);
    }

    final /* synthetic */ long e() {
        return this.f37254a;
    }

    final /* synthetic */ float f() {
        return this.f37255b;
    }

    final /* synthetic */ long g() {
        return this.f37256c;
    }

    /* synthetic */ wa5(xa5 xa5Var, byte[] bArr) {
        this.f37254a = xa5Var.f37860a;
        this.f37255b = xa5Var.f37861b;
        this.f37256c = xa5Var.f37862c;
    }
}
