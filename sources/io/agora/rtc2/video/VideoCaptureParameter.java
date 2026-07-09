package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
class VideoCaptureParameter {
    boolean autoWhiteBalance;
    int camera1FocusMode;
    boolean camera1FpsRange;
    int camera2FocusMode;
    int cameraTimeout;
    boolean captureToTexture;
    int customMaxFps;
    int customMinFps;
    boolean customStrictMode;
    boolean enableRefocus;
    boolean enableTargetFps;
    boolean extraSurface;
    boolean faceFocusing;
    int focalLengthType;
    int hardwareLevelSelected;
    int lowCameraSelected;
    int lowFpsLimit;
    int noiseReduce;
    int physicalId;
    int pqFirstCaptureMode;
    int pqFirstDiff;
    int templateType;

    @CalledByNative
    public VideoCaptureParameter(boolean z11, int i11, int i12, int i13, int i14, boolean z12, boolean z13, int i15, int i16, boolean z14, boolean z15, int i17, int i18, boolean z16, int i19, int i21, int i22, int i23, int i24, boolean z17, boolean z18, int i25) {
        this.captureToTexture = z11;
        this.lowCameraSelected = i11;
        this.hardwareLevelSelected = i12;
        this.templateType = i13;
        this.noiseReduce = i14;
        this.faceFocusing = z12;
        this.extraSurface = z13;
        this.camera1FocusMode = i15;
        this.camera2FocusMode = i16;
        this.autoWhiteBalance = z14;
        this.camera1FpsRange = z15;
        this.focalLengthType = i17;
        this.physicalId = i18;
        this.enableRefocus = z16;
        this.pqFirstCaptureMode = i19;
        this.pqFirstDiff = i21;
        this.cameraTimeout = i22;
        this.customMinFps = i23;
        this.customMaxFps = i24;
        this.enableTargetFps = z17;
        this.customStrictMode = z18;
        this.lowFpsLimit = i25;
    }

    public int getCamera1FocusMode() {
        return this.camera1FocusMode;
    }

    public int getCamera2FocusMode() {
        return this.camera2FocusMode;
    }

    public int getCameraTimeout() {
        return this.cameraTimeout;
    }

    public int getCustomMaxFps() {
        return this.customMaxFps;
    }

    public int getCustomMinFps() {
        return this.customMinFps;
    }

    public int getFocalLengthType() {
        return this.focalLengthType;
    }

    public int getHardwareLevelSelected() {
        return this.hardwareLevelSelected;
    }

    public int getLowCameraSelected() {
        return this.lowCameraSelected;
    }

    public int getLowFpsLimit() {
        return this.lowFpsLimit;
    }

    public int getNoiseReduce() {
        return this.noiseReduce;
    }

    public int getPhysicalId() {
        return this.physicalId;
    }

    public int getPqFirstCaptureMode() {
        return this.pqFirstCaptureMode;
    }

    public int getPqFirstDiff() {
        return this.pqFirstDiff;
    }

    public int getTemplateType() {
        return this.templateType;
    }

    public boolean isAutoWhiteBalance() {
        return this.autoWhiteBalance;
    }

    public boolean isCamera1FpsRange() {
        return this.camera1FpsRange;
    }

    public boolean isCaptureToTexture() {
        return this.captureToTexture;
    }

    public boolean isCustomStrictMode() {
        return this.customStrictMode;
    }

    public boolean isEnableRefocus() {
        return this.enableRefocus;
    }

    public boolean isEnableTargetFps() {
        return this.enableTargetFps;
    }

    public boolean isExtraSurface() {
        return this.extraSurface;
    }

    public boolean isFaceFocusing() {
        return this.faceFocusing;
    }

    public void setAutoWhiteBalance(boolean z11) {
        this.autoWhiteBalance = z11;
    }

    public void setCamera1FocusMode(int i11) {
        this.camera1FocusMode = i11;
    }

    public void setCamera1FpsRange(boolean z11) {
        this.camera1FpsRange = z11;
    }

    public void setCamera2FocusMode(int i11) {
        this.camera2FocusMode = i11;
    }

    public void setCameraTimeout(int i11) {
        this.cameraTimeout = i11;
    }

    public void setCaptureToTexture(boolean z11) {
        this.captureToTexture = z11;
    }

    public void setCustomMaxFps(int i11) {
        this.customMaxFps = i11;
    }

    public void setCustomMinFps(int i11) {
        this.customMinFps = i11;
    }

    public void setCustomStrictMode(boolean z11) {
        this.customStrictMode = z11;
    }

    public void setEnableRefocus(boolean z11) {
        this.enableRefocus = z11;
    }

    public void setEnableTargetFps(boolean z11) {
        this.enableTargetFps = z11;
    }

    public void setExtraSurface(boolean z11) {
        this.extraSurface = z11;
    }

    public void setFaceFocusing(boolean z11) {
        this.faceFocusing = z11;
    }

    public void setFocalLengthType(int i11) {
        this.focalLengthType = i11;
    }

    public void setHardwareLevelSelected(int i11) {
        this.hardwareLevelSelected = i11;
    }

    public void setLowCameraSelected(int i11) {
        this.lowCameraSelected = i11;
    }

    public void setLowFpsLimit(int i11) {
        this.lowFpsLimit = i11;
    }

    public void setNoiseReduce(int i11) {
        this.noiseReduce = i11;
    }

    public void setPhysicalId(int i11) {
        this.physicalId = i11;
    }

    public void setPqFirstCaptureMode(int i11) {
        this.pqFirstCaptureMode = i11;
    }

    public void setPqFirstDiff(int i11) {
        this.pqFirstDiff = i11;
    }

    public void setTemplateType(int i11) {
        this.templateType = i11;
    }
}
