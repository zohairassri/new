package l7;

import l7.j0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f113562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f113563b;

    public m0(long j11) {
        this(j11, 0L);
    }

    @Override // l7.j0
    public j0.a c(long j11) {
        return new j0.a(new k0(j11, this.f113563b));
    }

    @Override // l7.j0
    public boolean e() {
        return true;
    }

    @Override // l7.j0
    public long f() {
        return this.f113562a;
    }

    public m0(long j11, long j12) {
        this.f113562a = j11;
        this.f113563b = j12;
    }
}
