package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 {
    private static final /* synthetic */ c2[] I0;
    private static final /* synthetic */ cf0.a J0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f112251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c2 f112216b = new c2("LEFT_CHAR", 0, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c2 f112217c = new c2("RIGHT_CHAR", 1, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c2 f112218d = new c2("RIGHT_WORD", 2, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c2 f112219e = new c2("LEFT_WORD", 3, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c2 f112220f = new c2("NEXT_PARAGRAPH", 4, false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c2 f112221g = new c2("PREV_PARAGRAPH", 5, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c2 f112222h = new c2("LINE_START", 6, false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c2 f112223i = new c2("LINE_END", 7, false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c2 f112227l = new c2("LINE_LEFT", 8, false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c2 f112229m = new c2("LINE_RIGHT", 9, false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c2 f112231n = new c2("UP", 10, false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c2 f112236r = new c2("DOWN", 11, false);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c2 f112238s = new c2("CENTER", 12, false);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c2 f112242v = new c2("PAGE_UP", 13, false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c2 f112244w = new c2("PAGE_DOWN", 14, false);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c2 f112246x = new c2("HOME", 15, false);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c2 f112248y = new c2("END", 16, false);
    public static final c2 B = new c2("COPY", 17, false);
    public static final c2 N = new c2("PASTE", 18, true);
    public static final c2 S = new c2("CUT", 19, true);
    public static final c2 X = new c2("DELETE_PREV_CHAR", 20, true);
    public static final c2 Y = new c2("DELETE_NEXT_CHAR", 21, true);
    public static final c2 Z = new c2("DELETE_PREV_WORD", 22, true);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final c2 f112224i0 = new c2("DELETE_NEXT_WORD", 23, true);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final c2 f112225j0 = new c2("DELETE_FROM_LINE_START", 24, true);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final c2 f112226k0 = new c2("DELETE_TO_LINE_END", 25, true);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final c2 f112228l0 = new c2("SELECT_ALL", 26, false);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final c2 f112230m0 = new c2("SELECT_LEFT_CHAR", 27, false);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final c2 f112232n0 = new c2("SELECT_RIGHT_CHAR", 28, false);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final c2 f112233o0 = new c2("SELECT_UP", 29, false);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c2 f112234p0 = new c2("SELECT_DOWN", 30, false);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final c2 f112235q0 = new c2("SELECT_PAGE_UP", 31, false);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final c2 f112237r0 = new c2("SELECT_PAGE_DOWN", 32, false);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final c2 f112239s0 = new c2("SELECT_HOME", 33, false);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final c2 f112240t0 = new c2("SELECT_END", 34, false);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final c2 f112241u0 = new c2("SELECT_LEFT_WORD", 35, false);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final c2 f112243v0 = new c2("SELECT_RIGHT_WORD", 36, false);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final c2 f112245w0 = new c2("SELECT_NEXT_PARAGRAPH", 37, false);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final c2 f112247x0 = new c2("SELECT_PREV_PARAGRAPH", 38, false);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final c2 f112249y0 = new c2("SELECT_LINE_START", 39, false);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final c2 f112250z0 = new c2("SELECT_LINE_END", 40, false);
    public static final c2 A0 = new c2("SELECT_LINE_LEFT", 41, false);
    public static final c2 B0 = new c2("SELECT_LINE_RIGHT", 42, false);
    public static final c2 C0 = new c2("DESELECT", 43, false);
    public static final c2 D0 = new c2("NEW_LINE", 44, true);
    public static final c2 E0 = new c2("TAB", 45, true);
    public static final c2 F0 = new c2("UNDO", 46, true);
    public static final c2 G0 = new c2("REDO", 47, true);
    public static final c2 H0 = new c2("CHARACTER_PALETTE", 48, true);

    static {
        c2[] c2VarArrA = a();
        I0 = c2VarArrA;
        J0 = cf0.b.a(c2VarArrA);
    }

    private c2(String str, int i11, boolean z11) {
        this.f112251a = z11;
    }

    private static final /* synthetic */ c2[] a() {
        return new c2[]{f112216b, f112217c, f112218d, f112219e, f112220f, f112221g, f112222h, f112223i, f112227l, f112229m, f112231n, f112236r, f112238s, f112242v, f112244w, f112246x, f112248y, B, N, S, X, Y, Z, f112224i0, f112225j0, f112226k0, f112228l0, f112230m0, f112232n0, f112233o0, f112234p0, f112235q0, f112237r0, f112239s0, f112240t0, f112241u0, f112243v0, f112245w0, f112247x0, f112249y0, f112250z0, A0, B0, C0, D0, E0, F0, G0, H0};
    }

    public static c2 valueOf(String str) {
        return (c2) Enum.valueOf(c2.class, str);
    }

    public static c2[] values() {
        return (c2[]) I0.clone();
    }

    public final boolean b() {
        return this.f112251a;
    }
}
