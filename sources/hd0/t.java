package hd0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final t f100793a = new u().a();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static abstract class a extends t {
        a() {
        }

        @Override // hd0.t
        public abstract int c();
    }

    protected t() {
    }

    static t a(int i11, int i12, int i13, int i14, int i15, int i16) {
        return new b(i11, i12, i13, i14, i15, i16);
    }

    public static t b() {
        return f100793a;
    }

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public u i() {
        return new u().c(d()).f(g()).g(h()).d(e()).e(f()).b(c());
    }
}
