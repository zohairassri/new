package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class xj5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f38008a;

    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
        Boolean bool = f38008a;
        if (bool == null || !bool.booleanValue()) {
            return wj5.a(videoCapabilities, i11, i12, d11);
        }
        return 0;
    }
}
