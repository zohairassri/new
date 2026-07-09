package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f133852a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f133853b = b(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f133854c = b(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f133855d = b(0);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return v.f133855d;
        }

        private a() {
        }
    }

    public static final boolean c(int i11, int i12) {
        return i11 == i12;
    }

    public static int d(int i11) {
        return Integer.hashCode(i11);
    }

    public static String e(int i11) {
        return "ArcMode(value=" + i11 + ')';
    }

    public static int b(int i11) {
        return i11;
    }
}
