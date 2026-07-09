package py;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f121989a = new d1("NONE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d1 f121990b = new d1("CCPA_REGI", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d1 f121991c = new d1("CCPA_ANON", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d1 f121992d = new d1("ERROR", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d1 f121993e = new d1("ERROR_DEVICE_OFFLINE", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ d1[] f121994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f121995g;

    static {
        d1[] d1VarArrA = a();
        f121994f = d1VarArrA;
        f121995g = cf0.b.a(d1VarArrA);
    }

    private d1(String str, int i11) {
    }

    private static final /* synthetic */ d1[] a() {
        return new d1[]{f121989a, f121990b, f121991c, f121992d, f121993e};
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) f121994f.clone();
    }
}
