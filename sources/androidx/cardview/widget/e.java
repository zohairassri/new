package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
abstract class e extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f2643a = Math.cos(Math.toRadians(45.0d));

    static float a(float f11, float f12, boolean z11) {
        return z11 ? (float) (((double) f11) + ((1.0d - f2643a) * ((double) f12))) : f11;
    }

    static float b(float f11, float f12, boolean z11) {
        return z11 ? (float) (((double) (f11 * 1.5f)) + ((1.0d - f2643a) * ((double) f12))) : f11 * 1.5f;
    }
}
