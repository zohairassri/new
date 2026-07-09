package com.google.android.gms.internal.pal;

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
/* JADX INFO: loaded from: classes9.dex */
public final class i2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i2 f41432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i2 f41433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i2 f41434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i2 f41435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i2 f41436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i2 f41437i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i2 f41438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i2 f41439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i2 f41440n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i2 f41441r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ i2[] f41442s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f41443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f41444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f41445c;

    static {
        i2 i2Var = new i2("VOID", 0, Void.class, Void.class, null);
        f41432d = i2Var;
        Class cls = Integer.TYPE;
        i2 i2Var2 = new i2("INT", 1, cls, Integer.class, 0);
        f41433e = i2Var2;
        i2 i2Var3 = new i2("LONG", 2, Long.TYPE, Long.class, 0L);
        f41434f = i2Var3;
        i2 i2Var4 = new i2("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f41435g = i2Var4;
        i2 i2Var5 = new i2("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f41436h = i2Var5;
        i2 i2Var6 = new i2("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f41437i = i2Var6;
        i2 i2Var7 = new i2("STRING", 6, String.class, String.class, "");
        f41438l = i2Var7;
        i2 i2Var8 = new i2("BYTE_STRING", 7, a1.class, a1.class, a1.f40988b);
        f41439m = i2Var8;
        i2 i2Var9 = new i2("ENUM", 8, cls, Integer.class, null);
        f41440n = i2Var9;
        i2 i2Var10 = new i2("MESSAGE", 9, Object.class, Object.class, null);
        f41441r = i2Var10;
        f41442s = new i2[]{i2Var, i2Var2, i2Var3, i2Var4, i2Var5, i2Var6, i2Var7, i2Var8, i2Var9, i2Var10};
    }

    private i2(String str, int i11, Class cls, Class cls2, Object obj) {
        this.f41443a = cls;
        this.f41444b = cls2;
        this.f41445c = obj;
    }

    public static i2[] values() {
        return (i2[]) f41442s.clone();
    }

    public final Class a() {
        return this.f41444b;
    }
}
