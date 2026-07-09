package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f2351a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f2352b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f2353c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[] f2354d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f2355e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f2356f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f2357g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f2358h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int[] f2359i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f2360j = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(h.j.AppCompatTheme);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(h.j.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i11) {
        ColorStateList colorStateListE = e(context, i11);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(f2352b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF, true);
        return d(context, i11, typedValueF.getFloat());
    }

    public static int c(Context context, int i11) {
        int[] iArr = f2360j;
        iArr[0] = i11;
        g0 g0VarU = g0.u(context, null, iArr);
        try {
            return g0VarU.b(0, 0);
        } finally {
            g0VarU.x();
        }
    }

    static int d(Context context, int i11, float f11) {
        return o4.e.l(c(context, i11), Math.round(Color.alpha(r0) * f11));
    }

    public static ColorStateList e(Context context, int i11) {
        int[] iArr = f2360j;
        iArr[0] = i11;
        g0 g0VarU = g0.u(context, null, iArr);
        try {
            return g0VarU.c(0);
        } finally {
            g0VarU.x();
        }
    }

    private static TypedValue f() {
        ThreadLocal threadLocal = f2351a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
