package zn;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import ho.b;
import o4.e;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static int a(int i11, int i12) {
        return e.l(i11, (Color.alpha(i11) * i12) / 255);
    }

    public static int b(Context context, int i11, int i12) {
        Integer numF = f(context, i11);
        return numF != null ? numF.intValue() : i12;
    }

    public static int c(Context context, int i11, String str) {
        return l(context, b.e(context, i11, str));
    }

    public static int d(View view, int i11) {
        return l(view.getContext(), b.f(view, i11));
    }

    public static int e(View view, int i11, int i12) {
        return b(view.getContext(), i11, i12);
    }

    public static Integer f(Context context, int i11) {
        TypedValue typedValueA = b.a(context, i11);
        if (typedValueA != null) {
            return Integer.valueOf(l(context, typedValueA));
        }
        return null;
    }

    public static ColorStateList g(Context context, int i11) {
        TypedValue typedValueA = b.a(context, i11);
        if (typedValueA == null) {
            return null;
        }
        int i12 = typedValueA.resourceId;
        if (i12 != 0) {
            return l4.a.d(context, i12);
        }
        int i13 = typedValueA.data;
        if (i13 != 0) {
            return ColorStateList.valueOf(i13);
        }
        return null;
    }

    public static boolean h(int i11) {
        return i11 != 0 && e.e(i11) > 0.5d;
    }

    public static int i(int i11, int i12) {
        return e.h(i12, i11);
    }

    public static int j(int i11, int i12, float f11) {
        return i(i11, e.l(i12, Math.round(Color.alpha(i12) * f11)));
    }

    public static int k(View view, int i11, int i12, float f11) {
        return j(d(view, i11), d(view, i12), f11);
    }

    private static int l(Context context, TypedValue typedValue) {
        int i11 = typedValue.resourceId;
        return i11 != 0 ? l4.a.c(context, i11) : typedValue.data;
    }
}
