package com.google.ads.interactivemedia.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
enum zzu {
    ERROR_CODE("errcode"),
    NONCE_LENGTH("length"),
    NONCE_LOADED_TIME("nonload"),
    NONCE_LOADER_INIT_TIME("loaderinit"),
    NONCE_REQUESTED_TIME("nonreq"),
    SERVICE_END_TIME("srvcend"),
    SERVICE_START_TIME("srvcstrt");

    private final String zzi;

    zzu(String str) {
        this.zzi = str;
    }

    final String zza() {
        return this.zzi;
    }
}
