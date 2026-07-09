package y0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h2 f138810a = new h2("Dismissed", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h2 f138811b = new h2("ActionPerformed", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ h2[] f138812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f138813d;

    static {
        h2[] h2VarArrA = a();
        f138812c = h2VarArrA;
        f138813d = cf0.b.a(h2VarArrA);
    }

    private h2(String str, int i11) {
    }

    private static final /* synthetic */ h2[] a() {
        return new h2[]{f138810a, f138811b};
    }

    public static h2 valueOf(String str) {
        return (h2) Enum.valueOf(h2.class, str);
    }

    public static h2[] values() {
        return (h2[]) f138812c.clone();
    }
}
