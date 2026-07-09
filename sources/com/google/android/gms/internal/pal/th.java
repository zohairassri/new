package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class th {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        long jB = b(bArr, 0, 0);
        long jB2 = b(bArr, 3, 2) & 67108611;
        long jB3 = b(bArr, 6, 4) & 67092735;
        long jB4 = b(bArr, 9, 6) & 66076671;
        long jB5 = b(bArr, 12, 8) & 1048575;
        long j11 = jB2 * 5;
        long j12 = jB3 * 5;
        long j13 = jB4 * 5;
        long j14 = jB5 * 5;
        int i11 = 17;
        byte[] bArr3 = new byte[17];
        long j15 = 0;
        int i12 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        while (true) {
            int length = bArr2.length;
            if (i12 >= length) {
                long j21 = j15 + (j16 >> 26);
                long j22 = j21 & 67108863;
                long j23 = j17 + (j21 >> 26);
                long j24 = j23 & 67108863;
                long j25 = j18 + (j23 >> 26);
                long j26 = j25 & 67108863;
                long j27 = j19 + ((j25 >> 26) * 5);
                long j28 = j27 & 67108863;
                long j29 = (j16 & 67108863) + (j27 >> 26);
                long j31 = j28 + 5;
                long j32 = (j31 >> 26) + j29;
                long j33 = j22 + (j32 >> 26);
                long j34 = j24 + (j33 >> 26);
                long j35 = (j26 + (j34 >> 26)) - 67108864;
                long j36 = j35 >> 63;
                long j37 = ~j36;
                long j38 = (j29 & j36) | (j32 & 67108863 & j37);
                long j39 = (j22 & j36) | (j33 & 67108863 & j37);
                long j41 = (j24 & j36) | (j34 & 67108863 & j37);
                long jC = (((j28 & j36) | (j31 & 67108863 & j37) | (j38 << 26)) & 4294967295L) + c(bArr, 16);
                long jC2 = (((j38 >> 6) | (j39 << 20)) & 4294967295L) + c(bArr, 20) + (jC >> 32);
                long jC3 = (((j39 >> 12) | (j41 << 14)) & 4294967295L) + c(bArr, 24) + (jC2 >> 32);
                long jC4 = c(bArr, 28);
                byte[] bArr4 = new byte[16];
                d(bArr4, jC & 4294967295L, 0);
                d(bArr4, jC2 & 4294967295L, 4);
                d(bArr4, jC3 & 4294967295L, 8);
                d(bArr4, ((((j41 >> 18) | (((j36 & j26) | (j35 & j37)) << 8)) & 4294967295L) + jC4 + (jC3 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i12);
            System.arraycopy(bArr2, i12, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i11, (byte) 0);
            }
            long jB6 = j19 + b(bArr3, 0, 0);
            long jB7 = j16 + b(bArr3, 3, 2);
            long jB8 = j15 + b(bArr3, 6, 4);
            long jB9 = j17 + b(bArr3, 9, 6);
            long jB10 = j18 + (b(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j42 = (jB6 * jB) + (jB7 * j14) + (jB8 * j13) + (jB9 * j12) + (jB10 * j11);
            long j43 = (jB6 * jB2) + (jB7 * jB) + (jB8 * j14) + (jB9 * j13) + (jB10 * j12) + (j42 >> 26);
            long j44 = (jB6 * jB3) + (jB7 * jB2) + (jB8 * jB) + (jB9 * j14) + (jB10 * j13) + (j43 >> 26);
            long j45 = (jB6 * jB4) + (jB7 * jB3) + (jB8 * jB2) + (jB9 * jB) + (jB10 * j14) + (j44 >> 26);
            long j46 = (jB6 * jB5) + (jB7 * jB4) + (jB8 * jB3) + (jB9 * jB2) + (jB10 * jB) + (j45 >> 26);
            j18 = j46 & 67108863;
            long j47 = (j42 & 67108863) + ((j46 >> 26) * 5);
            j19 = j47 & 67108863;
            j16 = (j43 & 67108863) + (j47 >> 26);
            i12 += 16;
            j17 = j45 & 67108863;
            j15 = j44 & 67108863;
            i11 = 17;
        }
    }

    private static long b(byte[] bArr, int i11, int i12) {
        return (c(bArr, i11) >> i12) & 67108863;
    }

    private static long c(byte[] bArr, int i11) {
        return ((long) (((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16))) & 4294967295L;
    }

    private static void d(byte[] bArr, long j11, int i11) {
        int i12 = 0;
        while (i12 < 4) {
            bArr[i11 + i12] = (byte) (255 & j11);
            i12++;
            j11 >>= 8;
        }
    }
}
