package w4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class h extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f134050c;

    public h(int i11) {
        super(i11);
        this.f134050c = new Object();
    }

    @Override // w4.g, w4.f
    public boolean a(Object instance) {
        boolean zA;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.f134050c) {
            zA = super.a(instance);
        }
        return zA;
    }

    @Override // w4.g, w4.f
    public Object b() {
        Object objB;
        synchronized (this.f134050c) {
            objB = super.b();
        }
        return objB;
    }
}
