package f2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f93390a = a.f93391a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f93391a = new a();

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f93392a = new b("CounterClockwise", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f93393b = new b("Clockwise", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f93394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ cf0.a f93395d;

        static {
            b[] bVarArrA = a();
            f93394c = bVarArrA;
            f93395d = cf0.b.a(bVarArrA);
        }

        private b(String str, int i11) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f93392a, f93393b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f93394c.clone();
        }
    }

    static /* synthetic */ void f(h1 h1Var, e2.h hVar, b bVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i11 & 2) != 0) {
            bVar = b.f93392a;
        }
        h1Var.l(hVar, bVar);
    }

    static /* synthetic */ void k(h1 h1Var, e2.j jVar, b bVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i11 & 2) != 0) {
            bVar = b.f93392a;
        }
        h1Var.j(jVar, bVar);
    }

    static /* synthetic */ void m(h1 h1Var, h1 h1Var2, long j11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i11 & 2) != 0) {
            j11 = e2.f.f90920b.c();
        }
        h1Var.a(h1Var2, j11);
    }

    void N();

    void a(h1 h1Var, long j11);

    void b(float f11, float f12);

    void c(float f11, float f12, float f13, float f14, float f15, float f16);

    void close();

    void cubicTo(float f11, float f12, float f13, float f14, float f15, float f16);

    void d(int i11);

    void e(float f11, float f12, float f13, float f14);

    boolean g(h1 h1Var, h1 h1Var2, int i11);

    e2.h getBounds();

    void h(long j11);

    void i(float f11, float f12, float f13, float f14);

    boolean isEmpty();

    void j(e2.j jVar, b bVar);

    void l(e2.h hVar, b bVar);

    void lineTo(float f11, float f12);

    void moveTo(float f11, float f12);

    int n();

    void o(e2.h hVar, float f11, float f12, boolean z11);

    void p(float f11, float f12);

    void reset();
}
