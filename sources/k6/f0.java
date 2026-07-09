package k6;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class f0 implements i {
    protected f0() {
    }

    @Override // k6.i
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // k6.i
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // k6.i
    public long c() {
        return SystemClock.uptimeMillis();
    }

    @Override // k6.i
    public o d(Looper looper, Handler.Callback callback) {
        return new g0(new Handler(looper, callback));
    }

    @Override // k6.i
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // k6.i
    public void e() {
    }
}
