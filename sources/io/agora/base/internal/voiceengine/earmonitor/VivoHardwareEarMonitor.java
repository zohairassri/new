package io.agora.base.internal.voiceengine.earmonitor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class VivoHardwareEarMonitor extends GsaiHardwareEarMonitor {
    private static final String TAG = "VivoHardwareEarMonitor";

    public VivoHardwareEarMonitor(HardwareEarMonitorListener hardwareEarMonitorListener) {
        super(hardwareEarMonitorListener, TAG);
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.GsaiHardwareEarMonitor
    protected int getMixerSoundType() {
        return 10;
    }
}
