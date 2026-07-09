package qj;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b {
    public static Object a(int i11, Object obj, a aVar, c cVar) {
        Object objApply;
        if (i11 < 1) {
            return aVar.apply(obj);
        }
        do {
            objApply = aVar.apply(obj);
            obj = cVar.a(obj, objApply);
            if (obj == null) {
                break;
            }
            i11--;
        } while (i11 >= 1);
        return objApply;
    }
}
