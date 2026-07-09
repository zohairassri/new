package hf;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f102108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f102109b;

    public c(String newThreadContext) {
        Intrinsics.checkNotNullParameter(newThreadContext, "newThreadContext");
        this.f102108a = newThreadContext;
        this.f102109b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        int andIncrement = this.f102109b.getAndIncrement();
        Thread thread = new Thread(runnable, "datadog-" + this.f102108a + "-thread-" + andIncrement);
        thread.setPriority(5);
        thread.setDaemon(false);
        return thread;
    }
}
