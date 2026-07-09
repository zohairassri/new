package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class w1 implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Choreographer f37099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final DisplayManager f37100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile long f37101c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile long f37102d = -9223372036854775807L;

    /* synthetic */ w1(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        this.f37099a = choreographer;
        this.f37100b = displayManager;
    }

    void a() {
        this.f37100b.registerDisplayListener(this, yy2.y(null));
    }

    abstract void b();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i11) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i11) {
    }
}
