package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u2 f5892a = new u2();

    private u2() {
    }

    public final ActionMode a(View view, ActionMode.Callback callback, int i11) {
        return view.startActionMode(callback, i11);
    }
}
