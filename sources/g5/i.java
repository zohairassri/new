package g5;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static void a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void b(View view, View.OnClickListener onClickListener, boolean z11) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z11);
    }
}
