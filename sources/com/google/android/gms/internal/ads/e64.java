package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class e64 extends e04 implements Future {
    protected e64() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return l().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return l().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return l().isDone();
    }

    protected abstract Future l();

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        return l().get(j11, timeUnit);
    }
}
