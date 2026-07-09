package com.google.android.gms.internal.pal;

import android.util.Base64;
import android.util.Log;
import com.google.ads.interactivemedia.pal.NonceLoaderException;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class n5 implements m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final se f41591a;

    n5(se seVar) {
        this.f41591a = seVar;
    }

    @Override // com.google.android.gms.internal.pal.m5
    public final String b(String str) throws NonceLoaderException {
        try {
            return Base64.encodeToString(this.f41591a.zza(str.getBytes("UTF-8"), new byte[0]), 10);
        } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e11) {
            Log.e("NonceGenerator", "Failed to encrypt the string.", e11);
            throw new NonceLoaderException(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEPUPILS, e11);
        }
    }
}
