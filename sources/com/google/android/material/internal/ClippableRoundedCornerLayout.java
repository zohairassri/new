package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Path f44752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f44753b;

    public ClippableRoundedCornerLayout(@NonNull Context context) {
        super(context);
    }

    public void a() {
        this.f44752a = null;
        this.f44753b = 0.0f;
        invalidate();
    }

    public void b(float f11, float f12, float f13, float f14, float f15) {
        d(new RectF(f11, f12, f13, f14), f15);
    }

    public void c(Rect rect, float f11) {
        b(rect.left, rect.top, rect.right, rect.bottom, f11);
    }

    public void d(RectF rectF, float f11) {
        if (this.f44752a == null) {
            this.f44752a = new Path();
        }
        this.f44753b = f11;
        this.f44752a.reset();
        this.f44752a.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        this.f44752a.close();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f44752a == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f44752a);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public void e(float f11) {
        b(getLeft(), getTop(), getRight(), getBottom(), f11);
    }

    public float getCornerRadius() {
        return this.f44753b;
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
