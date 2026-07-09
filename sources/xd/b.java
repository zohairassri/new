package xd;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import xd.d;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f137477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f137478b;

    public b(int i11, boolean z11) {
        this.f137477a = i11;
        this.f137478b = z11;
    }

    @Override // xd.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(Drawable drawable, d.a aVar) {
        Drawable drawableG = aVar.g();
        if (drawableG == null) {
            drawableG = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawableG, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f137478b);
        transitionDrawable.startTransition(this.f137477a);
        aVar.e(transitionDrawable);
        return true;
    }
}
