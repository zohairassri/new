package q6;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f122447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Looper f122448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f122449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f122450d;

    public b0() {
        this(null);
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f122447a) {
            try {
                if (this.f122448b == null) {
                    k6.a.g(this.f122450d == 0 && this.f122449c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f122449c = handlerThread;
                    handlerThread.start();
                    this.f122448b = this.f122449c.getLooper();
                }
                this.f122450d++;
                looper = this.f122448b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f122447a) {
            try {
                k6.a.g(this.f122450d > 0);
                int i11 = this.f122450d - 1;
                this.f122450d = i11;
                if (i11 == 0 && (handlerThread = this.f122449c) != null) {
                    handlerThread.quit();
                    this.f122449c = null;
                    this.f122448b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b0(Looper looper) {
        this.f122447a = new Object();
        this.f122448b = looper;
        this.f122449c = null;
        this.f122450d = 0;
    }
}
