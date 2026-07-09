package y4;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        static void a(AccessibilityEvent accessibilityEvent, boolean z11) {
            accessibilityEvent.setAccessibilityDataSensitive(z11);
        }
    }

    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, boolean z11) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.a(accessibilityEvent, z11);
        }
    }

    public static void c(AccessibilityEvent accessibilityEvent, int i11) {
        accessibilityEvent.setContentChangeTypes(i11);
    }
}
