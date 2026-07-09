package s5;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import w4.i;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f125561a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f125562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f125563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f125564c = true;

        a(TextView textView) {
            this.f125562a = textView;
            this.f125563b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f125563b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f125563b;
            return inputFilterArr2;
        }

        private SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i11 = 0; i11 < inputFilterArr.length; i11++) {
                InputFilter inputFilter = inputFilterArr[i11];
                if (inputFilter instanceof d) {
                    sparseArray.put(i11, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (sparseArrayG.indexOfKey(i12) < 0) {
                    inputFilterArr2[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f125562a.setFilters(a(this.f125562a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // s5.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f125564c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // s5.f.b
        public boolean b() {
            return this.f125564c;
        }

        @Override // s5.f.b
        void c(boolean z11) {
            if (z11) {
                l();
            }
        }

        @Override // s5.f.b
        void d(boolean z11) {
            this.f125564c = z11;
            l();
            k();
        }

        @Override // s5.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f125564c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z11) {
            this.f125564c = z11;
        }

        void l() {
            this.f125562a.setTransformationMethod(e(this.f125562a.getTransformationMethod()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {
        b() {
        }

        abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        abstract void c(boolean z11);

        abstract void d(boolean z11);

        abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f125565a;

        c(TextView textView) {
            this.f125565a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.e.k();
        }

        @Override // s5.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f125565a.a(inputFilterArr);
        }

        @Override // s5.f.b
        public boolean b() {
            return this.f125565a.b();
        }

        @Override // s5.f.b
        void c(boolean z11) {
            if (f()) {
                return;
            }
            this.f125565a.c(z11);
        }

        @Override // s5.f.b
        void d(boolean z11) {
            if (f()) {
                this.f125565a.i(z11);
            } else {
                this.f125565a.d(z11);
            }
        }

        @Override // s5.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f125565a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z11) {
        i.h(textView, "textView cannot be null");
        if (z11) {
            this.f125561a = new a(textView);
        } else {
            this.f125561a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f125561a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f125561a.b();
    }

    public void c(boolean z11) {
        this.f125561a.c(z11);
    }

    public void d(boolean z11) {
        this.f125561a.d(z11);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f125561a.e(transformationMethod);
    }
}
