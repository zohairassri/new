package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f2403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s5.f f2404b;

    i(TextView textView) {
        this.f2403a = textView;
        this.f2404b = new s5.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f2404b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f2404b.b();
    }

    void c(AttributeSet attributeSet, int i11) {
        TypedArray typedArrayObtainStyledAttributes = this.f2403a.getContext().obtainStyledAttributes(attributeSet, h.j.AppCompatTextView, i11, 0);
        try {
            int i12 = h.j.AppCompatTextView_emojiCompatEnabled;
            boolean z11 = typedArrayObtainStyledAttributes.hasValue(i12) ? typedArrayObtainStyledAttributes.getBoolean(i12, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z11);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    void d(boolean z11) {
        this.f2404b.c(z11);
    }

    void e(boolean z11) {
        this.f2404b.d(z11);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f2404b.e(transformationMethod);
    }
}
