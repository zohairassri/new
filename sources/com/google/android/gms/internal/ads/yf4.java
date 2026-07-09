package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class yf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f38480a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f38481b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f38482c = {67108863, 33554431};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f38483d = {26, 25};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f38484e = 0;

    static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 10; i11++) {
            jArr[i11] = jArr2[i11] + jArr3[i11];
        }
    }

    static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 10; i11++) {
            jArr[i11] = jArr2[i11] - jArr3[i11];
        }
    }

    static void c(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
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

    static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        long j11 = jArr2[0];
        long j12 = jArr3[0];
        long j13 = j11 * j12;
        long j14 = jArr3[1];
        long j15 = jArr2[1];
        long j16 = (j11 * j14) + (j15 * j12);
        long j17 = jArr3[2];
        long j18 = jArr2[2];
        long j19 = ((j15 + j15) * j14) + (j11 * j17) + (j18 * j12);
        long j21 = jArr3[3];
        long j22 = jArr2[3];
        long j23 = (j15 * j17) + (j18 * j14) + (j11 * j21) + (j22 * j12);
        long j24 = jArr3[4];
        long j25 = jArr2[4];
        long j26 = (j15 * j21) + (j22 * j14);
        long j27 = (j18 * j17) + j26 + j26 + (j11 * j24) + (j25 * j12);
        long j28 = jArr3[5];
        long j29 = jArr2[5];
        long j31 = (j18 * j21) + (j22 * j17) + (j15 * j24) + (j25 * j14) + (j11 * j28) + (j29 * j12);
        long j32 = jArr3[6];
        long j33 = jArr2[6];
        long j34 = (j22 * j21) + (j15 * j28) + (j29 * j14);
        long j35 = j34 + j34 + (j18 * j24) + (j25 * j17) + (j11 * j32) + (j33 * j12);
        long j36 = jArr3[7];
        long j37 = jArr2[7];
        long j38 = (j22 * j24) + (j25 * j21) + (j18 * j28) + (j29 * j17) + (j15 * j32) + (j33 * j14) + (j11 * j36) + (j37 * j12);
        long j39 = jArr3[8];
        long j41 = jArr2[8];
        long j42 = (j22 * j28) + (j29 * j21) + (j15 * j36) + (j37 * j14);
        long j43 = (j25 * j24) + j42 + j42 + (j18 * j32) + (j33 * j17) + (j11 * j39) + (j41 * j12);
        long j44 = jArr3[9];
        long j45 = jArr2[9];
        long j46 = (j25 * j28) + (j29 * j24) + (j22 * j32) + (j33 * j21) + (j18 * j36) + (j37 * j17) + (j15 * j39) + (j41 * j14) + (j11 * j44) + (j12 * j45);
        long j47 = (j29 * j28) + (j22 * j36) + (j37 * j21) + (j15 * j44) + (j14 * j45);
        long j48 = (j29 * j36) + (j37 * j28) + (j22 * j44) + (j21 * j45);
        long j49 = (j37 * j36) + (j29 * j44) + (j28 * j45);
        long j51 = (j37 * j39) + (j41 * j36) + (j33 * j44) + (j32 * j45);
        long j52 = (j37 * j44) + (j36 * j45);
        c(new long[]{j13, j16, j19, j23, j27, j31, j35, j38, j43, j46, j47 + j47 + (j25 * j32) + (j33 * j24) + (j18 * j39) + (j41 * j17), (j29 * j32) + (j33 * j28) + (j25 * j36) + (j37 * j24) + (j22 * j39) + (j41 * j21) + (j18 * j44) + (j17 * j45), (j33 * j32) + j48 + j48 + (j25 * j39) + (j41 * j24), (j33 * j36) + (j37 * j32) + (j29 * j39) + (j41 * j28) + (j25 * j44) + (j24 * j45), j49 + j49 + (j33 * j39) + (j41 * j32), j51, (j41 * j39) + j52 + j52, (j41 * j44) + (j39 * j45), (j45 + j45) * j44}, jArr);
    }

    static void f(long[] jArr, long[] jArr2) {
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
        long j41 = (j24 * j26) + (j22 * j28) + (j19 * j33);
        long j42 = (j26 * j26) + (j24 * j28) + ((j22 + j22) * j33);
        long j43 = (j26 * j28) + (j24 * j33);
        c(new long[]{j12, j14, j16 + j16, j18 + j18, j21, j23 + j23, j25 + j25, j27 + j27, j32, j34 + j34, j36 + j36, j37 + j37, (j24 * j24) + j39 + j39, j41 + j41, j42 + j42, j43 + j43, (j28 * j28) + (j26 * 4 * j33), (j28 + j28) * j33, (j33 + j33) * j33}, jArr);
    }

    static long[] g(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = f38480a[i11];
            int i13 = bArr[i12] & 255;
            int i14 = bArr[i12 + 1] & 255;
            long j11 = ((long) i13) | (((long) i14) << 8);
            jArr[i11] = (((j11 | (((long) (bArr[i12 + 2] & 255)) << 16)) | (((long) (bArr[i12 + 3] & 255)) << 24)) >> f38481b[i11]) & ((long) f38482c[i11 & 1]);
        }
        return jArr;
    }

    public static byte[] h(long[] jArr) {
        int i11;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= 2) {
                break;
            }
            int i14 = 0;
            while (i14 < 9) {
                long j11 = jArrCopyOf[i14];
                int i15 = f38483d[i14 & 1];
                int i16 = -((int) (((j11 >> 31) & j11) >> i15));
                jArrCopyOf[i14] = j11 + ((long) (i16 << i15));
                i14++;
                jArrCopyOf[i14] = jArrCopyOf[i14] - ((long) i16);
            }
            long j12 = jArrCopyOf[9];
            int i17 = -((int) (((j12 >> 31) & j12) >> 25));
            jArrCopyOf[9] = j12 + ((long) (i17 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i17) * 19);
            i13++;
        }
        long j13 = jArrCopyOf[0];
        int i18 = -((int) (((j13 >> 31) & j13) >> 26));
        jArrCopyOf[0] = j13 + ((long) (i18 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i18);
        int i19 = 0;
        while (i19 < 2) {
            int i21 = i12;
            while (i21 < 9) {
                long j14 = jArrCopyOf[i21];
                int i22 = i21 & 1;
                int i23 = i12;
                long j15 = j14 >> f38483d[i22];
                jArrCopyOf[i21] = j14 & ((long) f38482c[i22]);
                i21++;
                jArrCopyOf[i21] = jArrCopyOf[i21] + ((long) ((int) j15));
                i12 = i23;
                i19 = i19;
            }
            i19++;
        }
        int i24 = i12;
        long j16 = jArrCopyOf[9];
        jArrCopyOf[9] = j16 & 33554431;
        jArrCopyOf[i24] = jArrCopyOf[i24] + (((long) ((int) (j16 >> 25))) * 19);
        int i25 = ~((((int) r2) - 67108845) >> 31);
        for (int i26 = 1; i26 < 10; i26++) {
            int i27 = ~(((int) jArrCopyOf[i26]) ^ f38482c[i26 & 1]);
            int i28 = i27 & (i27 << 16);
            int i29 = i28 & (i28 << 8);
            int i31 = i29 & (i29 << 4);
            int i32 = i31 & (i31 << 2);
            i25 &= (i32 & (i32 + i32)) >> 31;
        }
        jArrCopyOf[i24] = jArrCopyOf[i24] - ((long) (67108845 & i25));
        long j17 = 33554431 & i25;
        jArrCopyOf[1] = jArrCopyOf[1] - j17;
        for (i11 = 2; i11 < 10; i11 += 2) {
            jArrCopyOf[i11] = jArrCopyOf[i11] - ((long) (67108863 & i25));
            int i33 = i11 + 1;
            jArrCopyOf[i33] = jArrCopyOf[i33] - j17;
        }
        for (int i34 = i24; i34 < 10; i34++) {
            jArrCopyOf[i34] = jArrCopyOf[i34] << f38481b[i34];
        }
        byte[] bArr = new byte[32];
        for (int i35 = i24; i35 < 10; i35++) {
            int i36 = f38480a[i35];
            long j18 = bArr[i36];
            long j19 = jArrCopyOf[i35];
            bArr[i36] = (byte) (j18 | (j19 & 255));
            bArr[i36 + 1] = (byte) (((long) bArr[r5]) | ((j19 >> 8) & 255));
            bArr[i36 + 2] = (byte) (((long) bArr[r5]) | ((j19 >> 16) & 255));
            bArr[i36 + 3] = (byte) (((long) bArr[r4]) | ((j19 >> 24) & 255));
        }
        return bArr;
    }
}
