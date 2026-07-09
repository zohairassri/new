package com.google.android.gms.internal.atv_ads_framework;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c3 f39890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c3 f39891b;

    static {
        c3 c3Var = null;
        try {
            c3Var = (c3) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f39890a = c3Var;
        f39891b = new c3();
    }

    static c3 a() {
        return f39890a;
    }

    static c3 b() {
        return f39891b;
    }
}
