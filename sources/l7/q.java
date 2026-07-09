package l7;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface q extends h6.i {
    int a(int i11);

    boolean b(byte[] bArr, int i11, int i12, boolean z11);

    void d();

    boolean f(byte[] bArr, int i11, int i12, boolean z11);

    long g();

    long getLength();

    long getPosition();

    void h(int i11);

    int i(byte[] bArr, int i11, int i12);

    void j(int i11);

    boolean k(int i11, boolean z11);

    void l(byte[] bArr, int i11, int i12);

    boolean m(int i11, boolean z11);

    @Override // h6.i
    int read(byte[] bArr, int i11, int i12);

    void readFully(byte[] bArr, int i11, int i12);
}
