package mw;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f117022a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f117023b = new a();

        private a() {
            super("Already Purchased Item Error", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f117024b = new b();

        private b() {
            super("Blocked By Exiting Error", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f117025b = new c();

        private c() {
            super("Invalid Receipt Error", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f117026b = new d();

        private d() {
            super("Google Play Store Down Error", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class e extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f117027b = new e();

        private e() {
            super("Reauth Required Error", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class f extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f117028b = new f();

        private f() {
            super("Server Error", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class g extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f117029b = new g();

        private g() {
            super("Success", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class h extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f117030b = new h();

        private h() {
            super("Unknown / Unhandled Error", null);
        }
    }

    public /* synthetic */ j(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f117022a;
    }

    private j(String str) {
        this.f117022a = str;
    }
}
