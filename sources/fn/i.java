package fn;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class i extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f94455a;

    public i(Looper looper) {
        super(looper);
        this.f94455a = Looper.getMainLooper();
    }

    public i(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f94455a = Looper.getMainLooper();
    }
}
