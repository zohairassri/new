package ml;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class f0 implements d {
    protected f0() {
    }

    @Override // ml.d
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // ml.d
    public long c() {
        return SystemClock.uptimeMillis();
    }

    @Override // ml.d
    public m d(Looper looper, Handler.Callback callback) {
        return new g0(new Handler(looper, callback));
    }

    @Override // ml.d
    public void e() {
    }
}
