package com.google.common.collect;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class r0 {
    static Object[] a(Object[] objArr, int i11, int i12, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i11, i12, objArr2.getClass());
    }

    static Object[] b(Object[] objArr, int i11) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i11);
    }

    static Map c(int i11) {
        return l.C(i11);
    }
}
