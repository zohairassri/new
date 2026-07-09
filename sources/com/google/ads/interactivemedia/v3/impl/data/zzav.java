package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzav extends zzcj {
    private final long currentTime;
    private final long duration;
    private final String timeUnit;

    zzav(long j11, long j12, String str) {
        this.currentTime = j11;
        this.duration = j12;
        if (str == null) {
            throw new NullPointerException("Null timeUnit");
        }
        this.timeUnit = str;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcj
    public long currentTime() {
        return this.currentTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcj
    public long duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcj) {
            zzcj zzcjVar = (zzcj) obj;
            if (this.currentTime == zzcjVar.currentTime() && this.duration == zzcjVar.duration() && this.timeUnit.equals(zzcjVar.timeUnit())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.duration;
        long j12 = this.currentTime;
        int i11 = (int) (j11 ^ (j11 >>> 32));
        return this.timeUnit.hashCode() ^ ((i11 ^ ((((int) (j12 ^ (j12 >>> 32))) ^ 1000003) * 1000003)) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcj
    public String timeUnit() {
        return this.timeUnit;
    }

    public String toString() {
        return "TimeUpdateData{currentTime=" + this.currentTime + ", duration=" + this.duration + ", timeUnit=" + this.timeUnit + "}";
    }
}
