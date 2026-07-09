package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class rb5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f34089a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Looper f34090b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f34091c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34092d = 0;

    public rb5(Looper looper) {
    }

    public final Looper a() {
        Looper looper;
        synchronized (this.f34089a) {
            try {
                if (this.f34090b == null) {
                    boolean z11 = false;
                    if (this.f34092d == 0 && this.f34091c == null) {
                        z11 = true;
                    }
                    jx3.i(z11);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f34091c = handlerThread;
                    handlerThread.start();
                    this.f34090b = this.f34091c.getLooper();
                }
                this.f34092d++;
                looper = this.f34090b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public final void b() {
        HandlerThread handlerThread;
        synchronized (this.f34089a) {
            try {
                jx3.i(this.f34092d > 0);
                int i11 = this.f34092d - 1;
                this.f34092d = i11;
                if (i11 == 0 && (handlerThread = this.f34091c) != null) {
                    handlerThread.quit();
                    this.f34091c = null;
                    this.f34090b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
