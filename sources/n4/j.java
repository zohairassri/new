package n4;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
abstract class j {
    public static int[] a(int[] iArr, int i11, int i12) {
        if (i11 + 1 > iArr.length) {
            int[] iArr2 = new int[c(i11)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            iArr = iArr2;
        }
        iArr[i11] = i12;
        return iArr;
    }

    public static Object[] b(Object[] objArr, int i11, Object obj) {
        if (i11 + 1 > objArr.length) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), c(i11));
            System.arraycopy(objArr, 0, objArr2, 0, i11);
            objArr = objArr2;
        }
        objArr[i11] = obj;
        return objArr;
    }

    public static int c(int i11) {
        if (i11 <= 4) {
            return 8;
        }
        return i11 * 2;
    }
}
