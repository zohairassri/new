package sn;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f127241a = new CountDownLatch(1);

    /* synthetic */ o(n nVar) {
    }

    @Override // sn.d
    public final void a() {
        this.f127241a.countDown();
    }

    public final void b() throws InterruptedException {
        this.f127241a.await();
    }

    public final boolean c(long j11, TimeUnit timeUnit) {
        return this.f127241a.await(j11, timeUnit);
    }

    @Override // sn.e
    public final void onFailure(Exception exc) {
        this.f127241a.countDown();
    }

    @Override // sn.f
    public final void onSuccess(Object obj) {
        this.f127241a.countDown();
    }
}
