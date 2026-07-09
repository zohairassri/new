package t3;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Throwable f129343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f129344b = new Object();

    public final void a(Throwable th2) {
        synchronized (this.f129344b) {
            this.f129343a = th2;
            Unit unit = Unit.f111650a;
        }
    }

    public final void b() {
        synchronized (this.f129344b) {
            Throwable th2 = this.f129343a;
            if (th2 != null) {
                this.f129343a = null;
                throw th2;
            }
        }
    }
}
