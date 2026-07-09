package r2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f123523a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f123524b = f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f123525c = f(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f123526d = f(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f123527e = f(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f123528f = f(4);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return k0.f123528f;
        }

        public final int b() {
            return k0.f123526d;
        }

        public final int c() {
            return k0.f123527e;
        }

        public final int d() {
            return k0.f123525c;
        }

        public final int e() {
            return k0.f123524b;
        }

        private a() {
        }
    }

    public static final boolean g(int i11, int i12) {
        return i11 == i12;
    }

    public static int h(int i11) {
        return Integer.hashCode(i11);
    }

    public static String i(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    private static int f(int i11) {
        return i11;
    }
}
