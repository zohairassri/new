package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class v {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f44912n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f44913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f44914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f44915c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f44917e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f44924l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f44916d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Layout.Alignment f44918f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f44919g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f44920h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f44921i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f44922j = f44912n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f44923k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f44925m = null;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a extends Exception {
    }

    private v(CharSequence charSequence, TextPaint textPaint, int i11) {
        this.f44913a = charSequence;
        this.f44914b = textPaint;
        this.f44915c = i11;
        this.f44917e = charSequence.length();
    }

    public static v b(CharSequence charSequence, TextPaint textPaint, int i11) {
        return new v(charSequence, textPaint, i11);
    }

    public StaticLayout a() {
        if (this.f44913a == null) {
            this.f44913a = "";
        }
        int iMax = Math.max(0, this.f44915c);
        CharSequence charSequenceEllipsize = this.f44913a;
        if (this.f44919g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f44914b, iMax, this.f44925m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f44917e);
        this.f44917e = iMin;
        if (this.f44924l && this.f44919g == 1) {
            this.f44918f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f44916d, iMin, this.f44914b, iMax);
        builderObtain.setAlignment(this.f44918f);
        builderObtain.setIncludePad(this.f44923k);
        builderObtain.setTextDirection(this.f44924l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f44925m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f44919g);
        float f11 = this.f44920h;
        if (f11 != 0.0f || this.f44921i != 1.0f) {
            builderObtain.setLineSpacing(f11, this.f44921i);
        }
        if (this.f44919g > 1) {
            builderObtain.setHyphenationFrequency(this.f44922j);
        }
        return builderObtain.build();
    }

    public v c(Layout.Alignment alignment) {
        this.f44918f = alignment;
        return this;
    }

    public v d(TextUtils.TruncateAt truncateAt) {
        this.f44925m = truncateAt;
        return this;
    }

    public v e(int i11) {
        this.f44922j = i11;
        return this;
    }

    public v f(boolean z11) {
        this.f44923k = z11;
        return this;
    }

    public v g(boolean z11) {
        this.f44924l = z11;
        return this;
    }

    public v h(float f11, float f12) {
        this.f44920h = f11;
        this.f44921i = f12;
        return this;
    }

    public v i(int i11) {
        this.f44919g = i11;
        return this;
    }

    public v j(w wVar) {
        return this;
    }
}
