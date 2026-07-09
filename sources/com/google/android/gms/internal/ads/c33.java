package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class c33 implements com.google.common.util.concurrent.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f24372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.e f24374c;

    public c33(Object obj, String str, com.google.common.util.concurrent.e eVar) {
        this.f24372a = obj;
        this.f24373b = str;
        this.f24374c = eVar;
    }

    @Override // com.google.common.util.concurrent.e
    public final void a(Runnable runnable, Executor executor) {
        this.f24374c.a(runnable, executor);
    }

    public final Object b() {
        return this.f24372a;
    }

    public final String c() {
        return this.f24373b;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return this.f24374c.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f24374c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24374c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f24374c.isDone();
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        String str = this.f24373b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
        sb2.append(str);
        sb2.append("@");
        sb2.append(iIdentityHashCode);
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        return this.f24374c.get(j11, timeUnit);
    }
}
