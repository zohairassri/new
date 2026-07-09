package y0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f138519a = new d1("Focused", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d1 f138520b = new d1("UnfocusedEmpty", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d1 f138521c = new d1("UnfocusedNotEmpty", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ d1[] f138522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f138523e;

    static {
        d1[] d1VarArrA = a();
        f138522d = d1VarArrA;
        f138523e = cf0.b.a(d1VarArrA);
    }

    private d1(String str, int i11) {
    }

    private static final /* synthetic */ d1[] a() {
        return new d1[]{f138519a, f138520b, f138521c};
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) f138522d.clone();
    }
}
