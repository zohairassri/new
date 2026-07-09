package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n0 f47510a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final n0 f47511b = new o0();

    static n0 a() {
        return f47510a;
    }

    static n0 b() {
        return f47511b;
    }

    private static n0 c() {
        try {
            return (n0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
