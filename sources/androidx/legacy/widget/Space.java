package androidx.legacy.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class Space extends View {
    @Deprecated
    public Space(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    private static int a(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i11 : size : Math.min(i11, size);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(a(getSuggestedMinimumWidth(), i11), a(getSuggestedMinimumHeight(), i12));
    }

    @Deprecated
    public Space(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public Space(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }
}
