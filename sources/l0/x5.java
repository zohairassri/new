package l0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class x5 implements m3.g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m3.g0 f112821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f112822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f112823d;

    public x5(m3.g0 g0Var, int i11, int i12) {
        this.f112821b = g0Var;
        this.f112822c = i11;
        this.f112823d = i12;
    }

    @Override // m3.g0
    public int a(int i11) {
        int iA = this.f112821b.a(i11);
        if (i11 >= 0 && i11 <= this.f112823d) {
            y5.h(iA, this.f112822c, i11);
        }
        return iA;
    }

    @Override // m3.g0
    public int b(int i11) {
        int iB = this.f112821b.b(i11);
        if (i11 >= 0 && i11 <= this.f112822c) {
            y5.g(iB, this.f112823d, i11);
        }
        return iB;
    }
}
