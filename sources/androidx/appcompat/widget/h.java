package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f2400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s5.a f2401b;

    h(EditText editText) {
        this.f2400a = editText;
        this.f2401b = new s5.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f2401b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i11) {
        TypedArray typedArrayObtainStyledAttributes = this.f2400a.getContext().obtainStyledAttributes(attributeSet, h.j.AppCompatTextView, i11, 0);
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

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f2401b.b(inputConnection, editorInfo);
    }

    void e(boolean z11) {
        this.f2401b.c(z11);
    }
}
