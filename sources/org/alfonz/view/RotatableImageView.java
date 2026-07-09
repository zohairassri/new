package org.alfonz.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ug0.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class RotatableImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f120670a;

    public RotatableImageView(Context context) {
        super(context);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.RotatableImageView);
        this.f120670a = typedArrayObtainStyledAttributes.getInteger(a.RotatableImageView_angle, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getAngle() {
        return this.f120670a;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.save();
        canvas.rotate(this.f120670a % 360, canvas.getWidth() / 2, canvas.getHeight() / 2);
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        int intrinsicWidth = getDrawable().getIntrinsicWidth();
        int intrinsicHeight = getDrawable().getIntrinsicHeight();
        double radians = Math.toRadians(this.f120670a);
        double d11 = intrinsicWidth;
        double d12 = intrinsicHeight;
        setMeasuredDimension((int) (Math.abs(Math.cos(radians) * d11) + Math.abs(Math.sin(radians) * d12)), (int) (Math.abs(d11 * Math.sin(radians)) + Math.abs(d12 * Math.cos(radians))));
    }

    public void setAngle(int i11) {
        this.f120670a = i11;
    }

    public RotatableImageView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public RotatableImageView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        a(context, attributeSet);
    }
}
