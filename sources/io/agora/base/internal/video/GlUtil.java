package io.agora.base.internal.video;

import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class GlUtil {
    public static final float[] IDENTITY_MATRIX;

    @NonNull
    private static GLErrorChecker sGLErrorChecker;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class DefaultGLErrorChecker implements GLErrorChecker {
        private DefaultGLErrorChecker() {
        }

        @Override // io.agora.base.internal.video.GlUtil.GLErrorChecker
        public void check(String str) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            throw new RuntimeException(str + ": GLES20 error: " + iGlGetError);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface GLErrorChecker {
        void check(String str);
    }

    static {
        float[] fArr = new float[16];
        IDENTITY_MATRIX = fArr;
        Matrix.setIdentityM(fArr, 0);
        sGLErrorChecker = new DefaultGLErrorChecker();
    }

    private GlUtil() {
    }

    public static void checkNoGLES2Error(String str) {
        sGLErrorChecker.check(str);
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static int generateTexture(int i11) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i12 = iArr[0];
        GLES20.glBindTexture(i11, i12);
        GLES20.glTexParameterf(i11, 10241, 9729.0f);
        GLES20.glTexParameterf(i11, 10240, 9729.0f);
        GLES20.glTexParameterf(i11, 10242, 33071.0f);
        GLES20.glTexParameterf(i11, 10243, 33071.0f);
        checkNoGLES2Error("generateTexture");
        return i12;
    }

    static void injectGLErrorChecker(GLErrorChecker gLErrorChecker) {
        if (gLErrorChecker != null) {
            sGLErrorChecker = gLErrorChecker;
        } else {
            sGLErrorChecker = new DefaultGLErrorChecker();
        }
    }
}
