package x2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f136587a = new b0("LookaheadMeasurement", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f136588b = new b0("LookaheadPlacement", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f136589c = new b0("Measurement", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f136590d = new b0("Placement", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ b0[] f136591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f136592f;

    static {
        b0[] b0VarArrA = a();
        f136591e = b0VarArrA;
        f136592f = cf0.b.a(b0VarArrA);
    }

    private b0(String str, int i11) {
    }

    private static final /* synthetic */ b0[] a() {
        return new b0[]{f136587a, f136588b, f136589c, f136590d};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f136591e.clone();
    }
}
