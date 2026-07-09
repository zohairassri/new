package w;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e0 f133575a = new y(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e0 f133576b = new y(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e0 f133577c = new y(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e0 f133578d = new e0() { // from class: w.f0
        @Override // w.e0
        public final float a(float f11) {
            return g0.b(f11);
        }
    };

    public static final e0 c() {
        return f133577c;
    }

    public static final e0 d() {
        return f133575a;
    }

    public static final e0 e() {
        return f133578d;
    }

    public static final e0 f() {
        return f133576b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float f11) {
        return f11;
    }
}
