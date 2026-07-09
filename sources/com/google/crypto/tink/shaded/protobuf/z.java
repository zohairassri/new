package com.google.crypto.tink.shaded.protobuf;

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
/* JADX INFO: loaded from: classes10.dex */
public final class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f46348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z f46349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z f46350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z f46351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final z f46352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z f46353i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final z f46354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final z f46355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final z f46356n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final z f46357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ z[] f46358s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f46359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f46360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f46361c;

    static {
        z zVar = new z("VOID", 0, Void.class, Void.class, null);
        f46348d = zVar;
        Class cls = Integer.TYPE;
        z zVar2 = new z("INT", 1, cls, Integer.class, 0);
        f46349e = zVar2;
        z zVar3 = new z("LONG", 2, Long.TYPE, Long.class, 0L);
        f46350f = zVar3;
        z zVar4 = new z("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f46351g = zVar4;
        z zVar5 = new z("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f46352h = zVar5;
        z zVar6 = new z("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f46353i = zVar6;
        z zVar7 = new z("STRING", 6, String.class, String.class, "");
        f46354l = zVar7;
        z zVar8 = new z("BYTE_STRING", 7, h.class, h.class, h.f46126b);
        f46355m = zVar8;
        z zVar9 = new z("ENUM", 8, cls, Integer.class, null);
        f46356n = zVar9;
        z zVar10 = new z("MESSAGE", 9, Object.class, Object.class, null);
        f46357r = zVar10;
        f46358s = new z[]{zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7, zVar8, zVar9, zVar10};
    }

    private z(String str, int i11, Class cls, Class cls2, Object obj) {
        this.f46359a = cls;
        this.f46360b = cls2;
        this.f46361c = obj;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f46358s.clone();
    }

    public Class a() {
        return this.f46360b;
    }
}
