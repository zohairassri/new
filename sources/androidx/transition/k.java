package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Matrix f12978a = new a();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends Matrix {
        a() {
        }

        void a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public boolean postConcat(Matrix matrix) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f11, float f12, float f13) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f11, float f12, float f13, float f14) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f11, float f12, float f13, float f14) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postTranslate(float f11, float f12) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preConcat(Matrix matrix) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f11, float f12, float f13) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f11, float f12, float f13, float f14) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f11, float f12, float f13, float f14) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preTranslate(float f11, float f12) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void reset() {
            a();
        }

        @Override // android.graphics.Matrix
        public void set(Matrix matrix) {
            a();
        }

        @Override // android.graphics.Matrix
        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setPolyToPoly(float[] fArr, int i11, float[] fArr2, int i12, int i13) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f11, float f12, float f13) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f11, float f12, float f13, float f14) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f11, float f12, float f13, float f14) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f11, float f12, float f13, float f14) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setTranslate(float f11, float f12) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setValues(float[] fArr) {
            a();
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f11) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f11, float f12) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f11, float f12) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f11) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f11, float f12) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f11, float f12) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f11) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f11, float f12) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f11, float f12) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f11, float f12) {
            a();
        }
    }
}
