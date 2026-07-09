package f2;

import android.graphics.Matrix;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Matrix f93355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Shader f93356b;

    private final Matrix b() {
        Matrix matrix = this.f93355a;
        if (matrix != null) {
            return matrix;
        }
        Matrix matrix2 = new Matrix();
        this.f93355a = matrix2;
        return matrix2;
    }

    public final Shader a() {
        return this.f93356b;
    }

    public final void c(Shader shader) {
        Matrix matrix = this.f93355a;
        if (matrix != null && shader != null) {
            shader.setLocalMatrix(matrix);
        }
        this.f93356b = shader;
    }

    public final void d(float[] fArr) {
        Matrix matrix;
        if (fArr == null) {
            matrix = null;
            this.f93355a = null;
        } else {
            Matrix matrixB = b();
            j.a(matrixB, fArr);
            matrix = matrixB;
        }
        Shader shader = this.f93356b;
        if (shader != null) {
            shader.setLocalMatrix(matrix);
        }
    }
}
