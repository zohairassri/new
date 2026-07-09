package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f112838a = new y1("None", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y1 f112839b = new y1("Selection", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y1 f112840c = new y1("Cursor", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ y1[] f112841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f112842e;

    static {
        y1[] y1VarArrA = a();
        f112841d = y1VarArrA;
        f112842e = cf0.b.a(y1VarArrA);
    }

    private y1(String str, int i11) {
    }

    private static final /* synthetic */ y1[] a() {
        return new y1[]{f112838a, f112839b, f112840c};
    }

    public static y1 valueOf(String str) {
        return (y1) Enum.valueOf(y1.class, str);
    }

    public static y1[] values() {
        return (y1[]) f112841d.clone();
    }
}
