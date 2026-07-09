package rc0;

import java.util.concurrent.TimeUnit;
import sc0.p;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f124735a = new h();

    private h() {
    }

    static b b() {
        return f124735a;
    }

    @Override // rc0.b
    public long a() {
        return c(true);
    }

    public long c(boolean z11) {
        return z11 ? p.b().a() : TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    @Override // rc0.b
    public long nanoTime() {
        return System.nanoTime();
    }

    public String toString() {
        return "SystemClock{}";
    }
}
