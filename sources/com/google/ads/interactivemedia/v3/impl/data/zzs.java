package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzs extends zzbf {
    private final double end;
    private final boolean played;
    private final double start;

    zzs(double d11, double d12, boolean z11) {
        this.start = d11;
        this.end = d12;
        this.played = z11;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbf
    public double end() {
        return this.end;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbf) {
            zzbf zzbfVar = (zzbf) obj;
            if (Double.doubleToLongBits(this.start) == Double.doubleToLongBits(zzbfVar.start()) && Double.doubleToLongBits(this.end) == Double.doubleToLongBits(zzbfVar.end()) && this.played == zzbfVar.played()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (true != this.played ? 1237 : 1231) ^ ((((((int) ((Double.doubleToLongBits(this.start) >>> 32) ^ Double.doubleToLongBits(this.start))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.end) >>> 32) ^ Double.doubleToLongBits(this.end)))) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbf
    public boolean played() {
        return this.played;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbf
    public double start() {
        return this.start;
    }

    public String toString() {
        return "CuePointData{start=" + this.start + ", end=" + this.end + ", played=" + this.played + "}";
    }
}
