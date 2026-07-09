package bm;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.fe3;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HandlerThread f14852a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f14853b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14854c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f14855d = new Object();

    public final Looper a() {
        Looper looper;
        Object obj = this.f14855d;
        synchronized (obj) {
            try {
                if (this.f14854c != 0) {
                    com.google.android.gms.common.internal.n.m(this.f14852a, "Invalid state: handlerThread should already been initialized.");
                } else if (this.f14852a == null) {
                    k1.k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f14852a = handlerThread;
                    handlerThread.start();
                    this.f14853b = new fe3(this.f14852a.getLooper());
                    k1.k("Looper thread started.");
                } else {
                    k1.k("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.f14854c++;
                looper = this.f14852a.getLooper();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public final Handler b() {
        return this.f14853b;
    }
}
