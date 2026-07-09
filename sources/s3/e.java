package s3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f125441b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f125442c = e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f125443d = e(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f125444e = e(IntCompanionObject.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f125445a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return e.f125443d;
        }

        public final int b() {
            return e.f125442c;
        }

        public final int c() {
            return e.f125444e;
        }

        private a() {
        }
    }

    private /* synthetic */ e(int i11) {
        this.f125445a = i11;
    }

    public static final /* synthetic */ e d(int i11) {
        return new e(i11);
    }

    public static boolean f(int i11, Object obj) {
        return (obj instanceof e) && i11 == ((e) obj).j();
    }

    public static final boolean g(int i11, int i12) {
        return i11 == i12;
    }

    public static int h(int i11) {
        return Integer.hashCode(i11);
    }

    public static String i(int i11) {
        return g(i11, f125442c) ? "Hyphens.None" : g(i11, f125443d) ? "Hyphens.Auto" : g(i11, f125444e) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f125445a, obj);
    }

    public int hashCode() {
        return h(this.f125445a);
    }

    public final /* synthetic */ int j() {
        return this.f125445a;
    }

    public String toString() {
        return i(this.f125445a);
    }

    private static int e(int i11) {
        return i11;
    }
}
