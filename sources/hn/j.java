package hn;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class j {
    static Object[] a(Object[] objArr, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (objArr[i12] == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 9);
                sb2.append("at index ");
                sb2.append(i12);
                throw new NullPointerException(sb2.toString());
            }
        }
        return objArr;
    }
}
