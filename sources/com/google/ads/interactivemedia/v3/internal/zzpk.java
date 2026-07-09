package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzpk extends zzlg implements zzpm {
    zzpk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpm
    public final void zze(com.google.android.gms.dynamic.a aVar, String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzli.zzd(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeString(null);
        zzv(8, parcelZza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpm
    public final void zzf() throws RemoteException {
        zzv(3, zza());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpm
    public final void zzg(int i11) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i11);
        zzv(7, parcelZza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpm
    public final void zzh(int[] iArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzv(4, parcelZza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpm
    public final void zzi(int i11) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i11);
        zzv(6, parcelZza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpm
    public final void zzj(byte[] bArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzv(5, parcelZza);
    }
}
