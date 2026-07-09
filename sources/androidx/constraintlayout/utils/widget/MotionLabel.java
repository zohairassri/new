package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.motion.widget.c;
import androidx.constraintlayout.widget.f;
import java.util.Objects;
import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class MotionLabel extends View implements c {
    private int A0;
    private int B;
    Rect B0;
    Paint C0;
    float D0;
    float E0;
    float F0;
    float G0;
    float H0;
    private int N;
    private int S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    TextPaint f6854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Path f6855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f6859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f6860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ViewOutlineProvider f6861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    RectF f6862i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private String f6863i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private Layout f6864j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f6865k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f6866l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f6867l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f6868m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f6869m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f6870n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private float f6871n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private float f6872o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f6873p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private Drawable f6874q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f6875r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    Matrix f6876r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f6877s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private Bitmap f6878s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private BitmapShader f6879t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private Matrix f6880u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f6881v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private float f6882v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f6883w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private float f6884w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Rect f6885x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private float f6886x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f6887y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private float f6888y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    Paint f6889z0;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), (Math.min(r3, r4) * MotionLabel.this.f6859f) / 2.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f6860g);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        this.f6854a = new TextPaint();
        this.f6855b = new Path();
        this.f6856c = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f6857d = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f6858e = false;
        this.f6859f = 0.0f;
        this.f6860g = Float.NaN;
        this.f6866l = 48.0f;
        this.f6868m = Float.NaN;
        this.f6877s = 0.0f;
        this.f6881v = "Hello World";
        this.f6883w = true;
        this.f6885x = new Rect();
        this.f6887y = 1;
        this.B = 1;
        this.N = 1;
        this.S = 1;
        this.f6865k0 = 8388659;
        this.f6867l0 = 0;
        this.f6869m0 = false;
        this.f6882v0 = Float.NaN;
        this.f6884w0 = Float.NaN;
        this.f6886x0 = 0.0f;
        this.f6888y0 = 0.0f;
        this.f6889z0 = new Paint();
        this.A0 = 0;
        this.E0 = Float.NaN;
        this.F0 = Float.NaN;
        this.G0 = Float.NaN;
        this.H0 = Float.NaN;
        g(context, null);
    }

    private void d(float f11, float f12, float f13, float f14) {
        if (this.f6880u0 == null) {
            return;
        }
        this.f6872o0 = f13 - f11;
        this.f6873p0 = f14 - f12;
        k();
    }

    private void g(Context context, AttributeSet attributeSet) {
        setUpTheme(context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.MotionLabel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == f.MotionLabel_android_text) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == f.MotionLabel_android_fontFamily) {
                    this.f6863i0 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == f.MotionLabel_scaleFromTextSize) {
                    this.f6868m = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f6868m);
                } else if (index == f.MotionLabel_android_textSize) {
                    this.f6866l = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f6866l);
                } else if (index == f.MotionLabel_android_textStyle) {
                    this.f6870n = typedArrayObtainStyledAttributes.getInt(index, this.f6870n);
                } else if (index == f.MotionLabel_android_typeface) {
                    this.f6875r = typedArrayObtainStyledAttributes.getInt(index, this.f6875r);
                } else if (index == f.MotionLabel_android_textColor) {
                    this.f6856c = typedArrayObtainStyledAttributes.getColor(index, this.f6856c);
                } else if (index == f.MotionLabel_borderRound) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.f6860g);
                    this.f6860g = dimension;
                    setRound(dimension);
                } else if (index == f.MotionLabel_borderRoundPercent) {
                    float f11 = typedArrayObtainStyledAttributes.getFloat(index, this.f6859f);
                    this.f6859f = f11;
                    setRoundPercent(f11);
                } else if (index == f.MotionLabel_android_gravity) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == f.MotionLabel_android_autoSizeTextType) {
                    this.f6867l0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == f.MotionLabel_textOutlineColor) {
                    this.f6857d = typedArrayObtainStyledAttributes.getInt(index, this.f6857d);
                    this.f6858e = true;
                } else if (index == f.MotionLabel_textOutlineThickness) {
                    this.f6877s = typedArrayObtainStyledAttributes.getDimension(index, this.f6877s);
                    this.f6858e = true;
                } else if (index == f.MotionLabel_textBackground) {
                    this.f6874q0 = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.f6858e = true;
                } else if (index == f.MotionLabel_textBackgroundPanX) {
                    this.E0 = typedArrayObtainStyledAttributes.getFloat(index, this.E0);
                } else if (index == f.MotionLabel_textBackgroundPanY) {
                    this.F0 = typedArrayObtainStyledAttributes.getFloat(index, this.F0);
                } else if (index == f.MotionLabel_textPanX) {
                    this.f6886x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f6886x0);
                } else if (index == f.MotionLabel_textPanY) {
                    this.f6888y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f6888y0);
                } else if (index == f.MotionLabel_textBackgroundRotate) {
                    this.H0 = typedArrayObtainStyledAttributes.getFloat(index, this.H0);
                } else if (index == f.MotionLabel_textBackgroundZoom) {
                    this.G0 = typedArrayObtainStyledAttributes.getFloat(index, this.G0);
                } else if (index == f.MotionLabel_textureHeight) {
                    this.f6882v0 = typedArrayObtainStyledAttributes.getDimension(index, this.f6882v0);
                } else if (index == f.MotionLabel_textureWidth) {
                    this.f6884w0 = typedArrayObtainStyledAttributes.getDimension(index, this.f6884w0);
                } else if (index == f.MotionLabel_textureEffect) {
                    this.A0 = typedArrayObtainStyledAttributes.getInt(index, this.A0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        j();
        i();
    }

    private float getHorizontalOffset() {
        float f11 = Float.isNaN(this.f6868m) ? 1.0f : this.f6866l / this.f6868m;
        TextPaint textPaint = this.f6854a;
        String str = this.f6881v;
        return (((((Float.isNaN(this.f6872o0) ? getMeasuredWidth() : this.f6872o0) - getPaddingLeft()) - getPaddingRight()) - (f11 * textPaint.measureText(str, 0, str.length()))) * (this.f6886x0 + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f11 = Float.isNaN(this.f6868m) ? 1.0f : this.f6866l / this.f6868m;
        Paint.FontMetrics fontMetrics = this.f6854a.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.f6873p0) ? getMeasuredHeight() : this.f6873p0) - getPaddingTop()) - getPaddingBottom();
        float f12 = fontMetrics.descent;
        float f13 = fontMetrics.ascent;
        return (((measuredHeight - ((f12 - f13) * f11)) * (1.0f - this.f6888y0)) / 2.0f) - (f11 * f13);
    }

    private void h(String str, int i11, int i12) {
        Typeface typefaceCreate;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i12);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
                return;
            }
        } else {
            typefaceCreate = null;
        }
        if (i11 == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i11 == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i11 == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        if (i12 <= 0) {
            this.f6854a.setFakeBoldText(false);
            this.f6854a.setTextSkewX(0.0f);
            setTypeface(typefaceCreate);
        } else {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i12) : Typeface.create(typefaceCreate, i12);
            setTypeface(typefaceDefaultFromStyle);
            int i13 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i12;
            this.f6854a.setFakeBoldText((i13 & 1) != 0);
            this.f6854a.setTextSkewX((i13 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    private void j() {
        if (this.f6874q0 != null) {
            this.f6880u0 = new Matrix();
            int intrinsicWidth = this.f6874q0.getIntrinsicWidth();
            int intrinsicHeight = this.f6874q0.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.f6884w0) ? 128 : (int) this.f6884w0;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.f6882v0) ? 128 : (int) this.f6882v0;
            }
            if (this.A0 != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f6878s0 = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f6878s0);
            this.f6874q0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f6874q0.setFilterBitmap(true);
            this.f6874q0.draw(canvas);
            if (this.A0 != 0) {
                this.f6878s0 = e(this.f6878s0, 4);
            }
            Bitmap bitmap = this.f6878s0;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f6879t0 = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    private void k() {
        float f11 = Float.isNaN(this.E0) ? 0.0f : this.E0;
        float f12 = Float.isNaN(this.F0) ? 0.0f : this.F0;
        float f13 = Float.isNaN(this.G0) ? 1.0f : this.G0;
        float f14 = Float.isNaN(this.H0) ? 0.0f : this.H0;
        this.f6880u0.reset();
        float width = this.f6878s0.getWidth();
        float height = this.f6878s0.getHeight();
        float f15 = Float.isNaN(this.f6884w0) ? this.f6872o0 : this.f6884w0;
        float f16 = Float.isNaN(this.f6882v0) ? this.f6873p0 : this.f6882v0;
        float f17 = f13 * (width * f16 < height * f15 ? f15 / width : f16 / height);
        this.f6880u0.postScale(f17, f17);
        float f18 = width * f17;
        float f19 = f15 - f18;
        float f21 = f17 * height;
        float f22 = f16 - f21;
        if (!Float.isNaN(this.f6882v0)) {
            f22 = this.f6882v0 / 2.0f;
        }
        if (!Float.isNaN(this.f6884w0)) {
            f19 = this.f6884w0 / 2.0f;
        }
        this.f6880u0.postTranslate((((f11 * f19) + f15) - f18) * 0.5f, (((f12 * f22) + f16) - f21) * 0.5f);
        this.f6880u0.postRotate(f14, f15 / 2.0f, f16 / 2.0f);
        this.f6879t0.setLocalMatrix(this.f6880u0);
    }

    private void setUpTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(h.a.colorPrimary, typedValue, true);
        TextPaint textPaint = this.f6854a;
        int i11 = typedValue.data;
        this.f6856c = i11;
        textPaint.setColor(i11);
    }

    @Override // androidx.constraintlayout.motion.widget.c
    public void a(float f11, float f12, float f13, float f14) {
        int i11 = (int) (f11 + 0.5f);
        this.f6871n0 = f11 - i11;
        int i12 = (int) (f13 + 0.5f);
        int i13 = i12 - i11;
        int i14 = (int) (f14 + 0.5f);
        int i15 = (int) (0.5f + f12);
        int i16 = i14 - i15;
        float f15 = f13 - f11;
        this.f6872o0 = f15;
        float f16 = f14 - f12;
        this.f6873p0 = f16;
        d(f11, f12, f13, f14);
        if (getMeasuredHeight() == i16 && getMeasuredWidth() == i13) {
            super.layout(i11, i15, i12, i14);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
            super.layout(i11, i15, i12, i14);
        }
        if (this.f6869m0) {
            if (this.B0 == null) {
                this.C0 = new Paint();
                this.B0 = new Rect();
                this.C0.set(this.f6854a);
                this.D0 = this.C0.getTextSize();
            }
            this.f6872o0 = f15;
            this.f6873p0 = f16;
            Paint paint = this.C0;
            String str = this.f6881v;
            paint.getTextBounds(str, 0, str.length(), this.B0);
            float fHeight = this.B0.height() * 1.3f;
            float f17 = (f15 - this.B) - this.f6887y;
            float f18 = (f16 - this.S) - this.N;
            float fWidth = this.B0.width();
            if (fWidth * f18 > fHeight * f17) {
                this.f6854a.setTextSize((this.D0 * f17) / fWidth);
            } else {
                this.f6854a.setTextSize((this.D0 * f18) / fHeight);
            }
            if (this.f6858e || !Float.isNaN(this.f6868m)) {
                f(Float.isNaN(this.f6868m) ? 1.0f : this.f6866l / this.f6868m);
            }
        }
    }

    Bitmap e(Bitmap bitmap, int i11) {
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i12 = 0; i12 < i11 && width >= 32 && height >= 32; i12++) {
            width /= 2;
            height /= 2;
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
        }
        return bitmapCreateScaledBitmap;
    }

    void f(float f11) {
        if (this.f6858e || f11 != 1.0f) {
            this.f6855b.reset();
            String str = this.f6881v;
            int length = str.length();
            this.f6854a.getTextBounds(str, 0, length, this.f6885x);
            this.f6854a.getTextPath(str, 0, length, 0.0f, 0.0f, this.f6855b);
            if (f11 != 1.0f) {
                androidx.constraintlayout.motion.widget.a.a();
                Matrix matrix = new Matrix();
                matrix.postScale(f11, f11);
                this.f6855b.transform(matrix);
            }
            Rect rect = this.f6885x;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.f6883w = false;
        }
    }

    public float getRound() {
        return this.f6860g;
    }

    public float getRoundPercent() {
        return this.f6859f;
    }

    public float getScaleFromTextSize() {
        return this.f6868m;
    }

    public float getTextBackgroundPanX() {
        return this.E0;
    }

    public float getTextBackgroundPanY() {
        return this.F0;
    }

    public float getTextBackgroundRotate() {
        return this.H0;
    }

    public float getTextBackgroundZoom() {
        return this.G0;
    }

    public int getTextOutlineColor() {
        return this.f6857d;
    }

    public float getTextPanX() {
        return this.f6886x0;
    }

    public float getTextPanY() {
        return this.f6888y0;
    }

    public float getTextureHeight() {
        return this.f6882v0;
    }

    public float getTextureWidth() {
        return this.f6884w0;
    }

    public Typeface getTypeface() {
        return this.f6854a.getTypeface();
    }

    void i() {
        this.f6887y = getPaddingLeft();
        this.B = getPaddingRight();
        this.N = getPaddingTop();
        this.S = getPaddingBottom();
        h(this.f6863i0, this.f6875r, this.f6870n);
        this.f6854a.setColor(this.f6856c);
        this.f6854a.setStrokeWidth(this.f6877s);
        this.f6854a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f6854a.setFlags(128);
        setTextSize(this.f6866l);
        this.f6854a.setAntiAlias(true);
    }

    @Override // android.view.View
    public void layout(int i11, int i12, int i13, int i14) {
        super.layout(i11, i12, i13, i14);
        boolean zIsNaN = Float.isNaN(this.f6868m);
        float f11 = zIsNaN ? 1.0f : this.f6866l / this.f6868m;
        this.f6872o0 = i13 - i11;
        this.f6873p0 = i14 - i12;
        if (this.f6869m0) {
            if (this.B0 == null) {
                this.C0 = new Paint();
                this.B0 = new Rect();
                this.C0.set(this.f6854a);
                this.D0 = this.C0.getTextSize();
            }
            Paint paint = this.C0;
            String str = this.f6881v;
            paint.getTextBounds(str, 0, str.length(), this.B0);
            int iWidth = this.B0.width();
            int iHeight = (int) (this.B0.height() * 1.3f);
            float f12 = (this.f6872o0 - this.B) - this.f6887y;
            float f13 = (this.f6873p0 - this.S) - this.N;
            if (zIsNaN) {
                float f14 = iWidth;
                float f15 = iHeight;
                if (f14 * f13 > f15 * f12) {
                    this.f6854a.setTextSize((this.D0 * f12) / f14);
                } else {
                    this.f6854a.setTextSize((this.D0 * f13) / f15);
                }
            } else {
                float f16 = iWidth;
                float f17 = iHeight;
                f11 = f16 * f13 > f17 * f12 ? f12 / f16 : f13 / f17;
            }
        }
        if (this.f6858e || !zIsNaN) {
            d(i11, i12, i13, i14);
            f(f11);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f11 = Float.isNaN(this.f6868m) ? 1.0f : this.f6866l / this.f6868m;
        super.onDraw(canvas);
        if (!this.f6858e && f11 == 1.0f) {
            canvas.drawText(this.f6881v, this.f6871n0 + this.f6887y + getHorizontalOffset(), this.N + getVerticalOffset(), this.f6854a);
            return;
        }
        if (this.f6883w) {
            f(f11);
        }
        if (this.f6876r0 == null) {
            this.f6876r0 = new Matrix();
        }
        if (!this.f6858e) {
            float horizontalOffset = this.f6887y + getHorizontalOffset();
            float verticalOffset = this.N + getVerticalOffset();
            this.f6876r0.reset();
            this.f6876r0.preTranslate(horizontalOffset, verticalOffset);
            this.f6855b.transform(this.f6876r0);
            this.f6854a.setColor(this.f6856c);
            this.f6854a.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f6854a.setStrokeWidth(this.f6877s);
            canvas.drawPath(this.f6855b, this.f6854a);
            this.f6876r0.reset();
            this.f6876r0.preTranslate(-horizontalOffset, -verticalOffset);
            this.f6855b.transform(this.f6876r0);
            return;
        }
        this.f6889z0.set(this.f6854a);
        this.f6876r0.reset();
        float horizontalOffset2 = this.f6887y + getHorizontalOffset();
        float verticalOffset2 = this.N + getVerticalOffset();
        this.f6876r0.postTranslate(horizontalOffset2, verticalOffset2);
        this.f6876r0.preScale(f11, f11);
        this.f6855b.transform(this.f6876r0);
        if (this.f6879t0 != null) {
            this.f6854a.setFilterBitmap(true);
            this.f6854a.setShader(this.f6879t0);
        } else {
            this.f6854a.setColor(this.f6856c);
        }
        this.f6854a.setStyle(Paint.Style.FILL);
        this.f6854a.setStrokeWidth(this.f6877s);
        canvas.drawPath(this.f6855b, this.f6854a);
        if (this.f6879t0 != null) {
            this.f6854a.setShader(null);
        }
        this.f6854a.setColor(this.f6857d);
        this.f6854a.setStyle(Paint.Style.STROKE);
        this.f6854a.setStrokeWidth(this.f6877s);
        canvas.drawPath(this.f6855b, this.f6854a);
        this.f6876r0.reset();
        this.f6876r0.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f6855b.transform(this.f6876r0);
        this.f6854a.set(this.f6889z0);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        this.f6869m0 = false;
        this.f6887y = getPaddingLeft();
        this.B = getPaddingRight();
        this.N = getPaddingTop();
        this.S = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f6854a;
            String str = this.f6881v;
            textPaint.getTextBounds(str, 0, str.length(), this.f6885x);
            if (mode != 1073741824) {
                size = (int) (this.f6885x.width() + 0.99999f);
            }
            size += this.f6887y + this.B;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f6854a.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.N + this.S + fontMetricsInt;
            }
        } else if (this.f6867l0 != 0) {
            this.f6869m0 = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i11) {
        if ((i11 & 8388615) == 0) {
            i11 |= 8388611;
        }
        if ((i11 & 112) == 0) {
            i11 |= 48;
        }
        if (i11 != this.f6865k0) {
            invalidate();
        }
        this.f6865k0 = i11;
        int i12 = i11 & 112;
        if (i12 == 48) {
            this.f6888y0 = -1.0f;
        } else if (i12 != 80) {
            this.f6888y0 = 0.0f;
        } else {
            this.f6888y0 = 1.0f;
        }
        int i13 = i11 & 8388615;
        if (i13 != 3) {
            if (i13 != 5) {
                if (i13 != 8388611) {
                    if (i13 != 8388613) {
                        this.f6886x0 = 0.0f;
                        return;
                    }
                }
            }
            this.f6886x0 = 1.0f;
            return;
        }
        this.f6886x0 = -1.0f;
    }

    public void setRound(float f11) {
        if (Float.isNaN(f11)) {
            this.f6860g = f11;
            float f12 = this.f6859f;
            this.f6859f = -1.0f;
            setRoundPercent(f12);
            return;
        }
        boolean z11 = this.f6860g != f11;
        this.f6860g = f11;
        if (f11 != 0.0f) {
            if (this.f6855b == null) {
                this.f6855b = new Path();
            }
            if (this.f6862i == null) {
                this.f6862i = new RectF();
            }
            if (this.f6861h == null) {
                b bVar = new b();
                this.f6861h = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f6862i.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f6855b.reset();
            Path path = this.f6855b;
            RectF rectF = this.f6862i;
            float f13 = this.f6860g;
            path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f11) {
        boolean z11 = this.f6859f != f11;
        this.f6859f = f11;
        if (f11 != 0.0f) {
            if (this.f6855b == null) {
                this.f6855b = new Path();
            }
            if (this.f6862i == null) {
                this.f6862i = new RectF();
            }
            if (this.f6861h == null) {
                a aVar = new a();
                this.f6861h = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f6859f) / 2.0f;
            this.f6862i.set(0.0f, 0.0f, width, height);
            this.f6855b.reset();
            this.f6855b.addRoundRect(this.f6862i, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f11) {
        this.f6868m = f11;
    }

    public void setText(CharSequence charSequence) {
        this.f6881v = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f11) {
        this.E0 = f11;
        k();
        invalidate();
    }

    public void setTextBackgroundPanY(float f11) {
        this.F0 = f11;
        k();
        invalidate();
    }

    public void setTextBackgroundRotate(float f11) {
        this.H0 = f11;
        k();
        invalidate();
    }

    public void setTextBackgroundZoom(float f11) {
        this.G0 = f11;
        k();
        invalidate();
    }

    public void setTextFillColor(int i11) {
        this.f6856c = i11;
        invalidate();
    }

    public void setTextOutlineColor(int i11) {
        this.f6857d = i11;
        this.f6858e = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f11) {
        this.f6877s = f11;
        this.f6858e = true;
        if (Float.isNaN(f11)) {
            this.f6877s = 1.0f;
            this.f6858e = false;
        }
        invalidate();
    }

    public void setTextPanX(float f11) {
        this.f6886x0 = f11;
        invalidate();
    }

    public void setTextPanY(float f11) {
        this.f6888y0 = f11;
        invalidate();
    }

    public void setTextSize(float f11) {
        this.f6866l = f11;
        TextPaint textPaint = this.f6854a;
        if (!Float.isNaN(this.f6868m)) {
            f11 = this.f6868m;
        }
        textPaint.setTextSize(f11);
        f(Float.isNaN(this.f6868m) ? 1.0f : this.f6866l / this.f6868m);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f11) {
        this.f6882v0 = f11;
        k();
        invalidate();
    }

    public void setTextureWidth(float f11) {
        this.f6884w0 = f11;
        k();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (Objects.equals(this.f6854a.getTypeface(), typeface)) {
            return;
        }
        this.f6854a.setTypeface(typeface);
        if (this.f6864j0 != null) {
            this.f6864j0 = null;
            requestLayout();
            invalidate();
        }
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6854a = new TextPaint();
        this.f6855b = new Path();
        this.f6856c = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f6857d = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f6858e = false;
        this.f6859f = 0.0f;
        this.f6860g = Float.NaN;
        this.f6866l = 48.0f;
        this.f6868m = Float.NaN;
        this.f6877s = 0.0f;
        this.f6881v = "Hello World";
        this.f6883w = true;
        this.f6885x = new Rect();
        this.f6887y = 1;
        this.B = 1;
        this.N = 1;
        this.S = 1;
        this.f6865k0 = 8388659;
        this.f6867l0 = 0;
        this.f6869m0 = false;
        this.f6882v0 = Float.NaN;
        this.f6884w0 = Float.NaN;
        this.f6886x0 = 0.0f;
        this.f6888y0 = 0.0f;
        this.f6889z0 = new Paint();
        this.A0 = 0;
        this.E0 = Float.NaN;
        this.F0 = Float.NaN;
        this.G0 = Float.NaN;
        this.H0 = Float.NaN;
        g(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f6854a = new TextPaint();
        this.f6855b = new Path();
        this.f6856c = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f6857d = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f6858e = false;
        this.f6859f = 0.0f;
        this.f6860g = Float.NaN;
        this.f6866l = 48.0f;
        this.f6868m = Float.NaN;
        this.f6877s = 0.0f;
        this.f6881v = "Hello World";
        this.f6883w = true;
        this.f6885x = new Rect();
        this.f6887y = 1;
        this.B = 1;
        this.N = 1;
        this.S = 1;
        this.f6865k0 = 8388659;
        this.f6867l0 = 0;
        this.f6869m0 = false;
        this.f6882v0 = Float.NaN;
        this.f6884w0 = Float.NaN;
        this.f6886x0 = 0.0f;
        this.f6888y0 = 0.0f;
        this.f6889z0 = new Paint();
        this.A0 = 0;
        this.E0 = Float.NaN;
        this.F0 = Float.NaN;
        this.G0 = Float.NaN;
        this.H0 = Float.NaN;
        g(context, attributeSet);
    }
}
