package tf0;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future f130000a;

    public l(Future future) {
        this.f130000a = future;
    }

    @Override // tf0.m
    public void b(Throwable th2) {
        this.f130000a.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f130000a + ']';
    }
}
