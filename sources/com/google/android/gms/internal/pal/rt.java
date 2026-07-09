package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class rt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f41739a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f41740b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f41741c = {67108863, 33554431};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f41742d = {26, 25};

    static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        b(jArr4, jArr2, jArr3);
        c(jArr4, jArr);
    }

    static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j11 = jArr2[0];
        long j12 = jArr3[1] * j11;
        long j13 = jArr2[1];
        long j14 = jArr3[0];
        jArr[1] = j12 + (j13 * j14);
        long j15 = jArr2[1];
        long j16 = jArr3[1];
        jArr[2] = ((j15 + j15) * j16) + (jArr3[2] * j11) + (jArr2[2] * j14);
        long j17 = jArr3[2];
        long j18 = jArr2[2];
        jArr[3] = (j15 * j17) + (j18 * j16) + (jArr3[3] * j11) + (jArr2[3] * j14);
        long j19 = jArr3[3];
        long j21 = jArr2[3];
        long j22 = (j15 * j19) + (j21 * j16);
        jArr[4] = (j18 * j17) + j22 + j22 + (jArr3[4] * j11) + (jArr2[4] * j14);
        long j23 = jArr3[4];
        long j24 = jArr2[4];
        jArr[5] = (j18 * j19) + (j21 * j17) + (j15 * j23) + (j24 * j16) + (jArr3[5] * j11) + (jArr2[5] * j14);
        long j25 = jArr3[5];
        long j26 = jArr2[5];
        long j27 = (j21 * j19) + (j15 * j25) + (j26 * j16);
        jArr[6] = j27 + j27 + (j18 * j23) + (j24 * j17) + (jArr3[6] * j11) + (jArr2[6] * j14);
        long j28 = jArr3[6];
        long j29 = jArr2[6];
        jArr[7] = (j21 * j23) + (j24 * j19) + (j18 * j25) + (j26 * j17) + (j15 * j28) + (j29 * j16) + (jArr3[7] * j11) + (jArr2[7] * j14);
        long j31 = jArr3[7];
        long j32 = jArr2[7];
        long j33 = (j21 * j25) + (j26 * j19) + (j15 * j31) + (j32 * j16);
        jArr[8] = (j24 * j23) + j33 + j33 + (j18 * j28) + (j29 * j17) + (jArr3[8] * j11) + (jArr2[8] * j14);
        long j34 = jArr3[8];
        long j35 = jArr2[8];
        jArr[9] = (j24 * j25) + (j26 * j23) + (j21 * j28) + (j29 * j19) + (j18 * j31) + (j32 * j17) + (j15 * j34) + (j35 * j16) + (j11 * jArr3[9]) + (jArr2[9] * j14);
        long j36 = jArr3[9];
        long j37 = jArr2[9];
        long j38 = (j26 * j25) + (j21 * j31) + (j32 * j19) + (j15 * j36) + (j16 * j37);
        jArr[10] = j38 + j38 + (j24 * j28) + (j29 * j23) + (j18 * j34) + (j35 * j17);
        jArr[11] = (j26 * j28) + (j29 * j25) + (j24 * j31) + (j32 * j23) + (j21 * j34) + (j35 * j19) + (j18 * j36) + (j17 * j37);
        long j39 = (j26 * j31) + (j32 * j25) + (j21 * j36) + (j19 * j37);
        jArr[12] = (j29 * j28) + j39 + j39 + (j24 * j34) + (j35 * j23);
        jArr[13] = (j29 * j31) + (j32 * j28) + (j26 * j34) + (j35 * j25) + (j24 * j36) + (j23 * j37);
        long j41 = (j32 * j31) + (j26 * j36) + (j25 * j37);
        jArr[14] = j41 + j41 + (j29 * j34) + (j35 * j28);
        jArr[15] = (j32 * j34) + (j35 * j31) + (j29 * j36) + (j28 * j37);
        long j42 = (j32 * j36) + (j31 * j37);
        jArr[16] = (j35 * j34) + j42 + j42;
        jArr[17] = (j35 * j36) + (j34 * j37);
        jArr[18] = (j37 + j37) * j36;
    }

    static void c(long[] jArr, long[] jArr2) {
        e(jArr);
        d(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    static void d(long[] jArr) {
        jArr[10] = 0;
        int i11 = 0;
        while (i11 < 10) {
            long j11 = jArr[i11];
            long j12 = j11 / 67108864;
            jArr[i11] = j11 - (j12 << 26);
            int i12 = i11 + 1;
            long j13 = jArr[i12] + j12;
            jArr[i12] = j13;
            long j14 = j13 / 33554432;
            jArr[i12] = j13 - (j14 << 25);
            i11 += 2;
            jArr[i11] = jArr[i11] + j14;
        }
        long j15 = jArr[0];
        long j16 = jArr[10];
        long j17 = j15 + (j16 << 4);
        jArr[0] = j17;
        long j18 = j17 + j16 + j16;
        jArr[0] = j18;
        long j19 = j18 + j16;
        jArr[0] = j19;
        jArr[10] = 0;
        long j21 = j19 / 67108864;
        jArr[0] = j19 - (j21 << 26);
        jArr[1] = jArr[1] + j21;
    }

    static void e(long[] jArr) {
        long j11 = jArr[8];
        long j12 = jArr[18];
        long j13 = j11 + (j12 << 4);
        jArr[8] = j13;
        long j14 = j13 + j12 + j12;
        jArr[8] = j14;
        jArr[8] = j14 + j12;
        long j15 = jArr[7];
        long j16 = jArr[17];
        long j17 = j15 + (j16 << 4);
        jArr[7] = j17;
        long j18 = j17 + j16 + j16;
        jArr[7] = j18;
        jArr[7] = j18 + j16;
        long j19 = jArr[6];
        long j21 = jArr[16];
        long j22 = j19 + (j21 << 4);
        jArr[6] = j22;
        long j23 = j22 + j21 + j21;
        jArr[6] = j23;
        jArr[6] = j23 + j21;
        long j24 = jArr[5];
        long j25 = jArr[15];
        long j26 = j24 + (j25 << 4);
        jArr[5] = j26;
        long j27 = j26 + j25 + j25;
        jArr[5] = j27;
        jArr[5] = j27 + j25;
        long j28 = jArr[4];
        long j29 = jArr[14];
        long j31 = j28 + (j29 << 4);
        jArr[4] = j31;
        long j32 = j31 + j29 + j29;
        jArr[4] = j32;
        jArr[4] = j32 + j29;
        long j33 = jArr[3];
        long j34 = jArr[13];
        long j35 = j33 + (j34 << 4);
        jArr[3] = j35;
        long j36 = j35 + j34 + j34;
        jArr[3] = j36;
        jArr[3] = j36 + j34;
        long j37 = jArr[2];
        long j38 = jArr[12];
        long j39 = j37 + (j38 << 4);
        jArr[2] = j39;
        long j41 = j39 + j38 + j38;
        jArr[2] = j41;
        jArr[2] = j41 + j38;
        long j42 = jArr[1];
        long j43 = jArr[11];
        long j44 = j42 + (j43 << 4);
        jArr[1] = j44;
        long j45 = j44 + j43 + j43;
        jArr[1] = j45;
        jArr[1] = j45 + j43;
        long j46 = jArr[0];
        long j47 = jArr[10];
        long j48 = j46 + (j47 << 4);
        jArr[0] = j48;
        long j49 = j48 + j47 + j47;
        jArr[0] = j49;
        jArr[0] = j49 + j47;
    }

    static void f(long[] jArr, long[] jArr2, long j11) {
        for (int i11 = 0; i11 < 10; i11++) {
            jArr[i11] = jArr2[i11] * j11;
        }
    }

    static void g(long[] jArr, long[] jArr2) {
        long j11 = jArr2[0];
        long j12 = j11 * j11;
        long j13 = jArr2[1];
        long j14 = (j11 + j11) * j13;
        long j15 = jArr2[2];
        long j16 = (j13 * j13) + (j11 * j15);
        long j17 = jArr2[3];
        long j18 = (j13 * j15) + (j11 * j17);
        long j19 = jArr2[4];
        long j21 = (j15 * j15) + (j13 * 4 * j17) + ((j11 + j11) * j19);
        long j22 = jArr2[5];
        long j23 = (j15 * j17) + (j13 * j19) + (j11 * j22);
        long j24 = jArr2[6];
        long j25 = (j17 * j17) + (j15 * j19) + (j11 * j24) + ((j13 + j13) * j22);
        long j26 = jArr2[7];
        long j27 = (j17 * j19) + (j15 * j22) + (j13 * j24) + (j11 * j26);
        long j28 = jArr2[8];
        long j29 = (j13 * j26) + (j17 * j22);
        long j31 = (j15 * j24) + (j11 * j28) + j29 + j29;
        long j32 = (j19 * j19) + j31 + j31;
        long j33 = jArr2[9];
        long j34 = (j19 * j22) + (j17 * j24) + (j15 * j26) + (j13 * j28) + (j11 * j33);
        long j35 = (j17 * j26) + (j13 * j33);
        long j36 = (j22 * j22) + (j19 * j24) + (j15 * j28) + j35 + j35;
        long j37 = (j22 * j24) + (j19 * j26) + (j17 * j28) + (j15 * j33);
        long j38 = (j22 * j26) + (j17 * j33);
        long j39 = (j19 * j28) + j38 + j38;
        long j41 = (j24 * j24) + j39 + j39;
        long j42 = (j24 * j26) + (j22 * j28) + (j19 * j33);
        long j43 = (j26 * j26) + (j24 * j28) + ((j22 + j22) * j33);
        long j44 = (j26 * j28) + (j24 * j33);
        c(new long[]{j12, j14, j16 + j16, j18 + j18, j21, j23 + j23, j25 + j25, j27 + j27, j32, j34 + j34, j36 + j36, j37 + j37, j41, j42 + j42, j43 + j43, j44 + j44, (j28 * j28) + (j26 * 4 * j33), (j28 + j28) * j33, (j33 + j33) * j33}, jArr);
    }

    static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 10; i11++) {
            jArr[i11] = jArr2[i11] - jArr3[i11];
        }
    }

    static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 10; i11++) {
            jArr[i11] = jArr2[i11] + jArr3[i11];
        }
    }

    static byte[] j(long[] jArr) {
        int i11;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i12 = 0;
        while (true) {
            if (i12 >= 2) {
                break;
            }
            int i13 = 0;
            while (i13 < 9) {
                long j11 = jArrCopyOf[i13];
                int i14 = f41742d[i13 & 1];
                int i15 = -((int) (((j11 >> 31) & j11) >> i14));
                jArrCopyOf[i13] = j11 + ((long) (i15 << i14));
                i13++;
                jArrCopyOf[i13] = jArrCopyOf[i13] - ((long) i15);
            }
            long j12 = jArrCopyOf[9];
            int i16 = -((int) (((j12 >> 31) & j12) >> 25));
            jArrCopyOf[9] = j12 + ((long) (i16 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - ((long) (i16 * 19));
            i12++;
        }
        long j13 = jArrCopyOf[0];
        int i17 = -((int) (((j13 >> 31) & j13) >> 26));
        jArrCopyOf[0] = j13 + ((long) (i17 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i17);
        for (int i18 = 0; i18 < 2; i18++) {
            int i19 = 0;
            while (i19 < 9) {
                long j14 = jArrCopyOf[i19];
                int i21 = i19 & 1;
                int i22 = f41742d[i21];
                jArrCopyOf[i19] = ((long) f41741c[i21]) & j14;
                i19++;
                jArrCopyOf[i19] = jArrCopyOf[i19] + ((long) ((int) (j14 >> i22)));
            }
        }
        long j15 = jArrCopyOf[9];
        jArrCopyOf[9] = 33554431 & j15;
        jArrCopyOf[0] = jArrCopyOf[0] + ((long) (((int) (j15 >> 25)) * 19));
        int i23 = ~((((int) r10) - 67108845) >> 31);
        for (int i24 = 1; i24 < 10; i24++) {
            int i25 = ~(((int) jArrCopyOf[i24]) ^ f41741c[i24 & 1]);
            int i26 = i25 & (i25 << 16);
            int i27 = i26 & (i26 << 8);
            int i28 = i27 & (i27 << 4);
            int i29 = i28 & (i28 << 2);
            i23 &= (i29 & (i29 + i29)) >> 31;
        }
        jArrCopyOf[0] = jArrCopyOf[0] - ((long) (67108845 & i23));
        long j16 = 33554431 & i23;
        jArrCopyOf[1] = jArrCopyOf[1] - j16;
        for (i11 = 2; i11 < 10; i11 += 2) {
            jArrCopyOf[i11] = jArrCopyOf[i11] - ((long) (67108863 & i23));
            int i31 = i11 + 1;
            jArrCopyOf[i31] = jArrCopyOf[i31] - j16;
        }
        for (int i32 = 0; i32 < 10; i32++) {
            jArrCopyOf[i32] = jArrCopyOf[i32] << f41740b[i32];
        }
        byte[] bArr = new byte[32];
        for (int i33 = 0; i33 < 10; i33++) {
            int i34 = f41739a[i33];
            byte b11 = bArr[i34];
            long j17 = jArrCopyOf[i33];
            bArr[i34] = (byte) (((long) b11) | (j17 & 255));
            bArr[i34 + 1] = (byte) (((long) bArr[r4]) | ((j17 >> 8) & 255));
            bArr[i34 + 2] = (byte) (((long) bArr[r4]) | ((j17 >> 16) & 255));
            bArr[i34 + 3] = (byte) (((j17 >> 24) & 255) | ((long) bArr[r3]));
        }
        return bArr;
    }

    static long[] k(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = f41739a[i11];
            jArr[i11] = ((((((long) (bArr[i12] & 255)) | (((long) (bArr[i12 + 1] & 255)) << 8)) | (((long) (bArr[i12 + 2] & 255)) << 16)) | (((long) (bArr[i12 + 3] & 255)) << 24)) >> f41740b[i11]) & ((long) f41741c[i11 & 1]);
        }
        return jArr;
    }
}
