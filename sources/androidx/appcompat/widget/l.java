package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f2434c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ProgressBar f2435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f2436b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {
        public static void a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i11) {
            layerDrawable2.setLayerGravity(i11, layerDrawable.getLayerGravity(i11));
            layerDrawable2.setLayerWidth(i11, layerDrawable.getLayerWidth(i11));
            layerDrawable2.setLayerHeight(i11, layerDrawable.getLayerHeight(i11));
            layerDrawable2.setLayerInsetLeft(i11, layerDrawable.getLayerInsetLeft(i11));
            layerDrawable2.setLayerInsetRight(i11, layerDrawable.getLayerInsetRight(i11));
            layerDrawable2.setLayerInsetTop(i11, layerDrawable.getLayerInsetTop(i11));
            layerDrawable2.setLayerInsetBottom(i11, layerDrawable.getLayerInsetBottom(i11));
            layerDrawable2.setLayerInsetStart(i11, layerDrawable.getLayerInsetStart(i11));
            layerDrawable2.setLayerInsetEnd(i11, layerDrawable.getLayerInsetEnd(i11));
        }
    }

    l(ProgressBar progressBar) {
        this.f2435a = progressBar;
    }

    private Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    private Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i11 = 0; i11 < numberOfFrames; i11++) {
            Drawable drawableD = d(animationDrawable.getFrame(i11), true);
            drawableD.setLevel(Constants.MAXIMUM_UPLOAD_PARTS);
            animationDrawable2.addFrame(drawableD, animationDrawable.getDuration(i11));
        }
        animationDrawable2.setLevel(Constants.MAXIMUM_UPLOAD_PARTS);
        return animationDrawable2;
    }

    Bitmap b() {
        return this.f2436b;
    }

    void c(AttributeSet attributeSet, int i11) {
        g0 g0VarV = g0.v(this.f2435a.getContext(), attributeSet, f2434c, i11, 0);
        Drawable drawableH = g0VarV.h(0);
        if (drawableH != null) {
            this.f2435a.setIndeterminateDrawable(e(drawableH));
        }
        Drawable drawableH2 = g0VarV.h(1);
        if (drawableH2 != null) {
            this.f2435a.setProgressDrawable(d(drawableH2, false));
        }
        g0VarV.x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    Drawable d(Drawable drawable, boolean z11) {
        if (drawable instanceof p4.b) {
            p4.b bVar = (p4.b) drawable;
            Drawable drawableA = bVar.a();
            if (drawableA != null) {
                bVar.b(d(drawableA, z11));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    int id2 = layerDrawable.getId(i11);
                    drawableArr[i11] = d(layerDrawable.getDrawable(i11), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i12 = 0; i12 < numberOfLayers; i12++) {
                    layerDrawable2.setId(i12, layerDrawable.getId(i12));
                    a.a(layerDrawable, layerDrawable2, i12);
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f2436b == null) {
                    this.f2436b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z11 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
