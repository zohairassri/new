package ho;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static TypedValue a(Context context, int i11) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i11, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i11, boolean z11) {
        TypedValue typedValueA = a(context, i11);
        return (typedValueA == null || typedValueA.type != 18) ? z11 : typedValueA.data != 0;
    }

    public static int c(Context context, int i11, int i12) {
        TypedValue typedValueA = a(context, i11);
        return (typedValueA == null || typedValueA.type != 16) ? i12 : typedValueA.data;
    }

    public static int d(Context context, int i11, String str) {
        return e(context, i11, str).data;
    }

    public static TypedValue e(Context context, int i11, String str) {
        TypedValue typedValueA = a(context, i11);
        if (typedValueA != null) {
            return typedValueA;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i11)));
    }

    public static TypedValue f(View view, int i11) {
        return e(view.getContext(), i11, view.getClass().getCanonicalName());
    }
}
