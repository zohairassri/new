package oj;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f120391b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f120392a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f120393a = null;

        a() {
        }

        public b a() {
            return new b(this.f120393a);
        }

        public a b(e eVar) {
            this.f120393a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f120392a = eVar;
    }

    public static a b() {
        return new a();
    }

    public e a() {
        return this.f120392a;
    }
}
