package fw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f94977b = new a("PASSWORD", 0, "nyt-password");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f94978c = new a("GOOGLE", 1, "google");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f94979d = new a("FACEBOOK", 2, "facebook");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f94980e = new a("NYT_CODE", 3, "nyt-code");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ a[] f94981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f94982g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94983a;

    static {
        a[] aVarArrA = a();
        f94981f = aVarArrA;
        f94982g = cf0.b.a(aVarArrA);
    }

    private a(String str, int i11, String str2) {
        this.f94983a = str2;
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f94977b, f94978c, f94979d, f94980e};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f94981f.clone();
    }

    public final String b() {
        return this.f94983a;
    }
}
