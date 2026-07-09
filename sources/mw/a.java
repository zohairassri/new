package mw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f116974a = new a("NoOverride", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f116975b = new a("Success", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f116976c = new a("Error_Existing_P1_User", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f116977d = new a("Error_Existing_P3_User", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f116978e = new a("Error_Anon_User", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f116979f = new a("Error_Missing_Cookies", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f116980g = new a("Error_Server", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f116981h = new a("Error_Unknown", 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ a[] f116982i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f116983l;

    static {
        a[] aVarArrA = a();
        f116982i = aVarArrA;
        f116983l = cf0.b.a(aVarArrA);
    }

    private a(String str, int i11) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f116974a, f116975b, f116976c, f116977d, f116978e, f116979f, f116980g, f116981h};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f116982i.clone();
    }
}
