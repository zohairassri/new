package dq;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f90243a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f90244b = new AtomicInteger();

    public void a() {
        this.f90244b.getAndIncrement();
    }

    public void b() {
        this.f90243a.getAndIncrement();
    }

    public void c() {
        this.f90244b.set(0);
    }
}
