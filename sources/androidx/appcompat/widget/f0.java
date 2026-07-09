package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class f0 extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f2387b;

    public f0(Context context, Resources resources) {
        super(resources);
        this.f2387b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i11) {
        Drawable drawableA = a(i11);
        Context context = (Context) this.f2387b.get();
        if (drawableA != null && context != null) {
            y.g().w(context, i11, drawableA);
        }
        return drawableA;
    }
}
