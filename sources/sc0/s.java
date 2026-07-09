package sc0;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rc0.b f126420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f126421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f126422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicLong f126423d;

    public s(double d11, double d12, rc0.b bVar) {
        this.f126420a = bVar;
        double d13 = d11 / 1.0E9d;
        this.f126421b = d13;
        long j11 = (long) (d12 / d13);
        this.f126422c = j11;
        this.f126423d = new AtomicLong(bVar.nanoTime() - j11);
    }
}
