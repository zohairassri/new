package rf0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f124823a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal[] f124824b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i11 = 0; i11 < 4; i11++) {
            threadLocalArr[i11] = new ThreadLocal();
        }
        f124824b = threadLocalArr;
    }

    public static final boolean a() {
        return f124823a;
    }
}
