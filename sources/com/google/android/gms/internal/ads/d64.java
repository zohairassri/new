package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class d64 extends c64 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.common.util.concurrent.e f24896h;

    d64(com.google.common.util.concurrent.e eVar) {
        eVar.getClass();
        this.f24896h = eVar;
    }

    @Override // com.google.android.gms.internal.ads.x44, com.google.common.util.concurrent.e
    public final void a(Runnable runnable, Executor executor) {
        this.f24896h.a(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.x44, java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return this.f24896h.cancel(z11);
    }

    @Override // com.google.android.gms.internal.ads.x44, java.util.concurrent.Future
    public final Object get() {
        return this.f24896h.get();
    }

    @Override // com.google.android.gms.internal.ads.x44, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24896h.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.x44, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f24896h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.x44
    public final String toString() {
        return this.f24896h.toString();
    }

    @Override // com.google.android.gms.internal.ads.x44, java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        return this.f24896h.get(j11, timeUnit);
    }
}
