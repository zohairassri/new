package lj;

import lj.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
abstract class o {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a {
        public abstract o a();

        abstract a b(jj.b bVar);

        abstract a c(jj.c cVar);

        abstract a d(jj.e eVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    o() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract jj.b b();

    abstract jj.c c();

    public byte[] d() {
        return (byte[]) e().apply(c().b());
    }

    abstract jj.e e();

    public abstract p f();

    public abstract String g();
}
