package io.agora.base.internal.video;

import android.content.Context;
import android.graphics.ColorSpace;
import android.view.Display;
import android.view.WindowManager;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
class VideoRenderUtils {
    private static final String TAG = "VideoRenderUtils";

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class ColorSpaceNamed {
        public static final int BT2020 = 5;
        public static final int BT709 = 4;
        public static final int DCI_P3 = 6;
        public static final int DISPLAY_P3 = 7;
        public static final int SRGB = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class HDRType {
        public static final int HDR_TYPE_DOLBY_VISION = 1;
        public static final int HDR_TYPE_HDR10 = 2;
        public static final int HDR_TYPE_HDR10_PLUS = 4;
        public static final int HDR_TYPE_HLG = 3;
    }

    VideoRenderUtils() {
    }

    public static float getDesiredMaxAverageLuminance() {
        WindowManager windowManager;
        Display defaultDisplay;
        Display.HdrCapabilities hdrCapabilities;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null || (hdrCapabilities = defaultDisplay.getHdrCapabilities()) == null) {
            return -1.0f;
        }
        float desiredMaxAverageLuminance = hdrCapabilities.getDesiredMaxAverageLuminance();
        Logging.i(TAG, "hdrcap:average luma:" + desiredMaxAverageLuminance);
        return desiredMaxAverageLuminance;
    }

    public static float getDesiredMaxLuminance() {
        WindowManager windowManager;
        Display defaultDisplay;
        Display.HdrCapabilities hdrCapabilities;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null || (hdrCapabilities = defaultDisplay.getHdrCapabilities()) == null) {
            return -1.0f;
        }
        float desiredMaxLuminance = hdrCapabilities.getDesiredMaxLuminance();
        Logging.i(TAG, "hdrcap:max luma:" + desiredMaxLuminance);
        return desiredMaxLuminance;
    }

    public static float getDesiredMinLuminance() {
        WindowManager windowManager;
        Display defaultDisplay;
        Display.HdrCapabilities hdrCapabilities;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null || (hdrCapabilities = defaultDisplay.getHdrCapabilities()) == null) {
            return -1.0f;
        }
        float desiredMinLuminance = hdrCapabilities.getDesiredMinLuminance();
        Logging.i(TAG, "hdrcap:min luma:" + desiredMinLuminance);
        return desiredMinLuminance;
    }

    @CalledByNative
    static int getPreferredWideGamutColorSpaceId() {
        WindowManager windowManager;
        Display defaultDisplay;
        ColorSpace preferredWideGamutColorSpace;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null || (preferredWideGamutColorSpace = defaultDisplay.getPreferredWideGamutColorSpace()) == null) {
            return -1;
        }
        int id2 = preferredWideGamutColorSpace.getId();
        Logging.i(TAG, "hdrcap:color space id:" + id2);
        return id2;
    }

    @CalledByNative
    static boolean isSupportedHDRByType(int i11) {
        Display defaultDisplay;
        Display.HdrCapabilities hdrCapabilities;
        Display defaultDisplay2;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return false;
        }
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        if (windowManager != null && (defaultDisplay2 = windowManager.getDefaultDisplay()) != null && !defaultDisplay2.isHdr()) {
            Logging.i(TAG, "hdrcap:ishdr:false");
            return false;
        }
        WindowManager windowManager2 = (WindowManager) applicationContext.getSystemService("window");
        if (windowManager2 != null && (defaultDisplay = windowManager2.getDefaultDisplay()) != null && (hdrCapabilities = defaultDisplay.getHdrCapabilities()) != null) {
            for (int i12 = 0; i12 < hdrCapabilities.getSupportedHdrTypes().length; i12++) {
                Logging.i(TAG, "hdrcap:" + hdrCapabilities.getSupportedHdrTypes()[i12]);
                if (hdrCapabilities.getSupportedHdrTypes()[i12] == i11) {
                    Logging.i(TAG, "hdrcap: got:" + hdrCapabilities.getSupportedHdrTypes()[i12]);
                    return true;
                }
            }
        }
        return false;
    }

    @CalledByNative
    static boolean isWideColorGamut() {
        WindowManager windowManager;
        Display defaultDisplay;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return false;
        }
        boolean zIsWideColorGamut = defaultDisplay.isWideColorGamut();
        Logging.i(TAG, "hdrcap:is wide:" + zIsWideColorGamut);
        return zIsWideColorGamut;
    }
}
