package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class nx0 implements oy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f31679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f31680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f31681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f31682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f31683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f31684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f31685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ q01 f31686h;

    nx0(q01 q01Var) {
        Objects.requireNonNull(q01Var);
        this.f31686h = q01Var;
        this.f31679a = new float[q01Var.h()];
        this.f31680b = new float[q01Var.h() * q01Var.g()];
        this.f31681c = new float[q01Var.h() * q01Var.g()];
        this.f31682d = new float[q01Var.h() * q01Var.g()];
    }

    private final int b(float[] fArr, int i11, int i12, int i13) {
        int i14 = 255;
        int i15 = 0;
        double d11 = 0.0d;
        double d12 = 1.0d;
        int i16 = i12;
        while (true) {
            double d13 = i14;
            double d14 = i15;
            if (i16 > i13) {
                this.f31683e = d12 / d14;
                this.f31684f = d11 / d13;
                return i15;
            }
            int i17 = 0;
            double dAbs = 0.0d;
            while (i17 < i16) {
                int iG = this.f31686h.g() * i11;
                dAbs += (double) Math.abs(fArr[iG + i17] - fArr[(iG + i16) + i17]);
                i17++;
                i14 = i14;
            }
            int i18 = i14;
            double d15 = d14 * dAbs;
            double d16 = i16;
            double d17 = d12 * d16;
            if (d15 < d17) {
                d12 = dAbs;
            }
            if (d15 < d17) {
                i15 = i16;
            }
            double d18 = d13 * dAbs;
            double d19 = d16 * d11;
            if (d18 > d19) {
                d11 = dAbs;
            }
            i14 = d18 > d19 ? i16 : i18;
            i16++;
        }
    }

    private final float[] c(float[] fArr, int i11, int i12) {
        q01 q01Var = this.f31686h;
        int length = fArr.length / q01Var.g();
        return i11 + i12 <= length ? fArr : Arrays.copyOf(fArr, (((length * 3) / 2) + i12) * q01Var.g());
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void L(int i11) {
        this.f31680b = c(this.f31680b, this.f31686h.i(), i11);
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final int a(int i11, int i12, int i13) {
        return b(this.f31679a, 0, i12, i13);
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void f(int i11, int i12) {
        int iG;
        int i13 = 0;
        while (true) {
            q01 q01Var = this.f31686h;
            if (i13 >= q01Var.h() / i12) {
                return;
            }
            double d11 = 0.0d;
            int i14 = 0;
            while (true) {
                iG = q01Var.g() * i12;
                if (i14 < iG) {
                    d11 += (double) this.f31680b[(q01Var.g() * i11) + (iG * i13) + i14];
                    i14++;
                }
            }
            this.f31679a[i13] = (float) (d11 / ((double) iG));
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final int g(int i11, int i12, int i13) {
        return b(this.f31680b, i11, i12, i13);
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void h(int i11, long j11, long j12) {
        int i12 = 0;
        while (true) {
            q01 q01Var = this.f31686h;
            if (i12 >= q01Var.g()) {
                return;
            }
            float[] fArr = this.f31681c;
            int iG = q01Var.g();
            int iJ = q01Var.j();
            float[] fArr2 = this.f31682d;
            int iG2 = (q01Var.g() * i11) + i12;
            float f11 = fArr2[iG2];
            float f12 = fArr2[iG2 + q01Var.g()];
            long jM = ((long) q01Var.m()) * j11;
            long jL = ((long) q01Var.l()) * j12;
            long jL2 = ((long) (q01Var.l() + 1)) * j12;
            long j13 = jL2 - jM;
            fArr[(iJ * iG) + i12] = ((j13 * f11) + ((r12 - j13) * f12)) / (jL2 - jL);
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void i(int i11) {
        this.f31682d = c(this.f31682d, this.f31686h.k(), i11);
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void j(ByteBuffer byteBuffer, int i11) {
        q01 q01Var = this.f31686h;
        byteBuffer.asFloatBuffer().put(this.f31681c, 0, q01Var.g() * i11);
        byteBuffer.position(byteBuffer.position() + (i11 * 4 * q01Var.g()));
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void k(ByteBuffer byteBuffer, int i11) {
        q01 q01Var = this.f31686h;
        byteBuffer.asFloatBuffer().get(this.f31680b, q01Var.i() * q01Var.g(), i11 / 4);
        byteBuffer.position(byteBuffer.position() + i11);
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void l(int i11, int i12, int i13, int i14, int i15) {
        float[] fArr = this.f31681c;
        float[] fArr2 = this.f31680b;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = (i14 * i12) + i16;
            int i18 = (i15 * i12) + i16;
            int i19 = (i13 * i12) + i16;
            for (int i21 = 0; i21 < i11; i21++) {
                fArr[i19] = ((fArr2[i17] * (i11 - i21)) + (fArr2[i18] * i21)) / i11;
                i19 += i12;
                i17 += i12;
                i18 += i12;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void m(int i11, int i12) {
        for (int i13 = 0; i13 < this.f31686h.g() * i12; i13++) {
            this.f31680b[i11 + i13] = 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void u(int i11) {
        this.f31681c = c(this.f31681c, this.f31686h.j(), i11);
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final boolean zzc() {
        double d11 = this.f31683e;
        return d11 != 0.0d && this.f31686h.n() != 0 && this.f31684f <= d11 * 3.0d && d11 + d11 > this.f31685g * 3.0d;
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void zzg() {
        this.f31685g = 0.0d;
        this.f31683e = 0.0d;
        this.f31684f = 0.0d;
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void zzi() {
        this.f31685g = this.f31683e;
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final /* synthetic */ Object zzp() {
        return this.f31682d;
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final /* synthetic */ Object zzq() {
        return this.f31681c;
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final /* synthetic */ Object zzr() {
        return this.f31680b;
    }
}
