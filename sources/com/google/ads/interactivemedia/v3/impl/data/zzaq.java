package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzaq extends zzch {
    private final Integer height;
    private final Integer width;

    zzaq(Integer num, Integer num2) {
        if (num == null) {
            throw new NullPointerException("Null width");
        }
        this.width = num;
        if (num2 == null) {
            throw new NullPointerException("Null height");
        }
        this.height = num2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzch) {
            zzch zzchVar = (zzch) obj;
            if (this.width.equals(zzchVar.width()) && this.height.equals(zzchVar.height())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.width.hashCode() ^ 1000003;
        return this.height.hashCode() ^ (iHashCode * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzch
    public Integer height() {
        return this.height;
    }

    public String toString() {
        return "SizeData{width=" + this.width + ", height=" + this.height + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzch
    public Integer width() {
        return this.width;
    }
}
