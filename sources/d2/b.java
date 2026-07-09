package d2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f88792a = new b("None", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f88793b = new b("Cancelled", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f88794c = new b("Redirected", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f88795d = new b("RedirectCancelled", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ b[] f88796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f88797f;

    static {
        b[] bVarArrA = a();
        f88796e = bVarArrA;
        f88797f = cf0.b.a(bVarArrA);
    }

    private b(String str, int i11) {
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f88792a, f88793b, f88794c, f88795d};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f88796e.clone();
    }
}
