package l7;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f113632a;

    public z(q qVar) {
        this.f113632a = qVar;
    }

    @Override // l7.q
    public int a(int i11) {
        return this.f113632a.a(i11);
    }

    @Override // l7.q
    public boolean b(byte[] bArr, int i11, int i12, boolean z11) {
        return this.f113632a.b(bArr, i11, i12, z11);
    }

    @Override // l7.q
    public void d() {
        this.f113632a.d();
    }

    @Override // l7.q
    public boolean f(byte[] bArr, int i11, int i12, boolean z11) {
        return this.f113632a.f(bArr, i11, i12, z11);
    }

    @Override // l7.q
    public long g() {
        return this.f113632a.g();
    }

    @Override // l7.q
    public long getLength() {
        return this.f113632a.getLength();
    }

    @Override // l7.q
    public long getPosition() {
        return this.f113632a.getPosition();
    }

    @Override // l7.q
    public void h(int i11) {
        this.f113632a.h(i11);
    }

    @Override // l7.q
    public int i(byte[] bArr, int i11, int i12) {
        return this.f113632a.i(bArr, i11, i12);
    }

    @Override // l7.q
    public void j(int i11) {
        this.f113632a.j(i11);
    }

    @Override // l7.q
    public boolean k(int i11, boolean z11) {
        return this.f113632a.k(i11, z11);
    }

    @Override // l7.q
    public void l(byte[] bArr, int i11, int i12) {
        this.f113632a.l(bArr, i11, i12);
    }

    @Override // l7.q
    public boolean m(int i11, boolean z11) {
        return this.f113632a.m(i11, z11);
    }

    @Override // l7.q, h6.i
    public int read(byte[] bArr, int i11, int i12) {
        return this.f113632a.read(bArr, i11, i12);
    }

    @Override // l7.q
    public void readFully(byte[] bArr, int i11, int i12) {
        this.f113632a.readFully(bArr, i11, i12);
    }
}
