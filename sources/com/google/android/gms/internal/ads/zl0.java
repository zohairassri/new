package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class zl0 implements com.google.common.util.concurrent.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f74 f39266a = f74.C();

    private static final boolean b(boolean z11) {
        if (!z11) {
            xl.r.l().k(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z11;
    }

    @Override // com.google.common.util.concurrent.e
    public final void a(Runnable runnable, Executor executor) {
        this.f39266a.a(runnable, executor);
    }

    public final boolean c(Object obj) {
        boolean zL = this.f39266a.l(obj);
        b(zL);
        return zL;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return this.f39266a.cancel(z11);
    }

    public final boolean d(Throwable th2) {
        boolean zM = this.f39266a.m(th2);
        b(zM);
        return zM;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f39266a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f39266a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f39266a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        return this.f39266a.get(j11, timeUnit);
    }
}
