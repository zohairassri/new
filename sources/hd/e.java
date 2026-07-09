package hd;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class e implements d {
    @Override // hd.d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // hd.d
    public Bitmap d(int i11, int i12, Bitmap.Config config) {
        return Bitmap.createBitmap(i11, i12, config);
    }

    @Override // hd.d
    public Bitmap e(int i11, int i12, Bitmap.Config config) {
        return d(i11, i12, config);
    }

    @Override // hd.d
    public void b() {
    }

    @Override // hd.d
    public void a(int i11) {
    }
}
