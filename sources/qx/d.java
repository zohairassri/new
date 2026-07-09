package qx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f123203a = new d("UserDefault", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f123204b = new d("AlwaysLight", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f123205c = new d("AlwaysDark", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f123206d = new d("UserInverse", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ d[] f123207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f123208f;

    static {
        d[] dVarArrA = a();
        f123207e = dVarArrA;
        f123208f = cf0.b.a(dVarArrA);
    }

    private d(String str, int i11) {
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f123203a, f123204b, f123205c, f123206d};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f123207e.clone();
    }
}
