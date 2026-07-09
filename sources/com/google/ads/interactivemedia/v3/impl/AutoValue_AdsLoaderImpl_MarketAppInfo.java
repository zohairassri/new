package com.google.ads.interactivemedia.v3.impl;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class AutoValue_AdsLoaderImpl_MarketAppInfo extends zzw {
    private final int appVersion;
    private final String packageName;

    AutoValue_AdsLoaderImpl_MarketAppInfo(int i11, String str) {
        this.appVersion = i11;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.packageName = str;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzw
    public int appVersion() {
        return this.appVersion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzwVar = (zzw) obj;
            if (this.appVersion == zzwVar.appVersion() && this.packageName.equals(zzwVar.packageName())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.appVersion;
        return this.packageName.hashCode() ^ ((i11 ^ 1000003) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzw
    public String packageName() {
        return this.packageName;
    }

    public String toString() {
        return "MarketAppInfo{appVersion=" + this.appVersion + ", packageName=" + this.packageName + "}";
    }
}
