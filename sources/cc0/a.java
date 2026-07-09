package cc0;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f17477a;

    public a(ScheduledExecutorService impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f17477a = impl;
    }

    public final ScheduledFuture a(Runnable runnable, long j11, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduledFutureSchedule = this.f17477a.schedule(runnable, j11, timeUnit);
        Intrinsics.checkNotNull(scheduledFutureSchedule, "null cannot be cast to non-null type java.util.concurrent.ScheduledFuture<T of io.embrace.android.embracesdk.internal.worker.BackgroundWorker.schedule>");
        return scheduledFutureSchedule;
    }

    public final ScheduledFuture b(Runnable runnable, long j11, long j12, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Intrinsics.checkNotNullParameter(unit, "unit");
        ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = this.f17477a.scheduleAtFixedRate(runnable, j11, j12, unit);
        Intrinsics.checkNotNullExpressionValue(scheduledFutureScheduleAtFixedRate, "impl.scheduleAtFixedRate…lDelay, intervalMs, unit)");
        return scheduledFutureScheduleAtFixedRate;
    }

    public final ScheduledFuture c(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        return this.f17477a.scheduleWithFixedDelay(runnable, j11, j12, timeUnit);
    }

    public final Future d(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Future<?> futureSubmit = this.f17477a.submit(runnable);
        Intrinsics.checkNotNullExpressionValue(futureSubmit, "impl.submit(runnable)");
        return futureSubmit;
    }

    public final Future e(Callable callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        Future futureSubmit = this.f17477a.submit(callable);
        Intrinsics.checkNotNullExpressionValue(futureSubmit, "impl.submit(callable)");
        return futureSubmit;
    }
}
