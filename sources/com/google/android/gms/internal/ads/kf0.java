package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class kf0 extends pr implements mf0 {
    kf0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final IBinder A(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelR = R();
        rr.e(parcelR, aVar);
        Parcel parcelY = Y(1, parcelR);
        IBinder strongBinder = parcelY.readStrongBinder();
        parcelY.recycle();
        return strongBinder;
    }
}
