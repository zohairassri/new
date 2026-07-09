package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class i20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference f28153a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference f28154b = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    static g20 a() {
        return (g20) f28153a.get();
    }

    static h20 b() {
        android.support.v4.media.a.a(f28154b.get());
        return null;
    }

    public static void c(g20 g20Var) {
        f28153a.set(g20Var);
    }
}
