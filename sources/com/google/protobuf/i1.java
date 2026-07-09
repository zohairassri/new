package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f47393a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f47394b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f47395c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f47396d = c(3, 2);

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
    public static class b {
        public static final b B;
        public static final b N;
        private static final /* synthetic */ b[] S;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f47397c = new b("DOUBLE", 0, c.DOUBLE, 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f47398d = new b("FLOAT", 1, c.FLOAT, 5);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f47399e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f47400f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f47401g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f47402h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f47403i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f47404l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f47405m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f47406n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f47407r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f47408s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f47409v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f47410w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final b f47411x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final b f47412y;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f47413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f47414b;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        enum a extends b {
            a(String str, int i11, c cVar, int i12) {
                super(str, i11, cVar, i12);
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.i1$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        enum C0354b extends b {
            C0354b(String str, int i11, c cVar, int i12) {
                super(str, i11, cVar, i12);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        enum c extends b {
            c(String str, int i11, c cVar, int i12) {
                super(str, i11, cVar, i12);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        enum d extends b {
            d(String str, int i11, c cVar, int i12) {
                super(str, i11, cVar, i12);
            }
        }

        static {
            c cVar = c.LONG;
            f47399e = new b("INT64", 2, cVar, 0);
            f47400f = new b("UINT64", 3, cVar, 0);
            c cVar2 = c.INT;
            f47401g = new b("INT32", 4, cVar2, 0);
            f47402h = new b("FIXED64", 5, cVar, 1);
            f47403i = new b("FIXED32", 6, cVar2, 5);
            f47404l = new b("BOOL", 7, c.BOOLEAN, 0);
            f47405m = new a("STRING", 8, c.STRING, 2);
            c cVar3 = c.MESSAGE;
            f47406n = new C0354b("GROUP", 9, cVar3, 3);
            f47407r = new c("MESSAGE", 10, cVar3, 2);
            f47408s = new d("BYTES", 11, c.BYTE_STRING, 2);
            f47409v = new b("UINT32", 12, cVar2, 0);
            f47410w = new b("ENUM", 13, c.ENUM, 0);
            f47411x = new b("SFIXED32", 14, cVar2, 5);
            f47412y = new b("SFIXED64", 15, cVar, 1);
            B = new b("SINT32", 16, cVar2, 0);
            N = new b("SINT64", 17, cVar, 0);
            S = a();
        }

        private static /* synthetic */ b[] a() {
            return new b[]{f47397c, f47398d, f47399e, f47400f, f47401g, f47402h, f47403i, f47404l, f47405m, f47406n, f47407r, f47408s, f47409v, f47410w, f47411x, f47412y, B, N};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) S.clone();
        }

        public c b() {
            return this.f47413a;
        }

        public int c() {
            return this.f47414b;
        }

        private b(String str, int i11, c cVar, int i12) {
            this.f47413a = cVar;
            this.f47414b = i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(f.f47336b),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f47425a;

        c(Object obj) {
            this.f47425a = obj;
        }
    }

    public static int a(int i11) {
        return i11 >>> 3;
    }

    public static int b(int i11) {
        return i11 & 7;
    }

    static int c(int i11, int i12) {
        return (i11 << 3) | i12;
    }
}
