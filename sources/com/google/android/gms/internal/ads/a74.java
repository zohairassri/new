package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class a74 extends f64 implements t64 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledFuture f23111b;

    a74(com.google.common.util.concurrent.e eVar, ScheduledFuture scheduledFuture) {
        super(eVar);
        this.f23111b = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        boolean zCancel = l().cancel(z11);
        if (zCancel) {
            this.f23111b.cancel(z11);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f23111b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f23111b.getDelay(timeUnit);
    }
}
