package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class q01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f33337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f33338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f33339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f33340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f33341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f33342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final oy0 f33343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33345k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f33346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f33348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f33349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f33350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private double f33351q;

    public q01(int i11, int i12, float f11, float f12, int i13, boolean z11) {
        this.f33335a = i11;
        this.f33336b = i12;
        this.f33337c = f11;
        this.f33338d = f12;
        this.f33339e = i11 / i13;
        this.f33340f = i11 / 400;
        int i14 = i11 / 65;
        this.f33341g = i14;
        this.f33342h = i14 + i14;
        this.f33343i = z11 ? new nx0(this) : new pz0(this);
    }

    private final void o(int i11, int i12) {
        oy0 oy0Var = this.f33343i;
        oy0Var.u(i12);
        Object objZzr = oy0Var.zzr();
        Object objZzq = oy0Var.zzq();
        int i13 = this.f33345k;
        int i14 = this.f33336b;
        System.arraycopy(objZzr, i11 * i14, objZzq, i13 * i14, i12 * i14);
        this.f33345k += i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017e A[EDGE_INSN: B:101:0x017e->B:59:0x017e BREAK  A[LOOP:3: B:13:0x0035->B:92:0x024c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024c A[LOOP:3: B:13:0x0035->B:92:0x024c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void p() {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q01.p():void");
    }

    public final int a() {
        return this.f33344j * this.f33336b * this.f33343i.zza();
    }

    public final void b(ByteBuffer byteBuffer) {
        oy0 oy0Var = this.f33343i;
        int iRemaining = byteBuffer.remaining();
        int iZza = iRemaining / (this.f33336b * oy0Var.zza());
        oy0Var.L(iZza);
        oy0Var.k(byteBuffer, iRemaining);
        this.f33344j += iZza;
        p();
    }

    public final void c(ByteBuffer byteBuffer) {
        jx3.i(this.f33345k >= 0);
        int i11 = this.f33336b;
        int iRemaining = byteBuffer.remaining();
        oy0 oy0Var = this.f33343i;
        int iMin = Math.min(iRemaining / (oy0Var.zza() * i11), this.f33345k);
        oy0Var.j(byteBuffer, iMin);
        this.f33345k -= iMin;
        System.arraycopy(oy0Var.zzq(), iMin * i11, oy0Var.zzq(), 0, this.f33345k * i11);
    }

    public final void d() {
        int i11 = this.f33344j;
        int i12 = this.f33349o;
        int i13 = this.f33345k;
        float f11 = this.f33337c;
        float f12 = this.f33338d;
        int i14 = i13 + ((int) ((((((((double) (i11 - i12)) / ((double) (f11 / f12))) + ((double) i12)) + this.f33351q) + ((double) this.f33346l)) / ((double) (this.f33339e * f12))) + 0.5d));
        this.f33351q = 0.0d;
        int i15 = this.f33342h;
        int i16 = i15 + i15;
        oy0 oy0Var = this.f33343i;
        oy0Var.L(i11 + i16);
        oy0Var.m(i11 * this.f33336b, i16);
        this.f33344j += i16;
        p();
        if (this.f33345k > i14) {
            this.f33345k = Math.max(i14, 0);
        }
        this.f33344j = 0;
        this.f33349o = 0;
        this.f33346l = 0;
    }

    public final void e() {
        this.f33344j = 0;
        this.f33345k = 0;
        this.f33346l = 0;
        this.f33347m = 0;
        this.f33348n = 0;
        this.f33349o = 0;
        this.f33350p = 0;
        this.f33351q = 0.0d;
        this.f33343i.zzg();
    }

    public final int f() {
        jx3.i(this.f33345k >= 0);
        return this.f33345k * this.f33336b * this.f33343i.zza();
    }

    final /* synthetic */ int g() {
        return this.f33336b;
    }

    final /* synthetic */ int h() {
        return this.f33342h;
    }

    final /* synthetic */ int i() {
        return this.f33344j;
    }

    final /* synthetic */ int j() {
        return this.f33345k;
    }

    final /* synthetic */ int k() {
        return this.f33346l;
    }

    final /* synthetic */ int l() {
        return this.f33347m;
    }

    final /* synthetic */ int m() {
        return this.f33348n;
    }

    final /* synthetic */ int n() {
        return this.f33350p;
    }
}
