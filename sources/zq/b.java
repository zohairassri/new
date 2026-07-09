package zq;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f142511a;

    private b() {
    }

    public static b b() {
        if (f142511a == null) {
            f142511a = new b();
        }
        return f142511a;
    }

    @Override // zq.a
    public long a() {
        return System.currentTimeMillis();
    }
}
