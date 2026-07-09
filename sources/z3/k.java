package z3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f141738b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f141739c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f141740d = d(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f141741a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return k.f141740d;
        }

        public final long b() {
            return k.f141739c;
        }

        private a() {
        }
    }

    private /* synthetic */ k(long j11) {
        this.f141741a = j11;
    }

    public static final /* synthetic */ k c(long j11) {
        return new k(j11);
    }

    public static final long e(long j11, float f11, float f12) {
        return d((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L));
    }

    public static /* synthetic */ long f(long j11, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = j(j11);
        }
        if ((i11 & 2) != 0) {
            f12 = i(j11);
        }
        return e(j11, f11, f12);
    }

    public static boolean g(long j11, Object obj) {
        return (obj instanceof k) && j11 == ((k) obj).m();
    }

    public static final boolean h(long j11, long j12) {
        return j11 == j12;
    }

    public static final float i(long j11) {
        return h.h(Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    public static final float j(long j11) {
        return h.h(Float.intBitsToFloat((int) (j11 >> 32)));
    }

    public static int k(long j11) {
        return Long.hashCode(j11);
    }

    public static String l(long j11) {
        if (j11 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) h.n(j(j11))) + " x " + ((Object) h.n(i(j11)));
    }

    public boolean equals(Object obj) {
        return g(this.f141741a, obj);
    }

    public int hashCode() {
        return k(this.f141741a);
    }

    public final /* synthetic */ long m() {
        return this.f141741a;
    }

    public String toString() {
        return l(this.f141741a);
    }

    public static long d(long j11) {
        return j11;
    }
}
