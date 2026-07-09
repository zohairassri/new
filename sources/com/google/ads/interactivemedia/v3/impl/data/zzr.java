package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzr extends zzbe {
    private final String clickThroughUrl;
    private final String size;
    private final String src;
    private final zzbd type;

    zzr(String str, String str2, String str3, zzbd zzbdVar) {
        if (str == null) {
            throw new NullPointerException("Null size");
        }
        this.size = str;
        if (str2 == null) {
            throw new NullPointerException("Null src");
        }
        this.src = str2;
        if (str3 == null) {
            throw new NullPointerException("Null clickThroughUrl");
        }
        this.clickThroughUrl = str3;
        if (zzbdVar == null) {
            throw new NullPointerException("Null type");
        }
        this.type = zzbdVar;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbe
    public String clickThroughUrl() {
        return this.clickThroughUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.size.equals(zzbeVar.size()) && this.src.equals(zzbeVar.src()) && this.clickThroughUrl.equals(zzbeVar.clickThroughUrl()) && this.type.equals(zzbeVar.type())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((this.size.hashCode() ^ 1000003) * 1000003) ^ this.src.hashCode()) * 1000003) ^ this.clickThroughUrl.hashCode();
        return this.type.hashCode() ^ (iHashCode * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbe
    public String size() {
        return this.size;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbe
    public String src() {
        return this.src;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbe
    public zzbd type() {
        return this.type;
    }
}
