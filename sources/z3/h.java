package z3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f141729b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f141730c = h(0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f141731d = h(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f141732e = h(Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f141733a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return h.f141730c;
        }

        public final float b() {
            return h.f141731d;
        }

        public final float c() {
            return h.f141732e;
        }

        private a() {
        }
    }

    private /* synthetic */ h(float f11) {
        this.f141733a = f11;
    }

    public static final /* synthetic */ h e(float f11) {
        return new h(f11);
    }

    public static int g(float f11, float f12) {
        return Float.compare(f11, f12);
    }

    public static boolean j(float f11, Object obj) {
        return (obj instanceof h) && Float.compare(f11, ((h) obj).o()) == 0;
    }

    public static final boolean k(float f11, float f12) {
        return Float.compare(f11, f12) == 0;
    }

    public static int l(float f11) {
        return Float.hashCode(f11);
    }

    public static String n(float f11) {
        if (Float.isNaN(f11)) {
            return "Dp.Unspecified";
        }
        return f11 + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return f(((h) obj).o());
    }

    public boolean equals(Object obj) {
        return j(this.f141733a, obj);
    }

    public int f(float f11) {
        return g(this.f141733a, f11);
    }

    public int hashCode() {
        return l(this.f141733a);
    }

    public final /* synthetic */ float o() {
        return this.f141733a;
    }

    public String toString() {
        return n(this.f141733a);
    }

    public static float h(float f11) {
        return f11;
    }
}
