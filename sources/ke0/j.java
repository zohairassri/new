package ke0;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class j extends a implements Callable {
    public j(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.f110625b = Thread.currentThread();
        try {
            this.f110624a.run();
            return null;
        } finally {
            lazySet(a.f110622c);
            this.f110625b = null;
        }
    }
}
