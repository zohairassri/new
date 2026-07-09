package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
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
public final class lz4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final lz4 f30503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final lz4 f30504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final lz4 f30505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final lz4 f30506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final lz4 f30507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final lz4 f30508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final lz4 f30509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final lz4 f30510i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final lz4 f30511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final lz4 f30512m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ lz4[] f30513n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f30514a;

    static {
        lz4 lz4Var = new lz4("VOID", 0, Void.class, Void.class, null);
        f30503b = lz4Var;
        Class cls = Integer.TYPE;
        lz4 lz4Var2 = new lz4("INT", 1, cls, Integer.class, 0);
        f30504c = lz4Var2;
        lz4 lz4Var3 = new lz4("LONG", 2, Long.TYPE, Long.class, 0L);
        f30505d = lz4Var3;
        lz4 lz4Var4 = new lz4("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f30506e = lz4Var4;
        lz4 lz4Var5 = new lz4("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f30507f = lz4Var5;
        lz4 lz4Var6 = new lz4("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f30508g = lz4Var6;
        lz4 lz4Var7 = new lz4("STRING", 6, String.class, String.class, "");
        f30509h = lz4Var7;
        lz4 lz4Var8 = new lz4("BYTE_STRING", 7, xx4.class, xx4.class, xx4.f38226b);
        f30510i = lz4Var8;
        lz4 lz4Var9 = new lz4("ENUM", 8, cls, Integer.class, null);
        f30511l = lz4Var9;
        lz4 lz4Var10 = new lz4("MESSAGE", 9, Object.class, Object.class, null);
        f30512m = lz4Var10;
        f30513n = new lz4[]{lz4Var, lz4Var2, lz4Var3, lz4Var4, lz4Var5, lz4Var6, lz4Var7, lz4Var8, lz4Var9, lz4Var10};
    }

    private lz4(String str, int i11, Class cls, Class cls2, Object obj) {
        this.f30514a = cls2;
    }

    public static lz4[] values() {
        return (lz4[]) f30513n.clone();
    }

    public final Class a() {
        return this.f30514a;
    }
}
