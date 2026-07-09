package cy;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f87559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f87560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f87561c;

        /* JADX INFO: renamed from: cy.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C0898a extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final C0898a f87562d = new C0898a();

            private C0898a() {
                super("error", "active subscription", null, 4, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class b extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final b f87563d = new b();

            private b() {
                super("are you sure", "are you sure", null, 4, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class c extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final c f87564d = new c();

            private c() {
                super("delete account", "delete account", null, 4, null);
            }
        }

        /* JADX INFO: renamed from: cy.d$a$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C0899d extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final C0899d f87565d = new C0899d();

            private C0899d() {
                super("success", "deleting your account", null, 4, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class e extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final e f87566d = new e();

            private e() {
                super("error", "system error", null, 4, null);
            }
        }

        public /* synthetic */ a(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3);
        }

        public final String a() {
            return this.f87560b;
        }

        public final String b() {
            return this.f87559a;
        }

        public final String c() {
            return this.f87561c;
        }

        public /* synthetic */ a(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? "delete account" : str3, null);
        }

        private a(String str, String str2, String str3) {
            super(null);
            this.f87559a = str;
            this.f87560b = str2;
            this.f87561c = str3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f87567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f87568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f87569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f87570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f87571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f87572f;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a extends b {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final a f87573g = new a();

            private a() {
                super("are you sure", "nevermind", "Cancel", null, null, null, 56, null);
            }
        }

        /* JADX INFO: renamed from: cy.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C0900b extends b {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final C0900b f87574g = new C0900b();

            private C0900b() {
                super("are you sure", "delete account", "Delete Account", null, null, null, 56, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class c extends b {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final c f87575g = new c();

            private c() {
                super("delete account", "delete account", "Delete Account", null, null, null, 56, null);
            }
        }

        /* JADX INFO: renamed from: cy.d$b$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C0901d extends b {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final C0901d f87576g = new C0901d();

            private C0901d() {
                super("error", "active subscription", "OK", null, null, null, 56, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class e extends b {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final e f87577g = new e();

            private e() {
                super("success", "deleting your account", "OK", null, null, null, 56, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class f extends b {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final f f87578g = new f();

            private f() {
                super("error", "system error", "OK", null, null, null, 56, null);
            }
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6);
        }

        public final String a() {
            return this.f87571e;
        }

        public final String b() {
            return this.f87569c;
        }

        public final String c() {
            return this.f87572f;
        }

        public final String d() {
            return this.f87568b;
        }

        public final String e() {
            return this.f87567a;
        }

        public final String f() {
            return this.f87570d;
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i11 & 8) != 0 ? "delete account" : str4, (i11 & 16) != 0 ? "tap" : str5, (i11 & 32) != 0 ? "button" : str6, null);
        }

        private b(String str, String str2, String str3, String str4, String str5, String str6) {
            super(null);
            this.f87567a = str;
            this.f87568b = str2;
            this.f87569c = str3;
            this.f87570d = str4;
            this.f87571e = str5;
            this.f87572f = str6;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f87579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f87580b;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a extends c {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f87581c = new a();

            /* JADX WARN: Multi-variable type inference failed */
            private a() {
                super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
        }

        public /* synthetic */ c(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public final String a() {
            return this.f87579a;
        }

        public final String b() {
            return this.f87580b;
        }

        public /* synthetic */ c(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "privacy settings" : str, (i11 & 2) != 0 ? "delete account" : str2, null);
        }

        private c(String str, String str2) {
            super(null);
            this.f87579a = str;
            this.f87580b = str2;
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private d() {
    }
}
