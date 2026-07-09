package cc0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17489a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a extends g {

        /* JADX INFO: renamed from: cc0.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C0271a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0271a f17490b = new C0271a();

            private C0271a() {
                super("anr-watchdog", null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class b extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f17491b = new b();

            private b() {
                super("http-request", null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f17492b = new c();

            private c() {
                super("non-io-reg", null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class d extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f17493b = new d();

            private d() {
                super("log-message", null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class e extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f17494b = new e();

            private e() {
                super("non-io-reg", null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class f extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f17495b = new f();

            private f() {
                super("periodic-cache", null);
            }
        }

        public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private a(String str) {
            super(str, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class b extends g {

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f17496b = new a();

            private a() {
                super("data-persistence", null);
            }
        }

        /* JADX INFO: renamed from: cc0.g$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C0272b extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0272b f17497b = new C0272b();

            private C0272b() {
                super("delivery-cache", null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class c extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f17498b = new c();

            private c() {
                super("network-request", null);
            }
        }

        public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private b(String str) {
            super(str, null);
        }
    }

    public /* synthetic */ g(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f17489a;
    }

    private g(String str) {
        this.f17489a = str;
    }
}
