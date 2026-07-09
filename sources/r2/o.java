package r2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f123536a = new o("Initial", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f123537b = new o("Main", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f123538c = new o("Final", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ o[] f123539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f123540e;

    static {
        o[] oVarArrA = a();
        f123539d = oVarArrA;
        f123540e = cf0.b.a(oVarArrA);
    }

    private o(String str, int i11) {
    }

    private static final /* synthetic */ o[] a() {
        return new o[]{f123536a, f123537b, f123538c};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f123539d.clone();
    }
}
