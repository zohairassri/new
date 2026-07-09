package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzaz extends zzcp {
    private final float volume;

    private zzaz(float f11) {
        this.volume = f11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zzcp) && Float.floatToIntBits(this.volume) == Float.floatToIntBits(((zzcp) obj).volume());
    }

    public int hashCode() {
        return Float.floatToIntBits(this.volume) ^ 1000003;
    }

    public String toString() {
        return "VolumeUpdateData{volume=" + this.volume + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcp
    public float volume() {
        return this.volume;
    }
}
