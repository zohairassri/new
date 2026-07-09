package dw;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Integer f90525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f90526b;

        /* JADX INFO: renamed from: dw.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C0984a extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0984a f90527c = new C0984a();

            /* JADX WARN: Multi-variable type inference failed */
            private C0984a() {
                super(null, "Anonymous User", 0 == true ? 1 : 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class b extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f90528c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f90529d;

            public b(int i11, String str) {
                super(Integer.valueOf(i11), str, null);
                this.f90528c = i11;
                this.f90529d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f90528c == bVar.f90528c && Intrinsics.areEqual(this.f90529d, bVar.f90529d);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.f90528c) * 31;
                String str = this.f90529d;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Existing1PSubscription(httpStatusCode=" + this.f90528c + ", errorMessage=" + this.f90529d + ")";
            }
        }

        /* JADX INFO: renamed from: dw.c$a$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C0985c extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0985c f90530c = new C0985c();

            /* JADX WARN: Multi-variable type inference failed */
            private C0985c() {
                super(null, "Existing 3P (Google Play) Subscription", 0 == true ? 1 : 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class d extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f90531c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f90532d;

            public d(int i11, String str) {
                super(Integer.valueOf(i11), str, null);
                this.f90531c = i11;
                this.f90532d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f90531c == dVar.f90531c && Intrinsics.areEqual(this.f90532d, dVar.f90532d);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.f90531c) * 31;
                String str = this.f90532d;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "InvalidOrMissingCookie(httpStatusCode=" + this.f90531c + ", errorMessage=" + this.f90532d + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class e extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final e f90533c = new e();

            /* JADX WARN: Multi-variable type inference failed */
            private e() {
                super(null, "Internet Not Connected", 1, 0 == true ? 1 : 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class f extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f90534c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f90535d;

            public f(int i11, String str) {
                super(Integer.valueOf(i11), str, null);
                this.f90534c = i11;
                this.f90535d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f90534c == fVar.f90534c && Intrinsics.areEqual(this.f90535d, fVar.f90535d);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.f90534c) * 31;
                String str = this.f90535d;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "ServerError(httpStatusCode=" + this.f90534c + ", errorMessage=" + this.f90535d + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class g extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f90536c;

            /* JADX WARN: Multi-variable type inference failed */
            public g(String str) {
                super(null, str, 1, 0 == true ? 1 : 0);
                this.f90536c = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && Intrinsics.areEqual(this.f90536c, ((g) obj).f90536c);
            }

            public int hashCode() {
                String str = this.f90536c;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "UnknownError(errorMessage=" + this.f90536c + ")";
            }
        }

        public /* synthetic */ a(Integer num, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str);
        }

        public /* synthetic */ a(Integer num, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, null);
        }

        private a(Integer num, String str) {
            super(null);
            this.f90525a = num;
            this.f90526b = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f90537a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
