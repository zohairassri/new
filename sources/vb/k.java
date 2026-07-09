package vb;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface k {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f132764a;

        private /* synthetic */ a(int i11) {
            this.f132764a = i11;
        }

        public static final /* synthetic */ a a(int i11) {
            return new a(i11);
        }

        public static boolean c(int i11, Object obj) {
            return (obj instanceof a) && i11 == ((a) obj).f();
        }

        public static int d(int i11) {
            return Integer.hashCode(i11);
        }

        public static String e(int i11) {
            return "RawRes(resId=" + i11 + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f132764a, obj);
        }

        public final /* synthetic */ int f() {
            return this.f132764a;
        }

        public int hashCode() {
            return d(this.f132764a);
        }

        public String toString() {
            return e(this.f132764a);
        }

        public static int b(int i11) {
            return i11;
        }
    }
}
