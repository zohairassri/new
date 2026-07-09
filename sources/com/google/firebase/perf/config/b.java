package com.google.firebase.perf.config;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f46765a;

    private b() {
    }

    protected static synchronized b e() {
        try {
            if (f46765a == null) {
                f46765a = new b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f46765a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "firebase_performance_collection_deactivated";
    }

    protected Boolean d() {
        return Boolean.FALSE;
    }
}
