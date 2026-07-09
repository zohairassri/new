package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzaf extends zzby {
    private final int connectionTimeoutMs;
    private final String content;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f19992id;
    private final int readTimeoutMs;
    private final zzbx requestType;
    private final String url;
    private final String userAgent;

    zzaf(zzbx zzbxVar, String str, String str2, String str3, String str4, int i11, int i12) {
        if (zzbxVar == null) {
            throw new NullPointerException("Null requestType");
        }
        this.requestType = zzbxVar;
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f19992id = str;
        if (str2 == null) {
            throw new NullPointerException("Null url");
        }
        this.url = str2;
        this.content = str3;
        if (str4 == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.userAgent = str4;
        this.connectionTimeoutMs = i11;
        this.readTimeoutMs = i12;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzby
    public int connectionTimeoutMs() {
        return this.connectionTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzby
    public String content() {
        return this.content;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzby) {
            zzby zzbyVar = (zzby) obj;
            if (this.requestType.equals(zzbyVar.requestType()) && this.f19992id.equals(zzbyVar.id()) && this.url.equals(zzbyVar.url()) && ((str = this.content) != null ? str.equals(zzbyVar.content()) : zzbyVar.content() == null) && this.userAgent.equals(zzbyVar.userAgent()) && this.connectionTimeoutMs == zzbyVar.connectionTimeoutMs() && this.readTimeoutMs == zzbyVar.readTimeoutMs()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((this.requestType.hashCode() ^ 1000003) * 1000003) ^ this.f19992id.hashCode()) * 1000003) ^ this.url.hashCode();
        String str = this.content;
        return this.readTimeoutMs ^ (((((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.userAgent.hashCode()) * 1000003) ^ this.connectionTimeoutMs) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzby
    public String id() {
        return this.f19992id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzby
    public int readTimeoutMs() {
        return this.readTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzby
    public zzbx requestType() {
        return this.requestType;
    }

    public String toString() {
        return "NetworkRequestData{requestType=" + String.valueOf(this.requestType) + ", id=" + this.f19992id + ", url=" + this.url + ", content=" + this.content + ", userAgent=" + this.userAgent + ", connectionTimeoutMs=" + this.connectionTimeoutMs + ", readTimeoutMs=" + this.readTimeoutMs + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzby
    public String url() {
        return this.url;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzby
    public String userAgent() {
        return this.userAgent;
    }
}
