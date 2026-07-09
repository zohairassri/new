package com.google.firebase.perf.config;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class u extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static u f46785a;

    private u() {
    }

    protected static synchronized u f() {
        try {
            if (f46785a == null) {
                f46785a = new u();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f46785a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_vc_trace_sampling_rate";
    }

    protected Double d() {
        return Double.valueOf(1.0d);
    }

    protected Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
