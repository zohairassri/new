package androidx.compose.ui.platform;

import android.view.MotionEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d2 f5612a = new d2();

    private d2() {
    }

    public final boolean a(@NotNull MotionEvent motionEvent, int i11) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i11)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i11)) & Integer.MAX_VALUE) < 2139095040;
    }
}
