package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.preference.s;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"AppCompatCustomView"})
public class PreferenceImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11685b;

    public PreferenceImageView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f11685b;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f11684a;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i11);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i11 = View.MeasureSpec.makeMeasureSpec(maxWidth, IntCompanionObject.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i12);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i12);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i12 = View.MeasureSpec.makeMeasureSpec(maxHeight, IntCompanionObject.MIN_VALUE);
            }
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i11) {
        this.f11685b = i11;
        super.setMaxHeight(i11);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i11) {
        this.f11684a = i11;
        super.setMaxWidth(i11);
    }

    public PreferenceImageView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f11684a = Integer.MAX_VALUE;
        this.f11685b = Integer.MAX_VALUE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.PreferenceImageView, i11, 0);
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(s.PreferenceImageView_maxWidth, Integer.MAX_VALUE));
        setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(s.PreferenceImageView_maxHeight, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }
}
