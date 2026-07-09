package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class o64 implements com.google.common.util.concurrent.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final com.google.common.util.concurrent.e f31781b = new o64(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final s64 f31782c = new s64(o64.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f31783a;

    o64(Object obj) {
        this.f31783a = obj;
    }

    @Override // com.google.common.util.concurrent.e
    public final void a(Runnable runnable, Executor executor) {
        jx3.k(runnable, "Runnable was null.");
        jx3.k(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e11) {
            Logger loggerA = f31782c.a();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(strValueOf);
            sb2.append(" with executor ");
            sb2.append(strValueOf2);
            loggerA.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb2.toString(), (Throwable) e11);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f31783a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.f31783a;
        String string = super.toString();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 25 + strValueOf.length() + 2);
        sb2.append(string);
        sb2.append("[status=SUCCESS, result=[");
        sb2.append(strValueOf);
        sb2.append("]]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f31783a;
    }
}
