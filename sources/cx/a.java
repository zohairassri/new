package cx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f87403c = new a("PRODUCTION", 0, "Production", "https://samizdat-graphql.nytimes.com/graphql/v2");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f87404d = new a("DEV", 1, "Dev", "https://samizdat-graphql.dev.nytimes.com/graphql/v2");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f87405e = new a("EXPERIMENTAL2", 2, "Samizdat Labs Experiment 2", "https://samizdat-graphql-experimental-lab-2.dev.nytimes.com/graphql/v2");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f87406f = new a("EXPERIMENTAL3", 3, "Samizdat Labs Experiment 3", "https://samizdat-graphql-experimental-lab-3.dev.nytimes.com/graphql/v2");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f87407g = new a("EXPERIMENTAL5", 4, "Samizdat Labs Experiment 5", "https://samizdat-graphql-experimental-lab-5.dev.nytimes.com/graphql/v2");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ a[] f87408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f87409i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f87410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f87411b;

    static {
        a[] aVarArrA = a();
        f87408h = aVarArrA;
        f87409i = cf0.b.a(aVarArrA);
    }

    private a(String str, int i11, String str2, String str3) {
        this.f87410a = str2;
        this.f87411b = str3;
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f87403c, f87404d, f87405e, f87406f, f87407g};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f87408h.clone();
    }

    public final String b() {
        return this.f87411b;
    }
}
