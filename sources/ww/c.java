package ww;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a extends c {

        /* JADX INFO: renamed from: ww.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C1906a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f135969a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1906a(String errorMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.f135969a = errorMessage;
            }

            public final String a() {
                return this.f135969a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1906a) && Intrinsics.areEqual(this.f135969a, ((C1906a) obj).f135969a);
            }

            public int hashCode() {
                return this.f135969a.hashCode();
            }

            public String toString() {
                return "ConnectionFailed(errorMessage=" + this.f135969a + ")";
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
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f135970a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set result) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.f135970a = result;
        }

        public final Set a() {
            return this.f135970a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f135970a, ((b) obj).f135970a);
        }

        public int hashCode() {
            return this.f135970a.hashCode();
        }

        public String toString() {
            return "Success(result=" + this.f135970a + ")";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
