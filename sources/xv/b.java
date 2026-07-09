package xv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f138005a = new b("USER_DETAILS", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f138006b = new b("GOOGLE_PLAY", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f138007c = new b("DB_INITIAL_LOAD", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f138008d = new b("PROVISIONAL_ENT_EXPIRED", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ b[] f138009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f138010f;

    static {
        b[] bVarArrA = a();
        f138009e = bVarArrA;
        f138010f = cf0.b.a(bVarArrA);
    }

    private b(String str, int i11) {
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f138005a, f138006b, f138007c, f138008d};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f138009e.clone();
    }
}
