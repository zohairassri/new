package dw;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Integer f90590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f90591b;

        /* JADX INFO: renamed from: dw.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C0987a extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f90592c;

            /* JADX WARN: Multi-variable type inference failed */
            public C0987a(int i11) {
                super(Integer.valueOf(i11), null, 2, 0 == true ? 1 : 0);
                this.f90592c = i11;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0987a) && this.f90592c == ((C0987a) obj).f90592c;
            }

            public int hashCode() {
                return Integer.hashCode(this.f90592c);
            }

            public String toString() {
                return "BadRequest(httpStatusCode=" + this.f90592c + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class b extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f90593c = new b();

            /* JADX WARN: Multi-variable type inference failed */
            private b() {
                super(null, "Internet Not Connected", 1, 0 == true ? 1 : 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class c extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f90594c;

            /* JADX WARN: Multi-variable type inference failed */
            public c(int i11) {
                super(Integer.valueOf(i11), null, 2, 0 == true ? 1 : 0);
                this.f90594c = i11;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f90594c == ((c) obj).f90594c;
            }

            public int hashCode() {
                return Integer.hashCode(this.f90594c);
            }

            public String toString() {
                return "ServerError(httpStatusCode=" + this.f90594c + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class d extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f90595c;

            /* JADX WARN: Multi-variable type inference failed */
            public d(String str) {
                super(null, str, 1, 0 == true ? 1 : 0);
                this.f90595c = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.areEqual(this.f90595c, ((d) obj).f90595c);
            }

            public int hashCode() {
                String str = this.f90595c;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "UnknownError(errorMessage=" + this.f90595c + ")";
            }
        }

        public /* synthetic */ a(Integer num, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str);
        }

        private a(Integer num, String str) {
            super(null);
            this.f90590a = num;
            this.f90591b = str;
        }

        public /* synthetic */ a(Integer num, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f90596a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private j() {
    }
}
