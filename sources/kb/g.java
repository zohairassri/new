package kb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f110339a = new g("FILL", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f110340b = new g("FIT", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ g[] f110341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f110342d;

    static {
        g[] gVarArrA = a();
        f110341c = gVarArrA;
        f110342d = cf0.b.a(gVarArrA);
    }

    private g(String str, int i11) {
    }

    private static final /* synthetic */ g[] a() {
        return new g[]{f110339a, f110340b};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f110341c.clone();
    }
}
