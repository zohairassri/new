package d7;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f89306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f89307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f89308d;

    public b(long j11, long j12) {
        this.f89306b = j11;
        this.f89307c = j12;
        f();
    }

    protected final void c() {
        long j11 = this.f89308d;
        if (j11 < this.f89306b || j11 > this.f89307c) {
            throw new NoSuchElementException();
        }
    }

    protected final long d() {
        return this.f89308d;
    }

    public boolean e() {
        return this.f89308d > this.f89307c;
    }

    public void f() {
        this.f89308d = this.f89306b - 1;
    }

    @Override // d7.m
    public boolean next() {
        this.f89308d++;
        return !e();
    }
}
