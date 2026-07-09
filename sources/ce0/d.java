package ce0;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d extends CountDownLatch implements sd0.t, vd0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f17567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Throwable f17568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    vd0.b f17569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f17570d;

    public d() {
        super(1);
    }

    public final Object a() {
        if (getCount() != 0) {
            try {
                ne0.e.b();
                await();
            } catch (InterruptedException e11) {
                dispose();
                throw ne0.j.d(e11);
            }
        }
        Throwable th2 = this.f17568b;
        if (th2 == null) {
            return this.f17567a;
        }
        throw ne0.j.d(th2);
    }

    @Override // vd0.b
    public final void dispose() {
        this.f17570d = true;
        vd0.b bVar = this.f17569c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // vd0.b
    /* JADX INFO: renamed from: isDisposed */
    public final boolean getDisposed() {
        return this.f17570d;
    }

    @Override // sd0.t
    public final void onComplete() {
        countDown();
    }

    @Override // sd0.t
    public final void onSubscribe(vd0.b bVar) {
        this.f17569c = bVar;
        if (this.f17570d) {
            bVar.dispose();
        }
    }
}
