package t;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
abstract class c {
    static Object[] a(Object[] objArr, int i11) {
        if (objArr.length < i11) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i11);
        }
        if (objArr.length > i11) {
            objArr[i11] = null;
        }
        return objArr;
    }
}
