package l7;

import l7.j0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0 f113403a;

    public a0(j0 j0Var) {
        this.f113403a = j0Var;
    }

    @Override // l7.j0
    public j0.a c(long j11) {
        return this.f113403a.c(j11);
    }

    @Override // l7.j0
    public boolean e() {
        return this.f113403a.e();
    }

    @Override // l7.j0
    public long f() {
        return this.f113403a.f();
    }
}
