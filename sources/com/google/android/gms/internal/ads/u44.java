package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class u44 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final u44 f35900d = new u44();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Runnable f35901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Executor f35902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    u44 f35903c;

    u44() {
        this.f35901a = null;
        this.f35902b = null;
    }

    u44(Runnable runnable, Executor executor) {
        this.f35901a = runnable;
        this.f35902b = executor;
    }
}
