package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzmu extends zzlh implements zzmv {
    public zzmu() {
        super("com.google.android.gms.ads.signalsdk.INetworkRequestCallback");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlh
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 1) {
            zznd zzndVar = (zznd) zzli.zza(parcel, zznd.CREATOR);
            zzli.zzb(parcel);
            zzc(zzndVar);
        } else {
            if (i11 != 2) {
                return false;
            }
            int i13 = parcel.readInt();
            zzli.zzb(parcel);
            zzb(i13);
        }
        return true;
    }
}
