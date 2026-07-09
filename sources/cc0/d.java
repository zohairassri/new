package cc0;

import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class d extends ThreadPoolExecutor implements AutoCloseable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ThreadFactory threadFactory, RejectedExecutionHandler handler, int i11, int i12, Comparator comparator) {
        super(i11, i12, 60L, TimeUnit.SECONDS, new PriorityBlockingQueue(100, comparator), threadFactory, handler);
        Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        n4.f.a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected RunnableFuture newTaskFor(Callable callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        throw new IllegalArgumentException("Callable must be PriorityCallable");
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (!(runnable instanceof b)) {
            throw new IllegalArgumentException("Runnable must be PriorityCallable");
        }
        RunnableFuture runnableFuture = super.newTaskFor(runnable, obj);
        Intrinsics.checkNotNullExpressionValue(runnableFuture, "runnableFuture");
        return new c(runnableFuture, ((b) runnable).a());
    }
}
