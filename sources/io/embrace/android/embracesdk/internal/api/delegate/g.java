package io.embrace.android.embracesdk.internal.api.delegate;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fb0.a f104099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yb0.c f104100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f104101c;

    public g(fb0.a logger, yb0.c cVar) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f104099a = logger;
        this.f104100b = cVar;
        this.f104101c = new AtomicBoolean(false);
    }

    public final boolean a(String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z11 = this.f104101c.get();
        if (!z11) {
            this.f104099a.u(action);
        }
        yb0.c cVar = this.f104100b;
        if (cVar != null) {
            cVar.a(action);
        }
        return z11;
    }

    public final AtomicBoolean b() {
        return this.f104101c;
    }
}
