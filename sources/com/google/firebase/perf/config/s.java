package com.google.firebase.perf.config;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class s extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static s f46783a;

    private s() {
    }

    public static synchronized s e() {
        try {
            if (f46783a == null) {
                f46783a = new s();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f46783a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_trace_event_count_bg";
    }

    protected Long d() {
        return 30L;
    }
}
