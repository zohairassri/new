package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f7661a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f7662b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f7663c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f7664d = c(3, 2);

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
    public static class b {
        public static final b B;
        public static final b N;
        private static final /* synthetic */ b[] S;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f7665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f7666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f7667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f7668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f7669g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f7670h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f7671i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f7672l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f7673m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f7674n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f7675r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f7676s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f7677v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f7678w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final b f7679x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final b f7680y;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f7681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7682b;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        enum a extends b {
            a(String str, int i11, c cVar, int i12) {
                super(str, i11, cVar, i12);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n1$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        enum C0130b extends b {
            C0130b(String str, int i11, c cVar, int i12) {
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
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f7665c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f7666d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f7667e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f7668f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f7669g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f7670h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f7671i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f7672l = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f7673m = aVar;
            c cVar3 = c.MESSAGE;
            C0130b c0130b = new C0130b("GROUP", 9, cVar3, 3);
            f7674n = c0130b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f7675r = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f7676s = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f7677v = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f7678w = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f7679x = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f7680y = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            B = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            N = bVar14;
            S = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0130b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) S.clone();
        }

        public c a() {
            return this.f7681a;
        }

        public int b() {
            return this.f7682b;
        }

        private b(String str, int i11, c cVar, int i12) {
            this.f7681a = cVar;
            this.f7682b = i12;
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
        BYTE_STRING(g.f7571b),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f7693a;

        c(Object obj) {
            this.f7693a = obj;
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
