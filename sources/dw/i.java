package dw;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Integer f90583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f90584b;

        /* JADX INFO: renamed from: dw.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C0986a extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f90585c;

            /* JADX WARN: Multi-variable type inference failed */
            public C0986a(int i11) {
                super(Integer.valueOf(i11), null, 2, 0 == true ? 1 : 0);
                this.f90585c = i11;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0986a) && this.f90585c == ((C0986a) obj).f90585c;
            }

            public int hashCode() {
                return Integer.hashCode(this.f90585c);
            }

            public String toString() {
                return "BadRequest(httpStatusCode=" + this.f90585c + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class b extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f90586c = new b();

            /* JADX WARN: Multi-variable type inference failed */
            private b() {
                super(null, "Internet Not Connected", 1, 0 == true ? 1 : 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class c extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f90587c;

            /* JADX WARN: Multi-variable type inference failed */
            public c(int i11) {
                super(Integer.valueOf(i11), null, 2, 0 == true ? 1 : 0);
                this.f90587c = i11;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f90587c == ((c) obj).f90587c;
            }

            public int hashCode() {
                return Integer.hashCode(this.f90587c);
            }

            public String toString() {
                return "ServerError(httpStatusCode=" + this.f90587c + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class d extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f90588c;

            /* JADX WARN: Multi-variable type inference failed */
            public d(String str) {
                super(null, str, 1, 0 == true ? 1 : 0);
                this.f90588c = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.areEqual(this.f90588c, ((d) obj).f90588c);
            }

            public int hashCode() {
                String str = this.f90588c;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "UnknownError(errorMessage=" + this.f90588c + ")";
            }
        }

        public /* synthetic */ a(Integer num, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str);
        }

        public final String a() {
            return this.f90584b;
        }

        private a(Integer num, String str) {
            super(null);
            this.f90583a = num;
            this.f90584b = str;
        }

        public /* synthetic */ a(Integer num, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f90589a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private i() {
    }
}
