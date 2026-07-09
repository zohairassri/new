package gf;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f98605a = a.f98606a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f98606a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c f98607b = new C1143a();

        /* JADX INFO: renamed from: gf.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C1143a implements c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f98608b = Build.VERSION.SDK_INT;

            C1143a() {
            }

            @Override // gf.c
            public int getVersion() {
                return this.f98608b;
            }
        }

        private a() {
        }

        public final c a() {
            return f98607b;
        }
    }

    int getVersion();
}
