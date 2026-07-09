package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class me4 {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        long jC = c(bArr, 0, 0);
        long jC2 = c(bArr, 3, 2) & 67108611;
        long jC3 = c(bArr, 6, 4) & 67092735;
        long jC4 = c(bArr, 9, 6) & 66076671;
        long jC5 = c(bArr, 12, 8) & 1048575;
        int i11 = 17;
        byte[] bArr3 = new byte[17];
        long j11 = 0;
        int i12 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        while (true) {
            int length = bArr2.length;
            if (i12 >= length) {
                long j16 = j11 + (j12 >> 26);
                long j17 = j16 & 67108863;
                long j18 = j13 + (j16 >> 26);
                long j19 = j18 & 67108863;
                long j21 = j14 + (j18 >> 26);
                long j22 = j21 & 67108863;
                long j23 = j15 + ((j21 >> 26) * 5);
                long j24 = j23 & 67108863;
                long j25 = j24 + 5;
                long j26 = (j12 & 67108863) + (j23 >> 26);
                long j27 = j26 + (j25 >> 26);
                long j28 = (j27 >> 26) + j17;
                long j29 = j19 + (j28 >> 26);
                long j31 = (j22 + (j29 >> 26)) - 67108864;
                long j32 = j31 >> 63;
                long j33 = ~j32;
                long j34 = (j26 & j32) | (j27 & 67108863 & j33);
                long j35 = (j17 & j32) | (j28 & 67108863 & j33);
                long j36 = (j19 & j32) | (j29 & 67108863 & j33);
                long j37 = (j22 & j32) | (j31 & j33);
                long jB = (((j32 & j24) | (j25 & 67108863 & j33) | (j34 << 26)) & 4294967295L) + b(bArr, 16);
                long jB2 = (((j34 >> 6) | (j35 << 20)) & 4294967295L) + b(bArr, 20);
                long jB3 = (((j35 >> 12) | (j36 << 14)) & 4294967295L) + b(bArr, 24);
                long jB4 = (((j36 >> 18) | (j37 << 8)) & 4294967295L) + b(bArr, 28);
                byte[] bArr4 = new byte[16];
                d(bArr4, jB & 4294967295L, 0);
                long j38 = jB2 + (jB >> 32);
                d(bArr4, j38 & 4294967295L, 4);
                long j39 = jB3 + (j38 >> 32);
                d(bArr4, j39 & 4294967295L, 8);
                d(bArr4, (jB4 + (j39 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i12);
            System.arraycopy(bArr2, i12, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i11, (byte) 0);
            }
            long j41 = jC5 * 5;
            long j42 = jC4 * 5;
            long j43 = jC3 * 5;
            long jC6 = j15 + c(bArr3, 0, 0);
            long jC7 = j12 + c(bArr3, 3, 2);
            long jC8 = j11 + c(bArr3, 6, 4);
            long jC9 = j13 + c(bArr3, 9, 6);
            long jC10 = j14 + (c(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j44 = jC7 * jC;
            long j45 = jC7 * jC2;
            long j46 = jC7 * jC3;
            long j47 = jC9 * jC;
            long j48 = jC7 * jC4;
            long j49 = jC10 * jC;
            long j51 = (jC6 * jC) + (jC7 * j41) + (jC8 * j42) + (jC9 * j43) + (jC2 * 5 * jC10);
            long j52 = (jC6 * jC2) + j44 + (jC8 * j41) + (jC9 * j42) + (j43 * jC10) + (j51 >> 26);
            long j53 = (jC6 * jC3) + j45 + (jC8 * jC) + (jC9 * j41) + (j42 * jC10) + (j52 >> 26);
            long j54 = (jC6 * jC4) + j46 + (jC8 * jC2) + j47 + (jC10 * j41) + (j53 >> 26);
            long j55 = (jC6 * jC5) + j48 + (jC8 * jC3) + (jC9 * jC2) + j49 + (j54 >> 26);
            long j56 = (j51 & 67108863) + ((j55 >> 26) * 5);
            j12 = (j52 & 67108863) + (j56 >> 26);
            i12 += 16;
            j11 = j53 & 67108863;
            j13 = j54 & 67108863;
            j14 = j55 & 67108863;
            i11 = 17;
            j15 = j56 & 67108863;
        }
    }

    private static long b(byte[] bArr, int i11) {
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((long) (((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16))) & 4294967295L;
    }

    private static long c(byte[] bArr, int i11, int i12) {
        return (b(bArr, i11) >> i12) & 67108863;
    }

    private static void d(byte[] bArr, long j11, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            bArr[i11 + i12] = (byte) (255 & j11);
            j11 >>= 8;
        }
    }
}
