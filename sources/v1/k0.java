package v1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f132305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k0 f132306b;

    public k0(long j11) {
        this.f132305a = j11;
    }

    public abstract void c(k0 k0Var);

    public abstract k0 d(long j11);

    public final k0 e() {
        return this.f132306b;
    }

    public final long f() {
        return this.f132305a;
    }

    public final void g(k0 k0Var) {
        this.f132306b = k0Var;
    }

    public final void h(long j11) {
        this.f132305a = j11;
    }
}
