package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzac extends zzbn {
    private final String adsIdentityToken;
    private final String appSetId;
    private final int appSetIdScope;
    private final String deviceId;
    private final String idType;
    private final boolean isLimitedAdTracking;

    zzac(String str, String str2, boolean z11, String str3, int i11, String str4) {
        this.deviceId = str;
        if (str2 == null) {
            throw new NullPointerException("Null idType");
        }
        this.idType = str2;
        this.isLimitedAdTracking = z11;
        if (str3 == null) {
            throw new NullPointerException("Null appSetId");
        }
        this.appSetId = str3;
        this.appSetIdScope = i11;
        if (str4 == null) {
            throw new NullPointerException("Null adsIdentityToken");
        }
        this.adsIdentityToken = str4;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbn
    public String adsIdentityToken() {
        return this.adsIdentityToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbn
    public String appSetId() {
        return this.appSetId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbn
    public int appSetIdScope() {
        return this.appSetIdScope;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbn
    public String deviceId() {
        return this.deviceId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbn) {
            zzbn zzbnVar = (zzbn) obj;
            String str = this.deviceId;
            if (str != null ? str.equals(zzbnVar.deviceId()) : zzbnVar.deviceId() == null) {
                if (this.idType.equals(zzbnVar.idType()) && this.isLimitedAdTracking == zzbnVar.isLimitedAdTracking() && this.appSetId.equals(zzbnVar.appSetId()) && this.appSetIdScope == zzbnVar.appSetIdScope() && this.adsIdentityToken.equals(zzbnVar.adsIdentityToken())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.deviceId;
        return this.adsIdentityToken.hashCode() ^ (((((((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.idType.hashCode()) * 1000003) ^ (true != this.isLimitedAdTracking ? 1237 : 1231)) * 1000003) ^ this.appSetId.hashCode()) * 1000003) ^ this.appSetIdScope) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbn
    public String idType() {
        return this.idType;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbn
    public boolean isLimitedAdTracking() {
        return this.isLimitedAdTracking;
    }

    public String toString() {
        return "IdentifierInfo{deviceId=" + this.deviceId + ", idType=" + this.idType + ", isLimitedAdTracking=" + this.isLimitedAdTracking + ", appSetId=" + this.appSetId + ", appSetIdScope=" + this.appSetIdScope + ", adsIdentityToken=" + this.adsIdentityToken + "}";
    }
}
