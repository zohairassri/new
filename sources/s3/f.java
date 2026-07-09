package s3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f125446b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f125447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f125448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f125449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f125450f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f125451a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return f.f125448d;
        }

        public final int b() {
            return f.f125447c;
        }

        public final int c() {
            return f.f125450f;
        }

        private a() {
        }
    }

    static {
        b.a aVar = b.f125452a;
        int iC = aVar.c();
        c.a aVar2 = c.f125457a;
        int iC2 = aVar2.c();
        d.a aVar3 = d.f125463a;
        f125447c = e(g.e(iC, iC2, aVar3.a()));
        f125448d = e(g.e(aVar.a(), aVar2.b(), aVar3.b()));
        f125449e = e(g.e(aVar.b(), aVar2.d(), aVar3.a()));
        f125450f = e(0);
    }

    private /* synthetic */ f(int i11) {
        this.f125451a = i11;
    }

    public static final /* synthetic */ f d(int i11) {
        return new f(i11);
    }

    public static boolean f(int i11, Object obj) {
        return (obj instanceof f) && i11 == ((f) obj).m();
    }

    public static final boolean g(int i11, int i12) {
        return i11 == i12;
    }

    public static final int h(int i11) {
        return b.d(g.f(i11));
    }

    public static final int i(int i11) {
        return c.e(g.g(i11));
    }

    public static final int j(int i11) {
        return d.c(g.h(i11));
    }

    public static int k(int i11) {
        return Integer.hashCode(i11);
    }

    public static String l(int i11) {
        return "LineBreak(strategy=" + ((Object) b.f(h(i11))) + ", strictness=" + ((Object) c.g(i(i11))) + ", wordBreak=" + ((Object) d.e(j(i11))) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f125451a, obj);
    }

    public int hashCode() {
        return k(this.f125451a);
    }

    public final /* synthetic */ int m() {
        return this.f125451a;
    }

    public String toString() {
        return l(this.f125451a);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f125452a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f125453b = d(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f125454c = d(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f125455d = d(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f125456e = d(0);

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.f125455d;
            }

            public final int b() {
                return b.f125454c;
            }

            public final int c() {
                return b.f125453b;
            }

            private a() {
            }
        }

        public static final boolean e(int i11, int i12) {
            return i11 == i12;
        }

        public static String f(int i11) {
            return e(i11, f125453b) ? "Strategy.Simple" : e(i11, f125454c) ? "Strategy.HighQuality" : e(i11, f125455d) ? "Strategy.Balanced" : e(i11, f125456e) ? "Strategy.Unspecified" : "Invalid";
        }

        public static int d(int i11) {
            return i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f125457a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f125458b = e(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f125459c = e(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f125460d = e(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f125461e = e(4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f125462f = e(0);

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.f125458b;
            }

            public final int b() {
                return c.f125459c;
            }

            public final int c() {
                return c.f125460d;
            }

            public final int d() {
                return c.f125461e;
            }

            private a() {
            }
        }

        public static final boolean f(int i11, int i12) {
            return i11 == i12;
        }

        public static String g(int i11) {
            return f(i11, f125458b) ? "Strictness.None" : f(i11, f125459c) ? "Strictness.Loose" : f(i11, f125460d) ? "Strictness.Normal" : f(i11, f125461e) ? "Strictness.Strict" : f(i11, f125462f) ? "Strictness.Unspecified" : "Invalid";
        }

        public static int e(int i11) {
            return i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f125463a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f125464b = c(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f125465c = c(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f125466d = c(0);

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return d.f125464b;
            }

            public final int b() {
                return d.f125465c;
            }

            private a() {
            }
        }

        public static final boolean d(int i11, int i12) {
            return i11 == i12;
        }

        public static String e(int i11) {
            return d(i11, f125464b) ? "WordBreak.None" : d(i11, f125465c) ? "WordBreak.Phrase" : d(i11, f125466d) ? "WordBreak.Unspecified" : "Invalid";
        }

        public static int c(int i11) {
            return i11;
        }
    }

    public static int e(int i11) {
        return i11;
    }
}
