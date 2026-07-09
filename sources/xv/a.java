package xv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f137999a = new a("USER_LOGOUT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f138000b = new a("UNIFIED_LIRE_FAILED_FORCE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f138001c = new a("DELETE_ACCOUNT", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f138002d = new a("SESSION_REFRESH_FAILED_FORCE", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ a[] f138003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f138004f;

    static {
        a[] aVarArrA = a();
        f138003e = aVarArrA;
        f138004f = cf0.b.a(aVarArrA);
    }

    private a(String str, int i11) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f137999a, f138000b, f138001c, f138002d};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f138003e.clone();
    }
}
