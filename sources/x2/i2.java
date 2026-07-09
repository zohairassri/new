package x2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2 f136705a = new i2("ContinueTraversal", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i2 f136706b = new i2("SkipSubtreeAndContinueTraversal", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i2 f136707c = new i2("CancelTraversal", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ i2[] f136708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f136709e;

    static {
        i2[] i2VarArrA = a();
        f136708d = i2VarArrA;
        f136709e = cf0.b.a(i2VarArrA);
    }

    private i2(String str, int i11) {
    }

    private static final /* synthetic */ i2[] a() {
        return new i2[]{f136705a, f136706b, f136707c};
    }

    public static i2 valueOf(String str) {
        return (i2) Enum.valueOf(i2.class, str);
    }

    public static i2[] values() {
        return (i2[]) f136708d.clone();
    }
}
