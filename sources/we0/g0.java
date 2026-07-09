package we0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class g0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f135173b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short f135174a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ g0(short s11) {
        this.f135174a = s11;
    }

    public static final /* synthetic */ g0 a(short s11) {
        return new g0(s11);
    }

    public static boolean c(short s11, Object obj) {
        return (obj instanceof g0) && s11 == ((g0) obj).g();
    }

    public static int e(short s11) {
        return Short.hashCode(s11);
    }

    public static String f(short s11) {
        return String.valueOf(s11 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(g() & 65535, ((g0) obj).g() & 65535);
    }

    public boolean equals(Object obj) {
        return c(this.f135174a, obj);
    }

    public final /* synthetic */ short g() {
        return this.f135174a;
    }

    public int hashCode() {
        return e(this.f135174a);
    }

    public String toString() {
        return f(this.f135174a);
    }

    public static short b(short s11) {
        return s11;
    }
}
