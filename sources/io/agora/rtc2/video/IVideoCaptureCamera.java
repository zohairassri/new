package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface IVideoCaptureCamera extends IVideoCapture {
    @CalledByNative
    float getMaxZoom();

    @CalledByNative
    boolean isAutoFaceFocusSupported();

    @CalledByNative
    boolean isCameraExposureSupported();

    @CalledByNative
    boolean isExposureSupported();

    @CalledByNative
    boolean isFaceDetectSupported();

    @CalledByNative
    boolean isFocusSupported();

    @CalledByNative
    boolean isTorchSupported();

    @CalledByNative
    boolean isZoomSupported();

    boolean needFallback();

    @CalledByNative
    int setAntiBandingMode(int i11);

    @CalledByNative
    int setAutoFaceFocus(boolean z11);

    @CalledByNative
    void setCameraDropCount(int i11);

    @CalledByNative
    int setEdgeEnhanceMode(int i11);

    @CalledByNative
    int setExposure(float f11, float f12);

    @CalledByNative
    int setExposureCompensation(int i11);

    @CalledByNative
    int setFaceDetection(boolean z11);

    @CalledByNative
    int setFocus(float f11, float f12);

    @CalledByNative
    int setNoiseReductionMode(int i11);

    @CalledByNative
    void setPreviewInfo(Object obj, boolean z11, int i11);

    @CalledByNative
    int setTorchMode(boolean z11);

    @CalledByNative
    int setVideoEdgeMode(int i11);

    @CalledByNative
    int setVideoStabilityMode(int i11);

    @CalledByNative
    int setZoom(float f11);
}
