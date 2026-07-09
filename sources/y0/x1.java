package y0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x1 f139691a = new x1("TopBar", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x1 f139692b = new x1("MainContent", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x1 f139693c = new x1("Snackbar", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x1 f139694d = new x1("Fab", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x1 f139695e = new x1("BottomBar", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ x1[] f139696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f139697g;

    static {
        x1[] x1VarArrA = a();
        f139696f = x1VarArrA;
        f139697g = cf0.b.a(x1VarArrA);
    }

    private x1(String str, int i11) {
    }

    private static final /* synthetic */ x1[] a() {
        return new x1[]{f139691a, f139692b, f139693c, f139694d, f139695e};
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) f139696f.clone();
    }
}
