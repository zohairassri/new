package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class s3 implements y3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final x3 f42585b = new x3(s3.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f42586a;

    s3(Object obj) {
        this.f42586a = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f42586a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.y3
    public final void j(Runnable runnable, Executor executor) {
        v.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e11) {
            f42585b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), (Throwable) e11);
        }
    }

    public final String toString() {
        Object obj = this.f42586a;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f42586a;
    }
}
