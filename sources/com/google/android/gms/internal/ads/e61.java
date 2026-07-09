package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class e61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f25604a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f25605b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap f25606c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f25607d = new ConcurrentHashMap();

    public final void a(String str) {
        synchronized (this.f25604a) {
            try {
                ConcurrentHashMap concurrentHashMap = this.f25605b;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int b(String str) {
        Integer num = (Integer) this.f25605b.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long c(String str) {
        Long l11 = (Long) this.f25607d.get(str);
        if (l11 == null) {
            return -1L;
        }
        return l11.longValue();
    }

    public final void d(String str, long j11) {
        this.f25606c.put(str, Long.valueOf(j11));
    }

    public final void e(String str, String str2, long j11) {
        ConcurrentHashMap concurrentHashMap = this.f25606c;
        Long l11 = (Long) concurrentHashMap.get(str2);
        if (l11 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        this.f25607d.put(str, Long.valueOf(j11 - l11.longValue()));
    }
}
