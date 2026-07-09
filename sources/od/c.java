package od;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import zd.k;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class c implements gd.c, gd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Drawable f120317a;

    public c(Drawable drawable) {
        this.f120317a = (Drawable) k.d(drawable);
    }

    @Override // gd.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f120317a.getConstantState();
        return constantState == null ? this.f120317a : constantState.newDrawable();
    }

    @Override // gd.b
    public void initialize() {
        Drawable drawable = this.f120317a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof qd.c) {
            ((qd.c) drawable).e().prepareToDraw();
        }
    }
}
