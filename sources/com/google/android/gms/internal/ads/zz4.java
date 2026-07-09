package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class zz4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f39534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f39535b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    final /* synthetic */ void a(int i11, int i12) {
        MediaCodec.CryptoInfo.Pattern pattern = this.f39535b;
        pattern.set(i11, i12);
        this.f39534a.setPattern(pattern);
    }
}
