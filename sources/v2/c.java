package v2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        boolean a();
    }

    Object n0(int i11, Function1 function1);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f132347a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f132348b = g(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f132349c = g(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f132350d = g(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f132351e = g(4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f132352f = g(5);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f132353g = g(6);

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.f132352f;
            }

            public final int b() {
                return b.f132349c;
            }

            public final int c() {
                return b.f132348b;
            }

            public final int d() {
                return b.f132353g;
            }

            public final int e() {
                return b.f132350d;
            }

            public final int f() {
                return b.f132351e;
            }

            private a() {
            }
        }

        public static final boolean h(int i11, int i12) {
            return i11 == i12;
        }

        public static int g(int i11) {
            return i11;
        }
    }
}
