package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import android.view.Display;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class x1 extends w1 implements Choreographer.FrameCallback {
    /* synthetic */ x1(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        super(choreographer, displayManager, null);
    }

    private static long c(DisplayManager displayManager) {
        Display display = displayManager.getDisplay(0);
        if (display != null) {
            return (long) (1.0E9d / ((double) display.getRefreshRate()));
        }
        y22.c("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.w1
    final void a() {
        super.a();
        this.f37099a.postFrameCallback(this);
        this.f37102d = c(this.f37100b);
    }

    @Override // com.google.android.gms.internal.ads.w1
    final void b() {
        this.f37100b.unregisterDisplayListener(this);
        this.f37099a.removeFrameCallback(this);
        this.f37101c = -9223372036854775807L;
        this.f37102d = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j11) {
        this.f37101c = j11;
        this.f37099a.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i11) {
        if (i11 == 0) {
            this.f37099a.postFrameCallback(this);
            this.f37102d = c(this.f37100b);
        }
    }
}
