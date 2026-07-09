package an;

import com.google.android.gms.common.internal.n;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadFactory f1151b = Executors.defaultThreadFactory();

    public b(String str) {
        n.m(str, "Name must not be null");
        this.f1150a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f1151b.newThread(new c(runnable, 0));
        threadNewThread.setName(this.f1150a);
        return threadNewThread;
    }
}
