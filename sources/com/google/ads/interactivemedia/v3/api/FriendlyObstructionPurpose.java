package com.google.ads.interactivemedia.v3.api;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum FriendlyObstructionPurpose {
    VIDEO_CONTROLS,
    CLOSE_AD,
    NOT_VISIBLE,
    OTHER;

    @NonNull
    public com.google.ads.interactivemedia.omid.library.adsession.FriendlyObstructionPurpose getOmidPurpose() {
        return (com.google.ads.interactivemedia.omid.library.adsession.FriendlyObstructionPurpose) Enum.valueOf(com.google.ads.interactivemedia.omid.library.adsession.FriendlyObstructionPurpose.class, name());
    }
}
