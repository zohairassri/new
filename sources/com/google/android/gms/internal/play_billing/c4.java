package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class c4 extends l3 implements ScheduledFuture, y3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledFuture f42336b;

    public c4(y3 y3Var, ScheduledFuture scheduledFuture) {
        super(y3Var);
        this.f42336b = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        boolean zCancel = c().cancel(z11);
        if (zCancel) {
            this.f42336b.cancel(z11);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f42336b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f42336b.getDelay(timeUnit);
    }
}
