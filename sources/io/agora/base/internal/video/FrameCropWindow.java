package io.agora.base.internal.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class FrameCropWindow {
    public final int bottom_offset;
    public final int left_offset;
    public final int right_offset;
    public final int top_offset;

    @CalledByNative
    public FrameCropWindow(int i11, int i12, int i13, int i14) {
        this.left_offset = i11;
        this.right_offset = i12;
        this.top_offset = i13;
        this.bottom_offset = i14;
    }
}
