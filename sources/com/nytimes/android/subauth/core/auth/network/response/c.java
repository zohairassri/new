package com.nytimes.android.subauth.core.auth.network.response;

import com.comscore.streaming.ContentDeliveryMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f48475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Integer f48476c;

        /* JADX INFO: renamed from: com.nytimes.android.subauth.core.auth.network.response.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C0364a extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f48477d;

            public C0364a(String str) {
                super("Bad Request", str, 400, null);
                this.f48477d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0364a) && Intrinsics.areEqual(this.f48477d, ((C0364a) obj).f48477d);
            }

            public int hashCode() {
                String str = this.f48477d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "BadRequest(message=" + this.f48477d + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class b extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f48478d;

            public b(String str) {
                super("Internal Server Error", str, 500, null);
                this.f48478d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f48478d, ((b) obj).f48478d);
            }

            public int hashCode() {
                String str = this.f48478d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "InternalServerError(message=" + this.f48478d + ")";
            }
        }

        /* JADX INFO: renamed from: com.nytimes.android.subauth.core.auth.network.response.c$a$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C0365c extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f48479d;

            public C0365c(String str) {
                super("Missing Cookie", str, 200, null);
                this.f48479d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0365c) && Intrinsics.areEqual(this.f48479d, ((C0365c) obj).f48479d);
            }

            public int hashCode() {
                String str = this.f48479d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "MissingCookie(message=" + this.f48479d + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class d extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f48480d;

            public d(String str) {
                super("Network Connectivity Error", str, null, 4, null);
                this.f48480d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.areEqual(this.f48480d, ((d) obj).f48480d);
            }

            public int hashCode() {
                String str = this.f48480d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "NetworkConnectivityError(message=" + this.f48480d + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class e extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final e f48481d = new e();

            /* JADX WARN: Illegal instructions before constructor call */
            private e() {
                String str = "Service Unavailable";
                super(str, str, Integer.valueOf(ContentDeliveryMode.DVR), null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class f extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f48482d;

            public f(String str) {
                super("Unknown Error", str, null, 4, null);
                this.f48482d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && Intrinsics.areEqual(this.f48482d, ((f) obj).f48482d);
            }

            public int hashCode() {
                String str = this.f48482d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "UnknownError(message=" + this.f48482d + ")";
            }
        }

        public /* synthetic */ a(String str, String str2, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, num);
        }

        public final Integer a() {
            return this.f48476c;
        }

        public final String b() {
            return this.f48475b;
        }

        public final String c() {
            return this.f48474a;
        }

        public /* synthetic */ a(String str, String str2, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : num, null);
        }

        private a(String str, String str2, Integer num) {
            super(null);
            this.f48474a = str;
            this.f48475b = str2;
            this.f48476c = num;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48483a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String refreshedToken) {
            super(null);
            Intrinsics.checkNotNullParameter(refreshedToken, "refreshedToken");
            this.f48483a = refreshedToken;
        }

        public final String a() {
            return this.f48483a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f48483a, ((b) obj).f48483a);
        }

        public int hashCode() {
            return this.f48483a.hashCode();
        }

        public String toString() {
            return "Success(refreshedToken=" + this.f48483a + ")";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
