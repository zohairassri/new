package com.google.firebase.perf.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class f extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f46769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f46770b = Collections.unmodifiableMap(new a());

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends HashMap {
        a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    private f() {
    }

    public static synchronized f e() {
        try {
            if (f46769a == null) {
                f46769a = new f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f46769a;
    }

    protected static String f(long j11) {
        return (String) f46770b.get(Long.valueOf(j11));
    }

    protected static boolean g(long j11) {
        return f46770b.containsKey(Long.valueOf(j11));
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_log_source";
    }

    protected String d() {
        return dr.a.f90404c;
    }
}
