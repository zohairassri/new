package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzap extends zzcg {
    private final int major;
    private final int micro;
    private final int minor;

    zzap(int i11, int i12, int i13) {
        this.major = i11;
        this.minor = i12;
        this.micro = i13;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcg) {
            zzcg zzcgVar = (zzcg) obj;
            if (this.major == zzcgVar.major() && this.minor == zzcgVar.minor() && this.micro == zzcgVar.micro()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.micro ^ ((((this.major ^ 1000003) * 1000003) ^ this.minor) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcg
    public int major() {
        return this.major;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcg
    public int micro() {
        return this.micro;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcg
    public int minor() {
        return this.minor;
    }

    public String toString() {
        return "SecureSignalsVersionData{major=" + this.major + ", minor=" + this.minor + ", micro=" + this.micro + "}";
    }
}
