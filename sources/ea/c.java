package ea;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface c extends ea.a {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0996a f91537b = new C0996a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f91538c = new a("NONE");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f91539d = new a("FULL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f91540a;

        /* JADX INFO: renamed from: ea.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C0996a {
            public /* synthetic */ C0996a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0996a() {
            }
        }

        private a(String str) {
            this.f91540a = str;
        }

        public String toString() {
            return this.f91540a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f91541b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f91542c = new b("VERTICAL");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f91543d = new b("HORIZONTAL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f91544a;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        private b(String str) {
            this.f91544a = str;
        }

        public String toString() {
            return this.f91544a;
        }
    }

    /* JADX INFO: renamed from: ea.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C0997c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f91545b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0997c f91546c = new C0997c("FLAT");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0997c f91547d = new C0997c("HALF_OPENED");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f91548a;

        /* JADX INFO: renamed from: ea.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        private C0997c(String str) {
            this.f91548a = str;
        }

        public String toString() {
            return this.f91548a;
        }
    }

    b a();

    boolean b();

    a c();

    C0997c getState();
}
