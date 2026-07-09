package z3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f141755a = new t("Ltr", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f141756b = new t("Rtl", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ t[] f141757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f141758d;

    static {
        t[] tVarArrA = a();
        f141757c = tVarArrA;
        f141758d = cf0.b.a(tVarArrA);
    }

    private t(String str, int i11) {
    }

    private static final /* synthetic */ t[] a() {
        return new t[]{f141755a, f141756b};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f141757c.clone();
    }
}
