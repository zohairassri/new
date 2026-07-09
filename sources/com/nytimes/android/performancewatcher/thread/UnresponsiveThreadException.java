package com.nytimes.android.performancewatcher.thread;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/nytimes/android/performancewatcher/thread/UnresponsiveThreadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Ljava/lang/Thread;", "a", "Ljava/lang/Thread;", "watchedThread", "", "getMessage", "()Ljava/lang/String;", "message", "performance-watcher_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUnresponsiveThreadException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnresponsiveThreadException.kt\ncom/nytimes/android/performancewatcher/thread/UnresponsiveThreadException\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n536#2:48\n521#2,6:49\n1#3:55\n32#4,2:56\n11228#5:58\n11563#5,3:59\n1869#6,2:62\n*S KotlinDebug\n*F\n+ 1 UnresponsiveThreadException.kt\ncom/nytimes/android/performancewatcher/thread/UnresponsiveThreadException\n*L\n10#1:48\n10#1:49,6\n36#1:56,2\n43#1:58\n43#1:59,3\n44#1:62,2\n*E\n"})
public final class UnresponsiveThreadException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Thread watchedThread;

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Thread " + this.watchedThread.getName() + "[" + this.watchedThread.getId() + "] unresponsive";
    }
}
