package hn;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class r {
    public static Object a(Class cls, String str, q... qVarArr) {
        return b(cls, "isIsolated", null, false, qVarArr);
    }

    private static Object b(Class cls, String str, Object obj, boolean z11, q... qVarArr) {
        int length = qVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        Object obj2 = null;
        if (qVarArr.length <= 0) {
            return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
        }
        q qVar = qVarArr[0];
        obj2.getClass();
        throw null;
    }
}
