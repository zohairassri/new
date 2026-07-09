package ve;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f132979a;

        public a(int i11) {
            super(null);
            this.f132979a = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f132979a == ((a) obj).f132979a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f132979a);
        }

        public String toString() {
            return "intake-code-" + this.f132979a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f132980a = new b();

        private b() {
            super(null);
        }

        public String toString() {
            return "invalid";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f132981a = new c();

        private c() {
            super(null);
        }

        public String toString() {
            return "obsolete";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f132982a = new d();

        private d() {
            super(null);
        }

        public String toString() {
            return "purged";
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a() {
        return true;
    }

    private g() {
    }
}
