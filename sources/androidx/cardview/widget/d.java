package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f2632a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f2634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f2635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f2636e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ColorStateList f2639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f2640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f2641j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2637f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2638g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f2642k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f2633b = new Paint(5);

    d(ColorStateList colorStateList, float f11) {
        this.f2632a = f11;
        e(colorStateList);
        this.f2634c = new RectF();
        this.f2635d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2639h = colorStateList;
        this.f2633b.setColor(colorStateList.getColorForState(getState(), this.f2639h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f2634c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f2635d.set(rect);
        if (this.f2637f) {
            this.f2635d.inset((int) Math.ceil(e.a(this.f2636e, this.f2632a, this.f2638g)), (int) Math.ceil(e.b(this.f2636e, this.f2632a, this.f2638g)));
            this.f2634c.set(this.f2635d);
        }
    }

    public ColorStateList b() {
        return this.f2639h;
    }

    float c() {
        return this.f2636e;
    }

    public float d() {
        return this.f2632a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z11;
        Paint paint = this.f2633b;
        if (this.f2640i == null || paint.getColorFilter() != null) {
            z11 = false;
        } else {
            paint.setColorFilter(this.f2640i);
            z11 = true;
        }
        RectF rectF = this.f2634c;
        float f11 = this.f2632a;
        canvas.drawRoundRect(rectF, f11, f11, paint);
        if (z11) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f11, boolean z11, boolean z12) {
        if (f11 == this.f2636e && this.f2637f == z11 && this.f2638g == z12) {
            return;
        }
        this.f2636e = f11;
        this.f2637f = z11;
        this.f2638g = z12;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f2635d, this.f2632a);
    }

    void h(float f11) {
        if (f11 == this.f2632a) {
            return;
        }
        this.f2632a = f11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f2641j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f2639h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f2639h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z11 = colorForState != this.f2633b.getColor();
        if (z11) {
            this.f2633b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f2641j;
        if (colorStateList2 == null || (mode = this.f2642k) == null) {
            return z11;
        }
        this.f2640i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f2633b.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2633b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2641j = colorStateList;
        this.f2640i = a(colorStateList, this.f2642k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2642k = mode;
        this.f2640i = a(this.f2641j, mode);
        invalidateSelf();
    }
}
