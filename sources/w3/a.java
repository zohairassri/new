package w3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1868a f134028b = new C1868a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f134029c = d("Enter");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f134030d = d("Exit");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f134031a;

    /* JADX INFO: renamed from: w3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1868a {
        public /* synthetic */ C1868a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return a.f134029c;
        }

        public final String b() {
            return a.f134030d;
        }

        private C1868a() {
        }
    }

    private /* synthetic */ a(String str) {
        this.f134031a = str;
    }

    public static final /* synthetic */ a c(String str) {
        return new a(str);
    }

    public static boolean e(String str, Object obj) {
        return (obj instanceof a) && Intrinsics.areEqual(str, ((a) obj).i());
    }

    public static final boolean f(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    public static int g(String str) {
        return str.hashCode();
    }

    public boolean equals(Object obj) {
        return e(this.f134031a, obj);
    }

    public int hashCode() {
        return g(this.f134031a);
    }

    public final /* synthetic */ String i() {
        return this.f134031a;
    }

    public String toString() {
        return h(this.f134031a);
    }

    private static String d(String str) {
        return str;
    }

    public static String h(String str) {
        return str;
    }
}
