package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h3 f41446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h3 f41447b;

    static {
        h3 h3Var = null;
        try {
            h3Var = (h3) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f41446a = h3Var;
        f41447b = new h3();
    }

    static h3 a() {
        return f41446a;
    }

    static h3 b() {
        return f41447b;
    }
}
