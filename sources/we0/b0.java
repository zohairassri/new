package we0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f135153b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f135154a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ b0(int i11) {
        this.f135154a = i11;
    }

    public static final /* synthetic */ b0 a(int i11) {
        return new b0(i11);
    }

    public static boolean c(int i11, Object obj) {
        return (obj instanceof b0) && i11 == ((b0) obj).g();
    }

    public static int e(int i11) {
        return Integer.hashCode(i11);
    }

    public static String f(int i11) {
        return String.valueOf(((long) i11) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return j0.b(g(), ((b0) obj).g());
    }

    public boolean equals(Object obj) {
        return c(this.f135154a, obj);
    }

    public final /* synthetic */ int g() {
        return this.f135154a;
    }

    public int hashCode() {
        return e(this.f135154a);
    }

    public String toString() {
        return f(this.f135154a);
    }

    public static int b(int i11) {
        return i11;
    }
}
