package ke0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class h extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f110670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f110671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f110672c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class a extends Thread implements g {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public h(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f110670a + '-' + incrementAndGet();
        Thread aVar = this.f110672c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f110671b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f110670a + "]";
    }

    public h(String str, int i11) {
        this(str, i11, false);
    }

    public h(String str, int i11, boolean z11) {
        this.f110670a = str;
        this.f110671b = i11;
        this.f110672c = z11;
    }
}
