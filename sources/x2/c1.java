package x2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {
    private static final void b(z zVar, q qVar) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < zVar.c()) {
            int i14 = i11 + 2;
            int iB = zVar.b(i11) - zVar.b(i14);
            int iB2 = zVar.b(i11 + 1) - zVar.b(i14);
            int iB3 = zVar.b(i14);
            i11 += 3;
            while (i12 < iB) {
                qVar.b(i13, i12);
                i12++;
            }
            while (i13 < iB2) {
                qVar.c(i13);
                i13++;
            }
            while (true) {
                int i15 = iB3 - 1;
                if (iB3 > 0) {
                    qVar.d(i12, i13);
                    i12++;
                    i13++;
                    iB3 = i15;
                }
            }
        }
    }

    private static final boolean c(int i11, int i12, int i13, int i14, q qVar, int[] iArr, int[] iArr2, int i15, int[] iArr3) {
        int iB;
        int i16;
        int i17;
        int i18 = (i12 - i11) - (i14 - i13);
        boolean z11 = (i18 & 1) == 0;
        int i19 = -i15;
        for (int i21 = i19; i21 <= i15; i21 += 2) {
            if (i21 == i19 || (i21 != i15 && f.b(iArr2, i21 + 1) < f.b(iArr2, i21 - 1))) {
                iB = f.b(iArr2, i21 + 1);
                i16 = iB;
            } else {
                iB = f.b(iArr2, i21 - 1);
                i16 = iB - 1;
            }
            int i22 = i14 - ((i12 - i16) - i21);
            int i23 = ((i15 != 0 ? 1 : 0) & (i16 == iB ? 1 : 0)) + i22;
            while (i16 > i11 && i22 > i13) {
                if (!qVar.a(i16 - 1, i22 - 1)) {
                    break;
                }
                i16--;
                i22--;
            }
            f.d(iArr2, i21, i16);
            if (z11 && (i17 = i18 - i21) >= i19 && i17 <= i15) {
                if (f.b(iArr, i17) >= i16) {
                    f(i16, i22, iB, i23, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final z d(int i11, int i12, q qVar) {
        char c11 = 1;
        int i13 = ((i11 + i12) + 1) / 2;
        z zVar = new z(i13 * 3);
        z zVar2 = new z(i13 * 4);
        zVar2.h(0, i11, 0, i12);
        int i14 = (i13 * 2) + 1;
        int[] iArrA = f.a(new int[i14]);
        int[] iArrA2 = f.a(new int[i14]);
        int[] iArrB = d2.b(new int[5]);
        while (zVar2.d()) {
            int iF = zVar2.f();
            int iF2 = zVar2.f();
            int iF3 = zVar2.f();
            int iF4 = zVar2.f();
            int[] iArr = iArrB;
            if (h(iF4, iF3, iF2, iF, qVar, iArrA, iArrA2, iArrB)) {
                char c12 = c11;
                if (Math.min(iArr[2] - iArr[0], iArr[3] - iArr[c11]) > 0) {
                    d2.a(iArr, zVar);
                }
                zVar2.h(iF4, iArr[0], iF2, iArr[c12]);
                zVar2.h(iArr[2], iF3, iArr[3], iF);
                iArrB = iArr;
                c11 = c12;
            } else {
                iArrB = iArr;
            }
        }
        zVar.k();
        zVar.g(i11, i12, 0);
        return zVar;
    }

    public static final void e(int i11, int i12, q qVar) {
        b(d(i11, i12, qVar), qVar);
    }

    public static final void f(int i11, int i12, int i13, int i14, boolean z11, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i11;
        iArr[1] = i12;
        iArr[2] = i13;
        iArr[3] = i14;
        iArr[4] = z11 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean g(int i11, int i12, int i13, int i14, q qVar, int[] iArr, int[] iArr2, int i15, int[] iArr3) {
        int iB;
        int i16;
        boolean z11;
        int i17 = (i12 - i11) - (i14 - i13);
        boolean z12 = true;
        boolean z13 = (Math.abs(i17) & 1) == 1;
        int i18 = -i15;
        int i19 = i18;
        while (i19 <= i15) {
            if (i19 == i18 || (i19 != i15 && f.b(iArr, i19 + 1) > f.b(iArr, i19 - 1))) {
                iB = f.b(iArr, i19 + 1);
                i16 = iB;
            } else {
                iB = f.b(iArr, i19 - 1);
                i16 = iB + 1;
            }
            int i21 = (i13 + (i16 - i11)) - i19;
            int i22 = i21 - ((i15 != 0 ? z12 : 0) & (i16 == iB ? z12 : 0));
            while (i16 < i12 && i21 < i14) {
                if (!qVar.a(i16, i21)) {
                    break;
                }
                i16++;
                i21++;
            }
            f.d(iArr, i19, i16);
            if (z13) {
                int i23 = i17 - i19;
                z11 = z12;
                if (i23 >= i18 + 1 && i23 <= i15 - 1) {
                    if (f.b(iArr2, i23) <= i16) {
                        f(iB, i22, i16, i21, false, iArr3);
                        return z11;
                    }
                }
                i19 += 2;
                z12 = z11;
            } else {
                z11 = z12;
            }
            i19 += 2;
            z12 = z11;
        }
        return false;
    }

    private static final boolean h(int i11, int i12, int i13, int i14, q qVar, int[] iArr, int[] iArr2, int[] iArr3) {
        int i15 = i12 - i11;
        int i16 = i14 - i13;
        if (i15 >= 1 && i16 >= 1) {
            int i17 = ((i15 + i16) + 1) / 2;
            int[] iArr4 = iArr;
            f.d(iArr4, 1, i11);
            int[] iArr5 = iArr2;
            f.d(iArr5, 1, i12);
            int i18 = 0;
            while (i18 < i17) {
                if (g(i11, i12, i13, i14, qVar, iArr4, iArr5, i18, iArr3) || c(i11, i12, i13, i14, qVar, iArr, iArr2, i18, iArr3)) {
                    return true;
                }
                i18++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int[] iArr, int i11, int i12) {
        int i13 = iArr[i11];
        iArr[i11] = iArr[i12];
        iArr[i12] = i13;
    }
}
