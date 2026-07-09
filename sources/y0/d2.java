package y0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d2 f138524a = new d2("Short", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d2 f138525b = new d2("Long", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d2 f138526c = new d2("Indefinite", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ d2[] f138527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f138528e;

    static {
        d2[] d2VarArrA = a();
        f138527d = d2VarArrA;
        f138528e = cf0.b.a(d2VarArrA);
    }

    private d2(String str, int i11) {
    }

    private static final /* synthetic */ d2[] a() {
        return new d2[]{f138524a, f138525b, f138526c};
    }

    public static d2 valueOf(String str) {
        return (d2) Enum.valueOf(d2.class, str);
    }

    public static d2[] values() {
        return (d2[]) f138527d.clone();
    }
}
