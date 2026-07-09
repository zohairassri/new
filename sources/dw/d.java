package dw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f90538a = new d("LoginCredentials", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f90539b = new d("LoginMagicLink", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f90540c = new d("RegisterCredentials", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f90541d = new d("GoogleSSO", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f90542e = new d("FacebookSSO", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f90543f = new d("GoogleOneTap", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f90544g = new d("SetPasswordWithToken", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f90545h = new d("WebSSO", 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f90546i = new d("CrossAppLogin", 8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f90547l = new d("OneTimeCode", 9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ d[] f90548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f90549n;

    static {
        d[] dVarArrA = a();
        f90548m = dVarArrA;
        f90549n = cf0.b.a(dVarArrA);
    }

    private d(String str, int i11) {
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f90538a, f90539b, f90540c, f90541d, f90542e, f90543f, f90544g, f90545h, f90546i, f90547l};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f90548m.clone();
    }
}
