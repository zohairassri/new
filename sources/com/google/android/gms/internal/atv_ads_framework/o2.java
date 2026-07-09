package com.google.android.gms.internal.atv_ads_framework;

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
public final class o2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o2 f39978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o2 f39979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o2 f39980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o2 f39981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o2 f39982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o2 f39983i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o2 f39984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o2 f39985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final o2 f39986n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o2 f39987r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ o2[] f39988s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f39989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f39990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f39991c;

    static {
        o2 o2Var = new o2("VOID", 0, Void.class, Void.class, null);
        f39978d = o2Var;
        Class cls = Integer.TYPE;
        o2 o2Var2 = new o2("INT", 1, cls, Integer.class, 0);
        f39979e = o2Var2;
        o2 o2Var3 = new o2("LONG", 2, Long.TYPE, Long.class, 0L);
        f39980f = o2Var3;
        o2 o2Var4 = new o2("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f39981g = o2Var4;
        o2 o2Var5 = new o2("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f39982h = o2Var5;
        o2 o2Var6 = new o2("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f39983i = o2Var6;
        o2 o2Var7 = new o2("STRING", 6, String.class, String.class, "");
        f39984l = o2Var7;
        o2 o2Var8 = new o2("BYTE_STRING", 7, p1.class, p1.class, p1.f39995b);
        f39985m = o2Var8;
        o2 o2Var9 = new o2("ENUM", 8, cls, Integer.class, null);
        f39986n = o2Var9;
        o2 o2Var10 = new o2("MESSAGE", 9, Object.class, Object.class, null);
        f39987r = o2Var10;
        f39988s = new o2[]{o2Var, o2Var2, o2Var3, o2Var4, o2Var5, o2Var6, o2Var7, o2Var8, o2Var9, o2Var10};
    }

    private o2(String str, int i11, Class cls, Class cls2, Object obj) {
        this.f39989a = cls;
        this.f39990b = cls2;
        this.f39991c = obj;
    }

    public static o2[] values() {
        return (o2[]) f39988s.clone();
    }

    public final Class a() {
        return this.f39990b;
    }
}
