package g2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f97884a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f97885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f97886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f97887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f97888e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b.f97887d;
        }

        public final long b() {
            return b.f97885b;
        }

        public final long c() {
            return b.f97886c;
        }

        private a() {
        }
    }

    static {
        long j11 = 3;
        long j12 = j11 << 32;
        f97885b = d((((long) 0) & 4294967295L) | j12);
        f97886c = d((((long) 1) & 4294967295L) | j12);
        f97887d = d(j12 | (((long) 2) & 4294967295L));
        f97888e = d((j11 & 4294967295L) | (((long) 4) << 32));
    }

    public static final boolean e(long j11, long j12) {
        return j11 == j12;
    }

    public static final int f(long j11) {
        return (int) (j11 >> 32);
    }

    public static int g(long j11) {
        return Long.hashCode(j11);
    }

    public static String h(long j11) {
        return e(j11, f97885b) ? "Rgb" : e(j11, f97886c) ? "Xyz" : e(j11, f97887d) ? "Lab" : e(j11, f97888e) ? "Cmyk" : "Unknown";
    }

    public static long d(long j11) {
        return j11;
    }
}
