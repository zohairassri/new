package qb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f122597a = new f("COMPONENT_GROUPS", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f122598b = new f("COMPONENTS_IN_A_GROUP", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f122599c = new f("COMPONENT_STYLES", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f122600d = new f("COMPONENT_DETAIL", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f122601e = new f("SHOWKASE_CATEGORIES", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f122602f = new f("COLOR_GROUPS", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f122603g = new f("COLORS_IN_A_GROUP", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f122604h = new f("TYPOGRAPHY_GROUPS", 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f122605i = new f("TYPOGRAPHY_IN_A_GROUP", 8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ f[] f122606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f122607m;

    static {
        f[] fVarArrA = a();
        f122606l = fVarArrA;
        f122607m = cf0.b.a(fVarArrA);
    }

    private f(String str, int i11) {
    }

    private static final /* synthetic */ f[] a() {
        return new f[]{f122597a, f122598b, f122599c, f122600d, f122601e, f122602f, f122603g, f122604h, f122605i};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f122606l.clone();
    }
}
