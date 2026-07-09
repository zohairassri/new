package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class mi3 implements hi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f30764a = Executors.newSingleThreadScheduledExecutor();

    mi3() {
    }

    @Override // com.google.android.gms.internal.ads.hi3
    public final void a(Runnable runnable, long j11) {
        this.f30764a.schedule(runnable, j11, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.hi3
    public final void zzb() {
    }
}
