package st;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f127314b = new j("ANONYMOUS", 0, "anon");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f127315c = new j("ANONYMOUS_SUB", 1, "anon sub");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f127316d = new j("REGISTERED", 2, "regi");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f127317e = new j("SUBSCRIBER", 3, "sub");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ j[] f127318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f127319g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f127320a;

    static {
        j[] jVarArrA = a();
        f127318f = jVarArrA;
        f127319g = cf0.b.a(jVarArrA);
    }

    private j(String str, int i11, String str2) {
        this.f127320a = str2;
    }

    private static final /* synthetic */ j[] a() {
        return new j[]{f127314b, f127315c, f127316d, f127317e};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f127318f.clone();
    }

    public final String b() {
        return this.f127320a;
    }
}
