package jc0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f105534a = new ThreadLocal();

    public static char[] a(int i11) {
        ThreadLocal threadLocal = f105534a;
        char[] cArr = (char[]) threadLocal.get();
        if (cArr != null && cArr.length >= i11) {
            return cArr;
        }
        char[] cArr2 = new char[i11];
        threadLocal.set(cArr2);
        return cArr2;
    }
}
