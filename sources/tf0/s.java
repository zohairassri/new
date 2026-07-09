package tf0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class s extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f130026c = AtomicIntegerFieldUpdater.newUpdater(s.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public s(af0.c cVar, Throwable th2, boolean z11) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + cVar + " was cancelled normally");
        }
        super(th2, z11);
    }

    public final boolean e() {
        return f130026c.compareAndSet(this, 0, 1);
    }
}
