package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.widget.TextView;
import v4.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        static void a(TextView textView, int i11) {
            textView.setBreakStrategy(i11);
        }

        static void b(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void c(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        static void d(TextView textView, int i11) {
            textView.setHyphenationFrequency(i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {
        static PrecomputedText.Params a(TextView textView) {
            return textView.getTextMetricsParams();
        }

        static void b(TextView textView, int i11) {
            textView.setFirstBaselineToTopHeight(i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class c {
        public static void a(TextView textView, int i11, float f11) {
            textView.setLineHeight(i11, f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class d implements ActionMode.Callback {
        abstract ActionMode.Callback a();
    }

    public static Drawable[] a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int d(TextView textView) {
        return textView.getMaxLines();
    }

    private static int e(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    public static c.a f(TextView textView) {
        return new c.a(b.a(textView));
    }

    public static void g(TextView textView, ColorStateList colorStateList) {
        w4.i.g(textView);
        a.b(textView, colorStateList);
    }

    public static void h(TextView textView, PorterDuff.Mode mode) {
        w4.i.g(textView);
        a.c(textView, mode);
    }

    public static void i(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void j(TextView textView, int i11) {
        w4.i.d(i11);
        b.b(textView, i11);
    }

    public static void k(TextView textView, int i11) {
        w4.i.d(i11);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i12 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i11 > Math.abs(i12)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i11 - i12);
        }
    }

    public static void l(TextView textView, int i11) {
        w4.i.d(i11);
        if (i11 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i11 - r0, 1.0f);
        }
    }

    public static void m(TextView textView, int i11, float f11) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.a(textView, i11, f11);
        } else {
            l(textView, Math.round(TypedValue.applyDimension(i11, f11, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void n(TextView textView, v4.c cVar) {
        throw null;
    }

    public static void o(TextView textView, int i11) {
        textView.setTextAppearance(i11);
    }

    public static void p(TextView textView, c.a aVar) {
        textView.setTextDirection(e(aVar.d()));
        textView.getPaint().set(aVar.e());
        a.a(textView, aVar.b());
        a.d(textView, aVar.c());
    }

    public static ActionMode.Callback q(ActionMode.Callback callback) {
        return callback instanceof d ? ((d) callback).a() : callback;
    }

    public static ActionMode.Callback r(TextView textView, ActionMode.Callback callback) {
        return callback;
    }
}
