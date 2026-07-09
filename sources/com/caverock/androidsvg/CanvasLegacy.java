package com.caverock.androidsvg;

import android.graphics.Canvas;
import com.chartbeat.androidsdk.QueryKeys;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class CanvasLegacy {
    static final int MATRIX_SAVE_FLAG;
    private static final Method SAVE;

    static {
        try {
            MATRIX_SAVE_FLAG = ((Integer) Canvas.class.getField("MATRIX_SAVE_FLAG").get(null)).intValue();
            SAVE = Canvas.class.getMethod("save", Integer.TYPE);
        } catch (Throwable th2) {
            throw sneakyThrow(th2);
        }
    }

    CanvasLegacy() {
    }

    static void save(Canvas canvas, int i11) {
        try {
            SAVE.invoke(canvas, Integer.valueOf(i11));
        } catch (Throwable th2) {
            throw sneakyThrow(th2);
        }
    }

    private static RuntimeException sneakyThrow(Throwable th2) {
        if (th2 != null) {
            return (RuntimeException) sneakyThrow0(th2);
        }
        throw new NullPointerException(QueryKeys.TOKEN);
    }

    private static <T extends Throwable> T sneakyThrow0(Throwable th2) throws Throwable {
        throw th2;
    }
}
