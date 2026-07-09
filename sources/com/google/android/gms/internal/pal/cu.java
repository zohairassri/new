package com.google.android.gms.internal.pal;

import java.security.InvalidKeyException;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class cu {
    public static byte[] a(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        int i11 = 0;
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        int i12 = bArrCopyOf[31] & ByteCompanionObject.MAX_VALUE;
        bArrCopyOf[31] = (byte) i12;
        bArrCopyOf[31] = (byte) (i12 | 64);
        byte[][] bArr3 = xs.f42215a;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, 32);
        bArrCopyOf2[31] = (byte) (bArrCopyOf2[31] & ByteCompanionObject.MAX_VALUE);
        for (int i13 = 0; i13 < 7; i13++) {
            byte[][] bArr4 = xs.f42215a;
            if (vs.b(bArr4[i13], bArrCopyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(st.a(bArr4[i13])));
            }
        }
        long[] jArrK = rt.k(bArrCopyOf2);
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        jArr7[0] = 1;
        long[] jArr8 = new long[19];
        long[] jArr9 = new long[19];
        jArr9[0] = 1;
        int i14 = 10;
        System.arraycopy(jArrK, 0, jArr2, 0, 10);
        for (int i15 = 32; i11 < i15; i15 = 32) {
            int i16 = bArrCopyOf[31 - i11] & 255;
            int i17 = 0;
            while (i17 < 8) {
                int i18 = (i16 >> (7 - i17)) & 1;
                xs.a(jArr4, jArr2, i18);
                xs.a(jArr5, jArr3, i18);
                byte[] bArr5 = bArrCopyOf;
                long[] jArrCopyOf = Arrays.copyOf(jArr4, 10);
                int i19 = i16;
                long[] jArr10 = new long[19];
                int i21 = i11;
                long[] jArr11 = new long[19];
                int i22 = i17;
                long[] jArr12 = new long[19];
                long[] jArr13 = jArr;
                long[] jArr14 = new long[19];
                long[] jArr15 = new long[19];
                long[] jArr16 = jArr9;
                long[] jArr17 = new long[19];
                long[] jArr18 = new long[19];
                rt.i(jArr4, jArr4, jArr5);
                rt.h(jArr5, jArrCopyOf, jArr5);
                long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
                rt.i(jArr2, jArr2, jArr3);
                rt.h(jArr3, jArrCopyOf2, jArr3);
                rt.b(jArr14, jArr2, jArr5);
                rt.b(jArr15, jArr4, jArr3);
                rt.e(jArr14);
                rt.d(jArr14);
                rt.e(jArr15);
                rt.d(jArr15);
                long[] jArr19 = jArr2;
                System.arraycopy(jArr14, 0, jArrCopyOf2, 0, 10);
                rt.i(jArr14, jArr14, jArr15);
                rt.h(jArr15, jArrCopyOf2, jArr15);
                rt.g(jArr18, jArr14);
                rt.g(jArr17, jArr15);
                rt.b(jArr15, jArr17, jArrK);
                rt.e(jArr15);
                rt.d(jArr15);
                System.arraycopy(jArr18, 0, jArr6, 0, 10);
                System.arraycopy(jArr15, 0, jArr7, 0, 10);
                rt.g(jArr11, jArr4);
                rt.g(jArr12, jArr5);
                rt.b(jArr8, jArr11, jArr12);
                rt.e(jArr8);
                rt.d(jArr8);
                rt.h(jArr12, jArr11, jArr12);
                Arrays.fill(jArr10, 10, 18, 0L);
                rt.f(jArr10, jArr12, 121665L);
                rt.d(jArr10);
                rt.i(jArr10, jArr10, jArr11);
                rt.b(jArr16, jArr12, jArr10);
                rt.e(jArr16);
                rt.d(jArr16);
                xs.a(jArr8, jArr6, i18);
                xs.a(jArr16, jArr7, i18);
                i17 = i22 + 1;
                long[] jArr20 = jArr7;
                jArr7 = jArr3;
                jArr3 = jArr20;
                long[] jArr21 = jArr4;
                jArr4 = jArr8;
                jArr8 = jArr21;
                long[] jArr22 = jArr5;
                jArr5 = jArr16;
                jArr9 = jArr22;
                jArr2 = jArr6;
                i16 = i19;
                bArrCopyOf = bArr5;
                i11 = i21;
                jArr = jArr13;
                jArr6 = jArr19;
            }
            i11++;
            i14 = 10;
        }
        int i23 = i14;
        long[] jArr23 = jArr;
        long[] jArr24 = new long[i23];
        long[] jArr25 = new long[i23];
        long[] jArr26 = new long[i23];
        long[] jArr27 = new long[i23];
        long[] jArr28 = new long[i23];
        long[] jArr29 = new long[i23];
        long[] jArr30 = new long[i23];
        long[] jArr31 = new long[i23];
        long[] jArr32 = new long[i23];
        long[] jArr33 = new long[i23];
        long[] jArr34 = jArr2;
        long[] jArr35 = new long[i23];
        rt.g(jArr25, jArr5);
        rt.g(jArr35, jArr25);
        rt.g(jArr33, jArr35);
        rt.a(jArr26, jArr33, jArr5);
        rt.a(jArr27, jArr26, jArr25);
        rt.g(jArr33, jArr27);
        rt.a(jArr28, jArr33, jArr26);
        rt.g(jArr33, jArr28);
        rt.g(jArr35, jArr33);
        rt.g(jArr33, jArr35);
        rt.g(jArr35, jArr33);
        rt.g(jArr33, jArr35);
        rt.a(jArr29, jArr33, jArr28);
        rt.g(jArr33, jArr29);
        rt.g(jArr35, jArr33);
        for (int i24 = 2; i24 < 10; i24 += 2) {
            rt.g(jArr33, jArr35);
            rt.g(jArr35, jArr33);
        }
        rt.a(jArr30, jArr35, jArr29);
        rt.g(jArr33, jArr30);
        rt.g(jArr35, jArr33);
        for (int i25 = 2; i25 < 20; i25 += 2) {
            rt.g(jArr33, jArr35);
            rt.g(jArr35, jArr33);
        }
        rt.a(jArr33, jArr35, jArr30);
        rt.g(jArr35, jArr33);
        rt.g(jArr33, jArr35);
        for (int i26 = 2; i26 < 10; i26 += 2) {
            rt.g(jArr35, jArr33);
            rt.g(jArr33, jArr35);
        }
        rt.a(jArr31, jArr33, jArr29);
        rt.g(jArr33, jArr31);
        rt.g(jArr35, jArr33);
        for (int i27 = 2; i27 < 50; i27 += 2) {
            rt.g(jArr33, jArr35);
            rt.g(jArr35, jArr33);
        }
        rt.a(jArr32, jArr35, jArr31);
        rt.g(jArr35, jArr32);
        rt.g(jArr33, jArr35);
        for (int i28 = 2; i28 < 100; i28 += 2) {
            rt.g(jArr35, jArr33);
            rt.g(jArr33, jArr35);
        }
        rt.a(jArr35, jArr33, jArr32);
        rt.g(jArr33, jArr35);
        rt.g(jArr35, jArr33);
        for (int i29 = 2; i29 < 50; i29 += 2) {
            rt.g(jArr33, jArr35);
            rt.g(jArr35, jArr33);
        }
        rt.a(jArr33, jArr35, jArr31);
        rt.g(jArr35, jArr33);
        rt.g(jArr33, jArr35);
        rt.g(jArr35, jArr33);
        rt.g(jArr33, jArr35);
        rt.g(jArr35, jArr33);
        rt.a(jArr24, jArr35, jArr27);
        rt.a(jArr23, jArr4, jArr24);
        long[] jArr36 = new long[10];
        long[] jArr37 = new long[10];
        long[] jArr38 = new long[11];
        long[] jArr39 = new long[11];
        long[] jArr40 = new long[11];
        rt.a(jArr36, jArrK, jArr23);
        rt.i(jArr37, jArrK, jArr23);
        long[] jArr41 = new long[10];
        jArr41[0] = 486662;
        rt.i(jArr39, jArr37, jArr41);
        rt.a(jArr39, jArr39, jArr3);
        rt.i(jArr39, jArr39, jArr34);
        rt.a(jArr39, jArr39, jArr36);
        rt.a(jArr39, jArr39, jArr34);
        rt.f(jArr38, jArr39, 4L);
        rt.d(jArr38);
        rt.a(jArr39, jArr36, jArr3);
        rt.h(jArr39, jArr39, jArr3);
        rt.a(jArr40, jArr37, jArr34);
        rt.i(jArr39, jArr39, jArr40);
        rt.g(jArr39, jArr39);
        if (vs.b(rt.j(jArr38), rt.j(jArr39))) {
            return rt.j(jArr23);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(st.a(bArr2)));
    }

    public static byte[] b() {
        byte[] bArrA = zt.a(32);
        bArrA[0] = (byte) (bArrA[0] | 7);
        int i11 = bArrA[31] & 63;
        bArrA[31] = (byte) i11;
        bArrA[31] = (byte) (i11 | 128);
        return bArrA;
    }

    public static byte[] c(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return a(bArr, bArr2);
    }
}
