package p6;

import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f121175a;

    public final void f(int i11) {
        this.f121175a = i11 | this.f121175a;
    }

    public void g() {
        this.f121175a = 0;
    }

    protected final boolean h(int i11) {
        return (this.f121175a & i11) == i11;
    }

    public final boolean j() {
        return h(268435456);
    }

    public final boolean k() {
        return h(4);
    }

    public final boolean l() {
        return h(134217728);
    }

    public final boolean n() {
        return h(1);
    }

    public final boolean o() {
        return h(536870912);
    }

    public final boolean p() {
        return h(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    public final void q(int i11) {
        this.f121175a = i11;
    }
}
