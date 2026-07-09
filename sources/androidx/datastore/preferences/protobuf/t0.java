package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r0 f7772a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r0 f7773b = new s0();

    static r0 a() {
        return f7772a;
    }

    static r0 b() {
        return f7773b;
    }

    private static r0 c() {
        try {
            return (r0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
