package com.google.android.gms.internal.ads;

import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class fz4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26763a;

    public void a() {
        this.f26763a = 0;
    }

    public final boolean b() {
        return i(4);
    }

    public final boolean c() {
        return i(1);
    }

    public final boolean d() {
        return i(536870912);
    }

    public final boolean e() {
        return i(268435456);
    }

    public final boolean f() {
        return i(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    public final void g(int i11) {
        this.f26763a = i11;
    }

    public final void h(int i11) {
        this.f26763a |= 536870912;
    }

    protected final boolean i(int i11) {
        return (this.f26763a & i11) == i11;
    }
}
