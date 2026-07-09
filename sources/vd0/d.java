package vd0;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
abstract class d extends AtomicReference implements b {
    d(Object obj) {
        super(ae0.b.e(obj, "value is null"));
    }

    protected abstract void a(Object obj);

    @Override // vd0.b
    public final void dispose() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // vd0.b
    /* JADX INFO: renamed from: isDisposed */
    public final boolean getDisposed() {
        return get() == null;
    }
}
