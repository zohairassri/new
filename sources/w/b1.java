package w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f133491a = new b1("Default", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1 f133492b = new b1("UserInput", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b1 f133493c = new b1("PreventUserInput", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ b1[] f133494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f133495e;

    static {
        b1[] b1VarArrA = a();
        f133494d = b1VarArrA;
        f133495e = cf0.b.a(b1VarArrA);
    }

    private b1(String str, int i11) {
    }

    private static final /* synthetic */ b1[] a() {
        return new b1[]{f133491a, f133492b, f133493c};
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) f133494d.clone();
    }
}
