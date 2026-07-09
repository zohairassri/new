package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h0 f7619a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h0 f7620b = new i0();

    static h0 a() {
        return f7619a;
    }

    static h0 b() {
        return f7620b;
    }

    private static h0 c() {
        try {
            return (h0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
