package com.google.android.gms.internal.measurement;

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
public final class u8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u8 f40770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u8 f40771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u8 f40772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u8 f40773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u8 f40774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u8 f40775i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u8 f40776l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u8 f40777m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u8 f40778n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u8 f40779r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ u8[] f40780s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f40781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f40782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f40783c;

    static {
        u8 u8Var = new u8("VOID", 0, Void.class, Void.class, null);
        f40770d = u8Var;
        Class cls = Integer.TYPE;
        u8 u8Var2 = new u8("INT", 1, cls, Integer.class, 0);
        f40771e = u8Var2;
        u8 u8Var3 = new u8("LONG", 2, Long.TYPE, Long.class, 0L);
        f40772f = u8Var3;
        u8 u8Var4 = new u8("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f40773g = u8Var4;
        u8 u8Var5 = new u8("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f40774h = u8Var5;
        u8 u8Var6 = new u8("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f40775i = u8Var6;
        u8 u8Var7 = new u8("STRING", 6, String.class, String.class, "");
        f40776l = u8Var7;
        u8 u8Var8 = new u8("BYTE_STRING", 7, c7.class, c7.class, c7.f40188b);
        f40777m = u8Var8;
        u8 u8Var9 = new u8("ENUM", 8, cls, Integer.class, null);
        f40778n = u8Var9;
        u8 u8Var10 = new u8("MESSAGE", 9, Object.class, Object.class, null);
        f40779r = u8Var10;
        f40780s = new u8[]{u8Var, u8Var2, u8Var3, u8Var4, u8Var5, u8Var6, u8Var7, u8Var8, u8Var9, u8Var10};
    }

    private u8(String str, int i11, Class cls, Class cls2, Object obj) {
        this.f40781a = cls;
        this.f40782b = cls2;
        this.f40783c = obj;
    }

    public static u8[] values() {
        return (u8[]) f40780s.clone();
    }

    public final Class a() {
        return this.f40782b;
    }
}
