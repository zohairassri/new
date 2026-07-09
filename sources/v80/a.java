package v80;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f132608a = new a();

    private a() {
    }

    private final Drawable b(int i11) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, 3.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        Paint paint = shapeDrawable.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "shapeDrawable.paint");
        paint.setColor(i11);
        return shapeDrawable;
    }

    public final Drawable a(int i11, int i12) {
        return new RippleDrawable(ColorStateList.valueOf(i12), null, b(i11));
    }
}
