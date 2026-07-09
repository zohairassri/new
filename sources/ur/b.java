package ur;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* JADX INFO: renamed from: ur.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1811b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f131592a;

        public C1811b(String sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            this.f131592a = sessionId;
        }

        public final String a() {
            return this.f131592a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1811b) && Intrinsics.areEqual(this.f131592a, ((C1811b) obj).f131592a);
        }

        public int hashCode() {
            return this.f131592a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f131592a + ')';
        }
    }

    void a(C1811b c1811b);

    boolean b();

    a c();
}
