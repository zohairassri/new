package s3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f125527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u f125528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final u f125529e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f125530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f125531b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u a() {
            return u.f125528d;
        }

        private a() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f125527c = new a(defaultConstructorMarker);
        b.a aVar = b.f125532b;
        f125528d = new u(aVar.a(), false, defaultConstructorMarker);
        f125529e = new u(aVar.b(), true, defaultConstructorMarker);
    }

    public /* synthetic */ u(int i11, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, z11);
    }

    public final int b() {
        return this.f125530a;
    }

    public final boolean c() {
        return this.f125531b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return b.g(this.f125530a, uVar.f125530a) && this.f125531b == uVar.f125531b;
    }

    public int hashCode() {
        return (b.h(this.f125530a) * 31) + Boolean.hashCode(this.f125531b);
    }

    public String toString() {
        return Intrinsics.areEqual(this, f125528d) ? "TextMotion.Static" : Intrinsics.areEqual(this, f125529e) ? "TextMotion.Animated" : "Invalid";
    }

    private u(int i11, boolean z11) {
        this.f125530a = i11;
        this.f125531b = z11;
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f125532b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f125533c = e(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f125534d = e(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f125535e = e(3);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f125536a;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.f125534d;
            }

            public final int b() {
                return b.f125533c;
            }

            public final int c() {
                return b.f125535e;
            }

            private a() {
            }
        }

        private /* synthetic */ b(int i11) {
            this.f125536a = i11;
        }

        public static final /* synthetic */ b d(int i11) {
            return new b(i11);
        }

        public static boolean f(int i11, Object obj) {
            return (obj instanceof b) && i11 == ((b) obj).j();
        }

        public static final boolean g(int i11, int i12) {
            return i11 == i12;
        }

        public static int h(int i11) {
            return Integer.hashCode(i11);
        }

        public static String i(int i11) {
            return g(i11, f125533c) ? "Linearity.Linear" : g(i11, f125534d) ? "Linearity.FontHinting" : g(i11, f125535e) ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return f(this.f125536a, obj);
        }

        public int hashCode() {
            return h(this.f125536a);
        }

        public final /* synthetic */ int j() {
            return this.f125536a;
        }

        public String toString() {
            return i(this.f125536a);
        }

        private static int e(int i11) {
            return i11;
        }
    }
}
