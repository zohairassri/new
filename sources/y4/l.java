package y4;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static void a(AccessibilityRecord accessibilityRecord, int i11) {
        accessibilityRecord.setMaxScrollX(i11);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i11) {
        accessibilityRecord.setMaxScrollY(i11);
    }

    public static void c(AccessibilityRecord accessibilityRecord, View view, int i11) {
        accessibilityRecord.setSource(view, i11);
    }
}
