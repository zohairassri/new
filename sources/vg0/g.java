package vg0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
abstract class g {
    static void a(int[] iArr, int i11, int i12, int[] iArr2, int i13) {
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = iArr2[i15];
            iArr4[i16] = iArr4[i16] + 1;
        }
        iArr5[1] = 0;
        int i17 = 1;
        while (i17 < 15) {
            int i18 = i17 + 1;
            iArr5[i18] = iArr5[i17] + iArr4[i17];
            i17 = i18;
        }
        for (int i19 = 0; i19 < i13; i19++) {
            int i21 = iArr2[i19];
            if (i21 != 0) {
                int i22 = iArr5[i21];
                iArr5[i21] = i22 + 1;
                iArr3[i22] = i19;
            }
        }
        int i23 = 1 << i12;
        if (iArr5[15] == 1) {
            for (int i24 = 0; i24 < i23; i24++) {
                iArr[i11 + i24] = iArr3[0];
            }
            return;
        }
        int i25 = 2;
        int i26 = 2;
        int iB = 0;
        int i27 = 1;
        while (i27 <= i12) {
            while (iArr4[i27] > 0) {
                d(iArr, i11 + iB, i26, i23, iArr3[i14] | (i27 << 16));
                iB = b(iB, i27);
                iArr4[i27] = iArr4[i27] - 1;
                i14++;
            }
            i27++;
            i26 <<= 1;
        }
        int i28 = i23 - 1;
        int i29 = i12 + 1;
        int i31 = -1;
        int i32 = i11;
        while (i29 <= 15) {
            while (iArr4[i29] > 0) {
                int i33 = iB & i28;
                if (i33 != i31) {
                    i32 += i23;
                    int iC = c(iArr4, i29, i12);
                    iArr[i11 + i33] = ((iC + i12) << 16) | ((i32 - i11) - i33);
                    i23 = 1 << iC;
                    i31 = i33;
                }
                d(iArr, (iB >> i12) + i32, i25, i23, ((i29 - i12) << 16) | iArr3[i14]);
                iB = b(iB, i29);
                iArr4[i29] = iArr4[i29] - 1;
                i14++;
            }
            i29++;
            i25 <<= 1;
        }
    }

    private static int b(int i11, int i12) {
        int i13 = 1 << (i12 - 1);
        while ((i11 & i13) != 0) {
            i13 >>= 1;
        }
        return (i11 & (i13 - 1)) + i13;
    }

    private static int c(int[] iArr, int i11, int i12) {
        int i13;
        int i14 = 1 << (i11 - i12);
        while (i11 < 15 && (i13 = i14 - iArr[i11]) > 0) {
            i11++;
            i14 = i13 << 1;
        }
        return i11 - i12;
    }

    private static void d(int[] iArr, int i11, int i12, int i13, int i14) {
        do {
            i13 -= i12;
            iArr[i11 + i13] = i14;
        } while (i13 > 0);
    }
}
