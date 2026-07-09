package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzpl extends zzlh implements zzpm {
    public zzpl() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlh
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        switch (i11) {
            case 2:
                a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                parcel.readString();
                zzli.zzb(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzli.zzb(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzli.zzb(parcel);
                break;
            case 6:
                parcel.readInt();
                zzli.zzb(parcel);
                break;
            case 7:
                parcel.readInt();
                zzli.zzb(parcel);
                break;
            case 8:
                a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzli.zzb(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
