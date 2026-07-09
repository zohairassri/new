package androidx.compose.ui.platform;

import android.content.ClipboardManager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f5848a = new p0();

    private p0() {
    }

    public static final void a(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }
}
