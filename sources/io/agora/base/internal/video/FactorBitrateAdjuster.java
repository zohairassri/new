package io.agora.base.internal.video;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
class FactorBitrateAdjuster extends BaseBitrateAdjuster {
    public static final int FACTOR_BASE = 1000;
    public static final int FACTOR_LEVEL1 = 950;
    private int factorLevel;

    public FactorBitrateAdjuster(int i11) {
        this.factorLevel = FACTOR_BASE;
        if (i11 == 950) {
            this.factorLevel = FACTOR_LEVEL1;
        }
    }

    private double getBitrateAdjustmentScale() {
        return ((double) this.factorLevel) / 1000.0d;
    }

    @Override // io.agora.base.internal.video.BaseBitrateAdjuster, io.agora.base.internal.video.BitrateAdjuster
    public void setTargets(int i11, int i12) {
        super.setTargets(i11, i12);
        this.targetBitrateBps = (int) (((double) this.targetBitrateBps) * getBitrateAdjustmentScale());
    }
}
