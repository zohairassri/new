package com.google.android.gms.common.util;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    public static boolean a(int[] iArr, int i11) {
        if (iArr != null) {
            for (int i12 : iArr) {
                if (i12 == i11) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            if (!com.google.android.gms.common.internal.m.a(objArr[i11], obj)) {
                i11++;
            } else if (i11 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static void c(StringBuilder sb2, double[] dArr) {
        int length = dArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(dArr[i11]);
        }
    }

    public static void d(StringBuilder sb2, float[] fArr) {
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(fArr[i11]);
        }
    }

    public static void e(StringBuilder sb2, int[] iArr) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(iArr[i11]);
        }
    }

    public static void f(StringBuilder sb2, long[] jArr) {
        int length = jArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(jArr[i11]);
        }
    }

    public static void g(StringBuilder sb2, Object[] objArr) {
        int length = objArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(objArr[i11]);
        }
    }

    public static void h(StringBuilder sb2, boolean[] zArr) {
        int length = zArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(zArr[i11]);
        }
    }

    public static void i(StringBuilder sb2, String[] strArr) {
        int length = strArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append("\"");
            sb2.append(strArr[i11]);
            sb2.append("\"");
        }
    }
}
