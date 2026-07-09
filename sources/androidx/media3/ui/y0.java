package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class y0 {
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f11293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f11294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f11295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f11296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f11297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextPaint f11298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f11299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f11300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f11301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Layout.Alignment f11302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Bitmap f11303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f11304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f11305m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f11306n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f11307o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f11308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f11309q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f11310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f11311s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f11312t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f11313u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f11314v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f11315w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f11316x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f11317y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f11318z;

    public y0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f11297e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f11296d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f11293a = fRound;
        this.f11294b = fRound;
        this.f11295c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f11298f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f11299g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f11300h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f11303k, (Rect) null, this.J, this.f11300h);
    }

    private void d(Canvas canvas, boolean z11) {
        if (z11) {
            e(canvas);
            return;
        }
        k6.a.e(this.J);
        k6.a.e(this.f11303k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f11313u) > 0) {
            this.f11299g.setColor(this.f11313u);
            canvas2 = canvas;
            canvas2.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f11299g);
        } else {
            canvas2 = canvas;
        }
        int i11 = this.f11315w;
        if (i11 == 1) {
            this.f11298f.setStrokeJoin(Paint.Join.ROUND);
            this.f11298f.setStrokeWidth(this.f11293a);
            this.f11298f.setColor(this.f11314v);
            this.f11298f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i11 == 2) {
            TextPaint textPaint = this.f11298f;
            float f11 = this.f11294b;
            float f12 = this.f11295c;
            textPaint.setShadowLayer(f11, f12, f12, this.f11314v);
        } else if (i11 == 3 || i11 == 4) {
            boolean z11 = i11 == 3;
            int i12 = z11 ? -1 : this.f11314v;
            int i13 = z11 ? this.f11314v : -1;
            float f13 = this.f11294b / 2.0f;
            this.f11298f.setColor(this.f11311s);
            this.f11298f.setStyle(Paint.Style.FILL);
            float f14 = -f13;
            this.f11298f.setShadowLayer(this.f11294b, f14, f14, i12);
            staticLayout2.draw(canvas2);
            this.f11298f.setShadowLayer(this.f11294b, f13, f13, i13);
        }
        this.f11298f.setColor(this.f11311s);
        this.f11298f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.f11298f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f11303k
            int r1 = r7.C
            int r2 = r7.A
            int r1 = r1 - r2
            int r3 = r7.D
            int r4 = r7.B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f11307o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f11304l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f11309q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f11310r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L2e
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L3f
        L2e:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L3f:
            int r3 = r7.f11308p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L48
            float r3 = (float) r1
        L46:
            float r2 = r2 - r3
            goto L4e
        L48:
            if (r3 != r5) goto L4e
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L46
        L4e:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f11306n
            if (r3 != r6) goto L59
            float r3 = (float) r0
        L57:
            float r4 = r4 - r3
            goto L5f
        L59:
            if (r3 != r5) goto L5f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L57
        L5f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.y0.f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g() {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.y0.g():void");
    }

    public void b(j6.a aVar, a aVar2, float f11, float f12, float f13, Canvas canvas, int i11, int i12, int i13, int i14) {
        int i15;
        boolean z11 = aVar.f104980d == null;
        if (!z11) {
            i15 = -16777216;
        } else if (TextUtils.isEmpty(aVar.f104977a)) {
            return;
        } else {
            i15 = aVar.f104988l ? aVar.f104989m : aVar2.f11204c;
        }
        if (a(this.f11301i, aVar.f104977a) && Objects.equals(this.f11302j, aVar.f104978b) && this.f11303k == aVar.f104980d && this.f11304l == aVar.f104981e && this.f11305m == aVar.f104982f && Integer.valueOf(this.f11306n).equals(Integer.valueOf(aVar.f104983g)) && this.f11307o == aVar.f104984h && Integer.valueOf(this.f11308p).equals(Integer.valueOf(aVar.f104985i)) && this.f11309q == aVar.f104986j && this.f11310r == aVar.f104987k && this.f11311s == aVar2.f11202a && this.f11312t == aVar2.f11203b && this.f11313u == i15 && this.f11315w == aVar2.f11205d && this.f11314v == aVar2.f11206e && Objects.equals(this.f11298f.getTypeface(), aVar2.f11207f) && this.f11316x == f11 && this.f11317y == f12 && this.f11318z == f13 && this.A == i11 && this.B == i12 && this.C == i13 && this.D == i14) {
            d(canvas, z11);
            return;
        }
        this.f11301i = aVar.f104977a;
        this.f11302j = aVar.f104978b;
        this.f11303k = aVar.f104980d;
        this.f11304l = aVar.f104981e;
        this.f11305m = aVar.f104982f;
        this.f11306n = aVar.f104983g;
        this.f11307o = aVar.f104984h;
        this.f11308p = aVar.f104985i;
        this.f11309q = aVar.f104986j;
        this.f11310r = aVar.f104987k;
        this.f11311s = aVar2.f11202a;
        this.f11312t = aVar2.f11203b;
        this.f11313u = i15;
        this.f11315w = aVar2.f11205d;
        this.f11314v = aVar2.f11206e;
        this.f11298f.setTypeface(aVar2.f11207f);
        this.f11316x = f11;
        this.f11317y = f12;
        this.f11318z = f13;
        this.A = i11;
        this.B = i12;
        this.C = i13;
        this.D = i14;
        if (z11) {
            k6.a.e(this.f11301i);
            g();
        } else {
            k6.a.e(this.f11303k);
            f();
        }
        d(canvas, z11);
    }
}
