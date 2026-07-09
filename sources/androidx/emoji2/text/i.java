package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f7941b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f7940a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f7942c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short f7943d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f7944e = 1.0f;

    i(o oVar) {
        w4.i.h(oVar, "rasterizer cannot be null");
        this.f7941b = oVar;
    }

    public final o a() {
        return this.f7941b;
    }

    final int b() {
        return this.f7942c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f7940a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f7940a;
        this.f7944e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f7941b.e();
        this.f7943d = (short) (this.f7941b.e() * this.f7944e);
        short sI = (short) (this.f7941b.i() * this.f7944e);
        this.f7942c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f7940a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
