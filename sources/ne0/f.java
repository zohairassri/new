package ne0;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class f extends CountDownLatch implements yd0.g, yd0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f117798a;

    public f() {
        super(1);
    }

    @Override // yd0.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th2) {
        this.f117798a = th2;
        countDown();
    }

    @Override // yd0.a
    public void run() {
        countDown();
    }
}
