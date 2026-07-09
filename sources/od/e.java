package od;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class e extends c {
    private e(Drawable drawable) {
        super(drawable);
    }

    static gd.c e(Drawable drawable) {
        if (drawable != null) {
            return new e(drawable);
        }
        return null;
    }

    @Override // gd.c
    public int a() {
        return Math.max(1, this.f120317a.getIntrinsicWidth() * this.f120317a.getIntrinsicHeight() * 4);
    }

    @Override // gd.c
    public Class c() {
        return this.f120317a.getClass();
    }

    @Override // gd.c
    public void b() {
    }
}
