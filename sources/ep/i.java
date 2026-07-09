package ep;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class i {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jC = c(bArr, 0, 0) & 67108863;
        int i11 = 3;
        int i12 = 2;
        long jC2 = c(bArr, 3, 2) & 67108611;
        long jC3 = c(bArr, 6, 4) & 67092735;
        long jC4 = c(bArr, 9, 6) & 66076671;
        long jC5 = c(bArr, 12, 8) & 1048575;
        long j11 = jC2 * 5;
        long j12 = jC3 * 5;
        long j13 = jC4 * 5;
        long j14 = jC5 * 5;
        byte[] bArr3 = new byte[17];
        long j15 = 0;
        int i13 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        while (i13 < bArr2.length) {
            b(bArr3, bArr2, i13);
            long jC6 = j19 + c(bArr3, 0, 0);
            long jC7 = j15 + c(bArr3, i11, i12);
            long jC8 = j16 + c(bArr3, 6, 4);
            long jC9 = j17 + c(bArr3, 9, 6);
            long j21 = jC2;
            long jC10 = j18 + (c(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j22 = (jC6 * jC) + (jC7 * j14) + (jC8 * j13) + (jC9 * j12) + (jC10 * j11);
            long j23 = (jC6 * j21) + (jC7 * jC) + (jC8 * j14) + (jC9 * j13) + (jC10 * j12);
            long j24 = (jC6 * jC3) + (jC7 * j21) + (jC8 * jC) + (jC9 * j14) + (jC10 * j13);
            long j25 = (jC6 * jC4) + (jC7 * jC3) + (jC8 * j21) + (jC9 * jC) + (jC10 * j14);
            long j26 = (jC6 * jC5) + (jC7 * jC4) + (jC8 * jC3) + (jC9 * j21) + (jC10 * jC);
            long j27 = j23 + (j22 >> 26);
            long j28 = j24 + (j27 >> 26);
            j16 = j28 & 67108863;
            long j29 = j25 + (j28 >> 26);
            j17 = j29 & 67108863;
            long j31 = j26 + (j29 >> 26);
            j18 = j31 & 67108863;
            long j32 = (j22 & 67108863) + ((j31 >> 26) * 5);
            j19 = j32 & 67108863;
            j15 = (j27 & 67108863) + (j32 >> 26);
            i13 += 16;
            jC2 = j21;
            i11 = 3;
            i12 = 2;
        }
        long j33 = j16 + (j15 >> 26);
        long j34 = j33 & 67108863;
        long j35 = j17 + (j33 >> 26);
        long j36 = j35 & 67108863;
        long j37 = j18 + (j35 >> 26);
        long j38 = j37 & 67108863;
        long j39 = j19 + ((j37 >> 26) * 5);
        long j41 = j39 & 67108863;
        long j42 = (j15 & 67108863) + (j39 >> 26);
        long j43 = j41 + 5;
        long j44 = j43 & 67108863;
        long j45 = (j43 >> 26) + j42;
        long j46 = j34 + (j45 >> 26);
        long j47 = j36 + (j46 >> 26);
        long j48 = j47 & 67108863;
        long j49 = (j38 + (j47 >> 26)) - 67108864;
        long j51 = j49 >> 63;
        long j52 = j41 & j51;
        long j53 = j42 & j51;
        long j54 = j34 & j51;
        long j55 = j36 & j51;
        long j56 = j38 & j51;
        long j57 = ~j51;
        long j58 = (j45 & 67108863 & j57) | j53;
        long j59 = (j46 & 67108863 & j57) | j54;
        long j61 = (j48 & j57) | j55;
        long j62 = j56 | (j49 & j57);
        long j63 = (j52 | (j44 & j57) | (j58 << 26)) & 4294967295L;
        long j64 = ((j58 >> 6) | (j59 << 20)) & 4294967295L;
        long j65 = ((j59 >> 12) | (j61 << 14)) & 4294967295L;
        long j66 = ((j61 >> 18) | (j62 << 8)) & 4294967295L;
        long jD = j63 + d(bArr, 16);
        long j67 = jD & 4294967295L;
        long jD2 = j64 + d(bArr, 20) + (jD >> 32);
        long j68 = jD2 & 4294967295L;
        long jD3 = j65 + d(bArr, 24) + (jD2 >> 32);
        long j69 = jD3 & 4294967295L;
        long jD4 = (j66 + d(bArr, 28) + (jD3 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        e(bArr4, j67, 0);
        e(bArr4, j68, 4);
        e(bArr4, j69, 8);
        e(bArr4, jD4, 12);
        return bArr4;
    }

    private static void b(byte[] bArr, byte[] bArr2, int i11) {
        int iMin = Math.min(16, bArr2.length - i11);
        System.arraycopy(bArr2, i11, bArr, 0, iMin);
        bArr[iMin] = 1;
        if (iMin != 16) {
            Arrays.fill(bArr, iMin + 1, bArr.length, (byte) 0);
        }
    }

    private static long c(byte[] bArr, int i11, int i12) {
        return (d(bArr, i11) >> i12) & 67108863;
    }

    private static long d(byte[] bArr, int i11) {
        return ((long) (((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16))) & 4294967295L;
    }

    private static void e(byte[] bArr, long j11, int i11) {
        int i12 = 0;
        while (i12 < 4) {
            bArr[i11 + i12] = (byte) (255 & j11);
            i12++;
            j11 >>= 8;
        }
    }

    public static void f(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!qp.f.b(a(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
