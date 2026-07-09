package com.google.firebase.perf.config;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class j extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f46774a;

    private j() {
    }

    public static synchronized j e() {
        try {
            if (f46774a == null) {
                f46774a = new j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f46774a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_time_limit_sec";
    }

    protected Long d() {
        return 600L;
    }
}
