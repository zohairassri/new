package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzlp extends zzlg implements IInterface {
    zzlp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    public final IBinder zze(com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, byte[] bArr) throws RemoteException {
        Parcel parcelZza = zza();
        zzli.zzd(parcelZza, aVar);
        zzli.zzd(parcelZza, aVar2);
        parcelZza.writeByteArray(bArr);
        Parcel parcelZzu = zzu(3, parcelZza);
        IBinder strongBinder = parcelZzu.readStrongBinder();
        parcelZzu.recycle();
        return strongBinder;
    }
}
