package j3;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f104917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f104918b;

    public c(CharSequence charSequence, TextPaint textPaint) {
        this.f104917a = charSequence;
        this.f104918b = textPaint;
    }

    @Override // j3.b
    public int e(int i11) {
        TextPaint textPaint = this.f104918b;
        CharSequence charSequence = this.f104917a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i11, 0);
    }

    @Override // j3.b
    public int f(int i11) {
        TextPaint textPaint = this.f104918b;
        CharSequence charSequence = this.f104917a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i11, 2);
    }
}
