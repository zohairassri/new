package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzag extends zzbz {
    private final String content;
    private final String contentType;
    private final int errorCode;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f19993id;

    zzag(String str, String str2, String str3, int i11) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f19993id = str;
        if (str2 == null) {
            throw new NullPointerException("Null content");
        }
        this.content = str2;
        if (str3 == null) {
            throw new NullPointerException("Null contentType");
        }
        this.contentType = str3;
        this.errorCode = i11;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbz
    public String content() {
        return this.content;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbz
    public String contentType() {
        return this.contentType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbz) {
            zzbz zzbzVar = (zzbz) obj;
            if (this.f19993id.equals(zzbzVar.id()) && this.content.equals(zzbzVar.content()) && this.contentType.equals(zzbzVar.contentType()) && this.errorCode == zzbzVar.errorCode()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbz
    public int errorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        return this.errorCode ^ ((((((this.f19993id.hashCode() ^ 1000003) * 1000003) ^ this.content.hashCode()) * 1000003) ^ this.contentType.hashCode()) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbz
    public String id() {
        return this.f19993id;
    }

    public String toString() {
        return "NetworkResponseData{id=" + this.f19993id + ", content=" + this.content + ", contentType=" + this.contentType + ", errorCode=" + this.errorCode + "}";
    }
}
