package xw;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ww.e;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a extends e {

        /* JADX INFO: renamed from: xw.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C1950a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f138117a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1950a(String errorMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.f138117a = errorMessage;
            }

            public final e.a.C1907a a() {
                return new e.a.C1907a(this.f138117a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1950a) && Intrinsics.areEqual(this.f138117a, ((C1950a) obj).f138117a);
            }

            public int hashCode() {
                return this.f138117a.hashCode();
            }

            public String toString() {
                return "ConnectionFailed(errorMessage=" + this.f138117a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f138118a = new b();

            private b() {
                super(null);
            }

            public final e.a.d a() {
                return e.a.d.f135988a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f138119a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set productDetails) {
            super(null);
            Intrinsics.checkNotNullParameter(productDetails, "productDetails");
            this.f138119a = productDetails;
        }

        public final Set a() {
            return this.f138119a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f138119a, ((b) obj).f138119a);
        }

        public int hashCode() {
            return this.f138119a.hashCode();
        }

        public String toString() {
            return "Success(productDetails=" + this.f138119a + ")";
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e() {
    }
}
