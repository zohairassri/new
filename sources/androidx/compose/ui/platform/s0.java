package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f5876a = new s0();

    private s0() {
    }

    public static final void a(@NotNull View view, float f11) {
        view.setRequestedFrameRate(f11);
    }
}
