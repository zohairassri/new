package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzaw extends zzcn {
    private final Integer downloadBandwidthKbps;
    private final boolean rendersUiNatively;

    zzaw(Integer num, boolean z11) {
        this.downloadBandwidthKbps = num;
        this.rendersUiNatively = z11;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcn
    public Integer downloadBandwidthKbps() {
        return this.downloadBandwidthKbps;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcn) {
            zzcn zzcnVar = (zzcn) obj;
            Integer num = this.downloadBandwidthKbps;
            if (num != null ? num.equals(zzcnVar.downloadBandwidthKbps()) : zzcnVar.downloadBandwidthKbps() == null) {
                if (this.rendersUiNatively == zzcnVar.rendersUiNatively()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.downloadBandwidthKbps;
        return (true != this.rendersUiNatively ? 1237 : 1231) ^ (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcn
    public boolean rendersUiNatively() {
        return this.rendersUiNatively;
    }

    public String toString() {
        return "VideoEnvironmentData{downloadBandwidthKbps=" + this.downloadBandwidthKbps + ", rendersUiNatively=" + this.rendersUiNatively + "}";
    }
}
