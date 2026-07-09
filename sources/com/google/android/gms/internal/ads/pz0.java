package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class pz0 implements oy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short[] f33298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private short[] f33299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short[] f33300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short[] f33301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ q01 f33305h;

    pz0(q01 q01Var) {
        Objects.requireNonNull(q01Var);
        this.f33305h = q01Var;
        this.f33298a = new short[q01Var.h()];
        this.f33299b = new short[q01Var.h() * q01Var.g()];
        this.f33300c = new short[q01Var.h() * q01Var.g()];
        this.f33301d = new short[q01Var.h() * q01Var.g()];
    }

    private final int b(short[] sArr, int i11, int i12, int i13) {
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i12 <= i13) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i12; i18++) {
                int iG = this.f33305h.g() * i11;
                iAbs += Math.abs(sArr[iG + i18] - sArr[(iG + i12) + i18]);
            }
            int i19 = iAbs * i16;
            int i21 = i14 * i12;
            if (i19 < i21) {
                i14 = iAbs;
            }
            if (i19 < i21) {
                i16 = i12;
            }
            int i22 = iAbs * i15;
            int i23 = i17 * i12;
            if (i22 > i23) {
                i17 = iAbs;
            }
            if (i22 > i23) {
                i15 = i12;
            }
            i12++;
        }
        this.f33302e = i14 / i16;
        this.f33303f = i17 / i15;
        return i16;
    }

    private final short[] c(short[] sArr, int i11, int i12) {
        q01 q01Var = this.f33305h;
        int length = sArr.length / q01Var.g();
        return i11 + i12 <= length ? sArr : Arrays.copyOf(sArr, (((length * 3) / 2) + i12) * q01Var.g());
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void L(int i11) {
        this.f33299b = c(this.f33299b, this.f33305h.i(), i11);
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final int a(int i11, int i12, int i13) {
        return b(this.f33298a, 0, i12, i13);
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void f(int i11, int i12) {
        int iG;
        short[] sArr = this.f33299b;
        int i13 = 0;
        while (true) {
            q01 q01Var = this.f33305h;
            if (i13 >= q01Var.h() / i12) {
                return;
            }
            int i14 = 0;
            int i15 = 0;
            while (true) {
                iG = q01Var.g() * i12;
                if (i14 < iG) {
                    i15 += sArr[(q01Var.g() * i11) + (iG * i13) + i14];
                    i14++;
                }
            }
            this.f33298a[i13] = (short) (i15 / iG);
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final int g(int i11, int i12, int i13) {
        return b(this.f33299b, i11, i12, i13);
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void h(int i11, long j11, long j12) {
        int i12 = 0;
        while (true) {
            q01 q01Var = this.f33305h;
            if (i12 >= q01Var.g()) {
                return;
            }
            short[] sArr = this.f33300c;
            int iG = q01Var.g();
            int iJ = q01Var.j();
            short[] sArr2 = this.f33301d;
            int iG2 = (q01Var.g() * i11) + i12;
            short s11 = sArr2[iG2];
            short s12 = sArr2[iG2 + q01Var.g()];
            long jM = ((long) q01Var.m()) * j11;
            long jL = ((long) q01Var.l()) * j12;
            long jL2 = ((long) (q01Var.l() + 1)) * j12;
            int i13 = i12;
            long j13 = jL2 - jL;
            long j14 = jL2 - jM;
            sArr[(iJ * iG) + i13] = (short) (((j14 * ((long) s11)) + ((j13 - j14) * ((long) s12))) / j13);
            i12 = i13 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void i(int i11) {
        this.f33301d = c(this.f33301d, this.f33305h.k(), i11);
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void j(ByteBuffer byteBuffer, int i11) {
        q01 q01Var = this.f33305h;
        byteBuffer.asShortBuffer().put(this.f33300c, 0, q01Var.g() * i11);
        byteBuffer.position(byteBuffer.position() + ((i11 + i11) * q01Var.g()));
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void k(ByteBuffer byteBuffer, int i11) {
        q01 q01Var = this.f33305h;
        byteBuffer.asShortBuffer().get(this.f33299b, q01Var.i() * q01Var.g(), i11 / 2);
        byteBuffer.position(byteBuffer.position() + i11);
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void l(int i11, int i12, int i13, int i14, int i15) {
        short[] sArr = this.f33300c;
        short[] sArr2 = this.f33299b;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = (i14 * i12) + i16;
            int i18 = (i15 * i12) + i16;
            int i19 = (i13 * i12) + i16;
            for (int i21 = 0; i21 < i11; i21++) {
                sArr[i19] = (short) (((sArr2[i17] * (i11 - i21)) + (sArr2[i18] * i21)) / i11);
                i19 += i12;
                i17 += i12;
                i18 += i12;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void m(int i11, int i12) {
        for (int i13 = 0; i13 < this.f33305h.g() * i12; i13++) {
            this.f33299b[i11 + i13] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void u(int i11) {
        this.f33300c = c(this.f33300c, this.f33305h.j(), i11);
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final boolean zzc() {
        int i11 = this.f33302e;
        return i11 != 0 && this.f33305h.n() != 0 && this.f33303f <= i11 * 3 && i11 + i11 > this.f33304g * 3;
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void zzg() {
        this.f33304g = 0;
        this.f33302e = 0;
        this.f33303f = 0;
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final void zzi() {
        this.f33304g = this.f33302e;
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final /* synthetic */ Object zzp() {
        return this.f33301d;
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final /* synthetic */ Object zzq() {
        return this.f33300c;
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final /* synthetic */ Object zzr() {
        return this.f33299b;
    }
}
