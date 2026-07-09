package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzq extends zzbb {
    private final int height;
    private final int left;
    private final int top;
    private final int width;

    private zzq(int i11, int i12, int i13, int i14) {
        this.left = i11;
        this.top = i12;
        this.height = i13;
        this.width = i14;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbb) {
            zzbb zzbbVar = (zzbb) obj;
            if (this.left == zzbbVar.left() && this.top == zzbbVar.top() && this.height == zzbbVar.height() && this.width == zzbbVar.width()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.width ^ ((((((this.left ^ 1000003) * 1000003) ^ this.top) * 1000003) ^ this.height) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbb
    public int height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbb
    public int left() {
        return this.left;
    }

    public String toString() {
        return "BoundingRectData{left=" + this.left + ", top=" + this.top + ", height=" + this.height + ", width=" + this.width + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbb
    public int top() {
        return this.top;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbb
    public int width() {
        return this.width;
    }
}
