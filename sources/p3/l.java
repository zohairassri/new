package p3;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final void a(TextPaint textPaint, float f11) {
        if (Float.isNaN(f11)) {
            return;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f11 * 255));
    }
}
