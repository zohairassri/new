package ke0;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
abstract class a extends AtomicReference implements vd0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final FutureTask f110622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final FutureTask f110623d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Runnable f110624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Thread f110625b;

    static {
        Runnable runnable = ae0.a.f825b;
        f110622c = new FutureTask(runnable, null);
        f110623d = new FutureTask(runnable, null);
    }

    a(Runnable runnable) {
        this.f110624a = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f110622c) {
                return;
            }
            if (future2 == f110623d) {
                future.cancel(this.f110625b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // vd0.b
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f110622c || future == (futureTask = f110623d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f110625b != Thread.currentThread());
    }

    @Override // vd0.b
    /* JADX INFO: renamed from: isDisposed */
    public final boolean getDisposed() {
        Future future = (Future) get();
        return future == f110622c || future == f110623d;
    }
}
