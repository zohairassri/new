package ax;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0214a f13689a = new C0214a(null);

    /* JADX INFO: renamed from: ax.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C0214a {
        public /* synthetic */ C0214a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0214a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f13690b = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f13691b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String errorMessage) {
            super(null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.f13691b = errorMessage;
        }

        public final String a() {
            return this.f13691b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f13691b, ((c) obj).f13691b);
        }

        public int hashCode() {
            return this.f13691b.hashCode();
        }

        public String toString() {
            return "Disconnected(errorMessage=" + this.f13691b + ")";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
