package rc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f124706a = new e("CacheFirst", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f124707b = new e("CacheOnly", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f124708c = new e("NetworkFirst", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f124709d = new e("NetworkOnly", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ e[] f124710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f124711f;

    static {
        e[] eVarArrA = a();
        f124710e = eVarArrA;
        f124711f = cf0.b.a(eVarArrA);
    }

    private e(String str, int i11) {
    }

    private static final /* synthetic */ e[] a() {
        return new e[]{f124706a, f124707b, f124708c, f124709d};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f124710e.clone();
    }
}
