package tf0;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class d1 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future f129930a;

    public d1(Future future) {
        this.f129930a = future;
    }

    @Override // tf0.e1
    public void dispose() {
        this.f129930a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f129930a + ']';
    }
}
