package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f44372j = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f44373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f44374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f44375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f44376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f44377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c.e f44378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f44379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f44380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f44381i;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void c(Canvas canvas);

        boolean d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f44373a = aVar;
        View view = (View) aVar;
        this.f44374b = view;
        view.setWillNotDraw(false);
        this.f44375c = new Path();
        this.f44376d = new Paint(7);
        Paint paint = new Paint(1);
        this.f44377e = paint;
        paint.setColor(0);
    }

    private void d(Canvas canvas) {
        if (o()) {
            Rect bounds = this.f44379g.getBounds();
            float fWidth = this.f44378f.f44386a - (bounds.width() / 2.0f);
            float fHeight = this.f44378f.f44387b - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.f44379g.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    private float g(c.e eVar) {
        return eo.a.b(eVar.f44386a, eVar.f44387b, 0.0f, 0.0f, this.f44374b.getWidth(), this.f44374b.getHeight());
    }

    private void i() {
        if (f44372j == 1) {
            this.f44375c.rewind();
            c.e eVar = this.f44378f;
            if (eVar != null) {
                this.f44375c.addCircle(eVar.f44386a, eVar.f44387b, eVar.f44388c, Path.Direction.CW);
            }
        }
        this.f44374b.invalidate();
    }

    private boolean n() {
        c.e eVar = this.f44378f;
        boolean z11 = eVar == null || eVar.a();
        return f44372j == 0 ? !z11 && this.f44381i : !z11;
    }

    private boolean o() {
        return (this.f44380h || this.f44379g == null || this.f44378f == null) ? false : true;
    }

    private boolean p() {
        return (this.f44380h || Color.alpha(this.f44377e.getColor()) == 0) ? false : true;
    }

    public void a() {
        if (f44372j == 0) {
            this.f44380h = true;
            this.f44381i = false;
            this.f44374b.buildDrawingCache();
            Bitmap drawingCache = this.f44374b.getDrawingCache();
            if (drawingCache == null && this.f44374b.getWidth() != 0 && this.f44374b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f44374b.getWidth(), this.f44374b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f44374b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f44376d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f44380h = false;
            this.f44381i = true;
        }
    }

    public void b() {
        if (f44372j == 0) {
            this.f44381i = false;
            this.f44374b.destroyDrawingCache();
            this.f44376d.setShader(null);
            this.f44374b.invalidate();
        }
    }

    public void c(Canvas canvas) {
        Canvas canvas2;
        if (n()) {
            int i11 = f44372j;
            if (i11 == 0) {
                canvas2 = canvas;
                c.e eVar = this.f44378f;
                canvas2.drawCircle(eVar.f44386a, eVar.f44387b, eVar.f44388c, this.f44376d);
                if (p()) {
                    c.e eVar2 = this.f44378f;
                    canvas2.drawCircle(eVar2.f44386a, eVar2.f44387b, eVar2.f44388c, this.f44377e);
                }
            } else if (i11 == 1) {
                canvas2 = canvas;
                int iSave = canvas2.save();
                canvas2.clipPath(this.f44375c);
                this.f44373a.c(canvas2);
                if (p()) {
                    canvas2.drawRect(0.0f, 0.0f, this.f44374b.getWidth(), this.f44374b.getHeight(), this.f44377e);
                }
                canvas2.restoreToCount(iSave);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("Unsupported strategy " + i11);
                }
                this.f44373a.c(canvas);
                if (p()) {
                    canvas.drawRect(0.0f, 0.0f, this.f44374b.getWidth(), this.f44374b.getHeight(), this.f44377e);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
            }
        } else {
            canvas2 = canvas;
            this.f44373a.c(canvas2);
            if (p()) {
                canvas2.drawRect(0.0f, 0.0f, this.f44374b.getWidth(), this.f44374b.getHeight(), this.f44377e);
            }
        }
        d(canvas2);
    }

    public Drawable e() {
        return this.f44379g;
    }

    public int f() {
        return this.f44377e.getColor();
    }

    public c.e h() {
        c.e eVar = this.f44378f;
        if (eVar == null) {
            return null;
        }
        c.e eVar2 = new c.e(eVar);
        if (eVar2.a()) {
            eVar2.f44388c = g(eVar2);
        }
        return eVar2;
    }

    public boolean j() {
        return this.f44373a.d() && !n();
    }

    public void k(Drawable drawable) {
        this.f44379g = drawable;
        this.f44374b.invalidate();
    }

    public void l(int i11) {
        this.f44377e.setColor(i11);
        this.f44374b.invalidate();
    }

    public void m(c.e eVar) {
        if (eVar == null) {
            this.f44378f = null;
        } else {
            c.e eVar2 = this.f44378f;
            if (eVar2 == null) {
                this.f44378f = new c.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (eo.a.c(eVar.f44388c, g(eVar), 1.0E-4f)) {
                this.f44378f.f44388c = Float.MAX_VALUE;
            }
        }
        i();
    }
}
