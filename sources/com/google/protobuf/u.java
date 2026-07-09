package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f47538d = new u("VOID", 0, Void.class, Void.class, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u f47539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u f47540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u f47541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u f47542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u f47543i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u f47544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u f47545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u f47546n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u f47547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ u[] f47548s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f47549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f47550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f47551c;

    static {
        Class cls = Integer.TYPE;
        f47539e = new u("INT", 1, cls, Integer.class, 0);
        f47540f = new u("LONG", 2, Long.TYPE, Long.class, 0L);
        f47541g = new u("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f47542h = new u("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f47543i = new u("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f47544l = new u("STRING", 6, String.class, String.class, "");
        f47545m = new u("BYTE_STRING", 7, f.class, f.class, f.f47336b);
        f47546n = new u("ENUM", 8, cls, Integer.class, null);
        f47547r = new u("MESSAGE", 9, Object.class, Object.class, null);
        f47548s = a();
    }

    private u(String str, int i11, Class cls, Class cls2, Object obj) {
        this.f47549a = cls;
        this.f47550b = cls2;
        this.f47551c = obj;
    }

    private static /* synthetic */ u[] a() {
        return new u[]{f47538d, f47539e, f47540f, f47541g, f47542h, f47543i, f47544l, f47545m, f47546n, f47547r};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f47548s.clone();
    }

    public Class b() {
        return this.f47550b;
    }
}
