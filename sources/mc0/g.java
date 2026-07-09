package mc0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class g implements o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g[] f116059c = d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final g f116060d = e((byte) 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final g f116061e = e((byte) 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f116062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f116063b;

    private g(byte b11) {
        char[] cArr = new char[2];
        jc0.f.d(b11, cArr, 0);
        this.f116062a = new String(cArr);
        this.f116063b = b11;
    }

    private static g[] d() {
        g[] gVarArr = new g[256];
        for (int i11 = 0; i11 < 256; i11++) {
            gVarArr[i11] = new g((byte) i11);
        }
        return gVarArr;
    }

    static g e(byte b11) {
        return f116059c[b11 & 255];
    }

    @Override // mc0.o
    public boolean a() {
        return (this.f116063b & 1) != 0;
    }

    public String c() {
        return this.f116062a;
    }

    public String toString() {
        return c();
    }
}
