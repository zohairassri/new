package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class f extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f44847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Drawable f44848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f44849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f44850d;

    public f(Drawable drawable, Drawable drawable2) {
        this.f44847a = drawable.getConstantState().newDrawable().mutate();
        Drawable drawableMutate = drawable2.getConstantState().newDrawable().mutate();
        this.f44848b = drawableMutate;
        drawableMutate.setAlpha(0);
        this.f44849c = new float[2];
    }

    public void a(float f11) {
        if (this.f44850d != f11) {
            this.f44850d = f11;
            h.a(f11, this.f44849c);
            this.f44847a.setAlpha((int) (this.f44849c[0] * 255.0f));
            this.f44848b.setAlpha((int) (this.f44849c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f44847a.draw(canvas);
        this.f44848b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f44847a.getIntrinsicHeight(), this.f44848b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f44847a.getIntrinsicWidth(), this.f44848b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f44847a.getMinimumHeight(), this.f44848b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f44847a.getMinimumWidth(), this.f44848b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f44847a.isStateful() || this.f44848b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (this.f44850d <= 0.5f) {
            this.f44847a.setAlpha(i11);
            this.f44848b.setAlpha(0);
        } else {
            this.f44847a.setAlpha(0);
            this.f44848b.setAlpha(i11);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i11, int i12, int i13, int i14) {
        super.setBounds(i11, i12, i13, i14);
        this.f44847a.setBounds(i11, i12, i13, i14);
        this.f44848b.setBounds(i11, i12, i13, i14);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f44847a.setColorFilter(colorFilter);
        this.f44848b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f44847a.setState(iArr) || this.f44848b.setState(iArr);
    }
}
