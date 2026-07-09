package we0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f135162b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f135163a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ d0(long j11) {
        this.f135163a = j11;
    }

    public static final /* synthetic */ d0 a(long j11) {
        return new d0(j11);
    }

    public static boolean c(long j11, Object obj) {
        return (obj instanceof d0) && j11 == ((d0) obj).h();
    }

    public static final boolean e(long j11, long j12) {
        return j11 == j12;
    }

    public static int f(long j11) {
        return Long.hashCode(j11);
    }

    public static String g(long j11) {
        return j0.f(j11, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return j0.c(h(), ((d0) obj).h());
    }

    public boolean equals(Object obj) {
        return c(this.f135163a, obj);
    }

    public final /* synthetic */ long h() {
        return this.f135163a;
    }

    public int hashCode() {
        return f(this.f135163a);
    }

    public String toString() {
        return g(this.f135163a);
    }

    public static long b(long j11) {
        return j11;
    }
}
