package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
class y64 extends f54 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f38337a;

    y64(ExecutorService executorService) {
        executorService.getClass();
        this.f38337a = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j11, TimeUnit timeUnit) {
        return this.f38337a.awaitTermination(j11, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f38337a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f38337a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f38337a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f38337a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f38337a.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.f38337a;
        String string = super.toString();
        String strValueOf = String.valueOf(executorService);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length() + 1);
        sb2.append(string);
        sb2.append("[");
        sb2.append(strValueOf);
        sb2.append("]");
        return sb2.toString();
    }
}
