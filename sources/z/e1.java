package z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f141092a = new e1("Vertical", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1 f141093b = new e1("Horizontal", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ e1[] f141094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f141095d;

    static {
        e1[] e1VarArrA = a();
        f141094c = e1VarArrA;
        f141095d = cf0.b.a(e1VarArrA);
    }

    private e1(String str, int i11) {
    }

    private static final /* synthetic */ e1[] a() {
        return new e1[]{f141092a, f141093b};
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) f141094c.clone();
    }
}
