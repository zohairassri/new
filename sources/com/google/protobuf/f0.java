package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d0 f47346a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d0 f47347b = new e0();

    static d0 a() {
        return f47346a;
    }

    static d0 b() {
        return f47347b;
    }

    private static d0 c() {
        try {
            return (d0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
