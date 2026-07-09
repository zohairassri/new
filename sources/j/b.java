package j;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import h.i;
import h.j;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class b extends Drawable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f104739m = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f104740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f104741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f104742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f104743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f104744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f104745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f104746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f104747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f104748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f104749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f104750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f104751l;

    public b(Context context) {
        Paint paint = new Paint();
        this.f104740a = paint;
        this.f104746g = new Path();
        this.f104748i = false;
        this.f104751l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, j.DrawerArrowToggle, h.a.drawerArrowStyle, i.Base_Widget_AppCompat_DrawerArrowToggle);
        c(typedArrayObtainStyledAttributes.getColor(j.DrawerArrowToggle_color, 0));
        b(typedArrayObtainStyledAttributes.getDimension(j.DrawerArrowToggle_thickness, 0.0f));
        f(typedArrayObtainStyledAttributes.getBoolean(j.DrawerArrowToggle_spinBars, true));
        d(Math.round(typedArrayObtainStyledAttributes.getDimension(j.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f104747h = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.DrawerArrowToggle_drawableSize, 0);
        this.f104742c = Math.round(typedArrayObtainStyledAttributes.getDimension(j.DrawerArrowToggle_barLength, 0.0f));
        this.f104741b = Math.round(typedArrayObtainStyledAttributes.getDimension(j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f104743d = typedArrayObtainStyledAttributes.getDimension(j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static float a(float f11, float f12, float f13) {
        return f11 + ((f12 - f11) * f13);
    }

    public void b(float f11) {
        if (this.f104740a.getStrokeWidth() != f11) {
            this.f104740a.setStrokeWidth(f11);
            this.f104750k = (float) (((double) (f11 / 2.0f)) * Math.cos(f104739m));
            invalidateSelf();
        }
    }

    public void c(int i11) {
        if (i11 != this.f104740a.getColor()) {
            this.f104740a.setColor(i11);
            invalidateSelf();
        }
    }

    public void d(float f11) {
        if (f11 != this.f104744e) {
            this.f104744e = f11;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i11 = this.f104751l;
        boolean z11 = false;
        if (i11 != 0 && (i11 == 1 || (i11 == 3 ? p4.a.f(this) == 0 : p4.a.f(this) == 1))) {
            z11 = true;
        }
        float f11 = this.f104741b;
        float fA = a(this.f104742c, (float) Math.sqrt(f11 * f11 * 2.0f), this.f104749j);
        float fA2 = a(this.f104742c, this.f104743d, this.f104749j);
        float fRound = Math.round(a(0.0f, this.f104750k, this.f104749j));
        float fA3 = a(0.0f, f104739m, this.f104749j);
        float fA4 = a(z11 ? 0.0f : -180.0f, z11 ? 180.0f : 0.0f, this.f104749j);
        double d11 = fA;
        double d12 = fA3;
        boolean z12 = z11;
        float fRound2 = Math.round(Math.cos(d12) * d11);
        float fRound3 = Math.round(d11 * Math.sin(d12));
        this.f104746g.rewind();
        float fA5 = a(this.f104744e + this.f104740a.getStrokeWidth(), -this.f104750k, this.f104749j);
        float f12 = (-fA2) / 2.0f;
        this.f104746g.moveTo(f12 + fRound, 0.0f);
        this.f104746g.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        this.f104746g.moveTo(f12, fA5);
        this.f104746g.rLineTo(fRound2, fRound3);
        this.f104746g.moveTo(f12, -fA5);
        this.f104746g.rLineTo(fRound2, -fRound3);
        this.f104746g.close();
        canvas.save();
        float strokeWidth = this.f104740a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (r5 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + this.f104744e);
        if (this.f104745f) {
            canvas.rotate(fA4 * (this.f104748i ^ z12 ? -1 : 1));
        } else if (z12) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f104746g, this.f104740a);
        canvas.restore();
    }

    public void e(float f11) {
        if (this.f104749j != f11) {
            this.f104749j = f11;
            invalidateSelf();
        }
    }

    public void f(boolean z11) {
        if (this.f104745f != z11) {
            this.f104745f = z11;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f104747h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f104747h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (i11 != this.f104740a.getAlpha()) {
            this.f104740a.setAlpha(i11);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f104740a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
