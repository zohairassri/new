package org.alfonz.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ug0.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class MaxWidthLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f120669a;

    public MaxWidthLinearLayout(@NonNull Context context) {
        super(context);
        this.f120669a = 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int i13 = this.f120669a;
        if (i13 > 0 && i13 < size) {
            i11 = View.MeasureSpec.makeMeasureSpec(this.f120669a, View.MeasureSpec.getMode(i11));
        }
        super.onMeasure(i11, i12);
    }

    public MaxWidthLinearLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.MaxWidthLinearLayout);
        this.f120669a = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.MaxWidthLinearLayout_maxWidth, Integer.MAX_VALUE);
        typedArrayObtainStyledAttributes.recycle();
    }
}
