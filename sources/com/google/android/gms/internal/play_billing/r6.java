package com.google.android.gms.internal.play_billing;

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
public final class r6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r6 f42565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r6 f42566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r6 f42567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r6 f42568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r6 f42569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r6 f42570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r6 f42571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r6 f42572i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r6 f42573l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final r6 f42574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ r6[] f42575n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f42576a;

    static {
        r6 r6Var = new r6("VOID", 0, Void.class, Void.class, null);
        f42565b = r6Var;
        Class cls = Integer.TYPE;
        r6 r6Var2 = new r6("INT", 1, cls, Integer.class, 0);
        f42566c = r6Var2;
        r6 r6Var3 = new r6("LONG", 2, Long.TYPE, Long.class, 0L);
        f42567d = r6Var3;
        r6 r6Var4 = new r6("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f42568e = r6Var4;
        r6 r6Var5 = new r6("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f42569f = r6Var5;
        r6 r6Var6 = new r6("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f42570g = r6Var6;
        r6 r6Var7 = new r6("STRING", 6, String.class, String.class, "");
        f42571h = r6Var7;
        r6 r6Var8 = new r6("BYTE_STRING", 7, p5.class, p5.class, p5.f42518b);
        f42572i = r6Var8;
        r6 r6Var9 = new r6("ENUM", 8, cls, Integer.class, null);
        f42573l = r6Var9;
        r6 r6Var10 = new r6("MESSAGE", 9, Object.class, Object.class, null);
        f42574m = r6Var10;
        f42575n = new r6[]{r6Var, r6Var2, r6Var3, r6Var4, r6Var5, r6Var6, r6Var7, r6Var8, r6Var9, r6Var10};
    }

    private r6(String str, int i11, Class cls, Class cls2, Object obj) {
        this.f42576a = cls2;
    }

    public static r6[] values() {
        return (r6[]) f42575n.clone();
    }

    public final Class a() {
        return this.f42576a;
    }
}
