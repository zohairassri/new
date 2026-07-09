package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r0 f46319a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r0 f46320b = new s0();

    static r0 a() {
        return f46319a;
    }

    static r0 b() {
        return f46320b;
    }

    private static r0 c() {
        try {
            return (r0) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
