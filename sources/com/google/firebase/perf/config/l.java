package com.google.firebase.perf.config;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class l extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static l f46776a;

    protected l() {
    }

    protected static synchronized l e() {
        try {
            if (f46776a == null) {
                f46776a = new l();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f46776a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_enabled";
    }

    protected Boolean d() {
        return Boolean.TRUE;
    }
}
