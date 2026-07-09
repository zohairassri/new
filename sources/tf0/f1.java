package tf0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class f1 implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e1 f129967a;

    public f1(e1 e1Var) {
        this.f129967a = e1Var;
    }

    @Override // tf0.m
    public void b(Throwable th2) {
        this.f129967a.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f129967a + ']';
    }
}
