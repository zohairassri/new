package s3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f125488a = new i("Ltr", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f125489b = new i("Rtl", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ i[] f125490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f125491d;

    static {
        i[] iVarArrA = a();
        f125490c = iVarArrA;
        f125491d = cf0.b.a(iVarArrA);
    }

    private i(String str, int i11) {
    }

    private static final /* synthetic */ i[] a() {
        return new i[]{f125488a, f125489b};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f125490c.clone();
    }
}
