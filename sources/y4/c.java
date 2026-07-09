package y4;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        static boolean a(AccessibilityManager accessibilityManager) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
        void onTouchExplorationStateChanged(boolean z11);
    }

    /* JADX INFO: renamed from: y4.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class AccessibilityManagerTouchExplorationStateChangeListenerC1987c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b f139844a;

        AccessibilityManagerTouchExplorationStateChangeListenerC1987c(b bVar) {
            this.f139844a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC1987c) {
                return this.f139844a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC1987c) obj).f139844a);
            }
            return false;
        }

        public int hashCode() {
            return this.f139844a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z11) {
            this.f139844a.onTouchExplorationStateChanged(z11);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, b bVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1987c(bVar));
    }

    public static boolean b(AccessibilityManager accessibilityManager) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(accessibilityManager);
        }
        return true;
    }

    public static boolean c(AccessibilityManager accessibilityManager, b bVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1987c(bVar));
    }
}
