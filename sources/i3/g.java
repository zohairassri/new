package i3;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f103137a = new g();

    private g() {
    }

    public final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i11, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z11, boolean z12, TextUtils.TruncateAt truncateAt, int i12) {
        if (!(i11 >= 0)) {
            n3.a.a("negative width");
        }
        if (!(i12 >= 0)) {
            n3.a.a("negative ellipsized width");
        }
        return Build.VERSION.SDK_INT >= 33 ? f.a(charSequence, textPaint, i11, alignment, 1.0f, 0.0f, metrics, z11, z12, truncateAt, i12) : h.a(charSequence, textPaint, i11, alignment, 1.0f, 0.0f, metrics, z11, truncateAt, i12);
    }

    public final boolean b(BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return f.c(boringLayout);
        }
        return false;
    }

    public final BoringLayout.Metrics c(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return Build.VERSION.SDK_INT >= 33 ? f.b(charSequence, textPaint, textDirectionHeuristic) : h.b(charSequence, textPaint, textDirectionHeuristic);
    }
}
