package s5;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import w4.i;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f125545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f125546b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f125547c = 0;

    /* JADX INFO: renamed from: s5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class C1691a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EditText f125548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f125549b;

        C1691a(EditText editText, boolean z11) {
            this.f125548a = editText;
            g gVar = new g(editText, z11);
            this.f125549b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(s5.b.getInstance());
        }

        @Override // s5.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // s5.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f125548a, inputConnection, editorInfo);
        }

        @Override // s5.a.b
        void c(boolean z11) {
            this.f125549b.c(z11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {
        b() {
        }

        abstract KeyListener a(KeyListener keyListener);

        abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        abstract void c(boolean z11);
    }

    public a(EditText editText, boolean z11) {
        i.h(editText, "editText cannot be null");
        this.f125545a = new C1691a(editText, z11);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f125545a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f125545a.b(inputConnection, editorInfo);
    }

    public void c(boolean z11) {
        this.f125545a.c(z11);
    }
}
