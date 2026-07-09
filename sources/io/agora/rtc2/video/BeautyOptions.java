package io.agora.rtc2.video;

/* JADX INFO: loaded from: classes7.dex */
public class BeautyOptions {
    public static final int LIGHTENING_CONTRAST_HIGH = 2;
    public static final int LIGHTENING_CONTRAST_LOW = 0;
    public static final int LIGHTENING_CONTRAST_NORMAL = 1;
    public int lighteningContrastLevel;
    public float lighteningLevel;
    public float rednessLevel;
    public float sharpnessLevel;
    public float smoothnessLevel;

    public BeautyOptions() {
        this.lighteningContrastLevel = 1;
        this.lighteningLevel = 0.6f;
        this.smoothnessLevel = 0.5f;
        this.rednessLevel = 0.1f;
        this.sharpnessLevel = 0.3f;
    }

    public BeautyOptions(int i11, float f11, float f12, float f13, float f14) {
        this.lighteningContrastLevel = i11;
        this.lighteningLevel = f11;
        this.smoothnessLevel = f12;
        this.rednessLevel = f13;
        this.sharpnessLevel = f14;
    }
}
