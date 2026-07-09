package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f5870a = new q0();

    private q0() {
    }

    public final int a(AccessibilityManager accessibilityManager, int i11, int i12) {
        return accessibilityManager.getRecommendedTimeoutMillis(i11, i12);
    }
}
