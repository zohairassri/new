package io.agora.base.internal.video;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
class BaseBitrateAdjuster implements BitrateAdjuster {
    protected int targetBitrateBps = 0;
    protected int targetFps = 0;

    BaseBitrateAdjuster() {
    }

    @Override // io.agora.base.internal.video.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    @Override // io.agora.base.internal.video.BitrateAdjuster
    public int getCodecConfigFramerate() {
        return this.targetFps;
    }

    @Override // io.agora.base.internal.video.BitrateAdjuster
    public void setTargets(int i11, int i12) {
        this.targetBitrateBps = i11;
        this.targetFps = i12;
    }

    @Override // io.agora.base.internal.video.BitrateAdjuster
    public void reportEncodedFrame(int i11) {
    }
}
