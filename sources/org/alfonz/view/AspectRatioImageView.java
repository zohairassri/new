package org.alfonz.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class AspectRatioImageView extends ImageView {
    public AspectRatioImageView(@NonNull Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int intrinsicHeight = 0;
        try {
            if (getDrawable() != null) {
                intrinsicHeight = (getDrawable().getIntrinsicHeight() * size) / getDrawable().getIntrinsicWidth();
            }
        } catch (ArithmeticException e11) {
            e11.printStackTrace();
        }
        setMeasuredDimension(size, intrinsicHeight);
    }

    public AspectRatioImageView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AspectRatioImageView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
