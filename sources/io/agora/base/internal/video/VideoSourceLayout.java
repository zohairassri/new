package io.agora.base.internal.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class VideoSourceLayout {
    private int cropped_height;
    private int cropped_width;
    private int cropped_x;
    private int cropped_y;
    private int dest_height;
    private int dest_width;
    private boolean mirror_x;
    private boolean mirror_y;
    private int position_x;
    private int position_y;
    private int rotation;
    private String source_id;
    private VideoSourceType videoSourceType;
    private int z_order;

    enum VideoSourceType {
        UNKNOWN,
        STREAM,
        PIC,
        GIF,
        CANVAS
    }

    @CalledByNative
    public VideoSourceLayout(String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z11, boolean z12, int i21, int i22) {
        this.videoSourceType = VideoSourceType.UNKNOWN;
        this.source_id = str;
        this.position_x = i11;
        this.position_y = i12;
        this.cropped_x = i13;
        this.cropped_y = i14;
        this.cropped_width = i15;
        this.cropped_height = i16;
        this.dest_width = i17;
        this.dest_height = i18;
        this.mirror_x = z11;
        this.mirror_y = z12;
        this.rotation = i21;
        this.z_order = i19;
        this.videoSourceType = VideoSourceType.values()[i22];
    }

    public int getCroppedHeight() {
        return this.cropped_height;
    }

    public int getCroppedWidth() {
        return this.cropped_width;
    }

    public int getCroppedX() {
        return this.cropped_x;
    }

    public int getCroppedY() {
        return this.cropped_y;
    }

    public int getDestHeight() {
        return this.dest_height;
    }

    public int getDestWidth() {
        return this.dest_width;
    }

    public int getPositionX() {
        return this.position_x;
    }

    public int getPositionY() {
        return this.position_y;
    }

    public int getRotation() {
        return this.rotation;
    }

    public String getSourceId() {
        return this.source_id;
    }

    public VideoSourceType getVideoSourceType() {
        return this.videoSourceType;
    }

    public int getZorder() {
        return this.z_order;
    }

    public boolean isMirrorX() {
        return this.mirror_x;
    }

    public boolean isMirrorY() {
        return this.mirror_y;
    }
}
