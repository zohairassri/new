package s3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1689a f125433b = new C1689a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f125434c = e(0.5f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f125435d = e(-0.5f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f125436e = e(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f125437a;

    /* JADX INFO: renamed from: s3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1689a {
        public /* synthetic */ C1689a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return a.f125436e;
        }

        public final float b() {
            return a.f125435d;
        }

        public final float c() {
            return a.f125434c;
        }

        private C1689a() {
        }
    }

    private /* synthetic */ a(float f11) {
        this.f125437a = f11;
    }

    public static final /* synthetic */ a d(float f11) {
        return new a(f11);
    }

    public static boolean f(float f11, Object obj) {
        return (obj instanceof a) && Float.compare(f11, ((a) obj).j()) == 0;
    }

    public static final boolean g(float f11, float f12) {
        return Float.compare(f11, f12) == 0;
    }

    public static int h(float f11) {
        return Float.hashCode(f11);
    }

    public static String i(float f11) {
        return "BaselineShift(multiplier=" + f11 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f125437a, obj);
    }

    public int hashCode() {
        return h(this.f125437a);
    }

    public final /* synthetic */ float j() {
        return this.f125437a;
    }

    public String toString() {
        return i(this.f125437a);
    }

    public static float e(float f11) {
        return f11;
    }
}
