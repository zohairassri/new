package androidx.compose.ui.graphics;

import f2.c2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5192b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f5193c = c2.a(0.5f, 0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f5194a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return j.f5193c;
        }

        private a() {
        }
    }

    private /* synthetic */ j(long j11) {
        this.f5194a = j11;
    }

    public static final /* synthetic */ j b(long j11) {
        return new j(j11);
    }

    public static boolean d(long j11, Object obj) {
        return (obj instanceof j) && j11 == ((j) obj).j();
    }

    public static final boolean e(long j11, long j12) {
        return j11 == j12;
    }

    public static final float f(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static final float g(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static int h(long j11) {
        return Long.hashCode(j11);
    }

    public static String i(long j11) {
        return "TransformOrigin(packedValue=" + j11 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f5194a, obj);
    }

    public int hashCode() {
        return h(this.f5194a);
    }

    public final /* synthetic */ long j() {
        return this.f5194a;
    }

    public String toString() {
        return i(this.f5194a);
    }

    public static long c(long j11) {
        return j11;
    }
}
