package cy;

import dw.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f87548a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f87549b = new a();

        private a() {
            super("deprecatedAuthMigration", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f87550b = new b();

        private b() {
            super("login", null);
        }
    }

    /* JADX INFO: renamed from: cy.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C0897c extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0897c f87551b = new C0897c();

        private C0897c() {
            super("register", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f87552b = new d();

        private d() {
            super("emailVerification", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class e extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f87553b = new e();

        private e() {
            super("oneTimeCodeLogin", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class f extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f87554b = new f();

        private f() {
            super("regiliteAccountReady", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class g extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l f87555b;

        public g(l lVar) {
            super("ssoConfirmationLogin", null);
            this.f87555b = lVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.areEqual(this.f87555b, ((g) obj).f87555b);
        }

        public int hashCode() {
            l lVar = this.f87555b;
            if (lVar == null) {
                return 0;
            }
            return lVar.hashCode();
        }

        public String toString() {
            return "SSOLogin(ssoType=" + this.f87555b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class h extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l f87556b;

        public h(l lVar) {
            super("ssoConfirmationLinked", null);
            this.f87556b = lVar;
        }

        public final l b() {
            return this.f87556b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.areEqual(this.f87556b, ((h) obj).f87556b);
        }

        public int hashCode() {
            l lVar = this.f87556b;
            if (lVar == null) {
                return 0;
            }
            return lVar.hashCode();
        }

        public String toString() {
            return "SSORegiLiteLinked(ssoType=" + this.f87556b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class i extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l f87557b;

        public i(l lVar) {
            super("ssoConfirmationRegister", null);
            this.f87557b = lVar;
        }

        public final l b() {
            return this.f87557b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.areEqual(this.f87557b, ((i) obj).f87557b);
        }

        public int hashCode() {
            l lVar = this.f87557b;
            if (lVar == null) {
                return 0;
            }
            return lVar.hashCode();
        }

        public String toString() {
            return "SSORegister(ssoType=" + this.f87557b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class j extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f87558b = new j();

        private j() {
            super("", null);
        }
    }

    public /* synthetic */ c(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f87548a;
    }

    private c(String str) {
        this.f87548a = str;
    }
}
