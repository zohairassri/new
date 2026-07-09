package s3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f125467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h f125468e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f125469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f125470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f125471c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C1690a f125472b = new C1690a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final float f125473c = d(0.0f);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final float f125474d = d(0.5f);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final float f125475e = d(-1.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final float f125476f = d(1.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f125477a;

        /* JADX INFO: renamed from: s3.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C1690a {
            public /* synthetic */ C1690a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final float a() {
                return a.f125474d;
            }

            public final float b() {
                return a.f125475e;
            }

            private C1690a() {
            }
        }

        private /* synthetic */ a(float f11) {
            this.f125477a = f11;
        }

        public static final /* synthetic */ a c(float f11) {
            return new a(f11);
        }

        public static float d(float f11) {
            if (!((0.0f <= f11 && f11 <= 1.0f) || f11 == -1.0f)) {
                n3.a.c("topRatio should be in [0..1] range or -1");
            }
            return f11;
        }

        public static boolean e(float f11, Object obj) {
            return (obj instanceof a) && Float.compare(f11, ((a) obj).i()) == 0;
        }

        public static final boolean f(float f11, float f12) {
            return Float.compare(f11, f12) == 0;
        }

        public static int g(float f11) {
            return Float.hashCode(f11);
        }

        public static String h(float f11) {
            if (f11 == f125473c) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f11 == f125474d) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f11 == f125475e) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f11 == f125476f) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f11 + ')';
        }

        public boolean equals(Object obj) {
            return e(this.f125477a, obj);
        }

        public int hashCode() {
            return g(this.f125477a);
        }

        public final /* synthetic */ float i() {
            return this.f125477a;
        }

        public String toString() {
            return h(this.f125477a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return h.f125468e;
        }

        private b() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f125467d = new b(defaultConstructorMarker);
        f125468e = new h(a.f125472b.b(), d.f125482b.a(), c.f125478b.a(), defaultConstructorMarker);
    }

    public /* synthetic */ h(float f11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, i11, i12);
    }

    public final float b() {
        return this.f125469a;
    }

    public final int c() {
        return this.f125471c;
    }

    public final int d() {
        return this.f125470b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return a.f(this.f125469a, hVar.f125469a) && d.f(this.f125470b, hVar.f125470b) && c.f(this.f125471c, hVar.f125471c);
    }

    public int hashCode() {
        return (((a.g(this.f125469a) * 31) + d.g(this.f125470b)) * 31) + c.g(this.f125471c);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.h(this.f125469a)) + ", trim=" + ((Object) d.j(this.f125470b)) + ",mode=" + ((Object) c.h(this.f125471c)) + ')';
    }

    public /* synthetic */ h(float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, i11);
    }

    private h(float f11, int i11, int i12) {
        this.f125469a = f11;
        this.f125470b = i11;
        this.f125471c = i12;
    }

    private h(float f11, int i11) {
        this(f11, i11, c.f125478b.a(), null);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f125478b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f125479c = d(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f125480d = d(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f125481a;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.f125479c;
            }

            public final int b() {
                return c.f125480d;
            }

            private a() {
            }
        }

        private /* synthetic */ c(int i11) {
            this.f125481a = i11;
        }

        public static final /* synthetic */ c c(int i11) {
            return new c(i11);
        }

        public static boolean e(int i11, Object obj) {
            return (obj instanceof c) && i11 == ((c) obj).i();
        }

        public static final boolean f(int i11, int i12) {
            return i11 == i12;
        }

        public static int g(int i11) {
            return Integer.hashCode(i11);
        }

        public static String h(int i11) {
            return "Mode(value=" + i11 + ')';
        }

        public boolean equals(Object obj) {
            return e(this.f125481a, obj);
        }

        public int hashCode() {
            return g(this.f125481a);
        }

        public final /* synthetic */ int i() {
            return this.f125481a;
        }

        public String toString() {
            return h(this.f125481a);
        }

        private static int d(int i11) {
            return i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f125482b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f125483c = d(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f125484d = d(16);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f125485e = d(17);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f125486f = d(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f125487a;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return d.f125485e;
            }

            public final int b() {
                return d.f125486f;
            }

            private a() {
            }
        }

        private /* synthetic */ d(int i11) {
            this.f125487a = i11;
        }

        public static final /* synthetic */ d c(int i11) {
            return new d(i11);
        }

        public static boolean e(int i11, Object obj) {
            return (obj instanceof d) && i11 == ((d) obj).k();
        }

        public static final boolean f(int i11, int i12) {
            return i11 == i12;
        }

        public static int g(int i11) {
            return Integer.hashCode(i11);
        }

        public static final boolean h(int i11) {
            return (i11 & 1) > 0;
        }

        public static final boolean i(int i11) {
            return (i11 & 16) > 0;
        }

        public static String j(int i11) {
            return i11 == f125483c ? "LineHeightStyle.Trim.FirstLineTop" : i11 == f125484d ? "LineHeightStyle.Trim.LastLineBottom" : i11 == f125485e ? "LineHeightStyle.Trim.Both" : i11 == f125486f ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return e(this.f125487a, obj);
        }

        public int hashCode() {
            return g(this.f125487a);
        }

        public final /* synthetic */ int k() {
            return this.f125487a;
        }

        public String toString() {
            return j(this.f125487a);
        }

        private static int d(int i11) {
            return i11;
        }
    }
}
