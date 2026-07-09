package com.google.android.gms.internal.ads;

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
public final class q15 {
    public static final q15 B;
    public static final q15 N;
    private static final /* synthetic */ q15[] S;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q15 f33379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q15 f33380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q15 f33381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q15 f33382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q15 f33383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q15 f33384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q15 f33385i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q15 f33386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q15 f33387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q15 f33388n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q15 f33389r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q15 f33390s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q15 f33391v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final q15 f33392w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final q15 f33393x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final q15 f33394y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r15 f33395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33396b;

    static {
        q15 q15Var = new q15("DOUBLE", 0, r15.DOUBLE, 1);
        f33379c = q15Var;
        q15 q15Var2 = new q15("FLOAT", 1, r15.FLOAT, 5);
        f33380d = q15Var2;
        r15 r15Var = r15.LONG;
        q15 q15Var3 = new q15("INT64", 2, r15Var, 0);
        f33381e = q15Var3;
        q15 q15Var4 = new q15("UINT64", 3, r15Var, 0);
        f33382f = q15Var4;
        r15 r15Var2 = r15.INT;
        q15 q15Var5 = new q15("INT32", 4, r15Var2, 0);
        f33383g = q15Var5;
        q15 q15Var6 = new q15("FIXED64", 5, r15Var, 1);
        f33384h = q15Var6;
        q15 q15Var7 = new q15("FIXED32", 6, r15Var2, 5);
        f33385i = q15Var7;
        q15 q15Var8 = new q15("BOOL", 7, r15.BOOLEAN, 0);
        f33386l = q15Var8;
        q15 q15Var9 = new q15("STRING", 8, r15.STRING, 2);
        f33387m = q15Var9;
        r15 r15Var3 = r15.MESSAGE;
        q15 q15Var10 = new q15("GROUP", 9, r15Var3, 3);
        f33388n = q15Var10;
        q15 q15Var11 = new q15("MESSAGE", 10, r15Var3, 2);
        f33389r = q15Var11;
        q15 q15Var12 = new q15("BYTES", 11, r15.BYTE_STRING, 2);
        f33390s = q15Var12;
        q15 q15Var13 = new q15("UINT32", 12, r15Var2, 0);
        f33391v = q15Var13;
        q15 q15Var14 = new q15("ENUM", 13, r15.ENUM, 0);
        f33392w = q15Var14;
        q15 q15Var15 = new q15("SFIXED32", 14, r15Var2, 5);
        f33393x = q15Var15;
        q15 q15Var16 = new q15("SFIXED64", 15, r15Var, 1);
        f33394y = q15Var16;
        q15 q15Var17 = new q15("SINT32", 16, r15Var2, 0);
        B = q15Var17;
        q15 q15Var18 = new q15("SINT64", 17, r15Var, 0);
        N = q15Var18;
        S = new q15[]{q15Var, q15Var2, q15Var3, q15Var4, q15Var5, q15Var6, q15Var7, q15Var8, q15Var9, q15Var10, q15Var11, q15Var12, q15Var13, q15Var14, q15Var15, q15Var16, q15Var17, q15Var18};
    }

    private q15(String str, int i11, r15 r15Var, int i12) {
        this.f33395a = r15Var;
        this.f33396b = i12;
    }

    public static q15[] values() {
        return (q15[]) S.clone();
    }

    public final r15 a() {
        return this.f33395a;
    }

    public final int b() {
        return this.f33396b;
    }
}
