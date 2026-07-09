package ql;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class u {
    public static e a(int i11, int i12, String str) {
        return new e(i11, i12, str);
    }

    public static e b(int i11, int i12) {
        e eVar = new e(i11, i12);
        eVar.h(true);
        eVar.i(i12);
        return eVar;
    }

    public static e c(int i11, int i12) {
        e eVar = new e(i11, i12);
        eVar.l(true);
        eVar.n(i12);
        return eVar;
    }

    public static boolean d(e eVar) {
        return eVar.k();
    }

    public static int e(e eVar) {
        return eVar.m();
    }

    public static boolean f(e eVar) {
        return eVar.f();
    }

    public static boolean g(e eVar) {
        return eVar.g();
    }

    public static int h(e eVar) {
        return eVar.j();
    }
}
