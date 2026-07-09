package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ea extends v9 implements IInterface {
    ea(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    public final IBinder z1(String str, com.google.android.gms.dynamic.a aVar) {
        Parcel parcelR = R();
        parcelR.writeString("h.3.2.2/n.android.3.2.2");
        x9.e(parcelR, aVar);
        Parcel parcelY = Y(2, parcelR);
        IBinder strongBinder = parcelY.readStrongBinder();
        parcelY.recycle();
        return strongBinder;
    }
}
