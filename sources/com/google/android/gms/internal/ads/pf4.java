package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class pf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long[] f32927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long[] f32928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long[] f32929c;

    pf4(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f32927a = jArr;
        this.f32928b = jArr2;
        this.f32929c = jArr3;
    }

    static pf4 a(pf4 pf4Var, of4 of4Var) {
        pf4 pf4Var2 = of4Var.f31928a;
        long[] jArr = pf4Var.f32927a;
        long[] jArr2 = pf4Var2.f32927a;
        long[] jArr3 = of4Var.f31929b;
        yf4.e(jArr, jArr2, jArr3);
        long[] jArr4 = pf4Var.f32928b;
        long[] jArr5 = pf4Var2.f32928b;
        long[] jArr6 = pf4Var2.f32929c;
        yf4.e(jArr4, jArr5, jArr6);
        yf4.e(pf4Var.f32929c, jArr6, jArr3);
        return pf4Var;
    }

    final byte[] b() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        int i11 = yf4.f38484e;
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = this.f32929c;
        yf4.f(jArr4, jArr14);
        yf4.f(jArr13, jArr4);
        yf4.f(jArr12, jArr13);
        yf4.e(jArr5, jArr12, jArr14);
        yf4.e(jArr6, jArr5, jArr4);
        yf4.f(jArr12, jArr6);
        yf4.e(jArr7, jArr12, jArr5);
        yf4.f(jArr12, jArr7);
        yf4.f(jArr13, jArr12);
        yf4.f(jArr12, jArr13);
        yf4.f(jArr13, jArr12);
        yf4.f(jArr12, jArr13);
        yf4.e(jArr8, jArr12, jArr7);
        yf4.f(jArr12, jArr8);
        yf4.f(jArr13, jArr12);
        for (int i12 = 2; i12 < 10; i12 += 2) {
            yf4.f(jArr12, jArr13);
            yf4.f(jArr13, jArr12);
        }
        yf4.e(jArr9, jArr13, jArr8);
        yf4.f(jArr12, jArr9);
        yf4.f(jArr13, jArr12);
        for (int i13 = 2; i13 < 20; i13 += 2) {
            yf4.f(jArr12, jArr13);
            yf4.f(jArr13, jArr12);
        }
        yf4.e(jArr12, jArr13, jArr9);
        yf4.f(jArr13, jArr12);
        yf4.f(jArr12, jArr13);
        for (int i14 = 2; i14 < 10; i14 += 2) {
            yf4.f(jArr13, jArr12);
            yf4.f(jArr12, jArr13);
        }
        yf4.e(jArr10, jArr12, jArr8);
        yf4.f(jArr12, jArr10);
        yf4.f(jArr13, jArr12);
        for (int i15 = 2; i15 < 50; i15 += 2) {
            yf4.f(jArr12, jArr13);
            yf4.f(jArr13, jArr12);
        }
        yf4.e(jArr11, jArr13, jArr10);
        yf4.f(jArr13, jArr11);
        yf4.f(jArr12, jArr13);
        for (int i16 = 2; i16 < 100; i16 += 2) {
            yf4.f(jArr13, jArr12);
            yf4.f(jArr12, jArr13);
        }
        yf4.e(jArr13, jArr12, jArr11);
        yf4.f(jArr12, jArr13);
        yf4.f(jArr13, jArr12);
        for (int i17 = 2; i17 < 50; i17 += 2) {
            yf4.f(jArr12, jArr13);
            yf4.f(jArr13, jArr12);
        }
        yf4.e(jArr12, jArr13, jArr10);
        yf4.f(jArr13, jArr12);
        yf4.f(jArr12, jArr13);
        yf4.f(jArr13, jArr12);
        yf4.f(jArr12, jArr13);
        yf4.f(jArr13, jArr12);
        yf4.e(jArr, jArr13, jArr6);
        yf4.e(jArr2, this.f32927a, jArr);
        yf4.e(jArr3, this.f32928b, jArr);
        byte[] bArrH = yf4.h(jArr3);
        bArrH[31] = (byte) (bArrH[31] ^ (rf4.f(jArr2) << 7));
        return bArrH;
    }

    pf4() {
        this(new long[10], new long[10], new long[10]);
    }

    pf4(of4 of4Var) {
        this();
        a(this, of4Var);
    }

    pf4(pf4 pf4Var) {
        this.f32927a = Arrays.copyOf(pf4Var.f32927a, 10);
        this.f32928b = Arrays.copyOf(pf4Var.f32928b, 10);
        this.f32929c = Arrays.copyOf(pf4Var.f32929c, 10);
    }
}
