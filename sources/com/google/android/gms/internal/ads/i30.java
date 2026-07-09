package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class i30 extends pr implements k30 {
    i30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.k30
    public final IBinder r3(com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3, int i11) {
        Parcel parcelR = R();
        rr.e(parcelR, aVar);
        rr.e(parcelR, aVar2);
        rr.e(parcelR, aVar3);
        parcelR.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(1, parcelR);
        IBinder strongBinder = parcelY.readStrongBinder();
        parcelY.recycle();
        return strongBinder;
    }
}
