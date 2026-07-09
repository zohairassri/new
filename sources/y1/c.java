package y1;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f139754a = new Handler(Looper.getMainLooper());

    public static final long b() {
        return System.currentTimeMillis();
    }

    public static final Object c(long j11, final Function0 function0) {
        Runnable runnable = new Runnable() { // from class: y1.b
            @Override // java.lang.Runnable
            public final void run() {
                c.d(function0);
            }
        };
        f139754a.postDelayed(runnable, j11);
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function0 function0) {
        function0.invoke();
    }

    public static final void e(Object obj) {
        if ((obj instanceof Runnable ? (Runnable) obj : null) == null) {
            return;
        }
        f139754a.removeCallbacks((Runnable) obj);
    }
}
