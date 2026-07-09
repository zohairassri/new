package io.agora.rtc2.video;

/* JADX INFO: loaded from: classes7.dex */
public class SegmentationProperty {
    public static final int SEG_MODEL_AI = 1;
    public static final int SEG_MODEL_GREEN = 2;
    public float greenCapacity;
    public int modelType;

    public SegmentationProperty() {
        this.modelType = 1;
        this.greenCapacity = 0.5f;
    }

    public SegmentationProperty(int i11, float f11) {
        this.modelType = i11;
        this.greenCapacity = f11;
    }
}
