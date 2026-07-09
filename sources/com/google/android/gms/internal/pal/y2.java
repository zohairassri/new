package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final x2 f42226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final x2 f42227b;

    static {
        x2 x2Var = null;
        try {
            x2Var = (x2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f42226a = x2Var;
        f42227b = new x2();
    }

    static x2 a() {
        return f42226a;
    }

    static x2 b() {
        return f42227b;
    }
}
