package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzan extends zzce {
    private final Integer height;
    private final Integer width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Integer f19994x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Integer f19995y;

    zzan(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null) {
            throw new NullPointerException("Null x");
        }
        this.f19994x = num;
        if (num2 == null) {
            throw new NullPointerException("Null y");
        }
        this.f19995y = num2;
        if (num3 == null) {
            throw new NullPointerException("Null width");
        }
        this.width = num3;
        if (num4 == null) {
            throw new NullPointerException("Null height");
        }
        this.height = num4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzce) {
            zzce zzceVar = (zzce) obj;
            if (this.f19994x.equals(zzceVar.x()) && this.f19995y.equals(zzceVar.y()) && this.width.equals(zzceVar.width()) && this.height.equals(zzceVar.height())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((this.f19994x.hashCode() ^ 1000003) * 1000003) ^ this.f19995y.hashCode()) * 1000003) ^ this.width.hashCode();
        return this.height.hashCode() ^ (iHashCode * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzce
    public Integer height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzce
    public Integer width() {
        return this.width;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzce
    public Integer x() {
        return this.f19994x;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzce
    public Integer y() {
        return this.f19995y;
    }
}
