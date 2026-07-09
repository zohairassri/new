package com.google.android.gms.internal.atv_ads_framework;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m3 f39972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m3 f39973b;

    static {
        m3 m3Var = null;
        try {
            m3Var = (m3) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f39972a = m3Var;
        f39973b = new m3();
    }

    static m3 a() {
        return f39972a;
    }

    static m3 b() {
        return f39973b;
    }
}
