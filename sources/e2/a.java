package e2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0992a f90914a = new C0992a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f90915b = b(0);

    /* JADX INFO: renamed from: e2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C0992a {
        public /* synthetic */ C0992a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a.f90915b;
        }

        private C0992a() {
        }
    }

    public static final boolean c(long j11, long j12) {
        return j11 == j12;
    }

    public static int d(long j11) {
        return Long.hashCode(j11);
    }

    public static String e(long j11) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        if (Float.intBitsToFloat(i11) == Float.intBitsToFloat(i12)) {
            return "CornerRadius.circular(" + c.a(Float.intBitsToFloat(i11), 1) + ')';
        }
        return "CornerRadius.elliptical(" + c.a(Float.intBitsToFloat(i11), 1) + ", " + c.a(Float.intBitsToFloat(i12), 1) + ')';
    }

    public static long b(long j11) {
        return j11;
    }
}
