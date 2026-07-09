package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class h24 {
    static Object[] a(Object[] objArr, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            b(objArr[i12], i12);
        }
        return objArr;
    }

    static Object b(Object obj, int i11) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 9);
        sb2.append("at index ");
        sb2.append(i11);
        throw new NullPointerException(sb2.toString());
    }
}
