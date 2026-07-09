package ww;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f135961b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f135962a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(int i11, String str) {
            if (i11 == -1) {
                return null;
            }
            d dVar = d.f135965c;
            if (i11 == dVar.a()) {
                return dVar;
            }
            f fVar = f.f135967c;
            if (i11 == fVar.a()) {
                return fVar;
            }
            g gVar = g.f135968c;
            if (i11 == gVar.a()) {
                return gVar;
            }
            C1905b c1905b = C1905b.f135963c;
            return i11 == c1905b.a() ? c1905b : i11 == 5 ? new e(str) : new c(str);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: ww.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1905b extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1905b f135963c = new C1905b();

        private C1905b() {
            super(4, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f135964c;

        public c(String str) {
            super(3, null);
            this.f135964c = str;
        }

        public final String b() {
            return this.f135964c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f135964c, ((c) obj).f135964c);
        }

        public int hashCode() {
            String str = this.f135964c;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "LinkToNYTFailed(errorMessage=" + this.f135964c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f135965c = new d();

        private d() {
            super(0, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class e extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f135966c;

        public e(String str) {
            super(5, null);
            this.f135966c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f135966c, ((e) obj).f135966c);
        }

        public int hashCode() {
            String str = this.f135966c;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "NetworkConnectivityIssue(errorMessage=" + this.f135966c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class f extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f135967c = new f();

        private f() {
            super(1, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class g extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f135968c = new g();

        private g() {
            super(2, null);
        }
    }

    public /* synthetic */ b(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    public final int a() {
        return this.f135962a;
    }

    private b(int i11) {
        this.f135962a = i11;
    }
}
