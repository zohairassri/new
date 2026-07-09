package com.theathletic.drawable;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/theathletic/extension/g;", "", "<init>", "()V", "T", "Lkotlin/Function0;", "task", "Ljava/util/concurrent/Future;", QueryKeys.PAGE_LOAD_TIME, "(Lkotlin/jvm/functions/Function0;)Ljava/util/concurrent/Future;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f57059a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static ScheduledExecutorService executor;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
        executor = scheduledExecutorServiceNewScheduledThreadPool;
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(Function0 function0) {
        return function0.invoke();
    }

    public final Future b(final Function0 task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Future futureSubmit = executor.submit(new Callable() { // from class: com.theathletic.extension.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.c(task);
            }
        });
        Intrinsics.checkNotNullExpressionValue(futureSubmit, "submit(...)");
        return futureSubmit;
    }
}
