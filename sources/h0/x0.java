package h0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f99514a = a.f99515a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f99515a = new a();

        private a() {
        }

        public final x0 a(int i11) {
            if (!(i11 >= 0)) {
                c0.e.a("pages should be greater than or equal to 0. You have used " + i11 + '.');
            }
            return new y0(i11);
        }
    }

    int a(int i11, int i12, float f11, int i13, int i14);
}
