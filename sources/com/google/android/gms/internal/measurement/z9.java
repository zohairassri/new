package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final y9 f40960a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final y9 f40961b = new aa();

    static y9 a() {
        return f40960a;
    }

    static y9 b() {
        return f40961b;
    }

    private static y9 c() {
        try {
            return (y9) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
