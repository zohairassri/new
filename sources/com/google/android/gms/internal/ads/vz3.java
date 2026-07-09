package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class vz3 {
    static Object a(int i11) {
        if (i11 >= 2 && i11 <= 1073741824 && Integer.highestOneBit(i11) == i11) {
            return i11 <= 256 ? new byte[i11] : i11 <= 65536 ? new short[i11] : new int[i11];
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 41);
        sb2.append("must be power of 2 between 2^1 and 2^30: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    static int b(Object obj, int i11) {
        return obj instanceof byte[] ? ((byte[]) obj)[i11] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i11] : ((int[]) obj)[i11];
    }

    static void c(Object obj, int i11, int i12) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i11] = (byte) i12;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i11] = (short) i12;
        } else {
            ((int[]) obj)[i11] = i12;
        }
    }

    static int d(int i11) {
        return (i11 < 32 ? 4 : 2) * (i11 + 1);
    }

    static int e(Object obj, Object obj2, int i11, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i12;
        int i13;
        int iB = g04.b(obj);
        int i14 = iB & i11;
        int iB2 = b(obj3, i14);
        if (iB2 != 0) {
            int i15 = ~i11;
            int i16 = iB & i15;
            int i17 = -1;
            while (true) {
                i12 = iB2 - 1;
                int i18 = iArr[i12];
                i13 = i18 & i11;
                if ((i18 & i15) != i16 || !Objects.equals(obj, objArr[i12]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i12]))) {
                    if (i13 == 0) {
                        break;
                    }
                    i17 = i12;
                    iB2 = i13;
                } else {
                    break;
                }
            }
            if (i17 == -1) {
                c(obj3, i14, i13);
                return i12;
            }
            iArr[i17] = (iArr[i17] & i15) | (i13 & i11);
            return i12;
        }
        return -1;
    }
}
