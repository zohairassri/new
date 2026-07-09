package io.agora.base.internal.video;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
class FramerateFactorBitrateAdjuster extends FactorBitrateAdjuster {
    private static final int INITIAL_FPS = 30;

    public FramerateFactorBitrateAdjuster(int i11) {
        super(i11);
    }

    @Override // io.agora.base.internal.video.BaseBitrateAdjuster, io.agora.base.internal.video.BitrateAdjuster
    public int getCodecConfigFramerate() {
        return 30;
    }

    @Override // io.agora.base.internal.video.FactorBitrateAdjuster, io.agora.base.internal.video.BaseBitrateAdjuster, io.agora.base.internal.video.BitrateAdjuster
    public void setTargets(int i11, int i12) {
        if (this.targetFps == 0) {
            i12 = 30;
        }
        super.setTargets((i11 * 30) / i12, i12);
    }
}
