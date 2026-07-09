package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class s64 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iy3 f34547a = new iy3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Logger f34549c;

    s64(Class cls) {
        this.f34548b = cls.getName();
    }

    final Logger a() {
        Logger logger = this.f34549c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f34547a) {
            try {
                Logger logger2 = this.f34549c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f34548b);
                this.f34549c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
