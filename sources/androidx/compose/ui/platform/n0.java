package androidx.compose.ui.platform;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f5817a = new n0();

    private n0() {
    }

    public final float a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public final float b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }
}
