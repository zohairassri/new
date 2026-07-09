package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.pr;
import com.google.android.gms.internal.ads.rr;
import com.google.android.gms.internal.ads.sb0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class d0 extends pr implements IInterface {
    d0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
    }

    public final IBinder z1(com.google.android.gms.dynamic.a aVar, sb0 sb0Var, int i11) {
        Parcel parcelR = R();
        rr.e(parcelR, aVar);
        rr.e(parcelR, sb0Var);
        parcelR.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(1, parcelR);
        IBinder strongBinder = parcelY.readStrongBinder();
        parcelY.recycle();
        return strongBinder;
    }
}
