package k3;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f107430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f107431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f107432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f107433d;

    public l(int i11, float f11, float f12, float f13) {
        this.f107430a = i11;
        this.f107431b = f11;
        this.f107432c = f12;
        this.f107433d = f13;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f107433d, this.f107431b, this.f107432c, this.f107430a);
    }
}
