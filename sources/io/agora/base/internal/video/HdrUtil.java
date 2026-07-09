package io.agora.base.internal.video;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.hardware.display.DisplayManager;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.view.Display;
import io.agora.base.VideoFrame;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import java.nio.IntBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class HdrUtil {
    private static final String EGL_EXT_GL_COLORSPACE_DISPLAY_P3 = "EGL_EXT_gl_colorspace_display_p3";
    private static final String EGL_EXT_SURFACE_SMPTE2086_METADATA = "EGL_EXT_surface_SMPTE2086_metadata";
    private static final String EXTENSION_COLORSPACE_BT2020_PQ = "EGL_EXT_gl_colorspace_bt2020_pq";
    private static final int HDR_TRANSFORM_SDR = 1;
    private static final int SDR_TRANSFORM_HDR = 2;
    private static final String TAG = "HdrUtil";
    private static final boolean isScreenSupportHdrVision;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum LumaBitDepth {
        Invalid(0),
        LUMA8BIT(1),
        LUMA10BIT(2);

        private final int depth;

        LumaBitDepth(int i11) {
            this.depth = i11;
        }

        public int depth() {
            return this.depth;
        }
    }

    static {
        isScreenSupportHdrVision = isBt2020PqExtensionSupported() && isScreenSupportHdrVision();
    }

    public static boolean CheckIs10bitTexture(int i11, int i12, int i13, VideoFrame.TextureBuffer.Type type) {
        int[] iArr;
        int[] iArr2;
        int i14;
        boolean z11;
        boolean z12 = false;
        try {
            iArr = new int[1];
            GLES20.glGetIntegerv(36006, IntBuffer.wrap(iArr));
            iArr2 = new int[1];
            GLES20.glGenFramebuffers(1, iArr2, 0);
            i14 = iArr2[0];
            GLES20.glBindFramebuffer(36160, i14);
            int[] iArr3 = new int[1];
            GLES20.glGenRenderbuffers(1, iArr3, 0);
            int i15 = iArr3[0];
            GLES20.glBindRenderbuffer(36161, i15);
            GLES20.glRenderbufferStorage(36161, 33189, i12, i13);
            GLES20.glFramebufferTexture2D(36160, 36064, type == VideoFrame.TextureBuffer.Type.OES ? 36197 : 3553, i11, 0);
            GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, i15);
            z11 = GLES20.glCheckFramebufferStatus(36160) != 36053;
        } catch (Exception e11) {
            e = e11;
        }
        try {
            GLES20.glDeleteRenderbuffers(1, IntBuffer.wrap(iArr2));
            GLES20.glDeleteFramebuffers(1, IntBuffer.allocate(i14));
            GLES20.glBindFramebuffer(36160, iArr[0]);
            return z11;
        } catch (Exception e12) {
            e = e12;
            z12 = z11;
            Logging.e(TAG, e.toString());
            return z12;
        }
    }

    public static boolean is10BitLumaDepth(int i11) {
        return i11 == VideoFrame.ColorSpace.Transfer.SMPTEST2084.getTransfer() || i11 == VideoFrame.ColorSpace.Transfer.ARIB_STD_B67.getTransfer();
    }

    public static boolean isBt2020PqExtensionSupported() {
        boolean z11 = false;
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        if (strEglQueryString != null && strEglQueryString.contains(EGL_EXT_GL_COLORSPACE_DISPLAY_P3) && strEglQueryString.contains(EXTENSION_COLORSPACE_BT2020_PQ) && strEglQueryString.contains(EGL_EXT_SURFACE_SMPTE2086_METADATA)) {
            z11 = true;
        }
        Logging.i(TAG, "supportedBt2020PqExtension: " + z11);
        return z11;
    }

    public static boolean isDirectHdrVision(int i11) {
        return isScreenSupportHdrVision && is10BitLumaDepth(i11);
    }

    public static boolean isDisplayHdrVision(int i11) {
        return isNeedTransToHdrVision(i11) || isDirectHdrVision(i11);
    }

    public static boolean isHDRConfig(boolean z11, int i11) {
        return z11 ? (isDirectHdrVision(i11) && 1 != nativeHdrSdrTransform()) || isNeedTransToHdrVision(i11) : isDirectHdrVision(i11);
    }

    public static boolean isNeedHdrSdrTrans(int i11) {
        return isNeedTransToSdrVision(i11) || isNeedTransToHdrVision(i11);
    }

    public static boolean isNeedTransToHdrVision(int i11) {
        return isScreenSupportHdrVision && !is10BitLumaDepth(i11) && nativeHdrSdrTransform() == 2;
    }

    public static boolean isNeedTransToSdrVision(int i11) {
        if (is10BitLumaDepth(i11)) {
            return !isDisplayHdrVision(i11) || 1 == nativeHdrSdrTransform();
        }
        return false;
    }

    public static boolean isScreenSupportHdrVision() {
        Context applicationContext = ContextUtils.getApplicationContext();
        boolean z11 = true;
        if (applicationContext == null) {
            return true;
        }
        DisplayManager displayManager = (DisplayManager) applicationContext.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr()) {
            z11 = false;
        } else {
            for (int i11 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 1) {
                    break;
                }
            }
            z11 = false;
        }
        Logging.i(TAG, "supportedDolbyVision: " + z11);
        return z11;
    }

    public static boolean isSupportedEGL3() {
        ActivityManager activityManager;
        ConfigurationInfo deviceConfigurationInfo;
        Context applicationContext = ContextUtils.getApplicationContext();
        return applicationContext == null || (activityManager = (ActivityManager) applicationContext.getSystemService("activity")) == null || (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) == null || deviceConfigurationInfo.reqGlEsVersion >= 196608;
    }

    public static native byte[] nativeGetLut10Buffer(int i11, boolean z11);

    public static native int nativeHdrSdrTransform();
}
