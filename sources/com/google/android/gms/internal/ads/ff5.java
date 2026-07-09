package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ff5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ff5 f26299c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ef5 f26301b;

    static {
        new ff5("");
        f26299c = new ff5("preload");
    }

    public ff5(String str) {
        this.f26300a = str;
        this.f26301b = Build.VERSION.SDK_INT >= 31 ? new ef5() : null;
    }

    public final synchronized LogSessionId a() {
        ef5 ef5Var;
        ef5Var = this.f26301b;
        if (ef5Var == null) {
            throw null;
        }
        return ef5Var.f25724a;
    }

    public final synchronized void b(LogSessionId logSessionId) {
        ef5 ef5Var = this.f26301b;
        if (ef5Var == null) {
            throw null;
        }
        jx3.i(ef5Var.f25724a.equals(LogSessionId.LOG_SESSION_ID_NONE));
        ef5Var.f25724a = logSessionId;
    }
}
