package androidx.compose.ui.window;

import android.view.WindowManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f6251a = new f();

    private f() {
    }

    public final void a(@NotNull WindowManager.LayoutParams layoutParams, int i11) {
        layoutParams.setFitInsetsSides(i11);
    }

    public final void b(@NotNull WindowManager.LayoutParams layoutParams, int i11) {
        layoutParams.setFitInsetsTypes(i11);
    }
}
