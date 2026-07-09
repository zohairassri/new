package v1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t1.a f132302a = new t1.a(0);

    public final void A(int i11) {
        int iA;
        do {
            iA = androidx.compose.runtime.snapshots.e.a(this.f132302a.get());
            if ((iA & i11) != 0) {
                return;
            }
        } while (!this.f132302a.compareAndSet(iA, androidx.compose.runtime.snapshots.e.a(iA | i11)));
    }

    public final boolean q(int i11) {
        return (androidx.compose.runtime.snapshots.e.a(this.f132302a.get()) & i11) != 0;
    }
}
