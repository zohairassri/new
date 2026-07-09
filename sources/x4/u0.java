package x4;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.util.Objects;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {
        static boolean a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class c {
        static int a(ViewConfiguration viewConfiguration, int i11, int i12, int i13) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i11, i12, i13);
        }

        static int b(ViewConfiguration viewConfiguration, int i11, int i12, int i13) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i11, i12, i13);
        }
    }

    private static int a(Resources resources, int i11, w4.j jVar, int i12) {
        int dimensionPixelSize;
        return i11 != -1 ? (i11 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i11)) < 0) ? i12 : dimensionPixelSize : ((Integer) jVar.get()).intValue();
    }

    private static int b(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    private static int c(Resources resources, int i11, int i12) {
        if (i11 == 4194304 && i12 == 26) {
            return b(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int d(Resources resources, int i11, int i12) {
        if (i11 == 4194304 && i12 == 26) {
            return b(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float e(ViewConfiguration viewConfiguration, Context context) {
        return a.a(viewConfiguration);
    }

    public static int f(Context context, final ViewConfiguration viewConfiguration, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i11, i12, i13);
        }
        if (!i(i11, i12, i13)) {
            return IntCompanionObject.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int iC = c(resources, i13, i12);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, iC, new w4.j() { // from class: x4.s0
            @Override // w4.j
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, IntCompanionObject.MIN_VALUE);
    }

    public static int g(Context context, final ViewConfiguration viewConfiguration, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i11, i12, i13);
        }
        if (!i(i11, i12, i13)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int iD = d(resources, i13, i12);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, iD, new w4.j() { // from class: x4.t0
            @Override // w4.j
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    public static float h(ViewConfiguration viewConfiguration, Context context) {
        return a.b(viewConfiguration);
    }

    private static boolean i(int i11, int i12, int i13) {
        InputDevice device = InputDevice.getDevice(i11);
        return (device == null || device.getMotionRange(i12, i13) == null) ? false : true;
    }

    public static boolean j(ViewConfiguration viewConfiguration, Context context) {
        return b.a(viewConfiguration);
    }
}
