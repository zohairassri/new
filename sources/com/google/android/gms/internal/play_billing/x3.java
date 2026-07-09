package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f42623a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Logger f42625c;

    x3(Class cls) {
        this.f42624b = cls.getName();
    }

    final Logger a() {
        Logger logger = this.f42625c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f42623a) {
            try {
                Logger logger2 = this.f42625c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f42624b);
                this.f42625c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
