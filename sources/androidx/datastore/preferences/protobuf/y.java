package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f7798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f7799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y f7800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y f7801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y f7802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y f7803i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final y f7804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final y f7805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final y f7806n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y f7807r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ y[] f7808s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f7809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f7810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f7811c;

    static {
        y yVar = new y("VOID", 0, Void.class, Void.class, null);
        f7798d = yVar;
        Class cls = Integer.TYPE;
        y yVar2 = new y("INT", 1, cls, Integer.class, 0);
        f7799e = yVar2;
        y yVar3 = new y("LONG", 2, Long.TYPE, Long.class, 0L);
        f7800f = yVar3;
        y yVar4 = new y("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f7801g = yVar4;
        y yVar5 = new y("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f7802h = yVar5;
        y yVar6 = new y("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f7803i = yVar6;
        y yVar7 = new y("STRING", 6, String.class, String.class, "");
        f7804l = yVar7;
        y yVar8 = new y("BYTE_STRING", 7, g.class, g.class, g.f7571b);
        f7805m = yVar8;
        y yVar9 = new y("ENUM", 8, cls, Integer.class, null);
        f7806n = yVar9;
        y yVar10 = new y("MESSAGE", 9, Object.class, Object.class, null);
        f7807r = yVar10;
        f7808s = new y[]{yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9, yVar10};
    }

    private y(String str, int i11, Class cls, Class cls2, Object obj) {
        this.f7809a = cls;
        this.f7810b = cls2;
        this.f7811c = obj;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f7808s.clone();
    }

    public Class a() {
        return this.f7810b;
    }
}
