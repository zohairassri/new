package g1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f95538b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f95539c = e("PrimaryNotEditable");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f95540d = e("PrimaryEditable");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f95541e = e("SecondaryEditable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95542a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return a1.f95540d;
        }

        public final String b() {
            return a1.f95539c;
        }

        public final String c() {
            return a1.f95541e;
        }

        private a() {
        }
    }

    private /* synthetic */ a1(String str) {
        this.f95542a = str;
    }

    public static final /* synthetic */ a1 d(String str) {
        return new a1(str);
    }

    public static boolean f(String str, Object obj) {
        return (obj instanceof a1) && Intrinsics.areEqual(str, ((a1) obj).j());
    }

    public static final boolean g(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    public static int h(String str) {
        return str.hashCode();
    }

    public boolean equals(Object obj) {
        return f(this.f95542a, obj);
    }

    public int hashCode() {
        return h(this.f95542a);
    }

    public final /* synthetic */ String j() {
        return this.f95542a;
    }

    public String toString() {
        return i(this.f95542a);
    }

    private static String e(String str) {
        return str;
    }

    public static String i(String str) {
        return str;
    }
}
