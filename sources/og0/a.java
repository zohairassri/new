package og0;

import android.graphics.RectF;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class a extends LinkMovementMethod {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f120352h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f120353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f120354b = new RectF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f120355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ClickableSpan f120356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f120357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f120358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f120359g;

    /* JADX INFO: renamed from: og0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    protected static class C1581a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ClickableSpan f120360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f120361b;

        protected C1581a(ClickableSpan clickableSpan, String str) {
            this.f120360a = clickableSpan;
            this.f120361b = str;
        }

        protected static C1581a a(TextView textView, ClickableSpan clickableSpan) {
            Spanned spanned = (Spanned) textView.getText();
            return new C1581a(clickableSpan, clickableSpan instanceof URLSpan ? ((URLSpan) clickableSpan).getURL() : spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan)).toString());
        }

        protected ClickableSpan b() {
            return this.f120360a;
        }

        protected String c() {
            return this.f120361b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    protected static final class b implements Runnable {
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface c {
        boolean a(TextView textView, String str);
    }

    protected a() {
    }

    private static void a(int i11, a aVar, TextView textView) {
        textView.setMovementMethod(aVar);
        if (i11 != -2) {
            Linkify.addLinks(textView, i11);
        }
    }

    private void b(TextView textView) {
        this.f120359g = false;
        this.f120356d = null;
        i(textView);
        h(textView);
    }

    public static a f(int i11, TextView... textViewArr) {
        a aVarG = g();
        for (TextView textView : textViewArr) {
            a(i11, aVarG, textView);
        }
        return aVarG;
    }

    public static a g() {
        return new a();
    }

    protected void c(TextView textView, ClickableSpan clickableSpan) {
        C1581a c1581aA = C1581a.a(textView, clickableSpan);
        c cVar = this.f120353a;
        if (cVar == null || !cVar.a(textView, c1581aA.c())) {
            c1581aA.b().onClick(textView);
        }
    }

    protected ClickableSpan d(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x11 = (int) motionEvent.getX();
        int y11 = (int) motionEvent.getY();
        int totalPaddingLeft = x11 - textView.getTotalPaddingLeft();
        int totalPaddingTop = y11 - textView.getTotalPaddingTop();
        int scrollX = totalPaddingLeft + textView.getScrollX();
        int scrollY = totalPaddingTop + textView.getScrollY();
        Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(scrollY);
        float f11 = scrollX;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f11);
        this.f120354b.left = layout.getLineLeft(lineForVertical);
        this.f120354b.top = layout.getLineTop(lineForVertical);
        RectF rectF = this.f120354b;
        float lineWidth = layout.getLineWidth(lineForVertical);
        RectF rectF2 = this.f120354b;
        rectF.right = lineWidth + rectF2.left;
        rectF2.bottom = layout.getLineBottom(lineForVertical);
        if (this.f120354b.contains(f11, scrollY)) {
            for (Object obj : spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)) {
                if (obj instanceof ClickableSpan) {
                    return (ClickableSpan) obj;
                }
            }
        }
        return null;
    }

    protected void e(TextView textView, ClickableSpan clickableSpan, Spannable spannable) {
        if (this.f120355c) {
            return;
        }
        this.f120355c = true;
        int spanStart = spannable.getSpanStart(clickableSpan);
        int spanEnd = spannable.getSpanEnd(clickableSpan);
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(textView.getHighlightColor());
        spannable.setSpan(backgroundColorSpan, spanStart, spanEnd, 18);
        textView.setTag(og0.b.bettermovementmethod_highlight_background_span, backgroundColorSpan);
        Selection.setSelection(spannable, spanStart, spanEnd);
    }

    protected void i(TextView textView) {
        if (this.f120355c) {
            this.f120355c = false;
            Spannable spannable = (Spannable) textView.getText();
            spannable.removeSpan((BackgroundColorSpan) textView.getTag(og0.b.bettermovementmethod_highlight_background_span));
            Selection.removeSelection(spannable);
        }
    }

    public a j(c cVar) {
        if (this == f120352h) {
            throw new UnsupportedOperationException("Setting a click listener on the instance returned by getInstance() is not supported to avoid memory leaks. Please use newInstance() or any of the linkify() methods instead.");
        }
        this.f120353a = cVar;
        return this;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (this.f120357e != textView.hashCode()) {
            this.f120357e = textView.hashCode();
            textView.setAutoLinkMask(0);
        }
        ClickableSpan clickableSpanD = d(textView, spannable, motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f120356d = clickableSpanD;
        }
        boolean z11 = this.f120356d != null;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (clickableSpanD != null) {
                e(textView, clickableSpanD, spannable);
            }
            return z11;
        }
        if (action == 1) {
            if (!this.f120359g && z11 && clickableSpanD == this.f120356d) {
                c(textView, clickableSpanD);
            }
            b(textView);
            return z11;
        }
        if (action != 2) {
            if (action != 3) {
                return false;
            }
            b(textView);
            return false;
        }
        if (clickableSpanD != this.f120356d) {
            h(textView);
        }
        if (!this.f120359g) {
            if (clickableSpanD != null) {
                e(textView, clickableSpanD, spannable);
                return z11;
            }
            i(textView);
        }
        return z11;
    }

    protected void h(TextView textView) {
    }
}
