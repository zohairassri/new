package i3;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    private static final void a(Rect rect, Rect rect2) {
        rect.right += rect2.width();
        rect.top = Math.min(rect.top, rect2.top);
        rect.bottom = Math.max(rect.bottom, rect2.bottom);
    }

    private static final void b(Paint paint, CharSequence charSequence, int i11, int i12, Rect rect) {
        v.a(paint, charSequence, i11, i12, rect);
    }

    public static final Rect c(TextPaint textPaint, CharSequence charSequence, int i11, int i12) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (x.b(spanned, MetricAffectingSpan.class, i11, i12)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i11 < i12) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i11, i12, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i11, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    Iterator it = ArrayIteratorKt.iterator(metricAffectingSpanArr);
                    while (it.hasNext()) {
                        MetricAffectingSpan metricAffectingSpan = (MetricAffectingSpan) it.next();
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    b(textPaint2, charSequence, i11, iNextSpanTransition, rect2);
                    a(rect, rect2);
                    i11 = iNextSpanTransition;
                }
                return rect;
            }
        }
        return d(textPaint, charSequence, i11, i12);
    }

    public static final Rect d(Paint paint, CharSequence charSequence, int i11, int i12) {
        Rect rect = new Rect();
        b(paint, charSequence, i11, i12, rect);
        return rect;
    }
}
