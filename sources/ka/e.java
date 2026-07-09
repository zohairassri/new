package ka;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class e implements androidx.work.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f110118a = t4.h.a(Looper.getMainLooper());

    @Override // androidx.work.m0
    public void a(Runnable runnable) {
        this.f110118a.removeCallbacks(runnable);
    }

    @Override // androidx.work.m0
    public void b(long j11, Runnable runnable) {
        this.f110118a.postDelayed(runnable, j11);
    }
}
