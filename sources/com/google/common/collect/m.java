package com.google.common.collect;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class m {
    static Object a(int i11) {
        if (i11 >= 2 && i11 <= 1073741824 && Integer.highestOneBit(i11) == i11) {
            return i11 <= 256 ? new byte[i11] : i11 <= 65536 ? new short[i11] : new int[i11];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i11);
    }

    static int b(int i11, int i12) {
        return i11 & (~i12);
    }

    static int c(int i11, int i12) {
        return i11 & i12;
    }

    static int d(int i11, int i12, int i13) {
        return (i11 & (~i13)) | (i12 & i13);
    }

    static int e(int i11) {
        return (i11 < 32 ? 4 : 2) * (i11 + 1);
    }

    static int f(Object obj, Object obj2, int i11, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i12;
        int i13;
        int iC = u.c(obj);
        int i14 = iC & i11;
        int iH = h(obj3, i14);
        if (iH == 0) {
            return -1;
        }
        int iB = b(iC, i11);
        int i15 = -1;
        while (true) {
            i12 = iH - 1;
            i13 = iArr[i12];
            if (b(i13, i11) == iB && zo.k.a(obj, objArr[i12]) && (objArr2 == null || zo.k.a(obj2, objArr2[i12]))) {
                break;
            }
            int iC2 = c(i13, i11);
            if (iC2 == 0) {
                return -1;
            }
            i15 = i12;
            iH = iC2;
        }
        int iC3 = c(i13, i11);
        if (i15 == -1) {
            i(obj3, i14, iC3);
            return i12;
        }
        iArr[i15] = d(iArr[i15], iC3, i11);
        return i12;
    }

    static void g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    static int h(Object obj, int i11) {
        return obj instanceof byte[] ? ((byte[]) obj)[i11] & 255 : obj instanceof short[] ? ((short[]) obj)[i11] & 65535 : ((int[]) obj)[i11];
    }

    static void i(Object obj, int i11, int i12) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i11] = (byte) i12;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i11] = (short) i12;
        } else {
            ((int[]) obj)[i11] = i12;
        }
    }

    static int j(int i11) {
        return Math.max(4, u.a(i11 + 1, 1.0d));
    }
}
