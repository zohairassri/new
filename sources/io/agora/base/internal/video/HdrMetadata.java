package io.agora.base.internal.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class HdrMetadata {
    private int luma_bit_depth;
    private int max_content_light_level = 0;
    private int max_frame_average_light_level = 0;
    private int profile;

    @CalledByNative
    HdrMetadata(int i11, int i12) {
        this.profile = i11;
        this.luma_bit_depth = i12;
    }

    @CalledByNative
    public int getLuma_bit_depth() {
        return this.luma_bit_depth;
    }

    @CalledByNative
    public int getMax_content_light_level() {
        return this.max_content_light_level;
    }

    @CalledByNative
    public int getMax_frame_average_light_level() {
        return this.max_frame_average_light_level;
    }

    @CalledByNative
    public int getProfile() {
        return this.profile;
    }

    public void setLuma_bit_depth(int i11) {
        this.luma_bit_depth = i11;
    }

    public void setMax_content_light_level(int i11) {
        this.max_content_light_level = i11;
    }

    public void setMax_frame_average_light_level(int i11) {
        this.max_frame_average_light_level = i11;
    }

    public void setProfile(int i11) {
        this.profile = i11;
    }
}
