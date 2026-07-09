package li;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f114353b = new c("dd-trace-processor");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f114354c = new c("dd-trace-writer");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f114355d = new c("dd-task-scheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f114356a;

    public c(String str) {
        this.f114356a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f114356a);
        thread.setDaemon(true);
        thread.setContextClassLoader(null);
        return thread;
    }
}
