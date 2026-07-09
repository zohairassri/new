package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class r7 extends s7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f40690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f40691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f40692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f40693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f40694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f40695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f40696k;

    private final void f() {
        int i11 = this.f40692g + this.f40693h;
        this.f40692g = i11;
        int i12 = i11 - this.f40695j;
        int i13 = this.f40696k;
        if (i12 <= i13) {
            this.f40693h = 0;
            return;
        }
        int i14 = i12 - i13;
        this.f40693h = i14;
        this.f40692g = i11 - i14;
    }

    @Override // com.google.android.gms.internal.measurement.s7
    public final int a(int i11) throws zzji {
        if (i11 < 0) {
            throw zzji.d();
        }
        int iD = i11 + d();
        if (iD < 0) {
            throw zzji.e();
        }
        int i12 = this.f40696k;
        if (iD > i12) {
            throw zzji.f();
        }
        this.f40696k = iD;
        f();
        return i12;
    }

    @Override // com.google.android.gms.internal.measurement.s7
    public final int d() {
        return this.f40694i - this.f40695j;
    }

    private r7(byte[] bArr, int i11, int i12, boolean z11) {
        super();
        this.f40696k = Integer.MAX_VALUE;
        this.f40690e = bArr;
        this.f40692g = i12 + i11;
        this.f40694i = i11;
        this.f40695j = i11;
        this.f40691f = z11;
    }
}
