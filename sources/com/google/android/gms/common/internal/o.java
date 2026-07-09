package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static o f22778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final RootTelemetryConfiguration f22779c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RootTelemetryConfiguration f22780a;

    private o() {
    }

    public static synchronized o b() {
        try {
            if (f22778b == null) {
                f22778b = new o();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f22778b;
    }

    public RootTelemetryConfiguration a() {
        return this.f22780a;
    }

    public final synchronized void c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f22780a = f22779c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f22780a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.p0() < rootTelemetryConfiguration.p0()) {
            this.f22780a = rootTelemetryConfiguration;
        }
    }
}
