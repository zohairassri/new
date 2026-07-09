package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f5611a = new d0();

    private d0() {
    }

    public final void a(@NotNull View view, int i11, boolean z11) {
        view.setFocusable(i11);
        view.setDefaultFocusHighlightEnabled(z11);
    }
}
