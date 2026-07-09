package com.google.ads.interactivemedia.pal;

import com.chartbeat.androidsdk.QueryKeys;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
enum zzr {
    CORRELATOR(QueryKeys.TIME_ON_VIEW_IN_MINUTES),
    EVENT_ID("lid"),
    LOGGER_ID("id"),
    PALV("palv"),
    SDKV("sdkv");

    private final String zzg;

    zzr(String str) {
        this.zzg = str;
    }

    final String zza() {
        return this.zzg;
    }
}
