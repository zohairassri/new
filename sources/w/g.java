package w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f133571a = new g("BoundReached", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f133572b = new g("Finished", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ g[] f133573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f133574d;

    static {
        g[] gVarArrA = a();
        f133573c = gVarArrA;
        f133574d = cf0.b.a(gVarArrA);
    }

    private g(String str, int i11) {
    }

    private static final /* synthetic */ g[] a() {
        return new g[]{f133571a, f133572b};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f133573c.clone();
    }
}
