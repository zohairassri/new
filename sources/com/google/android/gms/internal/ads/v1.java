package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class v1 {
    public static void a(Surface surface, float f11) {
        try {
            surface.setFrameRate(f11, f11 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e11) {
            y22.f("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e11);
        }
    }
}
