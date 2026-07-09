package com.google.ads.interactivemedia.v3.impl;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class AutoValue_StreamVideoDisplay_TimedMetadataWithKeys extends zzca {
    private final String TXXX;

    AutoValue_StreamVideoDisplay_TimedMetadataWithKeys(String str) {
        if (str == null) {
            throw new NullPointerException("Null TXXX");
        }
        this.TXXX = str;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzca
    String TXXX() {
        return this.TXXX;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzca) {
            return this.TXXX.equals(((zzca) obj).TXXX());
        }
        return false;
    }

    public int hashCode() {
        return this.TXXX.hashCode() ^ 1000003;
    }

    public String toString() {
        return "TimedMetadataWithKeys{TXXX=" + this.TXXX + "}";
    }
}
