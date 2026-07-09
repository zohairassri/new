package ke0;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import w.c1;
import yd0.o;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f110678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f110679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final AtomicReference f110680c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Map f110681d = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList(l.f110681d.keySet());
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) obj;
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    l.f110681d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b implements o {
        b() {
        }

        @Override // yd0.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(String str) {
            return System.getProperty(str);
        }
    }

    static {
        b bVar = new b();
        boolean zB = b(true, "rx2.purge-enabled", true, true, bVar);
        f110678a = zB;
        f110679b = c(zB, "rx2.purge-period-seconds", 1, 1, bVar);
        d();
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        e(f110678a, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    static boolean b(boolean z11, String str, boolean z12, boolean z13, o oVar) {
        if (!z11) {
            return z13;
        }
        try {
            String str2 = (String) oVar.apply(str);
            if (str2 != null) {
                return "true".equals(str2);
            }
        } catch (Throwable unused) {
        }
        return z12;
    }

    static int c(boolean z11, String str, int i11, int i12, o oVar) {
        if (!z11) {
            return i12;
        }
        try {
            String str2 = (String) oVar.apply(str);
            if (str2 != null) {
                return Integer.parseInt(str2);
            }
        } catch (Throwable unused) {
        }
        return i11;
    }

    public static void d() {
        f(f110678a);
    }

    static void e(boolean z11, ScheduledExecutorService scheduledExecutorService) {
        if (z11 && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f110681d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    static void f(boolean z11) {
        if (!z11) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = f110680c;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new h("RxSchedulerPurge"));
            if (c1.a(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                a aVar = new a();
                int i11 = f110679b;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(aVar, i11, i11, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
