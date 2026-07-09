package fu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f94967b = new d("STAGING", 0, "https://eg.stg.nytimes.com");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f94968c = new d("PRODUCTION", 1, "https://eg.nytimes.com");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f94969d = new d("DEV", 2, "https://eg.dev.nytimes.com");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ d[] f94970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f94971f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94972a;

    static {
        d[] dVarArrA = a();
        f94970e = dVarArrA;
        f94971f = cf0.b.a(dVarArrA);
    }

    private d(String str, int i11, String str2) {
        this.f94972a = str2;
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f94967b, f94968c, f94969d};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f94970e.clone();
    }

    public String b() {
        return this.f94972a;
    }
}
