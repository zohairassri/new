package x4;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f137094a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ScrollFeedbackProvider f137095a;

        b(View view) {
            this.f137095a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // x4.i0.d
        public void onScrollLimit(int i11, int i12, int i13, boolean z11) {
            this.f137095a.onScrollLimit(i11, i12, i13, z11);
        }

        @Override // x4.i0.d
        public void onScrollProgress(int i11, int i12, int i13, int i14) {
            this.f137095a.onScrollProgress(i11, i12, i13, i14);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private interface d {
        void onScrollLimit(int i11, int i12, int i13, boolean z11);

        void onScrollProgress(int i11, int i12, int i13, int i14);
    }

    private i0(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f137094a = new b(view);
        } else {
            this.f137094a = new c();
        }
    }

    public static i0 a(View view) {
        return new i0(view);
    }

    public void b(int i11, int i12, int i13, boolean z11) {
        this.f137094a.onScrollLimit(i11, i12, i13, z11);
    }

    public void c(int i11, int i12, int i13, int i14) {
        this.f137094a.onScrollProgress(i11, i12, i13, i14);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class c implements d {
        private c() {
        }

        @Override // x4.i0.d
        public void onScrollLimit(int i11, int i12, int i13, boolean z11) {
        }

        @Override // x4.i0.d
        public void onScrollProgress(int i11, int i12, int i13, int i14) {
        }
    }
}
