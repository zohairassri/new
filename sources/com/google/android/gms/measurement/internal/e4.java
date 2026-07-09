package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class e4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f42940h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d4 f42942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f42943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f42944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f42945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Object f42946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile Object f42947g;

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f42945e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L7
            return r4
        L7:
            com.google.android.gms.measurement.internal.d r4 = com.google.android.gms.measurement.internal.c4.f42889a
            if (r4 != 0) goto Le
            java.lang.Object r3 = r3.f42943c
            return r3
        Le:
            java.lang.Object r4 = com.google.android.gms.measurement.internal.e4.f42940h
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.d.a()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.f42947g     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L20
            java.lang.Object r3 = r3.f42943c     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r3 = move-exception
            goto L6c
        L20:
            java.lang.Object r3 = r3.f42947g     // Catch: java.lang.Throwable -> L1e
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            return r3
        L24:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            java.util.List r4 = com.google.android.gms.measurement.internal.b0.z0()     // Catch: java.lang.SecurityException -> L5a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L5a
        L2d:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L5a
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L5a
            com.google.android.gms.measurement.internal.e4 r0 = (com.google.android.gms.measurement.internal.e4) r0     // Catch: java.lang.SecurityException -> L5a
            boolean r1 = com.google.android.gms.measurement.internal.d.a()     // Catch: java.lang.SecurityException -> L5a
            if (r1 != 0) goto L52
            r1 = 0
            com.google.android.gms.measurement.internal.d4 r2 = r0.f42942b     // Catch: java.lang.IllegalStateException -> L48 java.lang.SecurityException -> L5a
            if (r2 == 0) goto L48
            java.lang.Object r1 = r2.zza()     // Catch: java.lang.IllegalStateException -> L48 java.lang.SecurityException -> L5a
        L48:
            java.lang.Object r2 = com.google.android.gms.measurement.internal.e4.f42940h     // Catch: java.lang.SecurityException -> L5a
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L5a
            r0.f42947g = r1     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            goto L2d
        L4f:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            throw r4     // Catch: java.lang.SecurityException -> L5a
        L52:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L5a
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L5a
            throw r4     // Catch: java.lang.SecurityException -> L5a
        L5a:
            com.google.android.gms.measurement.internal.d4 r4 = r3.f42942b
            if (r4 != 0) goto L61
            java.lang.Object r3 = r3.f42943c
            return r3
        L61:
            java.lang.Object r3 = r4.zza()     // Catch: java.lang.IllegalStateException -> L66 java.lang.SecurityException -> L69
            return r3
        L66:
            java.lang.Object r3 = r3.f42943c
            return r3
        L69:
            java.lang.Object r3 = r3.f42943c
            return r3
        L6c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            throw r3
        L6e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e4.a(java.lang.Object):java.lang.Object");
    }

    public final String b() {
        return this.f42941a;
    }

    private e4(String str, Object obj, Object obj2, d4 d4Var) {
        this.f42945e = new Object();
        this.f42946f = null;
        this.f42947g = null;
        this.f42941a = str;
        this.f42943c = obj;
        this.f42944d = obj2;
        this.f42942b = d4Var;
    }
}
