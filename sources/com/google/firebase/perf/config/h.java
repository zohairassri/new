package com.google.firebase.perf.config;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class h extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static h f46772a;

    private h() {
    }

    public static synchronized h e() {
        try {
            if (f46772a == null) {
                f46772a = new h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f46772a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_network_event_count_fg";
    }

    protected Long d() {
        return 700L;
    }
}
