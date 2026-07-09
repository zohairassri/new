package jo;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import o4.e;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f105853i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f105854j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f105855k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f105856l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f105857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f105858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f105859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f105860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f105861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f105862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f105863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f105864h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i11, float f11, float f12) {
        float f13;
        boolean z11 = f12 < 0.0f;
        Path path = this.f105863g;
        if (z11) {
            int[] iArr = f105855k;
            iArr[0] = 0;
            iArr[1] = this.f105862f;
            iArr[2] = this.f105861e;
            iArr[3] = this.f105860d;
            f13 = f11;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f13 = f11;
            path.arcTo(rectF, f13, f12);
            path.close();
            float f14 = -i11;
            rectF.inset(f14, f14);
            int[] iArr2 = f105855k;
            iArr2[0] = 0;
            iArr2[1] = this.f105860d;
            iArr2[2] = this.f105861e;
            iArr2[3] = this.f105862f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f15 = 1.0f - (i11 / fWidth);
        float[] fArr = f105856l;
        fArr[1] = f15;
        fArr[2] = ((1.0f - f15) / 2.0f) + f15;
        this.f105858b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f105855k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z11) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f105864h);
        }
        canvas.drawArc(rectF, f13, f12, true, this.f105858b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i11) {
        rectF.bottom += i11;
        rectF.offset(0.0f, -i11);
        int[] iArr = f105853i;
        iArr[0] = this.f105862f;
        iArr[1] = this.f105861e;
        iArr[2] = this.f105860d;
        Paint paint = this.f105859c;
        float f11 = rectF.left;
        paint.setShader(new LinearGradient(f11, rectF.top, f11, rectF.bottom, iArr, f105854j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f105859c);
        canvas.restore();
    }

    public Paint c() {
        return this.f105857a;
    }

    public void d(int i11) {
        this.f105860d = e.l(i11, 68);
        this.f105861e = e.l(i11, 20);
        this.f105862f = e.l(i11, 0);
        this.f105857a.setColor(this.f105860d);
    }

    public a(int i11) {
        this.f105863g = new Path();
        Paint paint = new Paint();
        this.f105864h = paint;
        this.f105857a = new Paint();
        d(i11);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f105858b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f105859c = new Paint(paint2);
    }
}
