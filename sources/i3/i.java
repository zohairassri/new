package i3;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f103163a = new i();

    private i() {
    }

    public final void a(Canvas canvas, CharSequence charSequence, int i11, int i12, int i13, int i14, float f11, float f12, boolean z11, Paint paint) {
        canvas.drawTextRun(charSequence, i11, i12, i13, i14, f11, f12, z11, paint);
    }

    public final void b(Canvas canvas, char[] cArr, int i11, int i12, int i13, int i14, float f11, float f12, boolean z11, Paint paint) {
        canvas.drawTextRun(cArr, i11, i12, i13, i14, f11, f12, z11, paint);
    }
}
