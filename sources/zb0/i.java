package zb0;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f142220a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Looper f142221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Thread f142222c;

    static {
        Looper mainLooper = Looper.getMainLooper();
        f142221b = mainLooper;
        Thread thread = mainLooper.getThread();
        Intrinsics.checkNotNullExpressionValue(thread, "mainLooper.thread");
        f142222c = thread;
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Runnable runnable, fb0.a logger) {
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        Intrinsics.checkNotNullParameter(logger, "$logger");
        try {
            runnable.run();
        } catch (Exception e11) {
            logger.d("Failed to run wrapped runnable on Main thread.", e11);
        }
    }

    public final void b(final fb0.a logger, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Runnable runnable2 = new Runnable() { // from class: zb0.h
            @Override // java.lang.Runnable
            public final void run() {
                i.c(runnable, logger);
            }
        };
        if (Thread.currentThread() != f142222c) {
            new Handler(f142221b).post(runnable2);
        } else {
            runnable2.run();
        }
    }
}
