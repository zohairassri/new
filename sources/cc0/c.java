package cc0;

import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements RunnableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RunnableFuture f17480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f17481b;

    public c(RunnableFuture impl, Object priorityInfo) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        Intrinsics.checkNotNullParameter(priorityInfo, "priorityInfo");
        this.f17480a = impl;
        this.f17481b = priorityInfo;
    }

    public final Object b() {
        return this.f17481b;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return this.f17480a.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f17480a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f17480a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f17480a.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f17480a.run();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j11, TimeUnit timeUnit) {
        return this.f17480a.get(j11, timeUnit);
    }
}
