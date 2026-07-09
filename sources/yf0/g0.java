package yf0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
abstract /* synthetic */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f140434a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f140434a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
