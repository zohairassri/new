package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ri0 extends pr implements IInterface {
    ri0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder z1(com.google.android.gms.dynamic.a aVar, String str, sb0 sb0Var, int i11) {
        Parcel parcelR = R();
        rr.e(parcelR, aVar);
        parcelR.writeString(str);
        rr.e(parcelR, sb0Var);
        parcelR.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(1, parcelR);
        IBinder strongBinder = parcelY.readStrongBinder();
        parcelY.recycle();
        return strongBinder;
    }
}
