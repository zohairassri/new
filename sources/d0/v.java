package d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f87856a = new v("Vertical", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f87857b = new v("Horizontal", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f87858c = new v("Both", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ v[] f87859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f87860e;

    static {
        v[] vVarArrA = a();
        f87859d = vVarArrA;
        f87860e = cf0.b.a(vVarArrA);
    }

    private v(String str, int i11) {
    }

    private static final /* synthetic */ v[] a() {
        return new v[]{f87856a, f87857b, f87858c};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f87859d.clone();
    }
}
